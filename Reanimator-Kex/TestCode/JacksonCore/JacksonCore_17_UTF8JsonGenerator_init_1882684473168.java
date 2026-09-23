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

public class UTF8JsonGenerator_init_1882684473168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39364;
     Object term38600;

    public UTF8JsonGenerator_init_1882684473168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39098 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term39196 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        Object term39280 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term39098, term39098.getClass(), "_features", 0);
        setField(term39098, term39098.getClass(), "_objectCodec", null);
        setField(term39098, term39098.getClass(), "_writeContext", null);
        setBooleanField(term39098, term39098.getClass(), "_cfgNumbersAsStrings", false);
        setField(term39098, term39098.getClass(), "_outputEscapes", null);
        setField(term39098, term39098.getClass(), "_rootValueSeparator", term39196);
        setField(term39098, term39098.getClass(), "_ioContext", term39280);
        setIntField(term39098, term39098.getClass(), "_maximumNonEscapedChar", 0);
        term39364 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term38600 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
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
        args[0] = term39364;
        args[1] = -1;
        args[2] = term38600;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


