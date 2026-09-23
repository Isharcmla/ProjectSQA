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
import org.mockito.Mockito;

public class UTF8JsonGenerator_init_25805811203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76977;
     Object term75149;

    public UTF8JsonGenerator_init_25805811203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76645 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term75895 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term75905 = (int[]) newIntArray(0);
        Object term76743 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term76827 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term76915 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        byte[] term75915 = (byte[]) newByteArray(0);
        setIntField(term76645, term76645.getClass(), "_features", 0);
        setField(term76645, term76645.getClass(), "_objectCodec", term75895);
        setField(term76645, term76645.getClass(), "_writeContext", null);
        setBooleanField(term76645, term76645.getClass(), "_cfgNumbersAsStrings", false);
        setField(term76645, term76645.getClass(), "_outputEscapes", term75905);
        setField(term76645, term76645.getClass(), "_rootValueSeparator", term76743);
        setField(term76645, term76645.getClass(), "_ioContext", term76827);
        setIntField(term76645, term76645.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term76645, term76645.getClass(), "_cfgUnqNames", false);
        setField(term76645, term76645.getClass(), "_outputStream", term76915);
        setBooleanField(term76645, term76645.getClass(), "_bufferRecyclable", false);
        setIntField(term76645, term76645.getClass(), "_outputTail", 0);
        setField(term76645, term76645.getClass(), "_outputBuffer", term75915);
        setIntField(term76645, term76645.getClass(), "_outputEnd", 0);
        setIntField(term76645, term76645.getClass(), "_outputMaxContiguous", 0);
        term76977 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        term75149 = (byte[]) newByteArray(489);
        setByteElement(term75149, 0, (byte) 73);
        setByteElement(term75149, 1, (byte) 71);
        setByteElement(term75149, 2, (byte) 78);
        setByteElement(term75149, 3, (byte) 79);
        setByteElement(term75149, 4, (byte) 82);
        setByteElement(term75149, 5, (byte) 69);
        setByteElement(term75149, 6, (byte) 95);
        setByteElement(term75149, 7, (byte) 85);
        setByteElement(term75149, 8, (byte) 78);
        setByteElement(term75149, 9, (byte) 75);
        setByteElement(term75149, 10, (byte) 78);
        setByteElement(term75149, 11, (byte) 79);
        setByteElement(term75149, 12, (byte) 87);
        setByteElement(term75149, 13, (byte) 78);
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
        args[0] = null;
        args[1] = -1;
        args[2] = null;
        args[3] = term76977;
        args[4] = term75149;
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


