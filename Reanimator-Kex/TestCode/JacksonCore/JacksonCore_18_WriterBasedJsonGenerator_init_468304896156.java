package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class WriterBasedJsonGenerator_init_468304896156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36496;

    public WriterBasedJsonGenerator_init_468304896156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36042 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term36144 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term36242 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term36326 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term36412 = newInstance(Class.forName("com.fasterxml.jackson.core.io.UTF8Writer"));
        setIntField(term36042, term36042.getClass(), "_features", 0);
        setField(term36042, term36042.getClass(), "_objectCodec", null);
        setField(term36042, term36042.getClass(), "_writeContext", term36144);
        setBooleanField(term36042, term36042.getClass(), "_cfgNumbersAsStrings", false);
        setField(term36042, term36042.getClass(), "_outputEscapes", null);
        setField(term36042, term36042.getClass(), "_rootValueSeparator", term36242);
        setField(term36042, term36042.getClass(), "_ioContext", term36326);
        setIntField(term36042, term36042.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term36042, term36042.getClass(), "_cfgUnqNames", false);
        setField(term36042, term36042.getClass(), "_writer", term36412);
        term36496 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term35563 = (char[]) newCharArray(233);
        setCharElement(term35563, 0, 'I');
        setCharElement(term35563, 1, 'G');
        setCharElement(term35563, 2, 'N');
        setCharElement(term35563, 3, 'O');
        setCharElement(term35563, 4, 'R');
        setCharElement(term35563, 5, 'E');
        setCharElement(term35563, 6, (char) 95);
        setCharElement(term35563, 7, 'U');
        setCharElement(term35563, 8, 'N');
        setCharElement(term35563, 9, 'K');
        setCharElement(term35563, 10, 'N');
        setCharElement(term35563, 11, 'O');
        setCharElement(term35563, 12, 'W');
        setCharElement(term35563, 13, 'N');
        setField(term36496, term36496.getClass(), "_concatCBuffer", term35563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.Writer");
        Object[] args = new Object[4];
        args[0] = term36496;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


