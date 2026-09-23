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

public class UTF8JsonGenerator_init_1882684473210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84880;
     Object term84282;

    public UTF8JsonGenerator_init_1882684473210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84796 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term84537 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term84547 = (int[]) newIntArray(0);
        setIntField(term84796, term84796.getClass(), "_features", 0);
        setField(term84796, term84796.getClass(), "_objectCodec", term84537);
        setField(term84796, term84796.getClass(), "_writeContext", null);
        setBooleanField(term84796, term84796.getClass(), "_cfgNumbersAsStrings", false);
        setField(term84796, term84796.getClass(), "_outputEscapes", term84547);
        setField(term84796, term84796.getClass(), "_rootValueSeparator", null);
        setField(term84796, term84796.getClass(), "_ioContext", null);
        setIntField(term84796, term84796.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term84796, term84796.getClass(), "_cfgUnqNames", false);
        setField(term84796, term84796.getClass(), "_outputStream", null);
        setBooleanField(term84796, term84796.getClass(), "_bufferRecyclable", false);
        term84880 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term84978 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term84880, term84880.getClass(), "_writeEncodingBuffer", null);
        setField(term84880, term84880.getClass(), "_bufferRecycler", term84978);
        term84282 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term84880;
        args[1] = -1;
        args[2] = term84282;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


