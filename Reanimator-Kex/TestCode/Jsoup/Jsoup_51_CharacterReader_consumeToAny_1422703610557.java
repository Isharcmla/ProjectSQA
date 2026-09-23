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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5112955;
     Object term5112322;

    public CharacterReader_consumeToAny_1422703610557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5112955 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5112325 = (char[]) newCharArray(233);
        setIntField(term5112955, term5112955.getClass(), "pos", -1594883902);
        setIntField(term5112955, term5112955.getClass(), "length", -1594883894);
        setCharElement(term5112325, 0, (char) 2048);
        setCharElement(term5112325, 1, (char) 2048);
        setCharElement(term5112325, 2, (char) 2048);
        setCharElement(term5112325, 3, (char) 2048);
        setCharElement(term5112325, 4, (char) 2048);
        setCharElement(term5112325, 5, (char) 2048);
        setCharElement(term5112325, 6, (char) 2048);
        setCharElement(term5112325, 7, (char) 2048);
        setCharElement(term5112325, 8, (char) 2048);
        setCharElement(term5112325, 9, (char) 2048);
        setCharElement(term5112325, 10, (char) 2048);
        setCharElement(term5112325, 11, (char) 2048);
        setCharElement(term5112325, 12, (char) 2048);
        setCharElement(term5112325, 13, (char) 2048);
        setCharElement(term5112325, 14, (char) 2048);
        setCharElement(term5112325, 15, (char) 2048);
        setCharElement(term5112325, 16, (char) 2048);
        setCharElement(term5112325, 17, (char) 2048);
        setField(term5112955, term5112955.getClass(), "input", term5112325);
        setField(term5112955, term5112955.getClass(), "stringCache", null);
        term5112322 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5112322;
        try {
            callMethod(klass, "consumeToAny", argTypes, term5112955, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


