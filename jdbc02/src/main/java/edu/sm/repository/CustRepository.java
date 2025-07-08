package edu.sm.repository;

import edu.sm.dto.Cust;
import edu.sm.frame.CustSql;
import edu.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CustRepository implements SmRepository<Cust, String> {
    @Override
    public void insert(Cust cust, Connection conn) throws Exception {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(CustSql.insert);
            ps.setString(1, cust.getCustId());
            ps.setString(2, cust.getCustPwd());
            ps.setString(3, cust.getCustName());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) ps.close();
        }

    }

    @Override
    public void update(Cust cust, Connection conn) throws Exception {

    }

    @Override
    public void delete(String s, Connection conn) throws Exception {

    }

    @Override
    public List<Cust> selectAll(Connection conn) throws Exception {
        return List.of();
    }

    @Override
    public Cust select(String s, Connection conn) throws Exception {
        return null;
    }
}
