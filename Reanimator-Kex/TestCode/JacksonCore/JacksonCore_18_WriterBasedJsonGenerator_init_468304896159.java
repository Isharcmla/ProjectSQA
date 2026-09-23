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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class WriterBasedJsonGenerator_init_468304896159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41052;

    public WriterBasedJsonGenerator_init_468304896159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40968 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        setIntField(term40968, term40968.getClass(), "_features", 0);
        setField(term40968, term40968.getClass(), "_objectCodec", null);
        setField(term40968, term40968.getClass(), "_writeContext", null);
        setBooleanField(term40968, term40968.getClass(), "_cfgNumbersAsStrings", false);
        setField(term40968, term40968.getClass(), "_outputEscapes", null);
        setField(term40968, term40968.getClass(), "_rootValueSeparator", null);
        setField(term40968, term40968.getClass(), "_ioContext", null);
        setIntField(term40968, term40968.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term40968, term40968.getClass(), "_cfgUnqNames", false);
        setField(term40968, term40968.getClass(), "_writer", null);
        term41052 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term41150 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term40707 = (Object[]) newArray("[C", 0);
        setField(term41052, term41052.getClass(), "_concatCBuffer", null);
        setField(term41150, term41150.getClass(), "_charBuffers", term40707);
        setField(term41052, term41052.getClass(), "_bufferRecycler", term41150);
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
        args[0] = term41052;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


