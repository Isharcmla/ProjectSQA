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
import org.mockito.Mockito;

public class UTF8JsonGenerator_init_1882684473220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99309;
     Object term98618;
     Object term99479;

    public UTF8JsonGenerator_init_1882684473220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99141 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term99225 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term99141, term99141.getClass(), "_features", 0);
        setField(term99141, term99141.getClass(), "_objectCodec", null);
        setField(term99141, term99141.getClass(), "_writeContext", null);
        setBooleanField(term99141, term99141.getClass(), "_cfgNumbersAsStrings", false);
        setField(term99141, term99141.getClass(), "_outputEscapes", null);
        setField(term99141, term99141.getClass(), "_rootValueSeparator", null);
        setField(term99141, term99141.getClass(), "_ioContext", term99225);
        setIntField(term99141, term99141.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term99141, term99141.getClass(), "_cfgUnqNames", false);
        setField(term99141, term99141.getClass(), "_outputStream", null);
        setBooleanField(term99141, term99141.getClass(), "_bufferRecyclable", false);
        term99309 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term99407 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term98908 = (Object[]) newArray("[B", 32);
        setField(term99309, term99309.getClass(), "_writeEncodingBuffer", null);
        setField(term99407, term99407.getClass(), "_byteBuffers", term98908);
        setField(term99309, term99309.getClass(), "_bufferRecycler", term99407);
        term98618 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term99479 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
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
        args[0] = term99309;
        args[1] = -1;
        args[2] = term98618;
        args[3] = term99479;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


