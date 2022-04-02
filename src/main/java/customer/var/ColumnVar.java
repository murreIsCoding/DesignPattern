package customer.var;

import customer.valuetype.Value;

import java.util.List;

/**
 * @Author LMY
 * @Date 2022/4/2 13:36
 * @Version 1.0
 */
public class ColumnVar<T extends Value> implements Var {
    List<T> values;

    public ColumnVar(List<T> values) {
        this.values = values;
    }

    @Override
    public void printValue() {
        for (Value value : values) {
            value.printValue();
            System.out.print(",");
        }
    }

}
