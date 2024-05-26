package Question_2;

abstract class DataPipeline {
    public final boolean processData(String URL) {
        if (connect(URL)) {
            if (transformData()) {
                return storeData();
            }
        }
        return false;
    }
    protected abstract boolean connect(String URL);
    protected abstract boolean transformData();
    protected abstract boolean storeData();
}