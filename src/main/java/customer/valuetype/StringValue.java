package customer.valuetype;

/**
 * @Author LMY
 * @Date 2022/4/2 13:32
 * @Version 1.0
 */
public class StringValue implements Value {
    String string;

    public StringValue(String string) {
        this.string = string;
    }

    @Override
    public void printValue() {
        System.out.print("STRING:"+string);
    }
}
