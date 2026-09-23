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

public class WriterBasedJsonGenerator_init_468304896157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37722;
     Object term37817;

    public WriterBasedJsonGenerator_init_468304896157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37256 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term36988 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term37358 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        int[] term36999 = (int[]) newIntArray(0);
        Object term37456 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term37722 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term37771 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object term37680 = newInstance(Class.forName("java.io.FileWriter"));
        setIntField(term37256, term37256.getClass(), "_features", 0);
        setField(term37256, term37256.getClass(), "_objectCodec", term36988);
        setField(term37256, term37256.getClass(), "_writeContext", term37358);
        setBooleanField(term37256, term37256.getClass(), "_cfgNumbersAsStrings", false);
        setField(term37256, term37256.getClass(), "_outputEscapes", term36999);
        setField(term37256, term37256.getClass(), "_rootValueSeparator", term37456);
        setField(term37722, term37722.getClass(), "_concatCBuffer", null);
        setField(term37722, term37722.getClass(), "_bufferRecycler", term37771);
        setField(term37256, term37256.getClass(), "_ioContext", term37722);
        setIntField(term37256, term37256.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term37256, term37256.getClass(), "_cfgUnqNames", false);
        setField(term37256, term37256.getClass(), "_writer", term37680);
        term37817 = newInstance(Class.forName("java.io.StringWriter"));
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
        args[0] = term37722;
        args[1] = -1;
        args[2] = null;
        args[3] = term37817;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


