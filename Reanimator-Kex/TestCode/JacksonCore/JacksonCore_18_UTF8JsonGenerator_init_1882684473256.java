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

public class UTF8JsonGenerator_init_1882684473256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838149;
     Object term836679;

    public UTF8JsonGenerator_init_1882684473256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term838065 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term836934 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        setIntField(term838065, term838065.getClass(), "_features", 0);
        setField(term838065, term838065.getClass(), "_objectCodec", term836934);
        setField(term838065, term838065.getClass(), "_writeContext", null);
        setBooleanField(term838065, term838065.getClass(), "_cfgNumbersAsStrings", false);
        setField(term838065, term838065.getClass(), "_outputEscapes", null);
        setField(term838065, term838065.getClass(), "_rootValueSeparator", null);
        setField(term838065, term838065.getClass(), "_ioContext", null);
        setIntField(term838065, term838065.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term838065, term838065.getClass(), "_cfgUnqNames", false);
        setField(term838065, term838065.getClass(), "_outputStream", null);
        setBooleanField(term838065, term838065.getClass(), "_bufferRecyclable", false);
        setField(term838065, term838065.getClass(), "_outputBuffer", null);
        setIntField(term838065, term838065.getClass(), "_outputEnd", 0);
        setIntField(term838065, term838065.getClass(), "_outputMaxContiguous", 0);
        term838149 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term838247 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term837465 = (Object[]) newArray("[B", 65);
        byte[] term837466 = (byte[]) newByteArray(0);
        Object[] term837792 = (Object[]) newArray("[C", 2);
        char[] term837793 = (char[]) newCharArray(0);
        char[] term837794 = (char[]) newCharArray(0);
        setField(term838149, term838149.getClass(), "_writeEncodingBuffer", null);
        setElement(term837465, 1, term837466);
        setField(term838247, term838247.getClass(), "_byteBuffers", term837465);
        setElement(term837792, 0, term837793);
        setElement(term837792, 1, term837794);
        setField(term838247, term838247.getClass(), "_charBuffers", term837792);
        setField(term838149, term838149.getClass(), "_bufferRecycler", term838247);
        setField(term838149, term838149.getClass(), "_concatCBuffer", null);
        term836679 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term838149;
        args[1] = -1;
        args[2] = term836679;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


