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

public class CharacterReader_nextIndexOf_1667543582153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29131;

    public CharacterReader_nextIndexOf_1667543582153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29131 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term29189 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term29131, term29131.getClass(), "bufPos", -2147483648);
        setIntField(term29131, term29131.getClass(), "bufSplitPoint", -2147483648);
        setField(term29131, term29131.getClass(), "reader", term29189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term29131, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


