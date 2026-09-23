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

public class CharacterReader_init_2130144751301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64261;

    public CharacterReader_init_2130144751301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64163 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term63556 = (Object[]) newArray("java.lang.String", 0);
        Object term64207 = newInstance(Class.forName("java.io.PipedReader"));
        char[] term64057 = (char[]) newCharArray(0);
        setField(term64163, term64163.getClass(), "stringCache", term63556);
        setField(term64163, term64163.getClass(), "reader", term64207);
        setField(term64163, term64163.getClass(), "charBuf", term64057);
        setIntField(term64163, term64163.getClass(), "bufPos", -2147483648);
        setIntField(term64163, term64163.getClass(), "bufSplitPoint", -2147483648);
        term64261 = newInstance(Class.forName("java.io.LineNumberReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term64261;
        args[1] = 498;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


