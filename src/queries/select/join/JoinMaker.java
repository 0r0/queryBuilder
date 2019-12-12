package queries.select.join;

public class JoinMaker {

//    private final static String leftJoin="left join";
//    private final static String innerJoin="inner join";
//    private final static String join="join";
//    private final  String outerJoin="outer Join";
//    private final String rightJoin="right join";
    JoinMaker(){};
    public static final String leftJoin (){
        return "left Join";
    }
    public static final String join(){
        return "join";
    }
    public static final String innerJoin(){
        return "inner join";
    }
    public static final String outerJoin(){
        return "outer join";
    }
    public static final String rightJoin(){
        return "right join";
    }

}
