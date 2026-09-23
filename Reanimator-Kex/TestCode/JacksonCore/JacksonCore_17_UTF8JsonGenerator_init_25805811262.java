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

public class UTF8JsonGenerator_init_25805811262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1365496;
     Object term1364480;
     Object term1364481;

    public UTF8JsonGenerator_init_25805811262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1365276 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term1365374 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term1365276, term1365276.getClass(), "_features", 0);
        setField(term1365276, term1365276.getClass(), "_objectCodec", null);
        setField(term1365276, term1365276.getClass(), "_writeContext", null);
        setBooleanField(term1365276, term1365276.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1365276, term1365276.getClass(), "_outputEscapes", null);
        setField(term1365374, term1365374.getClass(), "_value", " ");
        setField(term1365374, term1365374.getClass(), "_quotedUTF8Ref", null);
        setField(term1365374, term1365374.getClass(), "_unquotedUTF8Ref", null);
        setField(term1365374, term1365374.getClass(), "_quotedChars", null);
        setField(term1365374, term1365374.getClass(), "_jdkSerializeValue", null);
        setField(term1365276, term1365276.getClass(), "_rootValueSeparator", term1365374);
        setField(term1365276, term1365276.getClass(), "_ioContext", null);
        setIntField(term1365276, term1365276.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1365276, term1365276.getClass(), "_cfgUnqNames", false);
        setField(term1365276, term1365276.getClass(), "_outputStream", null);
        setBooleanField(term1365276, term1365276.getClass(), "_bufferRecyclable", false);
        setIntField(term1365276, term1365276.getClass(), "_outputTail", 0);
        setField(term1365276, term1365276.getClass(), "_outputBuffer", null);
        setIntField(term1365276, term1365276.getClass(), "_outputEnd", 0);
        setIntField(term1365276, term1365276.getClass(), "_outputMaxContiguous", 0);
        term1365496 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1365594 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1365014 = (Object[]) newArray("[C", 4);
        char[] term1365015 = (char[]) newCharArray(0);
        setField(term1365496, term1365496.getClass(), "_concatCBuffer", null);
        setElement(term1365014, 1, term1365015);
        setField(term1365594, term1365594.getClass(), "_charBuffers", term1365014);
        setField(term1365496, term1365496.getClass(), "_bufferRecycler", term1365594);
        term1364480 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term1364481 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.OutputStream");
        argTypes[4] = Array.newInstance(byte.class, 0).getClass();
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term1365496;
        args[1] = -1;
        args[2] = term1364480;
        args[3] = null;
        args[4] = term1364481;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


