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

public class WriterBasedJsonGenerator_init_468304896161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43349;

    public WriterBasedJsonGenerator_init_468304896161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43163 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term42267 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term43265 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term42407 = (int[]) newIntArray(0);
        setIntField(term43163, term43163.getClass(), "_features", 0);
        setField(term43163, term43163.getClass(), "_objectCodec", term42267);
        setField(term43163, term43163.getClass(), "_writeContext", term43265);
        setBooleanField(term43163, term43163.getClass(), "_cfgNumbersAsStrings", false);
        setField(term43163, term43163.getClass(), "_outputEscapes", term42407);
        setField(term43163, term43163.getClass(), "_rootValueSeparator", null);
        setField(term43163, term43163.getClass(), "_ioContext", null);
        setIntField(term43163, term43163.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term43163, term43163.getClass(), "_cfgUnqNames", false);
        setField(term43163, term43163.getClass(), "_writer", null);
        term43349 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term43447 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term43349, term43349.getClass(), "_concatCBuffer", null);
        setField(term43349, term43349.getClass(), "_bufferRecycler", term43447);
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
        args[0] = term43349;
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


