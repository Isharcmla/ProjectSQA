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

public class UTF8JsonGenerator_init_25805811163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public UTF8JsonGenerator_init_25805811163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33211 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term33313 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        Object term33397 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term33211, term33211.getClass(), "_features", 0);
        setField(term33211, term33211.getClass(), "_objectCodec", null);
        setIntField(term33313, term33313.getClass(), "_type", 0);
        setField(term33313, term33313.getClass(), "_parent", null);
        setField(term33313, term33313.getClass(), "_dups", null);
        setIntField(term33313, term33313.getClass(), "_index", 0);
        setField(term33211, term33211.getClass(), "_writeContext", term33313);
        setBooleanField(term33211, term33211.getClass(), "_cfgNumbersAsStrings", false);
        setField(term33211, term33211.getClass(), "_outputEscapes", null);
        setField(term33211, term33211.getClass(), "_rootValueSeparator", null);
        setField(term33211, term33211.getClass(), "_ioContext", term33397);
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
        args[0] = null;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = 0;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


