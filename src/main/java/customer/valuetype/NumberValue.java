package customer.valuetype;

/**
 * @Author LMY
 * @Date 2022/4/2 13:32
 * @Version 1.0
 */
public class NumberValue implements Value {
    Integer number;

    public NumberValue(Integer number) {
        this.number = number;
    }

    @Override
    public void printValue() {
        System.out.print("NUMBER:"+number);
    }
}
