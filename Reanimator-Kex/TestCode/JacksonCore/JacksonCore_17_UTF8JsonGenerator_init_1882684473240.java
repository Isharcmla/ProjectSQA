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

public class UTF8JsonGenerator_init_1882684473240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533399;
     Object term532622;

    public UTF8JsonGenerator_init_1882684473240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term533179 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term533277 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term533179, term533179.getClass(), "_features", 0);
        setField(term533179, term533179.getClass(), "_objectCodec", null);
        setField(term533179, term533179.getClass(), "_writeContext", null);
        setBooleanField(term533179, term533179.getClass(), "_cfgNumbersAsStrings", false);
        setField(term533179, term533179.getClass(), "_outputEscapes", null);
        setField(term533277, term533277.getClass(), "_value", " ");
        setField(term533277, term533277.getClass(), "_quotedUTF8Ref", null);
        setField(term533277, term533277.getClass(), "_unquotedUTF8Ref", null);
        setField(term533277, term533277.getClass(), "_quotedChars", null);
        setField(term533277, term533277.getClass(), "_jdkSerializeValue", null);
        setField(term533179, term533179.getClass(), "_rootValueSeparator", term533277);
        setField(term533179, term533179.getClass(), "_ioContext", null);
        setIntField(term533179, term533179.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term533179, term533179.getClass(), "_cfgUnqNames", false);
        setField(term533179, term533179.getClass(), "_outputStream", null);
        setBooleanField(term533179, term533179.getClass(), "_bufferRecyclable", false);
        setField(term533179, term533179.getClass(), "_outputBuffer", null);
        setIntField(term533179, term533179.getClass(), "_outputEnd", 0);
        setIntField(term533179, term533179.getClass(), "_outputMaxContiguous", 0);
        term533399 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term533497 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term532896 = (Object[]) newArray("[B", 8);
        byte[] term532897 = (byte[]) newByteArray(0);
        Object[] term532912 = (Object[]) newArray("[C", 2);
        char[] term532913 = (char[]) newCharArray(0);
        char[] term532914 = (char[]) newCharArray(0);
        setField(term533399, term533399.getClass(), "_writeEncodingBuffer", null);
        setElement(term532896, 0, term532897);
        setField(term533497, term533497.getClass(), "_byteBuffers", term532896);
        setElement(term532912, 0, term532913);
        setElement(term532912, 1, term532914);
        setField(term533497, term533497.getClass(), "_charBuffers", term532912);
        setField(term533399, term533399.getClass(), "_bufferRecycler", term533497);
        setField(term533399, term533399.getClass(), "_concatCBuffer", null);
        term532622 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term533399;
        args[1] = -1;
        args[2] = term532622;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


