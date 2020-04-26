package selfeducation.unit05.lesson02;

import java.time.LocalDate;
import java.util.*;


public class HashSetCollections {

    /* 5.2.1 HashSet из растений
    Создать коллекцию HashSet с типом элементов String.
    Добавить в неё 10 строк: арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Посмотреть, как изменился порядок добавленных элементов.*/
    public static void fruits() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.1:");
        Set<String> fruits = new HashSet<>();
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pear");
        fruits.add("melon");
        fruits.add("Blackberry");
        fruits.add("Ginseng");
        fruits.add("strawberry");
        fruits.add("Iris");
        fruits.add("potato");

  /*      System.out.println("");
        System.out.println("Simple output: ");
        System.out.println(fruits);*/

        System.out.println("");
        System.out.println("Output through cycle while:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }

        System.out.println("");
        System.out.println("Output through cycle for: ");
        for (String text : fruits) {
            System.out.println(text);
        }
    }

    /* 5.2.2 HashMap из 10 пар
    Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Пример вывода (тут показана только одна строка):
    картофель – клубень*/
    public static void fruitsCategories() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.2:");
        Map<String, String> fruitsCategories = new HashMap<>();
        fruitsCategories.put("Watermelon", "berry");
        fruitsCategories.put("Banana", "grass");
        fruitsCategories.put("Cherry", "berry");
        fruitsCategories.put("Pear", "fruit");
        fruitsCategories.put("Cucumber", "vegetable;");
        fruitsCategories.put("Blackberry", "bush");
        fruitsCategories.put("Ginseng", "root");
        fruitsCategories.put("Strawberry", "berry");
        fruitsCategories.put("Iris", "flower");
        fruitsCategories.put("Potato", "tuber");

/*        System.out.println("");
        System.out.println("Simple output: ");
        System.out.println(fruitsCategories);*/

        System.out.println("");
        System.out.println("Output through cycle while:");
        Iterator<Map.Entry<String, String>> iterator = fruitsCategories.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        System.out.println("");
        System.out.println("Output through cycle for: ");
        //String key = pair.getKey();
        for (Map.Entry<String, String> pair : fruitsCategories.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    /* 5.2.3 Коллекция HashMap из котов
    Есть класс Cat, с полем имя (name, String).
    Создать коллекцию HashMap<String, Cat>.
    Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
    Вывести результат на экран, каждый элемент с новой строки.*/

    public static void catsMapManualFill() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.3:");
        Map<String, Cat> cats = new HashMap<>();
        Random random = new Random();
        Cat myObj = new Cat("Timka");
        //cats.put(myObj.getName(), myObj); //TODO
        for (int i = 0; i < 10; i++) {
            cats.put(myObj.getName() + random.nextInt(100), new Cat("Barsic" + random.nextInt(10)));
        }

        System.out.println("Cats output:");
        for (Map.Entry<String, Cat> pair : cats.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    /* 5.2.4 Вывести на экран список ключей
    Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    Вывести на экран список ключей, каждый элемент с новой строки.*/

    public static void collectionKeysOutput() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.4:");

        Map<String, String> collectionKeysOutput = new HashMap<>();
        collectionKeysOutput.put("Nusha", "Siamese");
        collectionKeysOutput.put("Barsik", "Maine Coon");
        collectionKeysOutput.put("Leyla", "Australian Mist");
        collectionKeysOutput.put("Murzik", "Bengali");
        collectionKeysOutput.put("Anfisa", "Balinese");
        collectionKeysOutput.put("Vitamin", "Little bambino");
        collectionKeysOutput.put("Pushistic", "British Semi-longhair");
        collectionKeysOutput.put("Island", "California Spangled");
        collectionKeysOutput.put("", "");
        collectionKeysOutput.put("Milka", "Devon Rex");

        System.out.println("");
        System.out.println("Keys list: ");
        for (String key : collectionKeysOutput.keySet())
            System.out.println(key);
    }

    /* 5.2.5 Вывести на экран список значений
    Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
    Вывести на экран список значений, каждый элемент с новой строки.*/

    public static void collectionValuesOutput() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.5:");
        Map<String, String> collectionValuesOutput = new HashMap<>();
        collectionValuesOutput.put("Nusha", "Siamese");
        collectionValuesOutput.put("Barsik", "Maine Coon");
        collectionValuesOutput.put("Leyla", "Australian Mist");
        collectionValuesOutput.put("Murzik", "Bengali");
        collectionValuesOutput.put("Anfisa", "Balinese");
        collectionValuesOutput.put("Vitamin", "Little bambino");
        collectionValuesOutput.put("Pushistic", "British Semi-longhair");
        collectionValuesOutput.put("Island", "California Spangled");
        collectionValuesOutput.put("", "");
        collectionValuesOutput.put("Milka", "Devon Rex");

        System.out.println("");
        System.out.println("Values list:");
        for (String value : collectionValuesOutput.values())
            System.out.println(value);
    }

