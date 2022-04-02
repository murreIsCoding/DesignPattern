//package customer.var;
//
//import customer.valuetype.NumberValue;
//import customer.valuetype.StringValue;
//import customer.valuetype.Value;
//
//import java.lang.reflect.ParameterizedType;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @Author LMY
// * @Date 2022/4/2 13:36
// * @Version 1.0
// */
//public class TableVar implements Var {
//    List<ColumnVar<Value>> valueTable;
//
//    public TableVar(List<ColumnVar<Value>> valueTable) {
//        this.valueTable = valueTable;
//    }
//
//    public static void main(String[] args) {
//        List<ColumnVar<Value>> columnVars = new ArrayList<>();
//
//        List<NumberValue> numberValues= new ArrayList<>();
//        numberValues.add(new NumberValue(1));
//        numberValues.add(new NumberValue(2));
//        numberValues.add(new NumberValue(3));
//        numberValues.add(new NumberValue(4));
//        ColumnVar<NumberValue> numberValueColumnVar = new ColumnVar<>(numberValues);
//        columnVars.add((ColumnVar) numberValueColumnVar);
//
//
//        TableVar tableVar = new TableVar(columnVars);
//
//        System.out.println(tableVar.getColumnsClass());
//    }
//
//    @Override
//    public void printValue() {
//        for (ColumnVar<Value> columnVar : valueTable) {
//            columnVar.printValue();
//            System.out.println("");
//        }
//    }
//
//
//    public List<Class<Value>> getColumnsClass() {
//        List<Class<Value>> list = new ArrayList<>();
//        for (ColumnVar<Value> columnVar : valueTable) {
//            Class<Value> clazz = ((ParameterizedType)((Class<Value>) columnVar.getClass().getTypeParameters()[0].getClass().getGenericInterfaces()[0])).getActualTypeArguments().getClass();
//            list.add(clazz);
//        }
//        return list;
//    }
//
//}
