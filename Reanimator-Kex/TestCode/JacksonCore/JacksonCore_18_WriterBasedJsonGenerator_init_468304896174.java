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

public class WriterBasedJsonGenerator_init_468304896174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211775;
     Object term211164;

    public WriterBasedJsonGenerator_init_468304896174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term211691 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term211419 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        int[] term211429 = (int[]) newIntArray(0);
        setIntField(term211691, term211691.getClass(), "_features", 0);
        setField(term211691, term211691.getClass(), "_objectCodec", term211419);
        setField(term211691, term211691.getClass(), "_writeContext", null);
        setBooleanField(term211691, term211691.getClass(), "_cfgNumbersAsStrings", false);
        setField(term211691, term211691.getClass(), "_outputEscapes", term211429);
        setField(term211691, term211691.getClass(), "_rootValueSeparator", null);
        setField(term211691, term211691.getClass(), "_ioContext", null);
        setIntField(term211691, term211691.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term211691, term211691.getClass(), "_cfgUnqNames", false);
        setField(term211691, term211691.getClass(), "_writer", null);
        term211775 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term211873 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term211775, term211775.getClass(), "_concatCBuffer", null);
        setField(term211775, term211775.getClass(), "_bufferRecycler", term211873);
        term211164 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.Writer");
        Object[] args = new Object[4];
        args[0] = term211775;
        args[1] = -1;
        args[2] = term211164;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


