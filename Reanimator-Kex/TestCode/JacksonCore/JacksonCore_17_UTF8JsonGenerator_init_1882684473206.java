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

public class UTF8JsonGenerator_init_1882684473206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81629;
     Object term81020;

    public UTF8JsonGenerator_init_1882684473206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81545 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        setIntField(term81545, term81545.getClass(), "_features", 0);
        setField(term81545, term81545.getClass(), "_objectCodec", null);
        setField(term81545, term81545.getClass(), "_writeContext", null);
        setBooleanField(term81545, term81545.getClass(), "_cfgNumbersAsStrings", false);
        setField(term81545, term81545.getClass(), "_outputEscapes", null);
        setField(term81545, term81545.getClass(), "_rootValueSeparator", null);
        setField(term81545, term81545.getClass(), "_ioContext", null);
        setIntField(term81545, term81545.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term81545, term81545.getClass(), "_cfgUnqNames", false);
        setField(term81545, term81545.getClass(), "_outputStream", null);
        setBooleanField(term81545, term81545.getClass(), "_bufferRecyclable", false);
        term81629 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term81727 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term81297 = (Object[]) newArray("[B", 0);
        setField(term81629, term81629.getClass(), "_writeEncodingBuffer", null);
        setField(term81727, term81727.getClass(), "_byteBuffers", term81297);
        setField(term81629, term81629.getClass(), "_bufferRecycler", term81727);
        term81020 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term81629;
        args[1] = -1;
        args[2] = term81020;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


