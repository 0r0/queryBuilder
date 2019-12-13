package queries;



public class ConditionMaker {
    private String orConditionStatement;
    private String andConditionStatement;


    public ConditionMaker orCondition(String condition1, String condition2) {

        this.orConditionStatement = "or " + condition1 + "=" + condition2;
        return this;
    }

    ;

    public ConditionMaker andCondition(String condition1, String condition2) {
        this.andConditionStatement = "and " + condition1 + "=" + condition2;
        return this;

    }



    public String getOrConditionStatement() {
        return this.orConditionStatement;
    }

    public String getAndConditionStatement() {
        return this.andConditionStatement;
    }

}
