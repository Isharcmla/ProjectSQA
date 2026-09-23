package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeToAnySorted_1690453021319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68527;

    public CharacterReader_consumeToAnySorted_1690453021319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68527 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term68585 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term68527, term68527.getClass(), "bufPos", -2147483648);
        setIntField(term68527, term68527.getClass(), "bufSplitPoint", -2147483648);
        setField(term68527, term68527.getClass(), "reader", term68585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "consumeToAnySorted", argTypes, term68527, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


