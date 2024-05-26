package Question_2;

class DatabasePipeline extends DataPipeline {
    @Override
    protected boolean connect(String URL) {
        boolean connected = false;
        System.out.println("Connecting to database...");
        connected = true;
        return connected;
    }
    @Override
    protected boolean transformData() {
        boolean transformed = false;
        System.out.println("Transforming data in database...");
        transformed = true;
        return transformed;
    }
    @Override
    protected boolean storeData() {
        boolean stored = false;
        System.out.println("Storing data in database...");
        stored = true;
        return stored;
    }
}