public class Main {
    public static void main(String[] args) {
        String str1 = "иван иванович";
        String str2 = "Ива Иванович Иванов";
        checkUserName(str1, str2);
    }

    private static void checkUserName(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2))
            System.out.println("Выберите другое имя пользователя");
        else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + str2.length() + " символов.");
            System.out.println("А без пробелов ваше имя занимает " +str2.replace(" ","").length()+ " символов.");
        }
    }
}