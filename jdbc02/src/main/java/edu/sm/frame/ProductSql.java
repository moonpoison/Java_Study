package edu.sm.frame;

public class ProductSql {
    public static String insert = "INSERT INTO product VALUES (?,?,?,?,?,NOW(),NOW(),?)";
//    public static String select = "SELECT * FROM product WHERE product_id=?";
    public static String select = "SELECT * FROM product p INNER JOIN cate c ON p.cate_id = c.cate_id WHERE PRODUCT_ID = ?";
//    public static String selectAll = "SELECT * FROM product";
    public static String selectAll = "SELECT * FROM product p INNER JOIN cate c ON p.cate_id = c.cate_id";
    public static String update = "UPDATE product SET product_name=?, product_price=? WHERE product_id=?";
    public static String delete = "DELETE FROM product WHERE product_id=?";
}
