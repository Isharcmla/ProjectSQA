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

public class UTF8JsonGenerator_init_25805811187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54528;
     Object term53762;

    public UTF8JsonGenerator_init_25805811187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term54262 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term54360 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term54444 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term54262, term54262.getClass(), "_features", 0);
        setField(term54262, term54262.getClass(), "_objectCodec", null);
        setField(term54262, term54262.getClass(), "_writeContext", null);
        setBooleanField(term54262, term54262.getClass(), "_cfgNumbersAsStrings", false);
        setField(term54262, term54262.getClass(), "_outputEscapes", null);
        setField(term54262, term54262.getClass(), "_rootValueSeparator", term54360);
        setField(term54262, term54262.getClass(), "_ioContext", term54444);
        setIntField(term54262, term54262.getClass(), "_maximumNonEscapedChar", 0);
        term54528 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term53762 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term54528;
        args[1] = -1;
        args[2] = term53762;
        args[3] = null;
        args[4] = null;
        args[5] = 0;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


