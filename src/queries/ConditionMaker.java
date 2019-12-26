package queries;



public class ConditionMaker {
    private String orConditionStatement;
    private String andConditionStatement;
    private String[] operators={"=",">",">=","<=","<","<>"};


    public ConditionMaker orCondition(String condition1,String operator,String condition2 ) {

        this.orConditionStatement = "or " + condition1 + ""+operator+"" + condition2;
        return this;
    }



    public ConditionMaker andCondition(String condition1,String operator, String condition2) {

        this.andConditionStatement = "and " + condition1 + ""+operator+""+ condition2;
        return this;

    }



    public String getOrConditionStatement() {
        return this.orConditionStatement;
    }



    public String getAndConditionStatement() {
        return this.andConditionStatement;
    }
    private boolean conditionOperatorChecker(String operator){
        for (String s : operators) {
            if (operator.equals(s))
                return true;
        }
        return false;
    }
    private String getCondition(String condition1,String operator, String condition2) {


        if(conditionOperatorChecker(operator))
            return condition1 + ""+operator+""+ condition2;
        else
            throw new IllegalArgumentException("the operand is not true!");




    }

}
