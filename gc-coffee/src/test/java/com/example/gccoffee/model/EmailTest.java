package com.example.gccoffee.model;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EmailTest {

    @Test
    public void testEmail() {
        assertThatThrownBy(() -> new Email("accccc"))
            .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testValidEmail() {
        var email = new Email("hello@gmail.com");
        assertThat(email.getAddress()).isEqualTo("hello@gmail.com");
    }

    @Test
    public void testEqEmail() {
        var email = new Email("hello@gmail.com");
        var email2 = new Email("hello@gmail.com");
        assertEquals(email, email2);
    }
}