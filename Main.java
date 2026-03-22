// Задача 18: Интерфейс с обобщённым методом
public class Main {
    public static void main(String[] args) {
        // Тестирование TypeConverter с обобщённым методом convert
        
        // Конвертация String в Integer (это было проблемой)
        try {
            String strValue = "123";
            Integer intValue = TypeConverter.convert(strValue, Integer.class);
            System.out.println("String \"" + strValue + "\" -> Integer: " + intValue);
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка конвертации: " + e.getMessage());
        }
        
        // Другие примеры конвертации
        try {
            // String в Double
            String strDouble = "45.67";
            Double doubleValue = TypeConverter.convert(strDouble, Double.class);
            System.out.println("String \"" + strDouble + "\" -> Double: " + doubleValue);
            
            // Integer в String
            Integer intVal = 789;
            String strVal = TypeConverter.convert(intVal, String.class);
            System.out.println("Integer " + intVal + " -> String: \"" + strVal + "\"");
            
            // Double в Integer
            Double dblVal = 99.5;
            Integer intFromDouble = TypeConverter.convert(dblVal, Integer.class);
            System.out.println("Double " + dblVal + " -> Integer: " + intFromDouble);
            
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка конвертации: " + e.getMessage());
        }
    }
}