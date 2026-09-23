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

public class CharacterReader_consumeToAny_1422703610537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141555;
     Object term141211;

    public CharacterReader_consumeToAny_1422703610537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141555 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term141215 = (char[]) newCharArray(106);
        setIntField(term141555, term141555.getClass(), "bufPos", -2147482624);
        setIntField(term141555, term141555.getClass(), "bufSplitPoint", -2147482623);
        setIntField(term141555, term141555.getClass(), "bufLength", -2147482621);
        setCharElement(term141215, 0, (char) 1024);
        setCharElement(term141215, 1, (char) 1024);
        setCharElement(term141215, 2, (char) 1024);
        setCharElement(term141215, 3, (char) 1024);
        setCharElement(term141215, 4, (char) 1024);
        setCharElement(term141215, 5, (char) 1024);
        setCharElement(term141215, 6, (char) 1024);
        setCharElement(term141215, 7, (char) 1024);
        setCharElement(term141215, 8, (char) 1024);
        setCharElement(term141215, 9, (char) 1024);
        setCharElement(term141215, 10, (char) 1024);
        setCharElement(term141215, 11, (char) 1024);
        setCharElement(term141215, 12, (char) 1024);
        setCharElement(term141215, 13, (char) 1024);
        setCharElement(term141215, 14, (char) 1024);
        setCharElement(term141215, 15, (char) 1024);
        setCharElement(term141215, 16, (char) 1024);
        setCharElement(term141215, 17, (char) 1024);
        setCharElement(term141215, 18, (char) 1024);
        setCharElement(term141215, 19, (char) 1024);
        setCharElement(term141215, 20, (char) 1024);
        setCharElement(term141215, 21, (char) 1024);
        setCharElement(term141215, 22, (char) 1024);
        setCharElement(term141215, 23, (char) 1024);
        setCharElement(term141215, 24, (char) 1024);
        setCharElement(term141215, 25, (char) 1024);
        setCharElement(term141215, 26, (char) 1024);
        setCharElement(term141215, 27, (char) 1024);
        setCharElement(term141215, 28, (char) 1024);
        setCharElement(term141215, 29, (char) 1024);
        setCharElement(term141215, 30, (char) 1024);
        setCharElement(term141215, 31, (char) 1024);
        setCharElement(term141215, 32, (char) 1024);
        setCharElement(term141215, 33, (char) 1024);
        setCharElement(term141215, 34, (char) 1024);
        setCharElement(term141215, 35, (char) 1024);
        setCharElement(term141215, 36, (char) 1024);
        setCharElement(term141215, 37, (char) 1024);
        setCharElement(term141215, 38, (char) 1024);
        setCharElement(term141215, 39, (char) 1024);
        setCharElement(term141215, 40, (char) 1024);
        setCharElement(term141215, 41, (char) 1024);
        setCharElement(term141215, 42, (char) 1024);
        setCharElement(term141215, 43, (char) 1024);
        setCharElement(term141215, 44, (char) 1024);
        setCharElement(term141215, 45, (char) 1024);
        setCharElement(term141215, 46, (char) 1024);
        setCharElement(term141215, 47, (char) 1024);
        setCharElement(term141215, 48, (char) 1024);
        setCharElement(term141215, 49, (char) 1024);
        setCharElement(term141215, 50, (char) 1024);
        setCharElement(term141215, 51, (char) 1024);
        setCharElement(term141215, 52, (char) 1024);
        setCharElement(term141215, 53, (char) 1024);
        setCharElement(term141215, 54, (char) 1024);
        setCharElement(term141215, 55, (char) 1024);
        setCharElement(term141215, 56, (char) 1024);
        setCharElement(term141215, 57, (char) 1024);
        setCharElement(term141215, 58, (char) 1024);
        setCharElement(term141215, 59, (char) 1024);
        setCharElement(term141215, 60, (char) 1024);
        setCharElement(term141215, 61, (char) 1024);
        setCharElement(term141215, 62, (char) 1024);
        setCharElement(term141215, 63, (char) 1024);
        setCharElement(term141215, 64, (char) 1024);
        setCharElement(term141215, 65, (char) 1024);
        setCharElement(term141215, 66, (char) 1024);
        setCharElement(term141215, 67, (char) 1024);
        setCharElement(term141215, 68, (char) 1024);
        setCharElement(term141215, 69, (char) 1024);
        setCharElement(term141215, 70, (char) 1024);
        setCharElement(term141215, 71, (char) 1024);
        setCharElement(term141215, 72, (char) 1024);
        setCharElement(term141215, 73, (char) 1024);
        setCharElement(term141215, 74, (char) 1024);
        setCharElement(term141215, 75, (char) 1024);
        setCharElement(term141215, 76, (char) 1024);
        setCharElement(term141215, 77, (char) 1024);
        setCharElement(term141215, 78, (char) 1024);
        setCharElement(term141215, 79, (char) 1024);
        setCharElement(term141215, 80, (char) 1024);
        setCharElement(term141215, 81, (char) 1024);
        setCharElement(term141215, 82, (char) 1024);
        setCharElement(term141215, 83, (char) 1024);
        setCharElement(term141215, 84, (char) 1024);
        setCharElement(term141215, 85, (char) 1024);
        setCharElement(term141215, 86, (char) 1024);
        setCharElement(term141215, 87, (char) 1024);
        setCharElement(term141215, 88, (char) 1024);
        setCharElement(term141215, 89, (char) 1024);
        setCharElement(term141215, 90, (char) 1024);
        setCharElement(term141215, 91, (char) 1024);
        setCharElement(term141215, 92, (char) 1024);
        setCharElement(term141215, 93, (char) 1024);
        setCharElement(term141215, 94, (char) 1024);
        setCharElement(term141215, 95, (char) 1024);
        setCharElement(term141215, 96, (char) 1024);
        setCharElement(term141215, 97, (char) 1024);
        setCharElement(term141215, 98, (char) 1024);
        setCharElement(term141215, 99, (char) 1024);
        setCharElement(term141215, 100, (char) 1024);
        setCharElement(term141215, 101, (char) 1024);
        setCharElement(term141215, 102, (char) 1024);
        setCharElement(term141215, 103, (char) 1024);
        setCharElement(term141215, 104, (char) 1024);
        setCharElement(term141215, 105, (char) 1024);
        setField(term141555, term141555.getClass(), "charBuf", term141215);
        setField(term141555, term141555.getClass(), "stringCache", null);
        term141211 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term141211;
        try {
            callMethod(klass, "consumeToAny", argTypes, term141555, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


