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

public class UTF8JsonGenerator_init_25805811171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40140;

    public UTF8JsonGenerator_init_25805811171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39874 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        int[] term39634 = (int[]) newIntArray(0);
        Object term39972 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term40056 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        byte[] term39642 = (byte[]) newByteArray(0);
        setIntField(term39874, term39874.getClass(), "_features", 0);
        setField(term39874, term39874.getClass(), "_objectCodec", null);
        setField(term39874, term39874.getClass(), "_writeContext", null);
        setBooleanField(term39874, term39874.getClass(), "_cfgNumbersAsStrings", false);
        setField(term39874, term39874.getClass(), "_outputEscapes", term39634);
        setField(term39874, term39874.getClass(), "_rootValueSeparator", term39972);
        setField(term39874, term39874.getClass(), "_ioContext", term40056);
        setBooleanField(term39874, term39874.getClass(), "_cfgUnqNames", false);
        setField(term39874, term39874.getClass(), "_outputStream", null);
        setBooleanField(term39874, term39874.getClass(), "_bufferRecyclable", false);
        setIntField(term39874, term39874.getClass(), "_outputTail", 0);
        setField(term39874, term39874.getClass(), "_outputBuffer", term39642);
        term40140 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
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
        args[0] = term40140;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = 0;
        args[6] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


