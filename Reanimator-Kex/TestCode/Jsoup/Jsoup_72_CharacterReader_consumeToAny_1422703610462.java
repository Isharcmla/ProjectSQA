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

public class CharacterReader_consumeToAny_1422703610462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113203;
     Object term1112860;

    public CharacterReader_consumeToAny_1422703610462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1113203 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1112864 = (char[]) newCharArray(106);
        setIntField(term1113203, term1113203.getClass(), "bufPos", -2147482624);
        setIntField(term1113203, term1113203.getClass(), "bufSplitPoint", -2147482623);
        setIntField(term1113203, term1113203.getClass(), "bufLength", -2147482621);
        setCharElement(term1112864, 0, (char) 1024);
        setCharElement(term1112864, 1, (char) 1024);
        setCharElement(term1112864, 2, (char) 1024);
        setCharElement(term1112864, 3, (char) 1024);
        setCharElement(term1112864, 4, (char) 1024);
        setCharElement(term1112864, 5, (char) 1024);
        setCharElement(term1112864, 6, (char) 1024);
        setCharElement(term1112864, 7, (char) 1024);
        setCharElement(term1112864, 8, (char) 1024);
        setCharElement(term1112864, 9, (char) 1024);
        setCharElement(term1112864, 10, (char) 1024);
        setCharElement(term1112864, 11, (char) 1024);
        setCharElement(term1112864, 12, (char) 1024);
        setCharElement(term1112864, 13, (char) 1024);
        setCharElement(term1112864, 14, (char) 1024);
        setCharElement(term1112864, 15, (char) 1024);
        setCharElement(term1112864, 16, (char) 1024);
        setCharElement(term1112864, 17, (char) 1024);
        setCharElement(term1112864, 18, (char) 1024);
        setCharElement(term1112864, 19, (char) 1024);
        setCharElement(term1112864, 20, (char) 1024);
        setCharElement(term1112864, 21, (char) 1024);
        setCharElement(term1112864, 22, (char) 1024);
        setCharElement(term1112864, 23, (char) 1024);
        setCharElement(term1112864, 24, (char) 1024);
        setCharElement(term1112864, 25, (char) 1024);
        setCharElement(term1112864, 26, (char) 1024);
        setCharElement(term1112864, 27, (char) 1024);
        setCharElement(term1112864, 28, (char) 1024);
        setCharElement(term1112864, 29, (char) 1024);
        setCharElement(term1112864, 30, (char) 1024);
        setCharElement(term1112864, 31, (char) 1024);
        setCharElement(term1112864, 32, (char) 1024);
        setCharElement(term1112864, 33, (char) 1024);
        setCharElement(term1112864, 34, (char) 1024);
        setCharElement(term1112864, 35, (char) 1024);
        setCharElement(term1112864, 36, (char) 1024);
        setCharElement(term1112864, 37, (char) 1024);
        setCharElement(term1112864, 38, (char) 1024);
        setCharElement(term1112864, 39, (char) 1024);
        setCharElement(term1112864, 40, (char) 1024);
        setCharElement(term1112864, 41, (char) 1024);
        setCharElement(term1112864, 42, (char) 1024);
        setCharElement(term1112864, 43, (char) 1024);
        setCharElement(term1112864, 44, (char) 1024);
        setCharElement(term1112864, 45, (char) 1024);
        setCharElement(term1112864, 46, (char) 1024);
        setCharElement(term1112864, 47, (char) 1024);
        setCharElement(term1112864, 48, (char) 1024);
        setCharElement(term1112864, 49, (char) 1024);
        setCharElement(term1112864, 50, (char) 1024);
        setCharElement(term1112864, 51, (char) 1024);
        setCharElement(term1112864, 52, (char) 1024);
        setCharElement(term1112864, 53, (char) 1024);
        setCharElement(term1112864, 54, (char) 1024);
        setCharElement(term1112864, 55, (char) 1024);
        setCharElement(term1112864, 56, (char) 1024);
        setCharElement(term1112864, 57, (char) 1024);
        setCharElement(term1112864, 58, (char) 1024);
        setCharElement(term1112864, 59, (char) 1024);
        setCharElement(term1112864, 60, (char) 1024);
        setCharElement(term1112864, 61, (char) 1024);
        setCharElement(term1112864, 62, (char) 1024);
        setCharElement(term1112864, 63, (char) 1024);
        setCharElement(term1112864, 64, (char) 1024);
        setCharElement(term1112864, 65, (char) 1024);
        setCharElement(term1112864, 66, (char) 1024);
        setCharElement(term1112864, 67, (char) 1024);
        setCharElement(term1112864, 68, (char) 1024);
        setCharElement(term1112864, 69, (char) 1024);
        setCharElement(term1112864, 70, (char) 1024);
        setCharElement(term1112864, 71, (char) 1024);
        setCharElement(term1112864, 72, (char) 1024);
        setCharElement(term1112864, 73, (char) 1024);
        setCharElement(term1112864, 74, (char) 1024);
        setCharElement(term1112864, 75, (char) 1024);
        setCharElement(term1112864, 76, (char) 1024);
        setCharElement(term1112864, 77, (char) 1024);
        setCharElement(term1112864, 78, (char) 1024);
        setCharElement(term1112864, 79, (char) 1024);
        setCharElement(term1112864, 80, (char) 1024);
        setCharElement(term1112864, 81, (char) 1024);
        setCharElement(term1112864, 82, (char) 1024);
        setCharElement(term1112864, 83, (char) 1024);
        setCharElement(term1112864, 84, (char) 1024);
        setCharElement(term1112864, 85, (char) 1024);
        setCharElement(term1112864, 86, (char) 1024);
        setCharElement(term1112864, 87, (char) 1024);
        setCharElement(term1112864, 88, (char) 1024);
        setCharElement(term1112864, 89, (char) 1024);
        setCharElement(term1112864, 90, (char) 1024);
        setCharElement(term1112864, 91, (char) 1024);
        setCharElement(term1112864, 92, (char) 1024);
        setCharElement(term1112864, 93, (char) 1024);
        setCharElement(term1112864, 94, (char) 1024);
        setCharElement(term1112864, 95, (char) 1024);
        setCharElement(term1112864, 96, (char) 1024);
        setCharElement(term1112864, 97, (char) 1024);
        setCharElement(term1112864, 98, (char) 1024);
        setCharElement(term1112864, 99, (char) 1024);
        setCharElement(term1112864, 100, (char) 1024);
        setCharElement(term1112864, 101, (char) 1024);
        setCharElement(term1112864, 102, (char) 1024);
        setCharElement(term1112864, 103, (char) 1024);
        setCharElement(term1112864, 104, (char) 1024);
        setCharElement(term1112864, 105, (char) 1024);
        setField(term1113203, term1113203.getClass(), "charBuf", term1112864);
        setField(term1113203, term1113203.getClass(), "stringCache", null);
        term1112860 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1112860;
        try {
            callMethod(klass, "consumeToAny", argTypes, term1113203, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


