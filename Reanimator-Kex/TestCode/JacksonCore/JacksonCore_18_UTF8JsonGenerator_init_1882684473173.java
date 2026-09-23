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

public class UTF8JsonGenerator_init_1882684473173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41601;

    public UTF8JsonGenerator_init_1882684473173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41233 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term41003 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term41335 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term41013 = (int[]) newIntArray(0);
        Object term41433 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term41517 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term41233, term41233.getClass(), "_features", 0);
        setField(term41233, term41233.getClass(), "_objectCodec", term41003);
        setField(term41233, term41233.getClass(), "_writeContext", term41335);
        setBooleanField(term41233, term41233.getClass(), "_cfgNumbersAsStrings", false);
        setField(term41233, term41233.getClass(), "_outputEscapes", term41013);
        setField(term41233, term41233.getClass(), "_rootValueSeparator", term41433);
        setField(term41233, term41233.getClass(), "_ioContext", term41517);
        term41601 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[4];
        args[0] = term41601;
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


