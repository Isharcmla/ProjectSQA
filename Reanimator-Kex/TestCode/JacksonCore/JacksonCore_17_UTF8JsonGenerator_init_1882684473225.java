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

public class UTF8JsonGenerator_init_1882684473225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178379;

    public UTF8JsonGenerator_init_1882684473225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term178295 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term178295, term178295.getClass(), "_features", 0);
        setField(term178295, term178295.getClass(), "_objectCodec", null);
        setField(term178295, term178295.getClass(), "_writeContext", null);
        setBooleanField(term178295, term178295.getClass(), "_cfgNumbersAsStrings", false);
        setField(term178295, term178295.getClass(), "_outputEscapes", null);
        setField(term178295, term178295.getClass(), "_rootValueSeparator", null);
        setField(term178295, term178295.getClass(), "_ioContext", null);
        setIntField(term178295, term178295.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term178295, term178295.getClass(), "_cfgUnqNames", false);
        setField(term178295, term178295.getClass(), "_outputStream", null);
        setBooleanField(term178295, term178295.getClass(), "_bufferRecyclable", false);
        setField(term178295, term178295.getClass(), "_outputBuffer", null);
        setIntField(term178295, term178295.getClass(), "_outputEnd", 0);
        setIntField(term178295, term178295.getClass(), "_outputMaxContiguous", 0);
        term178379 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term178477 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term177766 = (Object[]) newArray("[B", 2);
        Object[] term178029 = (Object[]) newArray("[C", 0);
        setField(term178379, term178379.getClass(), "_writeEncodingBuffer", null);
        setField(term178477, term178477.getClass(), "_byteBuffers", term177766);
        setField(term178477, term178477.getClass(), "_charBuffers", term178029);
        setField(term178379, term178379.getClass(), "_bufferRecycler", term178477);
        setField(term178379, term178379.getClass(), "_concatCBuffer", null);
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
        args[0] = term178379;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


