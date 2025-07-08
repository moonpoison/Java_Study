package edu.sm.repository;

import edu.sm.dto.Product;
import edu.sm.frame.ProductSql;
import edu.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ProductRepository implements SmRepository<Product, Integer> {
    @Override
    public void insert(Product prod, Connection conn) throws Exception {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(ProductSql.insert);
            ps.setInt(1, prod.getProductId());
            ps.setString(2, prod.getProductName());
            ps.setInt(3, prod.getProductPrice());
            ps.setDouble(4, prod.getDiscountRate());
            ps.setString(5, prod.getProductImg());
            ps.setInt(6, prod.getCateId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) ps.close();
        }

    }

    @Override
    public void update(Product prod, Connection conn) throws Exception {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(ProductSql.update);
            ps.setString(1, prod.getProductName());
            ps.setInt(2, prod.getProductPrice());
            ps.setInt(3, prod.getProductId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) ps.close();
        }
    }

    @Override
    public void delete(Integer i, Connection conn) throws Exception {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(ProductSql.delete);
            ps.setInt(1, i);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) ps.close();
        }
    }

    @Override
    public List<Product> selectAll(Connection conn) throws Exception {
        PreparedStatement ps = null;
        List<Product> list = new java.util.ArrayList<>();
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(ProductSql.selectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product prod = new Product();
                prod.setProductId(rs.getInt("product_id"));
                prod.setProductName(rs.getString("product_name"));
                prod.setProductPrice(rs.getInt("product_price"));
                prod.setDiscountRate(rs.getDouble("product_price"));
                prod.setProductImg(rs.getString("product_price"));
                prod.setProductRegdate(rs.getTimestamp("product_regdate"));
                prod.setProductUpdate(rs.getTimestamp("product_update"));
                prod.setCateName(rs.getString("cate_name"));
                list.add(prod);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if(ps != null) ps.close();
            if(rs != null) rs.close();
        }
        return list;
    }

    @Override
    public Product select(Integer i, Connection conn) throws Exception {
        Product prod = new Product();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(ProductSql.select);
            ps.setInt(1, i);
            rs = ps.executeQuery();
            rs.next();
            prod.setProductId(rs.getInt("product_id"));
            prod.setProductName(rs.getString("product_name"));
            prod.setProductPrice(rs.getInt("product_price"));
            prod.setDiscountRate(rs.getDouble("product_price"));
            prod.setProductImg(rs.getString("product_price"));
            prod.setProductRegdate(rs.getTimestamp("product_regdate"));
            prod.setProductUpdate(rs.getTimestamp("product_update"));
            prod.setCateName(rs.getString("cate_name"));
        } catch (Exception e) {
            throw e;
        } finally {
            if(ps != null) ps.close();
            if(rs != null) rs.close();
        }
        return prod;
    }
}
