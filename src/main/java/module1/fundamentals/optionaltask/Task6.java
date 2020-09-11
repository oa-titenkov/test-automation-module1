package module1.fundamentals.optionaltask;

public class Task6 {

    protected static void printAscendingDigitsNumber(String[] numberArray) {
        Integer ascendingNumber = null;
        boolean ascendingFlag = false;

        for(String item : numberArray) {
            char[] charItem = item.toCharArray();

            if(charItem.length == 1){
                ascendingNumber = Integer.parseInt(item);
                break;
            }

            for(int i = 0; i < charItem.length - 1; i++){
                ascendingFlag = charItem[i] < charItem[i + 1];
                if(!ascendingFlag) break;
            }

            if(ascendingFlag){
                ascendingNumber = Integer.parseInt(item);
                break;
            }
        }

        System.out.println("Ascending number: " + ascendingNumber);
    }

}
