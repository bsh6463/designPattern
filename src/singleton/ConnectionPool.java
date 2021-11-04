package singleton;

public class ConnectionPool {

    //유일한 인스턴스 선언
    private static ConnectionPool instance  = new ConnectionPool();

    //생성자 못쓰게 막기
    private ConnectionPool() {
    }

    public static ConnectionPool getInstance() {

        if (instance == null){
            instance = new ConnectionPool();
        }
        return instance;
    }
}
