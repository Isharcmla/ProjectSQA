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

public class CharacterReader_consumeToAnySorted_1690453021471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1125203;

    public CharacterReader_consumeToAnySorted_1690453021471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1125203 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1125259 = newInstance(Class.forName("java.io.InputStreamReader"));
        setIntField(term1125203, term1125203.getClass(), "bufPos", -2147483648);
        setIntField(term1125203, term1125203.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1125203, term1125203.getClass(), "readerPos", 0);
        setField(term1125203, term1125203.getClass(), "reader", term1125259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "consumeToAnySorted", argTypes, term1125203, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


