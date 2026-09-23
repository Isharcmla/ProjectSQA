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

public class UTF8JsonGenerator_init_1882684473273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1503687;

    public UTF8JsonGenerator_init_1882684473273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1503383 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term1503481 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term1503603 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term1503383, term1503383.getClass(), "_features", 0);
        setField(term1503383, term1503383.getClass(), "_objectCodec", null);
        setField(term1503383, term1503383.getClass(), "_writeContext", null);
        setBooleanField(term1503383, term1503383.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1503383, term1503383.getClass(), "_outputEscapes", null);
        setField(term1503481, term1503481.getClass(), "_value", " ");
        setField(term1503481, term1503481.getClass(), "_quotedUTF8Ref", null);
        setField(term1503481, term1503481.getClass(), "_unquotedUTF8Ref", null);
        setField(term1503481, term1503481.getClass(), "_quotedChars", null);
        setField(term1503481, term1503481.getClass(), "_jdkSerializeValue", null);
        setField(term1503383, term1503383.getClass(), "_rootValueSeparator", term1503481);
        setField(term1503383, term1503383.getClass(), "_ioContext", term1503603);
        setIntField(term1503383, term1503383.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1503383, term1503383.getClass(), "_cfgUnqNames", false);
        setField(term1503383, term1503383.getClass(), "_outputStream", null);
        setBooleanField(term1503383, term1503383.getClass(), "_bufferRecyclable", false);
        setField(term1503383, term1503383.getClass(), "_outputBuffer", null);
        setIntField(term1503383, term1503383.getClass(), "_outputEnd", 0);
        setIntField(term1503383, term1503383.getClass(), "_outputMaxContiguous", 0);
        term1503687 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1503785 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1503082 = (Object[]) newArray("[B", 2);
        byte[] term1503083 = (byte[]) newByteArray(0);
        setField(term1503687, term1503687.getClass(), "_writeEncodingBuffer", null);
        setElement(term1503082, 0, term1503083);
        setElement(term1503082, 1, term1503083);
        setField(term1503785, term1503785.getClass(), "_byteBuffers", term1503082);
        setField(term1503687, term1503687.getClass(), "_bufferRecycler", term1503785);
        setField(term1503687, term1503687.getClass(), "_concatCBuffer", null);
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
        args[0] = term1503687;
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


