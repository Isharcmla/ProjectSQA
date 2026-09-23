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

public class UTF8JsonGenerator_init_25805811175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43193;

    public UTF8JsonGenerator_init_25805811175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42927 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        int[] term42687 = (int[]) newIntArray(0);
        Object term43025 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term43109 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        byte[] term42695 = (byte[]) newByteArray(0);
        setIntField(term42927, term42927.getClass(), "_features", 0);
        setField(term42927, term42927.getClass(), "_objectCodec", null);
        setField(term42927, term42927.getClass(), "_writeContext", null);
        setBooleanField(term42927, term42927.getClass(), "_cfgNumbersAsStrings", false);
        setField(term42927, term42927.getClass(), "_outputEscapes", term42687);
        setField(term42927, term42927.getClass(), "_rootValueSeparator", term43025);
        setField(term42927, term42927.getClass(), "_ioContext", term43109);
        setBooleanField(term42927, term42927.getClass(), "_cfgUnqNames", false);
        setField(term42927, term42927.getClass(), "_outputStream", null);
        setBooleanField(term42927, term42927.getClass(), "_bufferRecyclable", false);
        setIntField(term42927, term42927.getClass(), "_outputTail", 0);
        setField(term42927, term42927.getClass(), "_outputBuffer", term42695);
        term43193 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
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
        args[0] = term43193;
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


