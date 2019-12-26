package queries.select;

import queries.MutualQueryInfo;
import queries.Queries;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class SelectAbstract extends MutualQueryInfo implements Queries {
    public static String selectQuery(String firstTable, HashMap<String,String> selectedTableField, ArrayList<String> joins,String condition){

        return "select "+selectStringParser(selectedTableField)+" "+" from "+firstTable+" "+joinStringParser(joins)+" "+condition;



    }
    private static String selectStringParser(HashMap<String, String> H){
        String myParser="";
        for(String s:H.keySet())
            myParser+=s+"."+H.get(s)+",";
        return myParser.substring(0,myParser.length()-1);

            }

    private static String joinStringParser(ArrayList<String> A){
        String myParser="";
        for(String s:A)
            myParser+=s+" ";
        return  myParser;

    }

}

