package com.junitpractice.junit5.part18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void 文字列aaaを渡すと文字列aaaが変える() {
        // setup
        StringUtils sut = new StringUtils();
        String expected = "aaa";

        // execute
        String actual = sut.toSnakeCase("aaa");

        // verify
        assertThat(actual).isEqualTo(expected);
    }
}