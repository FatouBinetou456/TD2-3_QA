package sn.fbd.qa.junit;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class PersonTest {



    @Test
    public void testAli() {

        Person ali= new Person("Alice", 30);
        assertThat(ali.getName()).isEqualTo("Alice");
        assertThat(ali.getAge()).isGreaterThan(20);
    }
}
