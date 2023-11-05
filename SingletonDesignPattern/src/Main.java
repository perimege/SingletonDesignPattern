public class Main {
    public static void main(String[] args) {
        PostgreSqlLogger postgreSqlLogger=new PostgreSqlLogger();
        MongoDbLogger mongoDbLogger=new MongoDbLogger();
        MySqlLogger mySqlLogger=new MySqlLogger();

        mySqlLogger.MySqlLog();
        postgreSqlLogger.PostgreSqlLog();
        mongoDbLogger.MongoDbLog();
    }
}