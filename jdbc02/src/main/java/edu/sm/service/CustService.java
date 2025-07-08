package edu.sm.service;

import edu.sm.dto.Cust;
import edu.sm.frame.ConnectionPool;
import edu.sm.frame.SmService;
import edu.sm.repository.CustRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustService implements SmService<Cust, String> {
    CustRepository custRepository;
    ConnectionPool connectionPool;
    public CustService() {
        this.custRepository = new CustRepository();
        try {
            connectionPool = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void register(Cust cust) throws Exception {
        Connection conn = connectionPool.getConnection();
        try {
            custRepository.insert(cust, conn);
        } catch (Exception e) {
            throw e;
        } finally {
            if (conn != null) connectionPool.releaseConnection(conn);
        }
    }

    @Override
    public void modify(Cust cust) throws Exception {

    }

    @Override
    public void remove(String s) throws Exception {

    }

    @Override
    public List<Cust> get() throws Exception {
        return List.of();
    }

    @Override
    public Cust get(String s) throws Exception {
        return null;
    }
}
