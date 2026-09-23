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

public class CharacterReader_consumeToAny_1422703610439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616096;
     Object term615615;

    public CharacterReader_consumeToAny_1422703610439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616096 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term615635 = (char[]) newCharArray(133);
        Object[] term615918 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term616096, term616096.getClass(), "bufPos", 130);
        setIntField(term616096, term616096.getClass(), "bufSplitPoint", 131);
        setIntField(term616096, term616096.getClass(), "bufLength", 135);
        setCharElement(term615635, 1, (char) 1);
        setCharElement(term615635, 2, (char) 1);
        setCharElement(term615635, 3, (char) 1);
        setCharElement(term615635, 4, (char) 1);
        setCharElement(term615635, 5, (char) 1);
        setCharElement(term615635, 6, (char) 1);
        setCharElement(term615635, 7, (char) 1);
        setCharElement(term615635, 8, (char) 1);
        setCharElement(term615635, 9, (char) 1);
        setCharElement(term615635, 10, (char) 1);
        setCharElement(term615635, 11, (char) 1);
        setCharElement(term615635, 12, (char) 1);
        setCharElement(term615635, 13, (char) 1);
        setCharElement(term615635, 14, (char) 1);
        setCharElement(term615635, 15, (char) 1);
        setCharElement(term615635, 16, (char) 1);
        setCharElement(term615635, 17, (char) 1);
        setCharElement(term615635, 18, (char) 1);
        setCharElement(term615635, 19, (char) 1);
        setCharElement(term615635, 20, (char) 1);
        setCharElement(term615635, 21, (char) 1);
        setCharElement(term615635, 22, (char) 1);
        setCharElement(term615635, 23, (char) 1);
        setCharElement(term615635, 24, (char) 1);
        setCharElement(term615635, 25, (char) 1);
        setCharElement(term615635, 26, (char) 1);
        setCharElement(term615635, 27, (char) 1);
        setCharElement(term615635, 28, (char) 1);
        setCharElement(term615635, 29, (char) 1);
        setCharElement(term615635, 30, (char) 1);
        setCharElement(term615635, 31, (char) 1);
        setCharElement(term615635, 32, (char) 1);
        setCharElement(term615635, 33, (char) 1);
        setCharElement(term615635, 34, (char) 1);
        setCharElement(term615635, 35, (char) 1);
        setCharElement(term615635, 36, (char) 1);
        setCharElement(term615635, 37, (char) 1);
        setCharElement(term615635, 38, (char) 1);
        setCharElement(term615635, 39, (char) 1);
        setCharElement(term615635, 40, (char) 1);
        setCharElement(term615635, 41, (char) 1);
        setCharElement(term615635, 42, (char) 1);
        setCharElement(term615635, 43, (char) 1);
        setCharElement(term615635, 44, (char) 1);
        setCharElement(term615635, 45, (char) 1);
        setCharElement(term615635, 46, (char) 1);
        setCharElement(term615635, 47, (char) 1);
        setCharElement(term615635, 48, (char) 1);
        setCharElement(term615635, 49, (char) 1);
        setCharElement(term615635, 50, (char) 1);
        setCharElement(term615635, 51, (char) 1);
        setCharElement(term615635, 52, (char) 1);
        setCharElement(term615635, 53, (char) 1);
        setCharElement(term615635, 54, (char) 1);
        setCharElement(term615635, 55, (char) 1);
        setCharElement(term615635, 56, (char) 1);
        setCharElement(term615635, 57, (char) 1);
        setCharElement(term615635, 58, (char) 1);
        setCharElement(term615635, 59, (char) 1);
        setCharElement(term615635, 60, (char) 1);
        setCharElement(term615635, 61, (char) 1);
        setCharElement(term615635, 62, (char) 1);
        setCharElement(term615635, 63, (char) 1);
        setCharElement(term615635, 64, (char) 1);
        setCharElement(term615635, 65, (char) 1);
        setCharElement(term615635, 66, (char) 1);
        setCharElement(term615635, 67, (char) 1);
        setCharElement(term615635, 68, (char) 1);
        setCharElement(term615635, 69, (char) 1);
        setCharElement(term615635, 70, (char) 1);
        setCharElement(term615635, 71, (char) 1);
        setCharElement(term615635, 72, (char) 1);
        setCharElement(term615635, 73, (char) 1);
        setCharElement(term615635, 74, (char) 1);
        setCharElement(term615635, 75, (char) 1);
        setCharElement(term615635, 76, (char) 1);
        setCharElement(term615635, 77, (char) 1);
        setCharElement(term615635, 78, (char) 1);
        setCharElement(term615635, 79, (char) 1);
        setCharElement(term615635, 80, (char) 1);
        setCharElement(term615635, 81, (char) 1);
        setCharElement(term615635, 82, (char) 1);
        setCharElement(term615635, 83, (char) 1);
        setCharElement(term615635, 84, (char) 1);
        setCharElement(term615635, 85, (char) 1);
        setCharElement(term615635, 86, (char) 1);
        setCharElement(term615635, 87, (char) 1);
        setCharElement(term615635, 88, (char) 1);
        setCharElement(term615635, 89, (char) 1);
        setCharElement(term615635, 90, (char) 1);
        setCharElement(term615635, 91, (char) 1);
        setCharElement(term615635, 92, (char) 1);
        setCharElement(term615635, 93, (char) 1);
        setCharElement(term615635, 94, (char) 1);
        setCharElement(term615635, 95, (char) 1);
        setCharElement(term615635, 96, (char) 1);
        setCharElement(term615635, 97, (char) 1);
        setCharElement(term615635, 98, (char) 1);
        setCharElement(term615635, 99, (char) 1);
        setCharElement(term615635, 100, (char) 1);
        setCharElement(term615635, 101, (char) 1);
        setCharElement(term615635, 102, (char) 1);
        setCharElement(term615635, 103, (char) 1);
        setCharElement(term615635, 104, (char) 1);
        setCharElement(term615635, 105, (char) 1);
        setCharElement(term615635, 106, (char) 1);
        setCharElement(term615635, 107, (char) 1);
        setCharElement(term615635, 108, (char) 1);
        setCharElement(term615635, 109, (char) 1);
        setCharElement(term615635, 110, (char) 1);
        setCharElement(term615635, 111, (char) 1);
        setCharElement(term615635, 112, (char) 1);
        setCharElement(term615635, 113, (char) 1);
        setCharElement(term615635, 114, (char) 1);
        setCharElement(term615635, 115, (char) 1);
        setCharElement(term615635, 116, (char) 1);
        setCharElement(term615635, 117, (char) 1);
        setCharElement(term615635, 118, (char) 1);
        setCharElement(term615635, 119, (char) 1);
        setCharElement(term615635, 120, (char) 1);
        setCharElement(term615635, 121, (char) 1);
        setCharElement(term615635, 122, (char) 1);
        setCharElement(term615635, 123, (char) 1);
        setCharElement(term615635, 124, (char) 1);
        setCharElement(term615635, 125, (char) 1);
        setCharElement(term615635, 126, (char) 1);
        setCharElement(term615635, 127, (char) 1);
        setCharElement(term615635, 128, (char) 1);
        setCharElement(term615635, 129, (char) 1);
        setCharElement(term615635, 130, (char) 1);
        setCharElement(term615635, 131, (char) 1);
        setCharElement(term615635, 132, (char) 1);
        setField(term616096, term616096.getClass(), "charBuf", term615635);
        setField(term616096, term616096.getClass(), "stringCache", term615918);
        term615615 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term615615;
        try {
            callMethod(klass, "consumeToAny", argTypes, term616096, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


