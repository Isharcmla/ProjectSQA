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

public class UTF8JsonGenerator_init_25805811211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81947;
     Object term82107;
     Object term81340;

    public UTF8JsonGenerator_init_25805811211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81863 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term81863, term81863.getClass(), "_features", 0);
        setField(term81863, term81863.getClass(), "_objectCodec", null);
        setField(term81863, term81863.getClass(), "_writeContext", null);
        setBooleanField(term81863, term81863.getClass(), "_cfgNumbersAsStrings", false);
        setField(term81863, term81863.getClass(), "_outputEscapes", null);
        setField(term81863, term81863.getClass(), "_rootValueSeparator", null);
        setField(term81863, term81863.getClass(), "_ioContext", null);
        setIntField(term81863, term81863.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term81863, term81863.getClass(), "_cfgUnqNames", false);
        setField(term81863, term81863.getClass(), "_outputStream", null);
        setBooleanField(term81863, term81863.getClass(), "_bufferRecyclable", false);
        setIntField(term81863, term81863.getClass(), "_outputTail", 0);
        setField(term81863, term81863.getClass(), "_outputBuffer", null);
        setIntField(term81863, term81863.getClass(), "_outputEnd", 0);
        setIntField(term81863, term81863.getClass(), "_outputMaxContiguous", 0);
        term81947 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term82045 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term81625 = (Object[]) newArray("[C", 0);
        setField(term81947, term81947.getClass(), "_concatCBuffer", null);
        setField(term82045, term82045.getClass(), "_charBuffers", term81625);
        setField(term81947, term81947.getClass(), "_bufferRecycler", term82045);
        term82107 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        term81340 = (byte[]) newByteArray(0);
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
        args[0] = term81947;
        args[1] = -1;
        args[2] = null;
        args[3] = term82107;
        args[4] = term81340;
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


