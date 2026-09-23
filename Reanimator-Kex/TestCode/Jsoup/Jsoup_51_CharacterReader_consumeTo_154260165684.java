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

public class CharacterReader_consumeTo_154260165684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25592;

    public CharacterReader_consumeTo_154260165684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25592 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term25496 = (Object[]) newArray("java.lang.String", 114);
        setIntField(term25592, term25592.getClass(), "pos", 1517503622);
        setIntField(term25592, term25592.getClass(), "length", -1707450077);
        setField(term25592, term25592.getClass(), "input", null);
        setElement(term25496, 0, "");
        setElement(term25496, 1, "");
        setElement(term25496, 2, "");
        setElement(term25496, 3, "");
        setElement(term25496, 4, "");
        setElement(term25496, 5, "");
        setElement(term25496, 6, "");
        setElement(term25496, 7, "");
        setElement(term25496, 8, "");
        setElement(term25496, 9, "");
        setElement(term25496, 10, "");
        setElement(term25496, 11, "");
        setElement(term25496, 12, "");
        setElement(term25496, 13, "");
        setElement(term25496, 14, "");
        setElement(term25496, 15, "");
        setElement(term25496, 16, "");
        setElement(term25496, 17, "");
        setElement(term25496, 18, "");
        setElement(term25496, 19, "");
        setElement(term25496, 20, "");
        setElement(term25496, 21, "");
        setElement(term25496, 22, "");
        setElement(term25496, 23, "");
        setElement(term25496, 24, "");
        setElement(term25496, 25, "");
        setElement(term25496, 26, "");
        setElement(term25496, 27, "");
        setElement(term25496, 28, "");
        setElement(term25496, 29, "");
        setElement(term25496, 30, "");
        setElement(term25496, 31, "");
        setElement(term25496, 32, "");
        setElement(term25496, 33, "");
        setElement(term25496, 34, "");
        setElement(term25496, 35, "");
        setElement(term25496, 36, "");
        setElement(term25496, 37, "");
        setElement(term25496, 38, "");
        setElement(term25496, 39, "");
        setElement(term25496, 40, "");
        setElement(term25496, 41, "");
        setElement(term25496, 42, "");
        setElement(term25496, 43, "");
        setElement(term25496, 44, "");
        setElement(term25496, 45, "");
        setElement(term25496, 46, "");
        setElement(term25496, 47, "");
        setElement(term25496, 48, "");
        setElement(term25496, 49, "");
        setElement(term25496, 50, "");
        setElement(term25496, 51, "");
        setElement(term25496, 52, "");
        setElement(term25496, 53, "");
        setElement(term25496, 54, "");
        setElement(term25496, 55, "");
        setElement(term25496, 56, "");
        setElement(term25496, 57, "");
        setElement(term25496, 58, "");
        setElement(term25496, 59, "");
        setElement(term25496, 60, "");
        setElement(term25496, 61, "");
        setElement(term25496, 62, "");
        setElement(term25496, 63, "");
        setElement(term25496, 64, "");
        setElement(term25496, 65, "");
        setElement(term25496, 66, "");
        setElement(term25496, 67, "");
        setElement(term25496, 68, "");
        setElement(term25496, 69, "");
        setElement(term25496, 70, "");
        setElement(term25496, 71, "");
        setElement(term25496, 72, "");
        setElement(term25496, 73, "");
        setElement(term25496, 74, "");
        setElement(term25496, 75, "");
        setElement(term25496, 76, "");
        setElement(term25496, 77, "");
        setElement(term25496, 78, "");
        setElement(term25496, 79, "");
        setElement(term25496, 80, "");
        setElement(term25496, 81, "");
        setElement(term25496, 82, "");
        setElement(term25496, 83, "");
        setElement(term25496, 84, "");
        setElement(term25496, 85, "");
        setElement(term25496, 86, "");
        setElement(term25496, 87, "");
        setElement(term25496, 88, "");
        setElement(term25496, 89, "");
        setElement(term25496, 90, "");
        setElement(term25496, 91, "");
        setElement(term25496, 92, "");
        setElement(term25496, 93, "");
        setElement(term25496, 94, "");
        setElement(term25496, 95, "");
        setElement(term25496, 96, "");
        setElement(term25496, 97, "");
        setElement(term25496, 98, "");
        setElement(term25496, 99, "");
        setElement(term25496, 100, "");
        setElement(term25496, 101, "");
        setElement(term25496, 102, "");
        setElement(term25496, 103, "");
        setElement(term25496, 104, "");
        setElement(term25496, 105, "");
        setElement(term25496, 106, "");
        setElement(term25496, 107, "");
        setElement(term25496, 108, "");
        setElement(term25496, 109, "");
        setElement(term25496, 110, "");
        setElement(term25496, 111, "");
        setElement(term25496, 112, "");
        setElement(term25496, 113, "");
        setField(term25592, term25592.getClass(), "stringCache", term25496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "consumeTo", argTypes, term25592, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


