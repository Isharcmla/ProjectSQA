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
import org.mockito.Mockito;

public class UTF8JsonGenerator_init_25805811188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53758;

    public UTF8JsonGenerator_init_25805811188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term53390 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term53160 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term53492 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term53170 = (int[]) newIntArray(0);
        Object term53590 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term53674 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term53390, term53390.getClass(), "_features", 0);
        setField(term53390, term53390.getClass(), "_objectCodec", term53160);
        setField(term53390, term53390.getClass(), "_writeContext", term53492);
        setBooleanField(term53390, term53390.getClass(), "_cfgNumbersAsStrings", false);
        setField(term53390, term53390.getClass(), "_outputEscapes", term53170);
        setField(term53390, term53390.getClass(), "_rootValueSeparator", term53590);
        setField(term53390, term53390.getClass(), "_ioContext", term53674);
        term53758 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.OutputStream");
        argTypes[4] = Array.newInstance(byte.class, 0).getClass();
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term53758;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = 0;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


