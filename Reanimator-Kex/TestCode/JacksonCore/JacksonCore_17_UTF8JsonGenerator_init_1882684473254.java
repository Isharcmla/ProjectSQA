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

public class UTF8JsonGenerator_init_1882684473254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term960492;
     Object term959022;

    public UTF8JsonGenerator_init_1882684473254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term960408 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term959277 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        setIntField(term960408, term960408.getClass(), "_features", 0);
        setField(term960408, term960408.getClass(), "_objectCodec", term959277);
        setField(term960408, term960408.getClass(), "_writeContext", null);
        setBooleanField(term960408, term960408.getClass(), "_cfgNumbersAsStrings", false);
        setField(term960408, term960408.getClass(), "_outputEscapes", null);
        setField(term960408, term960408.getClass(), "_rootValueSeparator", null);
        setField(term960408, term960408.getClass(), "_ioContext", null);
        setIntField(term960408, term960408.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term960408, term960408.getClass(), "_cfgUnqNames", false);
        setField(term960408, term960408.getClass(), "_outputStream", null);
        setBooleanField(term960408, term960408.getClass(), "_bufferRecyclable", false);
        setField(term960408, term960408.getClass(), "_outputBuffer", null);
        setIntField(term960408, term960408.getClass(), "_outputEnd", 0);
        setIntField(term960408, term960408.getClass(), "_outputMaxContiguous", 0);
        term960492 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term960590 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term959808 = (Object[]) newArray("[B", 65);
        byte[] term959809 = (byte[]) newByteArray(0);
        Object[] term960135 = (Object[]) newArray("[C", 2);
        char[] term960136 = (char[]) newCharArray(0);
        char[] term960137 = (char[]) newCharArray(0);
        setField(term960492, term960492.getClass(), "_writeEncodingBuffer", null);
        setElement(term959808, 1, term959809);
        setField(term960590, term960590.getClass(), "_byteBuffers", term959808);
        setElement(term960135, 0, term960136);
        setElement(term960135, 1, term960137);
        setField(term960590, term960590.getClass(), "_charBuffers", term960135);
        setField(term960492, term960492.getClass(), "_bufferRecycler", term960590);
        setField(term960492, term960492.getClass(), "_concatCBuffer", null);
        term959022 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term960492;
        args[1] = -1;
        args[2] = term959022;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


