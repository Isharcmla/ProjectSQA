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
import java.lang.Object;

public class CharacterReader_consumeToAny_1422703610470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116667;
     Object term116251;

    public CharacterReader_consumeToAny_1422703610470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116667 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term116255 = (char[]) newCharArray(133);
        Object[] term116522 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term116667, term116667.getClass(), "bufPos", 130);
        setIntField(term116667, term116667.getClass(), "bufSplitPoint", 131);
        setIntField(term116667, term116667.getClass(), "bufLength", 135);
        setCharElement(term116255, 1, (char) 1);
        setCharElement(term116255, 2, (char) 1);
        setCharElement(term116255, 3, (char) 1);
        setCharElement(term116255, 4, (char) 1);
        setCharElement(term116255, 5, (char) 1);
        setCharElement(term116255, 6, (char) 1);
        setCharElement(term116255, 7, (char) 1);
        setCharElement(term116255, 8, (char) 1);
        setCharElement(term116255, 9, (char) 1);
        setCharElement(term116255, 10, (char) 1);
        setCharElement(term116255, 11, (char) 1);
        setCharElement(term116255, 12, (char) 1);
        setCharElement(term116255, 13, (char) 1);
        setCharElement(term116255, 14, (char) 1);
        setCharElement(term116255, 15, (char) 1);
        setCharElement(term116255, 16, (char) 1);
        setCharElement(term116255, 17, (char) 1);
        setCharElement(term116255, 18, (char) 1);
        setCharElement(term116255, 19, (char) 1);
        setCharElement(term116255, 20, (char) 1);
        setCharElement(term116255, 21, (char) 1);
        setCharElement(term116255, 22, (char) 1);
        setCharElement(term116255, 23, (char) 1);
        setCharElement(term116255, 24, (char) 1);
        setCharElement(term116255, 25, (char) 1);
        setCharElement(term116255, 26, (char) 1);
        setCharElement(term116255, 27, (char) 1);
        setCharElement(term116255, 28, (char) 1);
        setCharElement(term116255, 29, (char) 1);
        setCharElement(term116255, 30, (char) 1);
        setCharElement(term116255, 31, (char) 1);
        setCharElement(term116255, 32, (char) 1);
        setCharElement(term116255, 33, (char) 1);
        setCharElement(term116255, 34, (char) 1);
        setCharElement(term116255, 35, (char) 1);
        setCharElement(term116255, 36, (char) 1);
        setCharElement(term116255, 37, (char) 1);
        setCharElement(term116255, 38, (char) 1);
        setCharElement(term116255, 39, (char) 1);
        setCharElement(term116255, 40, (char) 1);
        setCharElement(term116255, 41, (char) 1);
        setCharElement(term116255, 42, (char) 1);
        setCharElement(term116255, 43, (char) 1);
        setCharElement(term116255, 44, (char) 1);
        setCharElement(term116255, 45, (char) 1);
        setCharElement(term116255, 46, (char) 1);
        setCharElement(term116255, 47, (char) 1);
        setCharElement(term116255, 48, (char) 1);
        setCharElement(term116255, 49, (char) 1);
        setCharElement(term116255, 50, (char) 1);
        setCharElement(term116255, 51, (char) 1);
        setCharElement(term116255, 52, (char) 1);
        setCharElement(term116255, 53, (char) 1);
        setCharElement(term116255, 54, (char) 1);
        setCharElement(term116255, 55, (char) 1);
        setCharElement(term116255, 56, (char) 1);
        setCharElement(term116255, 57, (char) 1);
        setCharElement(term116255, 58, (char) 1);
        setCharElement(term116255, 59, (char) 1);
        setCharElement(term116255, 60, (char) 1);
        setCharElement(term116255, 61, (char) 1);
        setCharElement(term116255, 62, (char) 1);
        setCharElement(term116255, 63, (char) 1);
        setCharElement(term116255, 64, (char) 1);
        setCharElement(term116255, 65, (char) 1);
        setCharElement(term116255, 66, (char) 1);
        setCharElement(term116255, 67, (char) 1);
        setCharElement(term116255, 68, (char) 1);
        setCharElement(term116255, 69, (char) 1);
        setCharElement(term116255, 70, (char) 1);
        setCharElement(term116255, 71, (char) 1);
        setCharElement(term116255, 72, (char) 1);
        setCharElement(term116255, 73, (char) 1);
        setCharElement(term116255, 74, (char) 1);
        setCharElement(term116255, 75, (char) 1);
        setCharElement(term116255, 76, (char) 1);
        setCharElement(term116255, 77, (char) 1);
        setCharElement(term116255, 78, (char) 1);
        setCharElement(term116255, 79, (char) 1);
        setCharElement(term116255, 80, (char) 1);
        setCharElement(term116255, 81, (char) 1);
        setCharElement(term116255, 82, (char) 1);
        setCharElement(term116255, 83, (char) 1);
        setCharElement(term116255, 84, (char) 1);
        setCharElement(term116255, 85, (char) 1);
        setCharElement(term116255, 86, (char) 1);
        setCharElement(term116255, 87, (char) 1);
        setCharElement(term116255, 88, (char) 1);
        setCharElement(term116255, 89, (char) 1);
        setCharElement(term116255, 90, (char) 1);
        setCharElement(term116255, 91, (char) 1);
        setCharElement(term116255, 92, (char) 1);
        setCharElement(term116255, 93, (char) 1);
        setCharElement(term116255, 94, (char) 1);
        setCharElement(term116255, 95, (char) 1);
        setCharElement(term116255, 96, (char) 1);
        setCharElement(term116255, 97, (char) 1);
        setCharElement(term116255, 98, (char) 1);
        setCharElement(term116255, 99, (char) 1);
        setCharElement(term116255, 100, (char) 1);
        setCharElement(term116255, 101, (char) 1);
        setCharElement(term116255, 102, (char) 1);
        setCharElement(term116255, 103, (char) 1);
        setCharElement(term116255, 104, (char) 1);
        setCharElement(term116255, 105, (char) 1);
        setCharElement(term116255, 106, (char) 1);
        setCharElement(term116255, 107, (char) 1);
        setCharElement(term116255, 108, (char) 1);
        setCharElement(term116255, 109, (char) 1);
        setCharElement(term116255, 110, (char) 1);
        setCharElement(term116255, 111, (char) 1);
        setCharElement(term116255, 112, (char) 1);
        setCharElement(term116255, 113, (char) 1);
        setCharElement(term116255, 114, (char) 1);
        setCharElement(term116255, 115, (char) 1);
        setCharElement(term116255, 116, (char) 1);
        setCharElement(term116255, 117, (char) 1);
        setCharElement(term116255, 118, (char) 1);
        setCharElement(term116255, 119, (char) 1);
        setCharElement(term116255, 120, (char) 1);
        setCharElement(term116255, 121, (char) 1);
        setCharElement(term116255, 122, (char) 1);
        setCharElement(term116255, 123, (char) 1);
        setCharElement(term116255, 124, (char) 1);
        setCharElement(term116255, 125, (char) 1);
        setCharElement(term116255, 126, (char) 1);
        setCharElement(term116255, 127, (char) 1);
        setCharElement(term116255, 128, (char) 1);
        setCharElement(term116255, 129, (char) 1);
        setCharElement(term116255, 130, (char) 1);
        setCharElement(term116255, 131, (char) 1);
        setCharElement(term116255, 132, (char) 1);
        setField(term116667, term116667.getClass(), "charBuf", term116255);
        setField(term116667, term116667.getClass(), "stringCache", term116522);
        term116251 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term116251;
        try {
            callMethod(klass, "consumeToAny", argTypes, term116667, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


