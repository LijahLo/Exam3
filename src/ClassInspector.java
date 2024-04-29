import java.lang.reflect.*;

public class ClassInspector {
    public static void main(String[] args) {
        inspectClass(Model.class);
        inspectClass(View.class);
        inspectClass(Controller.class);
    }

    public static void inspectClass(Class<?> clazz) {
        System.out.println("Methods in class: " + clazz.getSimpleName());
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("- " + method.getName());
        }
        System.out.println();
    }
}
