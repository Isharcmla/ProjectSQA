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

public class CharacterReader_consumeTo_1542601656117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22555;

    public CharacterReader_consumeTo_1542601656117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22555 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term22605 = newInstance(Class.forName("java.io.BufferedReader"));
        setIntField(term22555, term22555.getClass(), "bufPos", -2147483648);
        setIntField(term22555, term22555.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term22555, term22555.getClass(), "readerPos", 0);
        setField(term22555, term22555.getClass(), "reader", term22605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "consumeTo", argTypes, term22555, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


