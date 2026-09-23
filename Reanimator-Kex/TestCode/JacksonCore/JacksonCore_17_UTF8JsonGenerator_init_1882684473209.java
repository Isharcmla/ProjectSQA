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

public class UTF8JsonGenerator_init_1882684473209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83318;
     Object term83474;

    public UTF8JsonGenerator_init_1882684473209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83068 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term82816 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term83170 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term83234 = newInstance(Class.forName("java.util.jar.JarOutputStream"));
        setIntField(term83068, term83068.getClass(), "_features", 0);
        setField(term83068, term83068.getClass(), "_objectCodec", term82816);
        setField(term83068, term83068.getClass(), "_writeContext", term83170);
        setBooleanField(term83068, term83068.getClass(), "_cfgNumbersAsStrings", false);
        setField(term83068, term83068.getClass(), "_outputEscapes", null);
        setField(term83068, term83068.getClass(), "_rootValueSeparator", null);
        setField(term83068, term83068.getClass(), "_ioContext", null);
        setIntField(term83068, term83068.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term83068, term83068.getClass(), "_cfgUnqNames", false);
        setField(term83068, term83068.getClass(), "_outputStream", term83234);
        setBooleanField(term83068, term83068.getClass(), "_bufferRecyclable", false);
        term83318 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term83416 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term83318, term83318.getClass(), "_writeEncodingBuffer", null);
        setField(term83318, term83318.getClass(), "_bufferRecycler", term83416);
        term83474 = newInstance(Class.forName("java.io.ObjectOutputStream"));
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
        args[0] = term83318;
        args[1] = -1;
        args[2] = null;
        args[3] = term83474;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


