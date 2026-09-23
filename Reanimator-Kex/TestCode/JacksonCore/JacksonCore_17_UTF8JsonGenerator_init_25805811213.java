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

public class UTF8JsonGenerator_init_25805811213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86339;
     Object term86491;
     Object term85732;

    public UTF8JsonGenerator_init_25805811213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86255 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term86255, term86255.getClass(), "_features", 0);
        setField(term86255, term86255.getClass(), "_objectCodec", null);
        setField(term86255, term86255.getClass(), "_writeContext", null);
        setBooleanField(term86255, term86255.getClass(), "_cfgNumbersAsStrings", false);
        setField(term86255, term86255.getClass(), "_outputEscapes", null);
        setField(term86255, term86255.getClass(), "_rootValueSeparator", null);
        setField(term86255, term86255.getClass(), "_ioContext", null);
        setIntField(term86255, term86255.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term86255, term86255.getClass(), "_cfgUnqNames", false);
        setField(term86255, term86255.getClass(), "_outputStream", null);
        setBooleanField(term86255, term86255.getClass(), "_bufferRecyclable", false);
        setIntField(term86255, term86255.getClass(), "_outputTail", 0);
        setField(term86255, term86255.getClass(), "_outputBuffer", null);
        setIntField(term86255, term86255.getClass(), "_outputEnd", 0);
        setIntField(term86255, term86255.getClass(), "_outputMaxContiguous", 0);
        term86339 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term86437 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term86017 = (Object[]) newArray("[C", 0);
        setField(term86339, term86339.getClass(), "_concatCBuffer", null);
        setField(term86437, term86437.getClass(), "_charBuffers", term86017);
        setField(term86339, term86339.getClass(), "_bufferRecycler", term86437);
        term86491 = newInstance(Class.forName("java.io.DataOutputStream"));
        term85732 = (byte[]) newByteArray(0);
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
        args[0] = term86339;
        args[1] = -1;
        args[2] = null;
        args[3] = term86491;
        args[4] = term85732;
        args[5] = 0;
        args[6] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


