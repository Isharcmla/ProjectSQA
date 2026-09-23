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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_init_393906317127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24270;

    public CharacterReader_init_393906317127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23894 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term23944 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term23769 = (char[]) newCharArray(0);
        setField(term23894, term23894.getClass(), "stringCache", null);
        setField(term23894, term23894.getClass(), "reader", term23944);
        setField(term23894, term23894.getClass(), "charBuf", term23769);
        setIntField(term23894, term23894.getClass(), "bufPos", -2147483648);
        setIntField(term23894, term23894.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term23894, term23894.getClass(), "bufLength", 0);
        setIntField(term23894, term23894.getClass(), "readerPos", 0);
        setIntField(term23894, term23894.getClass(), "bufMark", 0);
        term24270 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term24271 = (char[]) newCharArray(0);
        Object term24272 = newInstance(Class.forName("java.io.StringReader"));
        Object[] term24275 = (Object[]) newArray("java.lang.String", 512);
        setField(term24270, term24270.getClass(), "charBuf", term24271);
        setField(term24272, term24272.getClass(), "str", "");
        setIntField(term24272, term24272.getClass(), "length", 0);
        setIntField(term24272, term24272.getClass(), "next", 0);
        setIntField(term24272, term24272.getClass(), "mark", 0);
        setField(term24272, term24272.getClass(), "lock", term24272);
        setField(term24272, term24272.getClass(), "skipBuffer", null);
        setField(term24270, term24270.getClass(), "reader", term24272);
        setIntField(term24270, term24270.getClass(), "bufLength", 0);
        setIntField(term24270, term24270.getClass(), "bufSplitPoint", 0);
        setIntField(term24270, term24270.getClass(), "bufPos", 0);
        setIntField(term24270, term24270.getClass(), "readerPos", 0);
        setIntField(term24270, term24270.getClass(), "bufMark", 0);
        setField(term24270, term24270.getClass(), "stringCache", term24275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24270));
    }

};


