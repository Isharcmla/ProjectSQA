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

public class CharacterReader_consumeToAny_1422703610297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594011;
     Object term593556;

    public CharacterReader_consumeToAny_1422703610297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594011 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term593559 = (char[]) newCharArray(172);
        setIntField(term594011, term594011.getClass(), "pos", 1995432016);
        setIntField(term594011, term594011.getClass(), "length", 1995432017);
        setCharElement(term593559, 0, (char) 256);
        setCharElement(term593559, 1, (char) 256);
        setCharElement(term593559, 2, (char) 256);
        setCharElement(term593559, 3, (char) 256);
        setCharElement(term593559, 4, (char) 256);
        setCharElement(term593559, 5, (char) 256);
        setCharElement(term593559, 6, (char) 256);
        setCharElement(term593559, 7, (char) 256);
        setCharElement(term593559, 8, (char) 256);
        setCharElement(term593559, 9, (char) 256);
        setCharElement(term593559, 10, (char) 256);
        setCharElement(term593559, 11, (char) 256);
        setCharElement(term593559, 12, (char) 256);
        setCharElement(term593559, 13, (char) 256);
        setCharElement(term593559, 14, (char) 256);
        setCharElement(term593559, 15, (char) 256);
        setCharElement(term593559, 16, (char) 256);
        setCharElement(term593559, 17, (char) 256);
        setCharElement(term593559, 18, (char) 256);
        setCharElement(term593559, 19, (char) 256);
        setCharElement(term593559, 20, (char) 256);
        setCharElement(term593559, 21, (char) 256);
        setCharElement(term593559, 22, (char) 256);
        setCharElement(term593559, 23, (char) 256);
        setCharElement(term593559, 24, (char) 256);
        setCharElement(term593559, 25, (char) 256);
        setCharElement(term593559, 26, (char) 256);
        setCharElement(term593559, 27, (char) 256);
        setCharElement(term593559, 28, (char) 256);
        setCharElement(term593559, 29, (char) 256);
        setCharElement(term593559, 30, (char) 256);
        setCharElement(term593559, 31, (char) 256);
        setCharElement(term593559, 32, (char) 256);
        setCharElement(term593559, 33, (char) 256);
        setCharElement(term593559, 34, (char) 256);
        setCharElement(term593559, 35, (char) 256);
        setCharElement(term593559, 36, (char) 256);
        setCharElement(term593559, 37, (char) 256);
        setCharElement(term593559, 38, (char) 256);
        setCharElement(term593559, 39, (char) 256);
        setCharElement(term593559, 40, (char) 256);
        setCharElement(term593559, 41, (char) 256);
        setCharElement(term593559, 42, (char) 256);
        setCharElement(term593559, 43, (char) 256);
        setCharElement(term593559, 44, (char) 256);
        setCharElement(term593559, 45, (char) 256);
        setCharElement(term593559, 46, (char) 256);
        setCharElement(term593559, 47, (char) 256);
        setCharElement(term593559, 48, (char) 256);
        setCharElement(term593559, 49, (char) 256);
        setCharElement(term593559, 50, (char) 256);
        setCharElement(term593559, 51, (char) 256);
        setCharElement(term593559, 52, (char) 256);
        setCharElement(term593559, 53, (char) 256);
        setCharElement(term593559, 54, (char) 256);
        setCharElement(term593559, 55, (char) 256);
        setCharElement(term593559, 56, (char) 256);
        setCharElement(term593559, 57, (char) 256);
        setCharElement(term593559, 58, (char) 256);
        setCharElement(term593559, 59, (char) 256);
        setCharElement(term593559, 60, (char) 256);
        setCharElement(term593559, 61, (char) 256);
        setCharElement(term593559, 62, (char) 256);
        setCharElement(term593559, 63, (char) 256);
        setCharElement(term593559, 64, (char) 256);
        setCharElement(term593559, 65, (char) 256);
        setCharElement(term593559, 66, (char) 256);
        setCharElement(term593559, 67, (char) 256);
        setCharElement(term593559, 68, (char) 256);
        setCharElement(term593559, 69, (char) 256);
        setCharElement(term593559, 70, (char) 256);
        setCharElement(term593559, 71, (char) 256);
        setCharElement(term593559, 72, (char) 256);
        setCharElement(term593559, 73, (char) 256);
        setCharElement(term593559, 74, (char) 256);
        setCharElement(term593559, 75, (char) 256);
        setCharElement(term593559, 76, (char) 256);
        setCharElement(term593559, 77, (char) 256);
        setCharElement(term593559, 78, (char) 256);
        setCharElement(term593559, 79, (char) 256);
        setCharElement(term593559, 80, (char) 256);
        setCharElement(term593559, 81, (char) 256);
        setCharElement(term593559, 82, (char) 256);
        setCharElement(term593559, 83, (char) 256);
        setCharElement(term593559, 84, (char) 256);
        setCharElement(term593559, 85, (char) 256);
        setCharElement(term593559, 86, (char) 256);
        setCharElement(term593559, 87, (char) 256);
        setCharElement(term593559, 88, (char) 256);
        setCharElement(term593559, 89, (char) 256);
        setCharElement(term593559, 90, (char) 256);
        setCharElement(term593559, 91, (char) 256);
        setCharElement(term593559, 92, (char) 256);
        setCharElement(term593559, 93, (char) 256);
        setCharElement(term593559, 94, (char) 256);
        setCharElement(term593559, 95, (char) 256);
        setCharElement(term593559, 96, (char) 256);
        setCharElement(term593559, 97, (char) 256);
        setCharElement(term593559, 98, (char) 256);
        setCharElement(term593559, 99, (char) 256);
        setCharElement(term593559, 100, (char) 256);
        setCharElement(term593559, 101, (char) 256);
        setCharElement(term593559, 102, (char) 256);
        setCharElement(term593559, 103, (char) 256);
        setCharElement(term593559, 104, (char) 256);
        setCharElement(term593559, 105, (char) 256);
        setCharElement(term593559, 106, (char) 256);
        setCharElement(term593559, 107, (char) 256);
        setCharElement(term593559, 108, (char) 256);
        setCharElement(term593559, 109, (char) 256);
        setCharElement(term593559, 110, (char) 256);
        setCharElement(term593559, 111, (char) 256);
        setCharElement(term593559, 112, (char) 256);
        setCharElement(term593559, 113, (char) 256);
        setCharElement(term593559, 114, (char) 256);
        setCharElement(term593559, 115, (char) 256);
        setCharElement(term593559, 116, (char) 256);
        setCharElement(term593559, 117, (char) 256);
        setCharElement(term593559, 118, (char) 256);
        setCharElement(term593559, 119, (char) 256);
        setCharElement(term593559, 120, (char) 256);
        setCharElement(term593559, 121, (char) 256);
        setCharElement(term593559, 122, (char) 256);
        setCharElement(term593559, 123, (char) 256);
        setCharElement(term593559, 124, (char) 256);
        setCharElement(term593559, 125, (char) 256);
        setCharElement(term593559, 126, (char) 256);
        setCharElement(term593559, 127, (char) 256);
        setCharElement(term593559, 128, (char) 256);
        setCharElement(term593559, 129, (char) 256);
        setCharElement(term593559, 130, (char) 256);
        setCharElement(term593559, 131, (char) 256);
        setCharElement(term593559, 132, (char) 256);
        setCharElement(term593559, 133, (char) 256);
        setCharElement(term593559, 134, (char) 256);
        setCharElement(term593559, 135, (char) 256);
        setCharElement(term593559, 136, (char) 256);
        setCharElement(term593559, 137, (char) 256);
        setCharElement(term593559, 138, (char) 256);
        setCharElement(term593559, 139, (char) 256);
        setCharElement(term593559, 140, (char) 256);
        setCharElement(term593559, 141, (char) 256);
        setCharElement(term593559, 142, (char) 256);
        setCharElement(term593559, 143, (char) 256);
        setCharElement(term593559, 144, (char) 256);
        setCharElement(term593559, 145, (char) 256);
        setCharElement(term593559, 146, (char) 256);
        setCharElement(term593559, 147, (char) 256);
        setCharElement(term593559, 148, (char) 256);
        setCharElement(term593559, 149, (char) 256);
        setCharElement(term593559, 150, (char) 256);
        setCharElement(term593559, 151, (char) 256);
        setCharElement(term593559, 152, (char) 256);
        setCharElement(term593559, 153, (char) 256);
        setCharElement(term593559, 154, (char) 256);
        setCharElement(term593559, 155, (char) 256);
        setCharElement(term593559, 156, (char) 256);
        setCharElement(term593559, 157, (char) 256);
        setCharElement(term593559, 158, (char) 256);
        setCharElement(term593559, 159, (char) 256);
        setCharElement(term593559, 160, (char) 256);
        setCharElement(term593559, 161, (char) 256);
        setCharElement(term593559, 162, (char) 256);
        setCharElement(term593559, 163, (char) 256);
        setCharElement(term593559, 164, (char) 256);
        setCharElement(term593559, 165, (char) 256);
        setCharElement(term593559, 166, (char) 256);
        setCharElement(term593559, 167, (char) 256);
        setCharElement(term593559, 168, (char) 256);
        setCharElement(term593559, 169, (char) 256);
        setCharElement(term593559, 170, (char) 256);
        setCharElement(term593559, 171, (char) 256);
        setField(term594011, term594011.getClass(), "input", term593559);
        setField(term594011, term594011.getClass(), "stringCache", null);
        term593556 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term593556;
        try {
            callMethod(klass, "consumeToAny", argTypes, term594011, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


