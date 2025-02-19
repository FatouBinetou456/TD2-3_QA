package sn.fbd.qa.junit;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    public static String convertUpperCase(String input) {
        return (input == null) ? null : input.toUpperCase();
    }
    public static List<String> filterNames(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
     }
}