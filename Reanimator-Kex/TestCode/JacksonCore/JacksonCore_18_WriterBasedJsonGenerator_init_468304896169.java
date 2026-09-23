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

public class WriterBasedJsonGenerator_init_468304896169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147658;
     Object term147800;

    public WriterBasedJsonGenerator_init_468304896169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term147426 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term147161 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term147528 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term147574 = newInstance(Class.forName("java.io.StringWriter"));
        setIntField(term147426, term147426.getClass(), "_features", 0);
        setField(term147426, term147426.getClass(), "_objectCodec", term147161);
        setField(term147426, term147426.getClass(), "_writeContext", term147528);
        setBooleanField(term147426, term147426.getClass(), "_cfgNumbersAsStrings", false);
        setField(term147426, term147426.getClass(), "_outputEscapes", null);
        setField(term147426, term147426.getClass(), "_rootValueSeparator", null);
        setField(term147426, term147426.getClass(), "_ioContext", null);
        setIntField(term147426, term147426.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term147426, term147426.getClass(), "_cfgUnqNames", false);
        setField(term147426, term147426.getClass(), "_writer", term147574);
        term147658 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term147756 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term147658, term147658.getClass(), "_concatCBuffer", null);
        setField(term147658, term147658.getClass(), "_bufferRecycler", term147756);
        term147800 = newInstance(Class.forName("java.io.PipedWriter"));
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
        args[0] = term147658;
        args[1] = -1;
        args[2] = null;
        args[3] = term147800;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


