
import java.util.Scanner;

public class Main {
    private static int[] intervals={0, 1, 4, 5, 9, 10, 40, 50, 90, 100};
    private static String[] numerals={"0", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};

    public static void main(String[] args ) {
        System.out.println(" Введите два числа и операцию между ними, a + b  a - b, a * b, a / b");
        String test = " ";
        calc(test);

    }

    public static String calc(String input) {
        try {
            Scanner scanner = new Scanner(System.in);

            String age = scanner.nextLine();
            age.trim();
            String[] RomeNumbers = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                    "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                    "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                    "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            int a = 0, b = 0;
            int a1 = 0, b1 = 0, sum = 0;

            String[] OLine = age.split(" ");
            String[] Line = new String[3];

            System.arraycopy(OLine, 0, Line, 0, OLine.length);


            switch (Line[0]) {

                case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10":
                    a = Integer.parseInt(Line[0]);
                    switch (Line[2]) {
                        case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10":
                            b = Integer.parseInt(Line[2]);

                            if (Line[1].equals("+")) {
                                System.out.println(a + b);
                            } else if (Line[1].equals("-")) {
                                System.out.println(a - b);
                            } else if (Line[1].equals("*")) {
                                System.out.println(a * b);
                            } else if (Line[1].equals("/")) {
                                System.out.println(a / b);
                            }

                            break;
                        default:
                            System.out.println("используются одновременно разные системы счисления или числа не входящие в диапазон от 1 до 10");

                    }
                    break;


                case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X":
                    switch (Line[2]) {

                        case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X":


                            if (Line[0].equals("I")) {
                                a1 = 1;
                            } else if (Line[0].equals("II")) {
                                a1 = 2;
                            } else if (Line[0].equals("III")) {
                                a1 = 3;
                            } else if (Line[0].equals("IV")) {
                                a1 = 4;
                            } else if (Line[0].equals("V")) {
                                a1 = 5;
                            } else if (Line[0].equals("VI")) {
                                a1 = 6;
                            } else if (Line[0].equals("VII")) {
                                a1 = 7;
                            } else if (Line[0].equals("VIII")) {
                                a1 = 8;
                            } else if (Line[0].equals("IX")) {
                                a1 = 9;
                            } else if (Line[0].equals("X")) {
                                a1 = 10;
                            }
                            if (Line[2].equals("I")) {
                                b1 = 1;
                            } else if (Line[2].equals("II")) {
                                b1 = 2;
                            } else if (Line[2].equals("III")) {
                                b1 = 3;
                            } else if (Line[2].equals("IV")) {
                                b1 = 4;
                            } else if (Line[2].equals("V")) {
                                b1 = 5;
                            } else if (Line[2].equals("VI")) {
                                b1 = 6;
                            } else if (Line[2].equals("VII")) {
                                b1 = 7;
                            } else if (Line[2].equals("VIII")) {
                                b1 = 8;
                            } else if (Line[2].equals("IX")) {
                                b1 = 9;
                            } else if (Line[2].equals("X")) {
                                b1 = 10;
                            }

                            if (Line[1].equals("+")) {
                                sum = a1 + b1;

                                System.out.println(RomeNumbers[sum]);
                            } else if (Line[1].equals("-")) {
                                try {
                                    sum = a1 - b1;
                                    System.out.println(RomeNumbers[sum]);
                                }catch (ArrayIndexOutOfBoundsException e){
                                    System.out.println("в римской системе нет отрицательных чисел");
                                };
                            } else if (Line[1].equals("*")) {
                                sum = a1 * b1;
                                System.out.println(RomeNumbers[sum]);
                            } else if (Line[1].equals("/")) {
                                sum = a1 / b1;
                                System.out.println(RomeNumbers[sum]);
                            }


                            break;
                        default:
                            System.out.println("используются одновременно разные системы счисления или числа не входящие в диапазон от 1 до 10");
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + Line[0]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *) с пробелами");
        } catch (NullPointerException e){
            System.out.println("строка не является математической операцией");
        } catch (IllegalStateException e){
            System.out.println("формат математической операции не удовлетворяет заданию - на вход подаются арабские или римские числа от 1 до 10 включительно");

        }

        return null;

    }
}

