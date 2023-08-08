import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Class c = ClasseAnotada.class;
        try {
            Constructor cons = c.getConstructor();

            ClasseAnotada classeAnotada = (ClasseAnotada) cons.newInstance();

            if(classeAnotada.getClass().isAnnotationPresent(Tabela.class)){
                Tabela t = classeAnotada.getClass().getAnnotation(Tabela.class);
                System.out.println(t.value());
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}
