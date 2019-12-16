package queries;

import queries.delete.Delete;
import queries.insert.Insert;
import queries.select.Select;
import queries.update.Update;

public class QueryMaker {
    public Queries getQueryMaker(String QueryName){
        if(QueryName.equalsIgnoreCase("select"))
            return new Select();
        if(QueryName.equalsIgnoreCase("update"))
            return new Update();
        if(QueryName.equalsIgnoreCase("insert"))
            return  new Insert();
        if(QueryName.equalsIgnoreCase("delete"))
            return new Delete();
        return null;
    }
}
