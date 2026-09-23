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

public class UTF8JsonGenerator_init_1882684473251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term860104;

    public UTF8JsonGenerator_init_1882684473251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term860020 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term860020, term860020.getClass(), "_features", 0);
        setField(term860020, term860020.getClass(), "_objectCodec", null);
        setField(term860020, term860020.getClass(), "_writeContext", null);
        setBooleanField(term860020, term860020.getClass(), "_cfgNumbersAsStrings", false);
        setField(term860020, term860020.getClass(), "_outputEscapes", null);
        setField(term860020, term860020.getClass(), "_rootValueSeparator", null);
        setField(term860020, term860020.getClass(), "_ioContext", null);
        setIntField(term860020, term860020.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term860020, term860020.getClass(), "_cfgUnqNames", false);
        setField(term860020, term860020.getClass(), "_outputStream", null);
        setBooleanField(term860020, term860020.getClass(), "_bufferRecyclable", false);
        setField(term860020, term860020.getClass(), "_outputBuffer", null);
        setIntField(term860020, term860020.getClass(), "_outputEnd", 0);
        setIntField(term860020, term860020.getClass(), "_outputMaxContiguous", 0);
        term860104 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term860202 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term859753 = (Object[]) newArray("[B", 8);
        setField(term860104, term860104.getClass(), "_writeEncodingBuffer", null);
        setField(term860202, term860202.getClass(), "_byteBuffers", term859753);
        setField(term860104, term860104.getClass(), "_bufferRecycler", term860202);
        setField(term860104, term860104.getClass(), "_concatCBuffer", null);
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
        args[0] = term860104;
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


