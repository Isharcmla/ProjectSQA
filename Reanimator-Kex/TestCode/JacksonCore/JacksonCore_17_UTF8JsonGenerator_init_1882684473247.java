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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class UTF8JsonGenerator_init_1882684473247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term759120;

    public UTF8JsonGenerator_init_1882684473247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term758900 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term758436 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term758998 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        byte[] term758481 = (byte[]) newByteArray(0);
        setIntField(term758900, term758900.getClass(), "_features", 0);
        setField(term758900, term758900.getClass(), "_objectCodec", term758436);
        setField(term758900, term758900.getClass(), "_writeContext", null);
        setBooleanField(term758900, term758900.getClass(), "_cfgNumbersAsStrings", false);
        setField(term758900, term758900.getClass(), "_outputEscapes", null);
        setField(term758998, term758998.getClass(), "_value", " ");
        setField(term758998, term758998.getClass(), "_quotedUTF8Ref", null);
        setField(term758998, term758998.getClass(), "_unquotedUTF8Ref", null);
        setField(term758998, term758998.getClass(), "_quotedChars", null);
        setField(term758998, term758998.getClass(), "_jdkSerializeValue", null);
        setField(term758900, term758900.getClass(), "_rootValueSeparator", term758998);
        setField(term758900, term758900.getClass(), "_ioContext", null);
        setIntField(term758900, term758900.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term758900, term758900.getClass(), "_cfgUnqNames", false);
        setField(term758900, term758900.getClass(), "_outputStream", null);
        setBooleanField(term758900, term758900.getClass(), "_bufferRecyclable", false);
        setField(term758900, term758900.getClass(), "_outputBuffer", term758481);
        setIntField(term758900, term758900.getClass(), "_outputEnd", 0);
        setIntField(term758900, term758900.getClass(), "_outputMaxContiguous", 0);
        term759120 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term759218 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term758462 = (Object[]) newArray("[B", 2);
        byte[] term758463 = (byte[]) newByteArray(0);
        Object[] term758630 = (Object[]) newArray("[C", 0);
        setField(term759120, term759120.getClass(), "_writeEncodingBuffer", null);
        setElement(term758462, 1, term758463);
        setField(term759218, term759218.getClass(), "_byteBuffers", term758462);
        setField(term759218, term759218.getClass(), "_charBuffers", term758630);
        setField(term759120, term759120.getClass(), "_bufferRecycler", term759218);
        setField(term759120, term759120.getClass(), "_concatCBuffer", null);
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
        args[0] = term759120;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


