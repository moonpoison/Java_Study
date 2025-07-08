package edu.sm.repository;

import edu.sm.dto.Cust;
import edu.sm.frame.CustSql;
import edu.sm.frame.SmRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(CustSql.update);
            ps.setString(1, cust.getCustPwd());
            ps.setString(2, cust.getCustName());
            ps.setString(3, cust.getCustId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) ps.close();
        }
    }

    @Override
    public void delete(String s, Connection conn) throws Exception {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(CustSql.delete);
            ps.setString(1, s);
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            if (ps != null) ps.close();
        }
    }

    @Override
    public List<Cust> selectAll(Connection conn) throws Exception {
        PreparedStatement ps = null;
        List<Cust> list = new java.util.ArrayList<>();
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(CustSql.selectAll);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cust cust = new Cust();
                cust.setCustId(rs.getString("cust_id"));
                cust.setCustPwd(rs.getString("cust_pwd"));
                cust.setCustName(rs.getString("cust_name"));
                cust.setCustRegdate(rs.getTimestamp("cust_regdate"));
                cust.setCustUpdate(rs.getTimestamp("cust_update"));
                list.add(cust);
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
    public Cust select(String s, Connection conn) throws Exception {
        Cust cust = new Cust();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(CustSql.select);
            ps.setString(1, s);
            rs = ps.executeQuery();
            rs.next();
            cust.setCustId(rs.getString("cust_id"));
            cust.setCustPwd(rs.getString("cust_pwd"));
            cust.setCustName(rs.getString("cust_name"));
            cust.setCustRegdate(rs.getTimestamp("cust_regdate"));
            cust.setCustUpdate(rs.getTimestamp("cust_update"));
        } catch (Exception e) {
            throw e;
        } finally {
            if(ps != null) ps.close();
            if(rs != null) rs.close();
        }
        return cust;
    }
}
