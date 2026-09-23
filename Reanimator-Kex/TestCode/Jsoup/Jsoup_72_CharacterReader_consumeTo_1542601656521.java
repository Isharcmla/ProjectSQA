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

public class CharacterReader_consumeTo_1542601656521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1142146;

    public CharacterReader_consumeTo_1542601656521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1142146 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1142204 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term1142146, term1142146.getClass(), "bufPos", -2147483648);
        setIntField(term1142146, term1142146.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1142146, term1142146.getClass(), "readerPos", 0);
        setField(term1142146, term1142146.getClass(), "reader", term1142204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "consumeTo", argTypes, term1142146, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


