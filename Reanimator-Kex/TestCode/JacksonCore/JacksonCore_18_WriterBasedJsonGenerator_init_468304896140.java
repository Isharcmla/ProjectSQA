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

public class WriterBasedJsonGenerator_init_468304896140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public WriterBasedJsonGenerator_init_468304896140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22424 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term21683 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term22508 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term22424, term22424.getClass(), "_features", 0);
        setField(term22424, term22424.getClass(), "_objectCodec", term21683);
        setField(term22424, term22424.getClass(), "_writeContext", null);
        setBooleanField(term22424, term22424.getClass(), "_cfgNumbersAsStrings", false);
        setField(term22424, term22424.getClass(), "_outputEscapes", null);
        setField(term22424, term22424.getClass(), "_rootValueSeparator", null);
        setField(term22424, term22424.getClass(), "_ioContext", term22508);
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
        args[0] = null;
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


