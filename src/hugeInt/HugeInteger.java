package hugeInt;

public class HugeInteger {

    private int[] integerHolder = new int[40];

    public int size(){
        return integerHolder.length;
    }

    public void parse(String elements) {
        int count = elements.length() - 1;
        for (int index = integerHolder.length - 1; index >= integerHolder.length - elements.length(); index--){
            int convert = Integer.parseInt(String.valueOf(elements.charAt(count--)));
            integerHolder[index] = convert;
        }
    }


    public String toString(){
        String result =  "";
        boolean foundFirst = false;
        for (int index = 0; index < integerHolder.length; index++){
            if  (integerHolder[index] != 0) {
                foundFirst = true;
            }

            if (foundFirst){
                result += integerHolder[index];
            }

            if (result.equals("")){
                return "0";
            }

        }
        return result;
    }

    public HugeInteger add(HugeInteger other) {
        HugeInteger hugeInt = new HugeInteger();
        int count = 0;
        for (int index = integerHolder.length - 1; index >= 0; index--){
            if (integerHolder[index] == 0){

            }

        }

        return hugeInt;
    }


    public int emptySpace(){
        return integerHolder.length;
    }

    public void isEqualTo(){}

}