package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240044;

    public StdValueInstantiator_init_1394365189241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term239940 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term240080 = Class.forName((String) "com.fasterxml.jackson.databind.type.ArrayType");
        Class<? extends Object> term240246 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term240412 = Class.forName((String) "kex.java.lang.AbstractStringBuilder");
        term240044 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term240210 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term240376 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term240546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term240044, term240044.getClass(), "_class", term240080);
        setField(term240210, term240210.getClass(), "_canonicalName", null);
        setField(term240210, term240210.getClass(), "_class", term240246);
        setField(term240376, term240376.getClass(), "_canonicalName", null);
        setField(term240376, term240376.getClass(), "_class", term240412);
        setField(term240376, term240376.getClass(), "_keyType", term240546);
        setField(term240210, term240210.getClass(), "_keyType", term240376);
        setField(term240044, term240044.getClass(), "_referencedType", term240210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term240044;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


