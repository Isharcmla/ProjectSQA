package com.fasterxml.jackson.databind.ser;

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
import static com.fasterxml.jackson.databind.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.EqualityUtils.*;

public class BeanPropertyWriter_init_141150188752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375;

    public BeanPropertyWriter_init_141150188752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term375, term375.getClass(), "_name", null);
        setField(term375, term375.getClass(), "_wrapperName", null);
        setField(term375, term375.getClass(), "_declaredType", null);
        setField(term375, term375.getClass(), "_cfgSerializationType", null);
        setField(term375, term375.getClass(), "_nonTrivialBaseType", null);
        setField(term375, term375.getClass(), "_contextAnnotations", null);
        setField(term375, term375.getClass(), "_metadata", null);
        setField(term375, term375.getClass(), "_format", null);
        setField(term375, term375.getClass(), "_member", null);
        setField(term375, term375.getClass(), "_accessorMethod", null);
        setField(term375, term375.getClass(), "_field", null);
        setField(term375, term375.getClass(), "_serializer", null);
        setField(term375, term375.getClass(), "_nullSerializer", null);
        setField(term375, term375.getClass(), "_typeSerializer", null);
        setField(term375, term375.getClass(), "_dynamicSerializers", null);
        setBooleanField(term375, term375.getClass(), "_suppressNulls", false);
        setField(term375, term375.getClass(), "_suppressableValue", null);
        setField(term375, term375.getClass(), "_includeInViews", null);
        setField(term375, term375.getClass(), "_internalSettings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term375));
    }

};


