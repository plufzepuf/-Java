import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try (Scanner fileScanner = new Scanner(file)) {
            
            System.out.println("--- Чтение данных со склада ---");
            while (fileScanner.hasNext()) {
                String itemName = fileScanner.next(); 
                int quantity = fileScanner.nextInt(); 
                
                System.out.println("Товар: " + itemName + ", Остаток: " + quantity + " шт.");
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл data.txt не найден.");
            System.out.println("Убедитесь, что он создан в корневой папке проекта.");
        }
    }
}
