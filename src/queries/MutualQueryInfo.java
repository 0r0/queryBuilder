package queries;

public  abstract class MutualQueryInfo {
    private static String Table;

    public final  String getTable() {
        return Table;
    }
    public final  void setTable(String Table){
        MutualQueryInfo.Table =Table;
    }
}
