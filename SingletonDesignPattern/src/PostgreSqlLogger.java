public class PostgreSqlLogger implements ILogger
{

    @Override
    public String loggedData() {
        return "PostgreSql log data";
    }
    public void PostgreSqlLog(){
        Logger logger=Logger.getInstance();
        logger.log(this);
    }
}
