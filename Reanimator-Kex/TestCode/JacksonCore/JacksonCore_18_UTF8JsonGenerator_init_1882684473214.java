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

public class UTF8JsonGenerator_init_1882684473214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83731;
     Object term83901;

    public UTF8JsonGenerator_init_1882684473214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83483 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term83231 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term83585 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term83647 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setIntField(term83483, term83483.getClass(), "_features", 0);
        setField(term83483, term83483.getClass(), "_objectCodec", term83231);
        setField(term83483, term83483.getClass(), "_writeContext", term83585);
        setBooleanField(term83483, term83483.getClass(), "_cfgNumbersAsStrings", false);
        setField(term83483, term83483.getClass(), "_outputEscapes", null);
        setField(term83483, term83483.getClass(), "_rootValueSeparator", null);
        setField(term83483, term83483.getClass(), "_ioContext", null);
        setIntField(term83483, term83483.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term83483, term83483.getClass(), "_cfgUnqNames", false);
        setField(term83483, term83483.getClass(), "_outputStream", term83647);
        setBooleanField(term83483, term83483.getClass(), "_bufferRecyclable", false);
        term83731 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term83829 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term83731, term83731.getClass(), "_writeEncodingBuffer", null);
        setField(term83731, term83731.getClass(), "_bufferRecycler", term83829);
        term83901 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
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
        args[0] = term83731;
        args[1] = -1;
        args[2] = null;
        args[3] = term83901;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


