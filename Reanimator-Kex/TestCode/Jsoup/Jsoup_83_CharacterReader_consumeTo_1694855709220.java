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

public class CharacterReader_consumeTo_1694855709220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42007;

    public CharacterReader_consumeTo_1694855709220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42007 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term41846 = (char[]) newCharArray(44);
        setIntField(term42007, term42007.getClass(), "bufPos", 2147483637);
        setIntField(term42007, term42007.getClass(), "bufSplitPoint", 2147483638);
        setIntField(term42007, term42007.getClass(), "bufLength", -2147483648);
        setCharElement(term41846, 0, (char) 1024);
        setCharElement(term41846, 1, (char) 1024);
        setCharElement(term41846, 2, (char) 1024);
        setCharElement(term41846, 3, (char) 1024);
        setCharElement(term41846, 4, (char) 1024);
        setCharElement(term41846, 5, (char) 1024);
        setCharElement(term41846, 6, (char) 1024);
        setCharElement(term41846, 7, (char) 1024);
        setCharElement(term41846, 8, (char) 1024);
        setCharElement(term41846, 9, (char) 1024);
        setCharElement(term41846, 10, (char) 1024);
        setCharElement(term41846, 11, (char) 1024);
        setCharElement(term41846, 12, (char) 1024);
        setCharElement(term41846, 13, (char) 1024);
        setCharElement(term41846, 14, (char) 1024);
        setCharElement(term41846, 15, (char) 1024);
        setCharElement(term41846, 16, (char) 1024);
        setCharElement(term41846, 17, (char) 1024);
        setCharElement(term41846, 18, (char) 1024);
        setCharElement(term41846, 19, (char) 1024);
        setCharElement(term41846, 20, (char) 1024);
        setCharElement(term41846, 21, (char) 1024);
        setCharElement(term41846, 22, (char) 1024);
        setCharElement(term41846, 23, (char) 1024);
        setCharElement(term41846, 24, (char) 1024);
        setCharElement(term41846, 25, (char) 1024);
        setCharElement(term41846, 26, (char) 1024);
        setCharElement(term41846, 27, (char) 1024);
        setCharElement(term41846, 28, (char) 1024);
        setCharElement(term41846, 29, (char) 1024);
        setCharElement(term41846, 30, (char) 1024);
        setCharElement(term41846, 31, (char) 1024);
        setCharElement(term41846, 32, (char) 1024);
        setCharElement(term41846, 33, (char) 1024);
        setCharElement(term41846, 34, (char) 1024);
        setCharElement(term41846, 35, (char) 1024);
        setCharElement(term41846, 36, (char) 1024);
        setCharElement(term41846, 37, (char) 1024);
        setCharElement(term41846, 38, (char) 1024);
        setCharElement(term41846, 39, (char) 1024);
        setCharElement(term41846, 40, (char) 1024);
        setCharElement(term41846, 41, (char) 1024);
        setCharElement(term41846, 42, (char) 1024);
        setCharElement(term41846, 43, (char) 1024);
        setField(term42007, term42007.getClass(), "charBuf", term41846);
        setField(term42007, term42007.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                  ";
        try {
            callMethod(klass, "consumeTo", argTypes, term42007, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


