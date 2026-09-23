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

public class UTF8JsonGenerator_init_25805811176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49073;
     Object term48307;

    public UTF8JsonGenerator_init_25805811176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48807 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term48905 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term48989 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term48807, term48807.getClass(), "_features", 0);
        setField(term48807, term48807.getClass(), "_objectCodec", null);
        setField(term48807, term48807.getClass(), "_writeContext", null);
        setBooleanField(term48807, term48807.getClass(), "_cfgNumbersAsStrings", false);
        setField(term48807, term48807.getClass(), "_outputEscapes", null);
        setField(term48807, term48807.getClass(), "_rootValueSeparator", term48905);
        setField(term48807, term48807.getClass(), "_ioContext", term48989);
        setIntField(term48807, term48807.getClass(), "_maximumNonEscapedChar", 0);
        term49073 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term48307 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.OutputStream");
        argTypes[4] = Array.newInstance(byte.class, 0).getClass();
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term49073;
        args[1] = -1;
        args[2] = term48307;
        args[3] = null;
        args[4] = null;
        args[5] = 0;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


