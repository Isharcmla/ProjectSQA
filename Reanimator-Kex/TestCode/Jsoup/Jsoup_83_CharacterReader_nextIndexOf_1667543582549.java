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

public class CharacterReader_nextIndexOf_1667543582549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154372;

    public CharacterReader_nextIndexOf_1667543582549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154372 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term154426 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term154372, term154372.getClass(), "bufPos", -2147483648);
        setIntField(term154372, term154372.getClass(), "bufSplitPoint", -2147483648);
        setField(term154372, term154372.getClass(), "reader", term154426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term154372, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


