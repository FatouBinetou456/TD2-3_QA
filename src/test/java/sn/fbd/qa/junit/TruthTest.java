package sn.fbd.qa.junit;

import static com.google.common.truth.Truth.*;

import org.junit.jupiter.api.Test;

class TruthTest {

    @Test
    void testInstallation() {
        String message = "Google Truth fonctionne!";
        assertThat(message).isNotNull();
        assertThat(message).isEqualTo("Google Truth fonctionne!");
    }
}