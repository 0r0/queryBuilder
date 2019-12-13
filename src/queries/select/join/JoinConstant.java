package queries.select.join;

import org.jetbrains.annotations.Contract;

public abstract class JoinConstant{


    JoinConstant(){};

    public static final String leftJoinConstant (){
        return "left Join";
    }
    public static final String joinConstant(){
        return "join";
    }
    public static final String innerJoinConstant(){
        return "inner join";
    }
    public static final String outerJoinConstant(){
        return "outer join";
    }
    public static final String rightJoinConstant(){
        return "right join";
    }

}
