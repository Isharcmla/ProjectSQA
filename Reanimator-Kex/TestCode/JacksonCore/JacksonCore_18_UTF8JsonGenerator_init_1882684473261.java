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

public class UTF8JsonGenerator_init_1882684473261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1025929;

    public UTF8JsonGenerator_init_1882684473261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1025645 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term1025747 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term1025845 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        setIntField(term1025645, term1025645.getClass(), "_features", 0);
        setField(term1025645, term1025645.getClass(), "_objectCodec", null);
        setField(term1025645, term1025645.getClass(), "_writeContext", term1025747);
        setBooleanField(term1025645, term1025645.getClass(), "_cfgNumbersAsStrings", false);
        setField(term1025645, term1025645.getClass(), "_outputEscapes", null);
        setField(term1025645, term1025645.getClass(), "_rootValueSeparator", term1025845);
        setField(term1025645, term1025645.getClass(), "_ioContext", null);
        setIntField(term1025645, term1025645.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term1025645, term1025645.getClass(), "_cfgUnqNames", false);
        setField(term1025645, term1025645.getClass(), "_outputStream", null);
        setBooleanField(term1025645, term1025645.getClass(), "_bufferRecyclable", false);
        term1025929 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term1026027 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term1025403 = (Object[]) newArray("[B", 32);
        byte[] term1025404 = (byte[]) newByteArray(0);
        setField(term1025929, term1025929.getClass(), "_writeEncodingBuffer", null);
        setElement(term1025403, 1, term1025404);
        setField(term1026027, term1026027.getClass(), "_byteBuffers", term1025403);
        setField(term1025929, term1025929.getClass(), "_bufferRecycler", term1026027);
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
        args[0] = term1025929;
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


