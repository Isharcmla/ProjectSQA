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

public class CharacterReader_consumeTo_1694855709180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33680;

    public CharacterReader_consumeTo_1694855709180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33680 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term33519 = (char[]) newCharArray(44);
        setIntField(term33680, term33680.getClass(), "bufPos", 2147483637);
        setIntField(term33680, term33680.getClass(), "bufSplitPoint", 2147483638);
        setIntField(term33680, term33680.getClass(), "bufLength", -2147483648);
        setCharElement(term33519, 0, (char) 1024);
        setCharElement(term33519, 1, (char) 1024);
        setCharElement(term33519, 2, (char) 1024);
        setCharElement(term33519, 3, (char) 1024);
        setCharElement(term33519, 4, (char) 1024);
        setCharElement(term33519, 5, (char) 1024);
        setCharElement(term33519, 6, (char) 1024);
        setCharElement(term33519, 7, (char) 1024);
        setCharElement(term33519, 8, (char) 1024);
        setCharElement(term33519, 9, (char) 1024);
        setCharElement(term33519, 10, (char) 1024);
        setCharElement(term33519, 11, (char) 1024);
        setCharElement(term33519, 12, (char) 1024);
        setCharElement(term33519, 13, (char) 1024);
        setCharElement(term33519, 14, (char) 1024);
        setCharElement(term33519, 15, (char) 1024);
        setCharElement(term33519, 16, (char) 1024);
        setCharElement(term33519, 17, (char) 1024);
        setCharElement(term33519, 18, (char) 1024);
        setCharElement(term33519, 19, (char) 1024);
        setCharElement(term33519, 20, (char) 1024);
        setCharElement(term33519, 21, (char) 1024);
        setCharElement(term33519, 22, (char) 1024);
        setCharElement(term33519, 23, (char) 1024);
        setCharElement(term33519, 24, (char) 1024);
        setCharElement(term33519, 25, (char) 1024);
        setCharElement(term33519, 26, (char) 1024);
        setCharElement(term33519, 27, (char) 1024);
        setCharElement(term33519, 28, (char) 1024);
        setCharElement(term33519, 29, (char) 1024);
        setCharElement(term33519, 30, (char) 1024);
        setCharElement(term33519, 31, (char) 1024);
        setCharElement(term33519, 32, (char) 1024);
        setCharElement(term33519, 33, (char) 1024);
        setCharElement(term33519, 34, (char) 1024);
        setCharElement(term33519, 35, (char) 1024);
        setCharElement(term33519, 36, (char) 1024);
        setCharElement(term33519, 37, (char) 1024);
        setCharElement(term33519, 38, (char) 1024);
        setCharElement(term33519, 39, (char) 1024);
        setCharElement(term33519, 40, (char) 1024);
        setCharElement(term33519, 41, (char) 1024);
        setCharElement(term33519, 42, (char) 1024);
        setCharElement(term33519, 43, (char) 1024);
        setField(term33680, term33680.getClass(), "charBuf", term33519);
        setField(term33680, term33680.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                  ";
        try {
            callMethod(klass, "consumeTo", argTypes, term33680, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


