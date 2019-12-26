package queries.select;

import queries.MutualQueryInfo;
import queries.Queries;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class SelectAbstract extends MutualQueryInfo implements Queries {
    public static String selectQuery(String firstTable, HashMap<String,String> selectedTableField, ArrayList<String> joins,String condition){

        return "select "+selectStringParser(selectedTableField)+" "+" from "+firstTable+" "+joinStringParser(joins)+" "+condition;



    }
    private static String selectStringParser(HashMap<String, String> selectedField){
        StringBuilder myParser= new StringBuilder();
        for(String s:selectedField.keySet())
            myParser.append(s).append(".").append(selectedField.get(s)).append(",");
        return myParser.substring(0,myParser.length()-1);

            }

    private static String joinStringParser(ArrayList<String> joins){
        StringBuilder myParser= new StringBuilder();
        for(String s:joins)
            myParser.append(s).append("\n");
        return myParser.toString();

    }

}

