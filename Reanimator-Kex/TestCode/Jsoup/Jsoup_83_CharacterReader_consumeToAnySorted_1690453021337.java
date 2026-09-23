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

public class CharacterReader_consumeToAnySorted_1690453021337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72933;

    public CharacterReader_consumeToAnySorted_1690453021337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72933 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term72983 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term72933, term72933.getClass(), "bufPos", -2147483648);
        setIntField(term72933, term72933.getClass(), "bufSplitPoint", -2147483648);
        setField(term72933, term72933.getClass(), "reader", term72983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "consumeToAnySorted", argTypes, term72933, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


