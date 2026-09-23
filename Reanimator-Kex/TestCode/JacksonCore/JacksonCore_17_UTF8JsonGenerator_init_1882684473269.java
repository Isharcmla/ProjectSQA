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

public class UTF8JsonGenerator_init_1882684473269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1433722;

    public UTF8JsonGenerator_init_1882684473269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1433418 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term1433516 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term1433638 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term1433418, term1433418.getClass(), "_features", 0);
        setField(term1433418, term1433418.getClass(), "_objectCodec", null);
        setField(term1433418, term1433418.getClass(), "_writeContext", null);
        setBooleanField(term1433418, term1433418.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1433418, term1433418.getClass(), "_outputEscapes", null);
        setField(term1433516, term1433516.getClass(), "_value", " ");
        setField(term1433516, term1433516.getClass(), "_quotedUTF8Ref", null);
        setField(term1433516, term1433516.getClass(), "_unquotedUTF8Ref", null);
        setField(term1433516, term1433516.getClass(), "_quotedChars", null);
        setField(term1433516, term1433516.getClass(), "_jdkSerializeValue", null);
        setField(term1433418, term1433418.getClass(), "_rootValueSeparator", term1433516);
        setField(term1433418, term1433418.getClass(), "_ioContext", term1433638);
        setIntField(term1433418, term1433418.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1433418, term1433418.getClass(), "_cfgUnqNames", false);
        setField(term1433418, term1433418.getClass(), "_outputStream", null);
        setBooleanField(term1433418, term1433418.getClass(), "_bufferRecyclable", false);
        setField(term1433418, term1433418.getClass(), "_outputBuffer", null);
        setIntField(term1433418, term1433418.getClass(), "_outputEnd", 0);
        setIntField(term1433418, term1433418.getClass(), "_outputMaxContiguous", 0);
        term1433722 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1433820 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1433117 = (Object[]) newArray("[B", 2);
        byte[] term1433118 = (byte[]) newByteArray(0);
        setField(term1433722, term1433722.getClass(), "_writeEncodingBuffer", null);
        setElement(term1433117, 0, term1433118);
        setElement(term1433117, 1, term1433118);
        setField(term1433820, term1433820.getClass(), "_byteBuffers", term1433117);
        setField(term1433722, term1433722.getClass(), "_bufferRecycler", term1433820);
        setField(term1433722, term1433722.getClass(), "_concatCBuffer", null);
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
        args[0] = term1433722;
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


