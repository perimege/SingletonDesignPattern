public class Logger {

    private static Logger instance;

    private Logger(){
        DbConnection dbConnection=new DbConnection();
        dbConnection.openConnection();
    }
    public static Logger getInstance() {
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }

    public void log(ILogger logger){
        System.out.println(logger.loggedData()+" loglandı");
    }


}
