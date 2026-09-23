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

public class UTF8JsonGenerator_init_1882684473218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92996;
     Object term92398;

    public UTF8JsonGenerator_init_1882684473218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92912 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term92653 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term92663 = (int[]) newIntArray(0);
        setIntField(term92912, term92912.getClass(), "_features", 0);
        setField(term92912, term92912.getClass(), "_objectCodec", term92653);
        setField(term92912, term92912.getClass(), "_writeContext", null);
        setBooleanField(term92912, term92912.getClass(), "_cfgNumbersAsStrings", false);
        setField(term92912, term92912.getClass(), "_outputEscapes", term92663);
        setField(term92912, term92912.getClass(), "_rootValueSeparator", null);
        setField(term92912, term92912.getClass(), "_ioContext", null);
        setIntField(term92912, term92912.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term92912, term92912.getClass(), "_cfgUnqNames", false);
        setField(term92912, term92912.getClass(), "_outputStream", null);
        setBooleanField(term92912, term92912.getClass(), "_bufferRecyclable", false);
        term92996 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term93094 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term92996, term92996.getClass(), "_writeEncodingBuffer", null);
        setField(term92996, term92996.getClass(), "_bufferRecycler", term93094);
        term92398 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term92996;
        args[1] = -1;
        args[2] = term92398;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


