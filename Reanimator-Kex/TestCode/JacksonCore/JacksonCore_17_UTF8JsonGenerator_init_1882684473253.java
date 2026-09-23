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

public class UTF8JsonGenerator_init_1882684473253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term910031;

    public UTF8JsonGenerator_init_1882684473253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term909747 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term909849 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term909947 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term909747, term909747.getClass(), "_features", 0);
        setField(term909747, term909747.getClass(), "_objectCodec", null);
        setField(term909747, term909747.getClass(), "_writeContext", term909849);
        setBooleanField(term909747, term909747.getClass(), "_cfgNumbersAsStrings", false);
        setField(term909747, term909747.getClass(), "_outputEscapes", null);
        setField(term909747, term909747.getClass(), "_rootValueSeparator", term909947);
        setField(term909747, term909747.getClass(), "_ioContext", null);
        setIntField(term909747, term909747.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term909747, term909747.getClass(), "_cfgUnqNames", false);
        setField(term909747, term909747.getClass(), "_outputStream", null);
        setBooleanField(term909747, term909747.getClass(), "_bufferRecyclable", false);
        term910031 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term910129 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term909505 = (Object[]) newArray("[B", 32);
        byte[] term909506 = (byte[]) newByteArray(0);
        setField(term910031, term910031.getClass(), "_writeEncodingBuffer", null);
        setElement(term909505, 1, term909506);
        setField(term910129, term910129.getClass(), "_byteBuffers", term909505);
        setField(term910031, term910031.getClass(), "_bufferRecycler", term910129);
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
        args[0] = term910031;
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


