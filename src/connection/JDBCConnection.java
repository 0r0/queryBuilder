package connection;

public class JDBCConnection {
    private static JDBCConnection object=null;
    private JDBCConnection(){}
    public static JDBCConnection getConnection(){
        if(object==null)
            object=new JDBCConnection();
        return object;
    }

    public static void connectivity(){

    }
}


