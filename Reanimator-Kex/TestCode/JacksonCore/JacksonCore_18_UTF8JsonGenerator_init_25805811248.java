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

public class UTF8JsonGenerator_init_25805811248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645416;
     Object term644782;
     Object term644783;

    public UTF8JsonGenerator_init_25805811248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term645332 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term645332, term645332.getClass(), "_features", 0);
        setField(term645332, term645332.getClass(), "_objectCodec", null);
        setField(term645332, term645332.getClass(), "_writeContext", null);
        setBooleanField(term645332, term645332.getClass(), "_cfgNumbersAsStrings", false);
        setField(term645332, term645332.getClass(), "_outputEscapes", null);
        setField(term645332, term645332.getClass(), "_rootValueSeparator", null);
        setField(term645332, term645332.getClass(), "_ioContext", null);
        setIntField(term645332, term645332.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term645332, term645332.getClass(), "_cfgUnqNames", false);
        setField(term645332, term645332.getClass(), "_outputStream", null);
        setBooleanField(term645332, term645332.getClass(), "_bufferRecyclable", false);
        setIntField(term645332, term645332.getClass(), "_outputTail", 0);
        setField(term645332, term645332.getClass(), "_outputBuffer", null);
        setIntField(term645332, term645332.getClass(), "_outputEnd", 0);
        setIntField(term645332, term645332.getClass(), "_outputMaxContiguous", 0);
        term645416 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term645514 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term645077 = (Object[]) newArray("[C", 2);
        setField(term645416, term645416.getClass(), "_concatCBuffer", null);
        setField(term645514, term645514.getClass(), "_charBuffers", term645077);
        setField(term645416, term645416.getClass(), "_bufferRecycler", term645514);
        term644782 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term644783 = (byte[]) newByteArray(1);
        setByteElement(term644783, 0, (byte) 32);
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
        args[0] = term645416;
        args[1] = -1;
        args[2] = term644782;
        args[3] = null;
        args[4] = term644783;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


