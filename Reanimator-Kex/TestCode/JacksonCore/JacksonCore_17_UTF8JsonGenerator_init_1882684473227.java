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

public class UTF8JsonGenerator_init_1882684473227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228018;

    public UTF8JsonGenerator_init_1882684473227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term227934 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term227934, term227934.getClass(), "_features", 0);
        setField(term227934, term227934.getClass(), "_objectCodec", null);
        setField(term227934, term227934.getClass(), "_writeContext", null);
        setBooleanField(term227934, term227934.getClass(), "_cfgNumbersAsStrings", false);
        setField(term227934, term227934.getClass(), "_outputEscapes", null);
        setField(term227934, term227934.getClass(), "_rootValueSeparator", null);
        setField(term227934, term227934.getClass(), "_ioContext", null);
        setIntField(term227934, term227934.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term227934, term227934.getClass(), "_cfgUnqNames", false);
        setField(term227934, term227934.getClass(), "_outputStream", null);
        setBooleanField(term227934, term227934.getClass(), "_bufferRecyclable", false);
        setField(term227934, term227934.getClass(), "_outputBuffer", null);
        setIntField(term227934, term227934.getClass(), "_outputEnd", 0);
        setIntField(term227934, term227934.getClass(), "_outputMaxContiguous", 0);
        term228018 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term228116 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term227668 = (Object[]) newArray("[B", 128);
        char[] term227676 = (char[]) newCharArray(0);
        setField(term228018, term228018.getClass(), "_writeEncodingBuffer", null);
        setField(term228116, term228116.getClass(), "_byteBuffers", term227668);
        setField(term228018, term228018.getClass(), "_bufferRecycler", term228116);
        setField(term228018, term228018.getClass(), "_concatCBuffer", term227676);
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
        args[0] = term228018;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


