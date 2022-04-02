package customer.var;

import customer.valuetype.Value;

/**
 * @Author LMY
 * @Date 2022/4/2 13:36
 * @Version 1.0
 */
public class SingleVar<T extends Value> implements Var{
    Value value ;

    public SingleVar(Value value) {
        this.value = value;
    }

    @Override
    public void printValue() {
       value.printValue();
    }
}
