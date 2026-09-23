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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_nextIndexOf_166754358283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17050;

    public CharacterReader_nextIndexOf_166754358283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17050 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term17096 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term17050, term17050.getClass(), "bufPos", -2147483648);
        setIntField(term17050, term17050.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term17050, term17050.getClass(), "readerPos", 0);
        setField(term17050, term17050.getClass(), "reader", term17096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term17050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


