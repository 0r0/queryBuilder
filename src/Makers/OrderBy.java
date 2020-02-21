package Makers;

public interface OrderBy {
    static  String orderBy(String table,String field ){
        return "order by "+table+"."+field;

    }
    static String orderByDescending(String table,String field){
        return "order by "+table+"."+field+" desc";

    }
}
