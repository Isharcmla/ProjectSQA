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

public class UTF8JsonGenerator_init_1882684473227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177361;
     Object term177503;

    public UTF8JsonGenerator_init_1882684473227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term177277 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term176496 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        setIntField(term177277, term177277.getClass(), "_features", 0);
        setField(term177277, term177277.getClass(), "_objectCodec", term176496);
        setField(term177277, term177277.getClass(), "_writeContext", null);
        setBooleanField(term177277, term177277.getClass(), "_cfgNumbersAsStrings", false);
        setField(term177277, term177277.getClass(), "_outputEscapes", null);
        setField(term177277, term177277.getClass(), "_rootValueSeparator", null);
        setField(term177277, term177277.getClass(), "_ioContext", null);
        setIntField(term177277, term177277.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term177277, term177277.getClass(), "_cfgUnqNames", false);
        setField(term177277, term177277.getClass(), "_outputStream", null);
        setBooleanField(term177277, term177277.getClass(), "_bufferRecyclable", false);
        term177361 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term177459 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term177026 = (Object[]) newArray("[B", 513);
        byte[] term177027 = (byte[]) newByteArray(0);
        setField(term177361, term177361.getClass(), "_writeEncodingBuffer", null);
        setElement(term177026, 1, term177027);
        setField(term177459, term177459.getClass(), "_byteBuffers", term177026);
        setField(term177361, term177361.getClass(), "_bufferRecycler", term177459);
        term177503 = newInstance(Class.forName("java.io.PrintStream"));
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
        args[0] = term177361;
        args[1] = -1;
        args[2] = null;
        args[3] = term177503;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


