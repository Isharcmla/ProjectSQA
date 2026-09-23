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

public class UTF8JsonGenerator_init_1882684473238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491185;
     Object term490153;

    public UTF8JsonGenerator_init_1882684473238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term490907 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term490408 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term491005 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term491101 = newInstance(Class.forName("java.io.ObjectOutputStream"));
        setIntField(term490907, term490907.getClass(), "_features", 0);
        setField(term490907, term490907.getClass(), "_objectCodec", term490408);
        setField(term490907, term490907.getClass(), "_writeContext", null);
        setBooleanField(term490907, term490907.getClass(), "_cfgNumbersAsStrings", false);
        setField(term490907, term490907.getClass(), "_outputEscapes", null);
        setField(term491005, term491005.getClass(), "_value", " ");
        setField(term491005, term491005.getClass(), "_quotedUTF8Ref", null);
        setField(term491005, term491005.getClass(), "_unquotedUTF8Ref", null);
        setField(term491005, term491005.getClass(), "_quotedChars", null);
        setField(term491005, term491005.getClass(), "_jdkSerializeValue", null);
        setField(term490907, term490907.getClass(), "_rootValueSeparator", term491005);
        setField(term490907, term490907.getClass(), "_ioContext", null);
        setIntField(term490907, term490907.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term490907, term490907.getClass(), "_cfgUnqNames", false);
        setField(term490907, term490907.getClass(), "_outputStream", term491101);
        setBooleanField(term490907, term490907.getClass(), "_bufferRecyclable", false);
        term491185 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term491283 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term490435 = (Object[]) newArray("[B", 2);
        byte[] term490436 = (byte[]) newByteArray(108);
        setField(term491185, term491185.getClass(), "_writeEncodingBuffer", null);
        setElement(term490435, 1, term490436);
        setField(term491283, term491283.getClass(), "_byteBuffers", term490435);
        setField(term491185, term491185.getClass(), "_bufferRecycler", term491283);
        term490153 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term491185;
        args[1] = -1;
        args[2] = term490153;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


