package sn.fbd.qa.junit;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static sn.fbd.qa.junit.StringUtils.filterNames;

public class StringUtilsTest {

        @Test
        void testConvertUpperCase() {
            // Vérifie que "java" devient "JAVA"
            assertThat(StringUtils.convertUpperCase("java")).isEqualTo("JAVA");
        }


    @Test
    void testContient(){
        // Vérifie que "Test" contient "es"
  assertThat("Test").contains("es");
    }
//
//
    @Test
    void testContient2(){
        // Vérifie que "Hello" commence par "He" et finit par "o"
    assertThat("Hello").startsWith("He");
    assertThat("Hello").endsWith("o");
    }

// // // //   Exercice 2

    @Test
    void testListe(){
        List<String> filteredList = StringUtils.filterNames(Stream.of("Alice", "Bob", "Anna").collect(Collectors.toList()));

        assertThat(filteredList).containsExactly("Alice", "Anna");
        assertThat(filteredList).doesNotContain("Bob");
        assertThat(filteredList).hasSize(2);

    }
}
