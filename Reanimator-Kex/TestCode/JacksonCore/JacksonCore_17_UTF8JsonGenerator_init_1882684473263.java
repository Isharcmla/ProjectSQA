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

public class UTF8JsonGenerator_init_1882684473263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1366602;
     Object term1365599;
     Object term1366802;

    public UTF8JsonGenerator_init_1882684473263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1366382 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term1366480 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term1366382, term1366382.getClass(), "_features", 0);
        setField(term1366382, term1366382.getClass(), "_objectCodec", null);
        setField(term1366382, term1366382.getClass(), "_writeContext", null);
        setBooleanField(term1366382, term1366382.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1366382, term1366382.getClass(), "_outputEscapes", null);
        setField(term1366480, term1366480.getClass(), "_value", " ");
        setField(term1366480, term1366480.getClass(), "_quotedUTF8Ref", null);
        setField(term1366480, term1366480.getClass(), "_unquotedUTF8Ref", null);
        setField(term1366480, term1366480.getClass(), "_quotedChars", null);
        setField(term1366480, term1366480.getClass(), "_jdkSerializeValue", null);
        setField(term1366382, term1366382.getClass(), "_rootValueSeparator", term1366480);
        setField(term1366382, term1366382.getClass(), "_ioContext", null);
        setIntField(term1366382, term1366382.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1366382, term1366382.getClass(), "_cfgUnqNames", false);
        setField(term1366382, term1366382.getClass(), "_outputStream", null);
        setBooleanField(term1366382, term1366382.getClass(), "_bufferRecyclable", false);
        term1366602 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1366700 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1366128 = (Object[]) newArray("[B", 128);
        setField(term1366602, term1366602.getClass(), "_writeEncodingBuffer", null);
        setField(term1366700, term1366700.getClass(), "_byteBuffers", term1366128);
        setField(term1366602, term1366602.getClass(), "_bufferRecycler", term1366700);
        term1365599 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term1366802 = newInstance(Class.forName("java.io.ObjectOutputStream$BlockDataOutputStream"));
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
        args[0] = term1366602;
        args[1] = -1;
        args[2] = term1365599;
        args[3] = term1366802;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


