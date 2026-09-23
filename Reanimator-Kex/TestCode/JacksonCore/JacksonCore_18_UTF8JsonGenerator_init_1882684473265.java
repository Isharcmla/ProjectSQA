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

public class UTF8JsonGenerator_init_1882684473265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1184961;

    public UTF8JsonGenerator_init_1882684473265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1184877 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term1184877, term1184877.getClass(), "_features", 0);
        setField(term1184877, term1184877.getClass(), "_objectCodec", null);
        setField(term1184877, term1184877.getClass(), "_writeContext", null);
        setBooleanField(term1184877, term1184877.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1184877, term1184877.getClass(), "_outputEscapes", null);
        setField(term1184877, term1184877.getClass(), "_rootValueSeparator", null);
        setField(term1184877, term1184877.getClass(), "_ioContext", null);
        setIntField(term1184877, term1184877.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1184877, term1184877.getClass(), "_cfgUnqNames", false);
        setField(term1184877, term1184877.getClass(), "_outputStream", null);
        setBooleanField(term1184877, term1184877.getClass(), "_bufferRecyclable", false);
        setField(term1184877, term1184877.getClass(), "_outputBuffer", null);
        setIntField(term1184877, term1184877.getClass(), "_outputEnd", 0);
        setIntField(term1184877, term1184877.getClass(), "_outputMaxContiguous", 0);
        term1184961 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1185059 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1184607 = (Object[]) newArray("[B", 2);
        byte[] term1184608 = (byte[]) newByteArray(0);
        setField(term1184961, term1184961.getClass(), "_writeEncodingBuffer", null);
        setElement(term1184607, 0, term1184608);
        setField(term1185059, term1185059.getClass(), "_byteBuffers", term1184607);
        setField(term1184961, term1184961.getClass(), "_bufferRecycler", term1185059);
        setField(term1184961, term1184961.getClass(), "_concatCBuffer", null);
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
        args[0] = term1184961;
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