    /* 5.2.6 Коллекция HashMap из Object
    Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    Пример вывода (тут показана только одна строка):
    Sim - 5*/

    public static void collectionObjectValue() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.6:");

        Map<String, Object> collectionObjectValue = new HashMap<>();
        collectionObjectValue.put("System", 8979);
        collectionObjectValue.put("Second", "String");
        collectionObjectValue.put("Third", 9870897.9080);
        collectionObjectValue.put("Destiny", 98327049328704987.9038);
        collectionObjectValue.put("Birthday", "On Baly");
        collectionObjectValue.put("Male", 8979);
        collectionObjectValue.put("FemALE", "String");
        collectionObjectValue.put("Eighth", 9870897.9080);
        collectionObjectValue.put("Major", 98327049328704987.9038);
        collectionObjectValue.put("Ukraine", null);

        System.out.println("Collection with Object type values output:");
        for (Map.Entry<String, Object> pair : collectionObjectValue.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    /* 5.2.7 5 различных строчек в списке
    1. Создай список строк.
    2. Добавь в него 5 различных строчек.
    3. Выведи его размер на экран.
    4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки*/

    public static void someList() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.7:");

        List<String> someStrings = new ArrayList<>();
        someStrings.add("First string");
        someStrings.add("Second string");
        someStrings.add("Third string");
        someStrings.add("Fourth string");
        someStrings.add("Fifth string");

        System.out.println("The arrayList contains " + someStrings.size() + " strings:");
        for (int i = 0; i < someStrings.size(); i++) {
            System.out.println(someStrings.get(i));
        }
        System.out.println("Second output option:");
        for (String x : someStrings) System.out.println(x);
    }

