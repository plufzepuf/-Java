package package1;

public class SamePackageClass {
    
    public void testAccess() {
        BaseClass obj = new BaseClass();
        
        System.out.println("--- Проверка из того же пакета (package1) ---");
        System.out.println(obj.publicField);    // ДОСТУПНО
        System.out.println(obj.protectedField); // ДОСТУПНО (один пакет)
        System.out.println(obj.defaultField);   // ДОСТУПНО (один пакет)
        
        // System.out.println(obj.privateField); 
        // ОШИБКА: The field BaseClass.privateField is not visible
    }
}