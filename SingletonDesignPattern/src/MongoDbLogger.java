public class MongoDbLogger implements ILogger{
    @Override
    public String loggedData() {
        return "MongoDb log data";
    }

    public void MongoDbLog(){
        Logger logger=Logger.getInstance();
        logger.log(this);
    }
}
