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

public class UTF8JsonGenerator_init_1882684473205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80094;

    public UTF8JsonGenerator_init_1882684473205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term79778 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        int[] term79032 = (int[]) newIntArray(0);
        Object term79876 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term79960 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term80010 = newInstance(Class.forName("java.io.OutputStream$1"));
        setIntField(term79778, term79778.getClass(), "_features", 0);
        setField(term79778, term79778.getClass(), "_objectCodec", null);
        setField(term79778, term79778.getClass(), "_writeContext", null);
        setBooleanField(term79778, term79778.getClass(), "_cfgNumbersAsStrings", false);
        setField(term79778, term79778.getClass(), "_outputEscapes", term79032);
        setField(term79778, term79778.getClass(), "_rootValueSeparator", term79876);
        setField(term79778, term79778.getClass(), "_ioContext", term79960);
        setIntField(term79778, term79778.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term79778, term79778.getClass(), "_cfgUnqNames", false);
        setField(term79778, term79778.getClass(), "_outputStream", term80010);
        setBooleanField(term79778, term79778.getClass(), "_bufferRecyclable", false);
        term80094 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term80192 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term80094, term80094.getClass(), "_writeEncodingBuffer", null);
        setField(term80094, term80094.getClass(), "_bufferRecycler", term80192);
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
        args[0] = term80094;
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


