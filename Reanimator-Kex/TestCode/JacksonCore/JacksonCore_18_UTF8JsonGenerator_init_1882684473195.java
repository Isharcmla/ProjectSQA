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

public class UTF8JsonGenerator_init_1882684473195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59967;
     Object term60118;

    public UTF8JsonGenerator_init_1882684473195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59489 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term59234 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term59591 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term59245 = (int[]) newIntArray(0);
        Object term59689 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term59967 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term60016 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object term59925 = newInstance(Class.forName("java.io.FileOutputStream"));
        setIntField(term59489, term59489.getClass(), "_features", 0);
        setField(term59489, term59489.getClass(), "_objectCodec", term59234);
        setField(term59489, term59489.getClass(), "_writeContext", term59591);
        setBooleanField(term59489, term59489.getClass(), "_cfgNumbersAsStrings", false);
        setField(term59489, term59489.getClass(), "_outputEscapes", term59245);
        setField(term59489, term59489.getClass(), "_rootValueSeparator", term59689);
        setField(term59967, term59967.getClass(), "_writeEncodingBuffer", null);
        setField(term59967, term59967.getClass(), "_bufferRecycler", term60016);
        setField(term59489, term59489.getClass(), "_ioContext", term59967);
        setIntField(term59489, term59489.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term59489, term59489.getClass(), "_cfgUnqNames", false);
        setField(term59489, term59489.getClass(), "_outputStream", term59925);
        setBooleanField(term59489, term59489.getClass(), "_bufferRecyclable", false);
        term60118 = newInstance(Class.forName("java.io.ObjectOutputStream$BlockDataOutputStream"));
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
        args[0] = term59967;
        args[1] = -1;
        args[2] = null;
        args[3] = term60118;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


