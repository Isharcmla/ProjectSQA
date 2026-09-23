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

public class BeanPropertyWriter_init_1969363585105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12939;
     Object term13634;
     Object term13635;

    public BeanPropertyWriter_init_1969363585105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12939 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        term13634 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term13634, term13634.getClass(), "_name", null);
        setField(term13634, term13634.getClass(), "_wrapperName", null);
        setField(term13634, term13634.getClass(), "_declaredType", null);
        setField(term13634, term13634.getClass(), "_cfgSerializationType", null);
        setField(term13634, term13634.getClass(), "_nonTrivialBaseType", null);
        setField(term13634, term13634.getClass(), "_contextAnnotations", null);
        setField(term13634, term13634.getClass(), "_metadata", null);
        setField(term13634, term13634.getClass(), "_format", null);
        setField(term13634, term13634.getClass(), "_member", null);
        setField(term13634, term13634.getClass(), "_accessorMethod", null);
        setField(term13634, term13634.getClass(), "_field", null);
        setField(term13634, term13634.getClass(), "_serializer", null);
        setField(term13634, term13634.getClass(), "_nullSerializer", null);
        setField(term13634, term13634.getClass(), "_typeSerializer", null);
        setField(term13634, term13634.getClass(), "_dynamicSerializers", null);
        setBooleanField(term13634, term13634.getClass(), "_suppressNulls", false);
        setField(term13634, term13634.getClass(), "_suppressableValue", null);
        setField(term13634, term13634.getClass(), "_includeInViews", null);
        setField(term13634, term13634.getClass(), "_internalSettings", null);
        term13635 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term13635, term13635.getClass(), "_name", null);
        setField(term13635, term13635.getClass(), "_wrapperName", null);
        setField(term13635, term13635.getClass(), "_declaredType", null);
        setField(term13635, term13635.getClass(), "_cfgSerializationType", null);
        setField(term13635, term13635.getClass(), "_nonTrivialBaseType", null);
        setField(term13635, term13635.getClass(), "_contextAnnotations", null);
        setField(term13635, term13635.getClass(), "_metadata", null);
        setField(term13635, term13635.getClass(), "_format", null);
        setField(term13635, term13635.getClass(), "_member", null);
        setField(term13635, term13635.getClass(), "_accessorMethod", null);
        setField(term13635, term13635.getClass(), "_field", null);
        setField(term13635, term13635.getClass(), "_serializer", null);
        setField(term13635, term13635.getClass(), "_nullSerializer", null);
        setField(term13635, term13635.getClass(), "_typeSerializer", null);
        setField(term13635, term13635.getClass(), "_dynamicSerializers", null);
        setBooleanField(term13635, term13635.getClass(), "_suppressNulls", false);
        setField(term13635, term13635.getClass(), "_suppressableValue", null);
        setField(term13635, term13635.getClass(), "_includeInViews", null);
        setField(term13635, term13635.getClass(), "_internalSettings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Object[] args = new Object[1];
        args[0] = term12939;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13634));
        assertTrue(recursiveEquals(term12939, term13635));
    }

};


