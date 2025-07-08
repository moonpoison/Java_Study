package edu.sm.service;

import edu.sm.dto.Product;
import edu.sm.frame.ConnectionPool;
import edu.sm.frame.SmService;
import edu.sm.repository.ProductRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ProductService implements SmService<Product, Integer> {
    ProductRepository prodRepository;
    ConnectionPool connectionPool;
    public ProductService() {
        this.prodRepository = new ProductRepository();
        try {
            connectionPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void register(Product prod) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            prodRepository.insert(prod, conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public void modify(Product prod) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            prodRepository.update(prod, conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public void remove(Integer i) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            prodRepository.delete(i, conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public List<Product> get() throws Exception {
        List<Product> list = null;
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            list = prodRepository.selectAll(conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if(conn != null) connectionPool.releaseConnection(conn);
        }
        return list;
    }

    @Override
    public Product get(Integer i) throws Exception {
        Product prod = null;
        Connection conn = connectionPool.getConnection();
        try {
            conn.setAutoCommit(false);
            prod = prodRepository.select(i, conn);
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw e;
        } finally {
            if(conn != null) connectionPool.releaseConnection(conn);
        }
        return prod;
    }
}
