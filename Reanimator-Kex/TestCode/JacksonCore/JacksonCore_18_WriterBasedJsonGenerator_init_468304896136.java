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

public class WriterBasedJsonGenerator_init_468304896136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20336;

    public WriterBasedJsonGenerator_init_468304896136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21324 = newInstance(Class.forName("com.fasterxml.jackson.core.json.WriterBasedJsonGenerator"));
        Object term21426 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setIntField(term21324, term21324.getClass(), "_features", 0);
        setField(term21324, term21324.getClass(), "_objectCodec", null);
        setField(term21324, term21324.getClass(), "_writeContext", term21426);
        setBooleanField(term21324, term21324.getClass(), "_cfgNumbersAsStrings", false);
        setField(term21324, term21324.getClass(), "_outputEscapes", null);
        setField(term21324, term21324.getClass(), "_rootValueSeparator", null);
        setField(term21324, term21324.getClass(), "_ioContext", null);
        term20336 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[2] = term20336;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


