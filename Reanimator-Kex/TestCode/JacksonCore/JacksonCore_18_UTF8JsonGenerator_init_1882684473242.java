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

public class UTF8JsonGenerator_init_1882684473242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535733;
     Object term534905;

    public UTF8JsonGenerator_init_1882684473242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term535513 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term535611 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] term535246 = (byte[]) newByteArray(0);
        setIntField(term535513, term535513.getClass(), "_features", 0);
        setField(term535513, term535513.getClass(), "_objectCodec", null);
        setField(term535513, term535513.getClass(), "_writeContext", null);
        setBooleanField(term535513, term535513.getClass(), "_cfgNumbersAsStrings", false);
        setField(term535513, term535513.getClass(), "_outputEscapes", null);
        setField(term535611, term535611.getClass(), "_value", " ");
        setField(term535611, term535611.getClass(), "_quotedUTF8Ref", null);
        setField(term535611, term535611.getClass(), "_unquotedUTF8Ref", null);
        setField(term535611, term535611.getClass(), "_quotedChars", null);
        setField(term535611, term535611.getClass(), "_jdkSerializeValue", null);
        setField(term535513, term535513.getClass(), "_rootValueSeparator", term535611);
        setField(term535513, term535513.getClass(), "_ioContext", null);
        setIntField(term535513, term535513.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term535513, term535513.getClass(), "_cfgUnqNames", false);
        setField(term535513, term535513.getClass(), "_outputStream", null);
        setBooleanField(term535513, term535513.getClass(), "_bufferRecyclable", false);
        setField(term535513, term535513.getClass(), "_outputBuffer", term535246);
        setIntField(term535513, term535513.getClass(), "_outputEnd", 0);
        setIntField(term535513, term535513.getClass(), "_outputMaxContiguous", 0);
        term535733 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term535831 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term535241 = (Object[]) newArray("[B", 2);
        byte[] term535242 = (byte[]) newByteArray(0);
        char[] term535251 = (char[]) newCharArray(0);
        setField(term535733, term535733.getClass(), "_writeEncodingBuffer", null);
        setElement(term535241, 1, term535242);
        setField(term535831, term535831.getClass(), "_byteBuffers", term535241);
        setField(term535733, term535733.getClass(), "_bufferRecycler", term535831);
        setField(term535733, term535733.getClass(), "_concatCBuffer", term535251);
        term534905 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term535733;
        args[1] = -1;
        args[2] = term534905;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


