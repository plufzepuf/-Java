package package2;

import package1.BaseClass;
import package1.SamePackageClass;

public class Main {
    public static void main(String[] args) {
        
        // 1. Посмотрим, что видит класс из соседнего пакета:
        SamePackageClass neighbor = new SamePackageClass();
        neighbor.testAccess();
        System.out.println();
        
        // 2. Посмотрим, что видит наследник из другого пакета:
        SubClass child = new SubClass();
        child.testAccess();
        System.out.println();
        
        // 3. А теперь попробуем обратиться к полям прямо отсюда (чужой класс в другом пакете):
        System.out.println("--- Проверка из чужого класса в другом пакете (package2) ---");
        BaseClass base = new BaseClass();
        
        System.out.println(base.publicField); // ДОСТУПНО (public работает везде)
        
        // System.out.println(base.protectedField); 
        // ОШИБКА: Main не лежит в package1 и не наследует BaseClass.
        
        // System.out.println(base.defaultField);   
        // ОШИБКА: Main не лежит в package1.
        
        // System.out.println(base.privateField);   
        // ОШИБКА: Доступно только в BaseClass.
        
        // Зато мы можем попросить сам BaseClass распечатать свое private-поле 
        // через его публичный метод:
        base.showPrivate();
    }
}