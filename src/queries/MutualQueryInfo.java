package queries;

public  abstract class MutualQueryInfo {
    private static String Table;
    protected MutualQueryInfo(){};
    public final  String getTable() {
        return Table;
    }
    public final  void Table(String Table){
        MutualQueryInfo.Table =Table;
    }
}
