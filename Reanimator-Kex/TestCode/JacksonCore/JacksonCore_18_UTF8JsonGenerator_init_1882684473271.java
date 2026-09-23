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

public class UTF8JsonGenerator_init_1882684473271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1345197;

    public UTF8JsonGenerator_init_1882684473271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1345113 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term1345113, term1345113.getClass(), "_features", 0);
        setField(term1345113, term1345113.getClass(), "_objectCodec", null);
        setField(term1345113, term1345113.getClass(), "_writeContext", null);
        setBooleanField(term1345113, term1345113.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1345113, term1345113.getClass(), "_outputEscapes", null);
        setField(term1345113, term1345113.getClass(), "_rootValueSeparator", null);
        setField(term1345113, term1345113.getClass(), "_ioContext", null);
        setIntField(term1345113, term1345113.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1345113, term1345113.getClass(), "_cfgUnqNames", false);
        setField(term1345113, term1345113.getClass(), "_outputStream", null);
        setBooleanField(term1345113, term1345113.getClass(), "_bufferRecyclable", false);
        setField(term1345113, term1345113.getClass(), "_outputBuffer", null);
        setIntField(term1345113, term1345113.getClass(), "_outputEnd", 0);
        setIntField(term1345113, term1345113.getClass(), "_outputMaxContiguous", 0);
        term1345197 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1345295 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1344846 = (Object[]) newArray("[B", 8);
        setField(term1345197, term1345197.getClass(), "_writeEncodingBuffer", null);
        setField(term1345295, term1345295.getClass(), "_byteBuffers", term1344846);
        setField(term1345197, term1345197.getClass(), "_bufferRecycler", term1345295);
        setField(term1345197, term1345197.getClass(), "_concatCBuffer", null);
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
        args[0] = term1345197;
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


