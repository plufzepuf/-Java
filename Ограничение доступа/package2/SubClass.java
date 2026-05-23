package package2;

import package1.BaseClass;

public class SubClass extends BaseClass {
    
    public void testAccess() {
        System.out.println("--- Проверка из класса-наследника в другом пакете (package2) ---");
        
        System.out.println(publicField);    // ДОСТУПНО
        
        // ДОСТУПНО: хоть пакет и другой, но мы - наследники! Это главная фишка protected.
        System.out.println(protectedField); 
        
        // System.out.println(defaultField); 
        // ОШИБКА: Поле недоступно, так как мы вышли за пределы пакета package1.
        
        // System.out.println(privateField); 
        // ОШИБКА: Поле недоступно никому, кроме самого BaseClass.
    }
}