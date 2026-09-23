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

public class CharacterReader_matchConsume_2104464962561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157333;

    public CharacterReader_matchConsume_2104464962561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157333 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term157383 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term157333, term157333.getClass(), "bufPos", -2147483648);
        setIntField(term157333, term157333.getClass(), "bufSplitPoint", -2147483648);
        setField(term157333, term157333.getClass(), "reader", term157383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchConsume", argTypes, term157333, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


