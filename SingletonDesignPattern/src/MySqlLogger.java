public class MySqlLogger implements ILogger{
    @Override
    public String loggedData() {
        return "MySql log data";
    }

    public void MySqlLog(){
        Logger logger=Logger.getInstance();
        logger.log(this);
    }
}
