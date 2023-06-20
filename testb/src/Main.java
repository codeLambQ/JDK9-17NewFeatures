import com.testb.TestRecord;

public class Main {
    public static void main(String[] args) {
        // JDK 16 新特性 Record 类
//        TestRecord testRecord = new TestRecord("test1", "password1");
//        String name = testRecord.name(); // 初始化之后只可以获取，不可以修改
//        System.out.println(name);

        // 增强 switch
        Object a = "Hello";

        // 增强后
        if (a instanceof String b) {
            System.out.println(b);
        }

        if (a instanceof Integer b) {
            System.out.println(b);
        }

        if (a instanceof Long b) {
            System.out.println(b);
        }
        
        switch (a) {
            case String b -> System.out.println(b);
            case Integer b -> System.out.println(b);
            case Long b -> System.out.println(b);
            default -> throw new IllegalStateException("Unexpected value: " + a);
        }
    }
}