package queries.select.join;



public class JoinMaker extends JoinConstant  {

    public static String leftJoin(String[] table1,String[] table2){
        stringArraySizeChecker(table1,table2);
        return leftJoinConstant()+" "+table2[0]+" on "+table2[0]+"."+table2[1]+" = "+table1[0]+"."+table1[1];
    }
    public static String rightJoin(String[] table1,String[] table2){
        stringArraySizeChecker(table1,table2);
        return rightJoinConstant()+" "+table2[0]+" on "+table2[0]+"."+table2[1]+" = "+table1[0]+"."+table1[1];
    }
    public static String join(String[] table1,String[] table2){
        stringArraySizeChecker(table1,table2);

        return joinConstant()+" "+table2[0]+" on "+table2[0]+"."+table2[1]+" = "+table1[0]+"."+table1[1];

    }
    public static String outerJoin(String[] table1,String[] table2){
        stringArraySizeChecker(table1,table2);
        return outerJoinConstant()+" "+table2[0]+" on "+table2[0]+"."+table2[1]+" = "+table1[0]+"."+table1[1];
    }
    public static String innerJoin(String[] table1,String[] table2){
        stringArraySizeChecker(table1,table2);
        return innerJoinConstant()+" "+table2[0]+" on "+table2[0]+"."+table2[1]+" = "+table1[0]+"."+table1[1];
    }
    private static void stringArraySizeChecker(String[] table1, String[] table2){
        if(table1.length!=2 || table2.length!=2)
            throw new IllegalArgumentException("size of String array must be 2, first is table name, second is field  name");

    }

}
