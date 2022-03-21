package main;

import org.apache.commons.lang3.StringUtils;
import util.Input;

public class Strings {
    public static Input input = new Input();

    public static void main(String[] args) {

        String userString = input.getString("\nEnter something:");
        doStuff(userString);

    }

    public static void doStuff(String userString) {
        System.out.printf("You entered: \"%s\".\n", userString);
        boolean isANum = StringUtils.isNumeric(userString);
        if (isANum) {
            System.out.printf("\"%s\" is a number.\n", userString);
        } else {
            System.out.printf("%s is not a number.\n", userString);
        }
        String swapped = StringUtils.swapCase(userString);
        System.out.printf("Flipped cased: %s\n", swapped);
        String reversed = StringUtils.reverse(userString);
        System.out.printf("Reversed: %s\n", reversed);
    }

}
