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
import org.mockito.Mockito;

public class UTF8JsonGenerator_init_1882684473208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80427;
     Object term79818;

    public UTF8JsonGenerator_init_1882684473208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80343 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term80343, term80343.getClass(), "_features", 0);
        setField(term80343, term80343.getClass(), "_objectCodec", null);
        setField(term80343, term80343.getClass(), "_writeContext", null);
        setBooleanField(term80343, term80343.getClass(), "_cfgNumbersAsStrings", false);
        setField(term80343, term80343.getClass(), "_outputEscapes", null);
        setField(term80343, term80343.getClass(), "_rootValueSeparator", null);
        setField(term80343, term80343.getClass(), "_ioContext", null);
        setIntField(term80343, term80343.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term80343, term80343.getClass(), "_cfgUnqNames", false);
        setField(term80343, term80343.getClass(), "_outputStream", null);
        setBooleanField(term80343, term80343.getClass(), "_bufferRecyclable", false);
        term80427 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term80525 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term80095 = (Object[]) newArray("[B", 0);
        setField(term80427, term80427.getClass(), "_writeEncodingBuffer", null);
        setField(term80525, term80525.getClass(), "_byteBuffers", term80095);
        setField(term80427, term80427.getClass(), "_bufferRecycler", term80525);
        term79818 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term80427;
        args[1] = -1;
        args[2] = term79818;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


