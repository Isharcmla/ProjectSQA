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

public class UTF8JsonGenerator_init_1882684473232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365247;
     Object term364357;

    public UTF8JsonGenerator_init_1882684473232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term365163 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        int[] term364621 = (int[]) newIntArray(0);
        setIntField(term365163, term365163.getClass(), "_features", 0);
        setField(term365163, term365163.getClass(), "_objectCodec", null);
        setField(term365163, term365163.getClass(), "_writeContext", null);
        setBooleanField(term365163, term365163.getClass(), "_cfgNumbersAsStrings", false);
        setField(term365163, term365163.getClass(), "_outputEscapes", term364621);
        setField(term365163, term365163.getClass(), "_rootValueSeparator", null);
        setField(term365163, term365163.getClass(), "_ioContext", null);
        setIntField(term365163, term365163.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term365163, term365163.getClass(), "_cfgUnqNames", false);
        setField(term365163, term365163.getClass(), "_outputStream", null);
        setBooleanField(term365163, term365163.getClass(), "_bufferRecyclable", false);
        setField(term365163, term365163.getClass(), "_outputBuffer", null);
        setIntField(term365163, term365163.getClass(), "_outputEnd", 0);
        setIntField(term365163, term365163.getClass(), "_outputMaxContiguous", 0);
        term365247 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term365345 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term364632 = (Object[]) newArray("[B", 128);
        setField(term365247, term365247.getClass(), "_writeEncodingBuffer", null);
        setField(term365345, term365345.getClass(), "_byteBuffers", term364632);
        setField(term365247, term365247.getClass(), "_bufferRecycler", term365345);
        setField(term365247, term365247.getClass(), "_concatCBuffer", null);
        term364357 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term365247;
        args[1] = -1;
        args[2] = term364357;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


