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

public class CharacterReader_init_2130144751844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261167;

    public CharacterReader_init_2130144751844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term261071 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term260861 = (Object[]) newArray("java.lang.String", 0);
        Object term261121 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term260970 = (char[]) newCharArray(0);
        setIntField(term261071, term261071.getClass(), "bufMark", 0);
        setField(term261071, term261071.getClass(), "stringCache", term260861);
        setField(term261071, term261071.getClass(), "reader", term261121);
        setField(term261071, term261071.getClass(), "charBuf", term260970);
        setIntField(term261071, term261071.getClass(), "bufPos", -2147483648);
        setIntField(term261071, term261071.getClass(), "bufSplitPoint", -2147483647);
        term261167 = newInstance(Class.forName("java.io.StringReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term261167;
        args[1] = 106;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


