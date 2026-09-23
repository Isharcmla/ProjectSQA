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

public class UTF8JsonGenerator_init_1882684473237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398111;

    public UTF8JsonGenerator_init_1882684473237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term398027 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term398027, term398027.getClass(), "_features", 0);
        setField(term398027, term398027.getClass(), "_objectCodec", null);
        setField(term398027, term398027.getClass(), "_writeContext", null);
        setBooleanField(term398027, term398027.getClass(), "_cfgNumbersAsStrings", false);
        setField(term398027, term398027.getClass(), "_outputEscapes", null);
        setField(term398027, term398027.getClass(), "_rootValueSeparator", null);
        setField(term398027, term398027.getClass(), "_ioContext", null);
        setIntField(term398027, term398027.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term398027, term398027.getClass(), "_cfgUnqNames", false);
        setField(term398027, term398027.getClass(), "_outputStream", null);
        setBooleanField(term398027, term398027.getClass(), "_bufferRecyclable", false);
        setField(term398027, term398027.getClass(), "_outputBuffer", null);
        setIntField(term398027, term398027.getClass(), "_outputEnd", 0);
        setIntField(term398027, term398027.getClass(), "_outputMaxContiguous", 0);
        term398111 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term398209 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term397761 = (Object[]) newArray("[B", 128);
        char[] term397769 = (char[]) newCharArray(0);
        setField(term398111, term398111.getClass(), "_writeEncodingBuffer", null);
        setField(term398209, term398209.getClass(), "_byteBuffers", term397761);
        setField(term398111, term398111.getClass(), "_bufferRecycler", term398209);
        setField(term398111, term398111.getClass(), "_concatCBuffer", term397769);
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
        args[0] = term398111;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


