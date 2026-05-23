package package1;

public class BaseClass {
    // 1. public - доступно абсолютно всем
    public String publicField = "public: доступен везде";
    
    // 2. protected - доступно внутри этого пакета (package1) И всем классам-наследникам
    protected String protectedField = "protected: доступен в пакете и наследникам";
    
    // 3. по умолчанию (package-private) - доступно ТОЛЬКО внутри пакета (package1)
    String defaultField = "default: доступен только внутри пакета package1";
    
    // 4. private - доступно ТОЛЬКО внутри фигурных скобок этого класса
    private String privateField = "private: доступен только внутри BaseClass";

    public void showPrivate() {
        // Здесь private поле доступно, так как мы находимся внутри BaseClass
        System.out.println("Вызов внутри BaseClass: " + privateField);
    }
}