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

public class UTF8JsonGenerator_init_1882684473268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1432739;

    public UTF8JsonGenerator_init_1882684473268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1432655 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term1432655, term1432655.getClass(), "_features", 0);
        setField(term1432655, term1432655.getClass(), "_objectCodec", null);
        setField(term1432655, term1432655.getClass(), "_writeContext", null);
        setBooleanField(term1432655, term1432655.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1432655, term1432655.getClass(), "_outputEscapes", null);
        setField(term1432655, term1432655.getClass(), "_rootValueSeparator", null);
        setField(term1432655, term1432655.getClass(), "_ioContext", null);
        setIntField(term1432655, term1432655.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1432655, term1432655.getClass(), "_cfgUnqNames", false);
        setField(term1432655, term1432655.getClass(), "_outputStream", null);
        setBooleanField(term1432655, term1432655.getClass(), "_bufferRecyclable", false);
        setField(term1432655, term1432655.getClass(), "_outputBuffer", null);
        setIntField(term1432655, term1432655.getClass(), "_outputEnd", 0);
        setIntField(term1432655, term1432655.getClass(), "_outputMaxContiguous", 0);
        term1432739 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1432837 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1432385 = (Object[]) newArray("[B", 2);
        byte[] term1432386 = (byte[]) newByteArray(0);
        setField(term1432739, term1432739.getClass(), "_writeEncodingBuffer", null);
        setElement(term1432385, 0, term1432386);
        setField(term1432837, term1432837.getClass(), "_byteBuffers", term1432385);
        setField(term1432739, term1432739.getClass(), "_bufferRecycler", term1432837);
        setField(term1432739, term1432739.getClass(), "_concatCBuffer", null);
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
        args[0] = term1432739;
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


