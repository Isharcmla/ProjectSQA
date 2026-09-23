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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class WriterBasedJsonGenerator_init_468304896146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27609;

    public WriterBasedJsonGenerator_init_468304896146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27273 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term27375 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term27025 = (int[]) newIntArray(0);
        Object term27473 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term27525 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setIntField(term27273, term27273.getClass(), "_features", 0);
        setField(term27273, term27273.getClass(), "_objectCodec", null);
        setField(term27273, term27273.getClass(), "_writeContext", term27375);
        setBooleanField(term27273, term27273.getClass(), "_cfgNumbersAsStrings", false);
        setField(term27273, term27273.getClass(), "_outputEscapes", term27025);
        setField(term27273, term27273.getClass(), "_rootValueSeparator", term27473);
        setField(term27273, term27273.getClass(), "_ioContext", null);
        setBooleanField(term27273, term27273.getClass(), "_cfgUnqNames", false);
        setField(term27273, term27273.getClass(), "_writer", term27525);
        term27609 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
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
        args[0] = term27609;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