    /* 5.2.8 Самая длинная строка
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую длинную строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки.*/
    public static void longestString() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.8:");
        List<String> writeStrings = new ArrayList<String>();
        //writeStrings.add("Fourth element");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");

        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            writeStrings.add(name);
        }
        //System.out.println("Test output: " + Arrays.asList(writeStrings));

        int max = 0;
        int idx = -1;
        for (int i = 0; i < writeStrings.size(); i++) {

            int length = writeStrings.get(i).length();
            if (length > max) {
                max = length;
                idx = i;
            }
        }
        System.out.println("The first longest string is:");
        System.out.println(writeStrings.get(idx));
        //System.out.println(max);

        for (String s : writeStrings)
            if (s.length() == max) System.out.println("The longest string is: " + s);
    }

    /* 5.2.9 Самая короткая строка
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую короткую строку в списке.
    4. Выведи найденную строку на экран.
    5. Если таких строк несколько, выведи каждую с новой строки*/
    public static void shortestString() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.9:");
        List<String> shortestString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            shortestString.add(s);
        }

        int min = 1000000;
        for (int i = 0; i < shortestString.size(); i++) {
            if (shortestString.get(i).length() < min) min = shortestString.get(i).length();
        }
        //System.out.println("Minimum lenth is: " + min);

        for (String t : shortestString)
            if (t.length() == min) System.out.println("The shortest element is: " + t);
    }

    /* 5.2.10 10 строчек в начало списка
    1. Создай список строк в методе main.
    2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
    3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.*/
    public static void addtoBeginning(List<String> addToBeginningList) {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.10:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            addToBeginningList.add(0, scanner.nextLine());
        }
        System.out.println("List output: ");
        for (String s : addToBeginningList) System.out.println(s);
    }

    /* 5.2.11 Удали последнюю строку и вставь её в начало
    1. Создай список строк.
    2. Добавь в него 5 строчек с клавиатуры.
    3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
    4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки*/
    public static void cutAndPastString() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.11:");
        List<String> cutAndPastString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 strings:");
        for (int i = 0; i < 5; i++) {
            cutAndPastString.add(scanner.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            cutAndPastString.add(0, cutAndPastString.remove(cutAndPastString.size() - 1));
        }
        System.out.println("Updated list:");
        for (String x : cutAndPastString) System.out.println(x);
    }

    /* 5.2.12 Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».*/
    public static void fillUpSetOfWordsFromL() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.12:");
        Set<String> setOfWordsFromL = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            setOfWordsFromL.add("Л" + i);
        }
        System.out.println("20 words from Л: ");
        for (String x : setOfWordsFromL) {
            System.out.println(x);
        }
    }

    /* 5.2.13 Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
    Удалить из множества все числа больше 10 */
    public static void filterSetOfRandomNumbers() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.13:");
        Set<Integer> setOfRandomNumbers = new HashSet<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            setOfRandomNumbers.add(random.nextInt(31));
        }
        setOfRandomNumbers.removeIf(integer -> integer > 10); // Java8 proposed this code instead of using Iterator and generated it of itself after my consent

        /* Iterator<Integer> iterator = setOfRandomNumbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) iterator.remove();
        } */

        System.out.println("Set of random numbers less than 11:");
        System.out.println(setOfRandomNumbers.toString());
    }

    /* 5.2.14 Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
    Проверить сколько людей имеют совпадающие с заданным имя или фамилию.*/
    public static void checkMapOfNamesAndSurnames() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.14:");
        Map<String, String> mapOfNamesAndSurnames = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 Names and Lastnames in format: 'Name Lastname'");
        for (int i = 0; i < 10; i++) {
            mapOfNamesAndSurnames.put(scanner.next(), scanner.nextLine());
        }

        System.out.println("Entire map: ");
        System.out.println(mapOfNamesAndSurnames.toString());

        System.out.println("Matches: ");
        Map<String, String> mapOfMatches = new HashMap<>();
        for (Map.Entry<String, String> pair : mapOfNamesAndSurnames.entrySet()) {
            if (pair.getKey().equals("Inna") | pair.getValue().equals(" Bagmut")) {
                //System.out.println(pair.getKey());
                mapOfMatches.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println("Output of filtered map:");
        System.out.println(mapOfMatches.toString());
        System.out.println("Number of people with the same name or lastname: " + mapOfMatches.size());

        System.out.println("Option 2:");
        int quantity = 0;
        for (Map.Entry<String, String> pair : mapOfNamesAndSurnames.entrySet()) {
            if (pair.getKey().equals("Inna") | pair.getValue().equals(" Bagmut")) {
                quantity++;
            }
        }
        System.out.println("Number of people with the same name or lastname: " + quantity);
    }

    /* 5.2.15 Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу:
    «фамилия» - «дата рождения». Удалить из словаря всех людей, родившихся летом.*/
    public static void deleteSummerDatesFromMap() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.15:");
        Random random = new Random();
        Map<String, LocalDate> mapOfLastnamesAndBirthdays = new HashMap<>();
        mapOfLastnamesAndBirthdays.put("Helen", LocalDate.of(2000, 12, 12));
        mapOfLastnamesAndBirthdays.put("Andrea", LocalDate.of(1975, 6, 30));
/*        for (int i = 0; i < 10; i++) {
            mapOfLastnamesAndBirthdays.put("LastName" + random.nextInt(10), LocalDate.of(1900 + random.nextInt(110), 1 + random.nextInt(11), 1 + random.nextInt(27)));
        }*/
        while (mapOfLastnamesAndBirthdays.size() < 10) {
            mapOfLastnamesAndBirthdays.put("LastName" + random.nextInt(10), LocalDate.of(1900 + random.nextInt(110), 1 + random.nextInt(12), 1 + random.nextInt(28)));
        }
        System.out.println(mapOfLastnamesAndBirthdays.toString());

        System.out.println("");
        System.out.println("Map output except entries with summer months:");
        for (Map.Entry<String, LocalDate> pair : mapOfLastnamesAndBirthdays.entrySet()) {
            if (pair.getValue().getMonthValue() > 5 && pair.getValue().getMonthValue() < 9)
                mapOfLastnamesAndBirthdays.remove(pair);
            else System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    /* 5.2.16 Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
    Удалить людей, имеющих одинаковые имена */
    public static void deleteEntriesWithSimilarNames() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.16:");
        Map<String, String> mapLastnamesNames = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            mapLastnamesNames.put("LastName" + random.nextInt(10), "Name" + random.nextInt(10));
        }
        mapLastnamesNames.put("LastNameA", "Sim");
        mapLastnamesNames.put("LastNameB", "Sim");

        for (Map.Entry<String, String> pair : mapLastnamesNames.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

        System.out.println("Map with deleted entries that saved similar lastnames:");
        for (Map.Entry<String, String> pair1 : mapLastnamesNames.entrySet()) {
            for (Map.Entry<String, String> pair2 : mapLastnamesNames.entrySet()) {
                if (!(pair1.getKey().equals(pair2.getKey())) && pair1.getValue().equals(pair2.getValue()))
                    mapLastnamesNames.remove(pair1.getKey()); //сохранить в List или заменить имена на ToDelete
            } // I wanted to resolve it without creating another map or set, but didn't figure out how...
            // and i want to get, why my solution doesn't work
            System.out.println(pair1.getKey() + " - " + pair1.getValue());
        }

        System.out.println("Separate output:");
        for (Map.Entry<String, String> pair : mapLastnamesNames.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    public static Map<String, String> createMapOption2() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.16 Option2:");
        Map<String, String> mapLastnamesNames = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            mapLastnamesNames.put("LastName" + random.nextInt(10), "Name" + random.nextInt(10));
        }
        mapLastnamesNames.put("LastNameA", "Sim");
        mapLastnamesNames.put("LastNameB", "Sim");
        //String originalValue = mapLastnamesNames.get

        System.out.println("Filled map:");
        for (Map.Entry<String, String> pair : mapLastnamesNames.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
        return mapLastnamesNames;
    }

    public static void removeEntriesWithSimilarNames(Map<String, String> map) {
        List<String> counter = new ArrayList<>(map.values());
        for (String a : counter) {
            int count = 0;
            for (int i = 0; i < counter.size(); i++) {
                if (a.equals(counter.get(i))) count++;
            }
            if (count > 1) removeEntry(map, a);
        }
        System.out.println("");
        System.out.println("Result:");
        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
    }

    private static void removeEntry(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    // This is just self education, not for reviewing:
    // Создать словарик mapNameCount, затнести в него key - скопированное value из map,
    // value - количество повторяющихся имён
    public static void countDuplicates(Map<String, String> map) {
        Map<String, Integer> mapNameCount = new HashMap<>();
        int count = 0;

        System.out.println("Option 1:");
/*        for (Map.Entry<String, String> pair1 : map.entrySet()) {
            for (Map.Entry<String, String> pair2 : map.entrySet()) {
                if (!pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue())) count++;
            }
            mapNameCount.put(pair1.getValue(), count);
        }*/
/*        for (Map.Entry<String, String> pair : map.entrySet()) {
            mapNameCount.put(pair.getValue(), count);
        }
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (mapNameCount.containsKey(pair.getValue())) count++;
            mapNameCount.put(pair.getValue(), count);
        }
        System.out.println(mapNameCount);*/

        /*
        System.out.println("Option 2:");
        List<String> names = new ArrayList<>(map.values());
        for (String a : names) {
            for (int i = 0; i < names.size(); i++) {
                if (a.equals(names.get(i))) count++;
            }
            mapNameCount.put(a, count);
        }*/

        //Option3
        for (Map.Entry<String, String> pair1 : map.entrySet()) {
            String name = pair1.getValue();
            if (mapNameCount.containsKey(name)) {
                mapNameCount.replace(name, mapNameCount.get(name)+1);
            }
            else {
                mapNameCount.put(name, 1);
            }
        }

        System.out.println(mapNameCount);
    }

    /* 5.2.17
    1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
    2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
    3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
    4. Вывести содержимое Map на экран. */

    public static void createmapWithSimilarLastnamesAndNames() {
        System.out.println("================================================================================");
        System.out.println("Task 5.2.17:");
        Map<String, String> mapWithSimilarLastnamesAndNames = new HashMap<>();
        Random random = new Random();
        mapWithSimilarLastnamesAndNames.put("Chillie", "Cler");
        mapWithSimilarLastnamesAndNames.put("Rainy", "Diana");
        mapWithSimilarLastnamesAndNames.put("Chillie", "Bim");
        while (mapWithSimilarLastnamesAndNames.size() < 10) {
            mapWithSimilarLastnamesAndNames.put("Lastname" + random.nextInt(8), "Name" + random.nextInt(3));
        }

        for (Map.Entry<String, String> pair : mapWithSimilarLastnamesAndNames.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
        System.out.println("Entry with repeated key replaces the first one");
    }
}
