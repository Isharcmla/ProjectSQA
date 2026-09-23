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

public class UTF8JsonGenerator_init_1882684473236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449206;
     Object term448378;

    public UTF8JsonGenerator_init_1882684473236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term448986 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term449084 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] term448719 = (byte[]) newByteArray(0);
        setIntField(term448986, term448986.getClass(), "_features", 0);
        setField(term448986, term448986.getClass(), "_objectCodec", null);
        setField(term448986, term448986.getClass(), "_writeContext", null);
        setBooleanField(term448986, term448986.getClass(), "_cfgNumbersAsStrings", false);
        setField(term448986, term448986.getClass(), "_outputEscapes", null);
        setField(term449084, term449084.getClass(), "_value", " ");
        setField(term449084, term449084.getClass(), "_quotedUTF8Ref", null);
        setField(term449084, term449084.getClass(), "_unquotedUTF8Ref", null);
        setField(term449084, term449084.getClass(), "_quotedChars", null);
        setField(term449084, term449084.getClass(), "_jdkSerializeValue", null);
        setField(term448986, term448986.getClass(), "_rootValueSeparator", term449084);
        setField(term448986, term448986.getClass(), "_ioContext", null);
        setIntField(term448986, term448986.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term448986, term448986.getClass(), "_cfgUnqNames", false);
        setField(term448986, term448986.getClass(), "_outputStream", null);
        setBooleanField(term448986, term448986.getClass(), "_bufferRecyclable", false);
        setField(term448986, term448986.getClass(), "_outputBuffer", term448719);
        setIntField(term448986, term448986.getClass(), "_outputEnd", 0);
        setIntField(term448986, term448986.getClass(), "_outputMaxContiguous", 0);
        term449206 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term449304 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term448714 = (Object[]) newArray("[B", 2);
        byte[] term448715 = (byte[]) newByteArray(0);
        char[] term448724 = (char[]) newCharArray(0);
        setField(term449206, term449206.getClass(), "_writeEncodingBuffer", null);
        setElement(term448714, 1, term448715);
        setField(term449304, term449304.getClass(), "_byteBuffers", term448714);
        setField(term449206, term449206.getClass(), "_bufferRecycler", term449304);
        setField(term449206, term449206.getClass(), "_concatCBuffer", term448724);
        term448378 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term449206;
        args[1] = -1;
        args[2] = term448378;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


