package swing;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 資料庫連線管理類別
 * 
 * 此類別負責建立與 MySQL 資料庫的連線，提供整個應用程式使用的連線物件。
 * 使用 MysqlDataSource 實現連線池功能，提高效能與安全性。
 * 
 * @author chunyen
 * @version 1.0
 * @since 2019-07-29
 */
public class DBConnection {
    /** 資料庫伺服器位址 */
    private static String servername = "127.0.0.1";
    
    /** 資料庫使用者名稱 */
    private static String username = "root";
    
    /** 資料庫名稱 */
    private static String dbname = "logindb";
    
    /** 資料庫連接埠 */
    private static Integer portnumber = 3306;
    
    /** 資料庫密碼 */
    private static String password = "1234";

    /**
     * 取得資料庫連線
     * 
     * 此方法建立並返回一個與 MySQL 資料庫的連線物件。
     * 如果連線失敗，會記錄錯誤但不會拋出例外，而是返回 null。
     * 
     * @return Connection 資料庫連線物件，若連線失敗則返回 null
     */
    public static Connection getConnection() {
        Connection cnx = null;
        
        // 建立 MySQL 資料來源
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setUseSSL(false); // 關閉 SSL，避免警告訊息
        
        try {
            // 嘗試建立連線
            cnx = datasource.getConnection(username, password);
        } catch (SQLException ex) {
            // 記錄連線失敗的錯誤
            Logger.getLogger("Get Connection ->" + DBConnection.class.getName())
                  .log(Level.SEVERE, "資料庫連線失敗", ex);
        }
        
        return cnx;
    }
}