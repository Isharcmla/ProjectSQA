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

public class UTF8JsonGenerator_init_1882684473234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356569;
     Object term355679;

    public UTF8JsonGenerator_init_1882684473234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term356485 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        int[] term355943 = (int[]) newIntArray(0);
        setIntField(term356485, term356485.getClass(), "_features", 0);
        setField(term356485, term356485.getClass(), "_objectCodec", null);
        setField(term356485, term356485.getClass(), "_writeContext", null);
        setBooleanField(term356485, term356485.getClass(), "_cfgNumbersAsStrings", false);
        setField(term356485, term356485.getClass(), "_outputEscapes", term355943);
        setField(term356485, term356485.getClass(), "_rootValueSeparator", null);
        setField(term356485, term356485.getClass(), "_ioContext", null);
        setIntField(term356485, term356485.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term356485, term356485.getClass(), "_cfgUnqNames", false);
        setField(term356485, term356485.getClass(), "_outputStream", null);
        setBooleanField(term356485, term356485.getClass(), "_bufferRecyclable", false);
        setField(term356485, term356485.getClass(), "_outputBuffer", null);
        setIntField(term356485, term356485.getClass(), "_outputEnd", 0);
        setIntField(term356485, term356485.getClass(), "_outputMaxContiguous", 0);
        term356569 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term356667 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term355954 = (Object[]) newArray("[B", 128);
        setField(term356569, term356569.getClass(), "_writeEncodingBuffer", null);
        setField(term356667, term356667.getClass(), "_byteBuffers", term355954);
        setField(term356569, term356569.getClass(), "_bufferRecycler", term356667);
        setField(term356569, term356569.getClass(), "_concatCBuffer", null);
        term355679 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term356569;
        args[1] = -1;
        args[2] = term355679;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


