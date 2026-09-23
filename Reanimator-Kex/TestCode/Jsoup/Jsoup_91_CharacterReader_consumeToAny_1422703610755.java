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

public class CharacterReader_consumeToAny_1422703610755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212163;
     Object term211028;

    public CharacterReader_consumeToAny_1422703610755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212163 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term211032 = (char[]) newCharArray(497);
        setIntField(term212163, term212163.getClass(), "bufPos", 268435456);
        setIntField(term212163, term212163.getClass(), "bufSplitPoint", 268435457);
        setIntField(term212163, term212163.getClass(), "bufLength", 268435463);
        setCharElement(term211032, 0, (char) 512);
        setCharElement(term211032, 1, (char) 512);
        setCharElement(term211032, 2, (char) 512);
        setCharElement(term211032, 3, (char) 512);
        setCharElement(term211032, 4, (char) 512);
        setCharElement(term211032, 5, (char) 512);
        setCharElement(term211032, 6, (char) 512);
        setCharElement(term211032, 7, (char) 512);
        setCharElement(term211032, 8, (char) 512);
        setCharElement(term211032, 9, (char) 512);
        setCharElement(term211032, 10, (char) 512);
        setCharElement(term211032, 11, (char) 512);
        setCharElement(term211032, 12, (char) 512);
        setCharElement(term211032, 13, (char) 512);
        setCharElement(term211032, 14, (char) 512);
        setCharElement(term211032, 15, (char) 512);
        setCharElement(term211032, 16, (char) 512);
        setCharElement(term211032, 17, (char) 512);
        setCharElement(term211032, 18, (char) 512);
        setCharElement(term211032, 19, (char) 512);
        setCharElement(term211032, 20, (char) 512);
        setCharElement(term211032, 21, (char) 512);
        setCharElement(term211032, 22, (char) 512);
        setCharElement(term211032, 23, (char) 512);
        setCharElement(term211032, 24, (char) 512);
        setCharElement(term211032, 25, (char) 512);
        setCharElement(term211032, 26, (char) 512);
        setCharElement(term211032, 27, (char) 512);
        setCharElement(term211032, 28, (char) 512);
        setCharElement(term211032, 29, (char) 512);
        setCharElement(term211032, 30, (char) 512);
        setCharElement(term211032, 31, (char) 512);
        setCharElement(term211032, 32, (char) 512);
        setCharElement(term211032, 33, (char) 512);
        setCharElement(term211032, 34, (char) 512);
        setCharElement(term211032, 35, (char) 512);
        setCharElement(term211032, 36, (char) 512);
        setCharElement(term211032, 37, (char) 512);
        setCharElement(term211032, 38, (char) 512);
        setCharElement(term211032, 39, (char) 512);
        setCharElement(term211032, 40, (char) 512);
        setCharElement(term211032, 41, (char) 512);
        setCharElement(term211032, 42, (char) 512);
        setField(term212163, term212163.getClass(), "charBuf", term211032);
        setField(term212163, term212163.getClass(), "stringCache", null);
        term211028 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term211028;
        try {
            callMethod(klass, "consumeToAny", argTypes, term212163, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


