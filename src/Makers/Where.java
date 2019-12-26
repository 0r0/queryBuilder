package Makers;

public interface Where {
    static String whereOperator(String condition1,String operator, String condition2){

        return "where "+condition1+" "+operator+" "+condition2;

    }
    static String whereIn(String condition1,String condition2){
        return "where "+condition1+" in("+condition2+")";
    }
    static String whereNotExist(String condition){
        return "where not exist("+condition+")";
    };
    static String whereExist(String condition){
        return "where Exist("+condition+")";
    }
    static String whereNot(String condition){
        return "";
    }
    static String whereAll(String condition){
        return "";
    }
//    static String



}
