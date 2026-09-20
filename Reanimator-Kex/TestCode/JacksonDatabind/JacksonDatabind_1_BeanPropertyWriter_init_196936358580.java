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

public class BeanPropertyWriter_init_196936358580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10297;
     Object term10579;
     Object term10580;

    public BeanPropertyWriter_init_196936358580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10297 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        term10579 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term10579, term10579.getClass(), "_member", null);
        setField(term10579, term10579.getClass(), "_contextAnnotations", null);
        setField(term10579, term10579.getClass(), "_declaredType", null);
        setField(term10579, term10579.getClass(), "_accessorMethod", null);
        setField(term10579, term10579.getClass(), "_field", null);
        setField(term10579, term10579.getClass(), "_internalSettings", null);
        setField(term10579, term10579.getClass(), "_name", null);
        setField(term10579, term10579.getClass(), "_wrapperName", null);
        setField(term10579, term10579.getClass(), "_cfgSerializationType", null);
        setField(term10579, term10579.getClass(), "_serializer", null);
        setField(term10579, term10579.getClass(), "_nullSerializer", null);
        setField(term10579, term10579.getClass(), "_dynamicSerializers", null);
        setBooleanField(term10579, term10579.getClass(), "_suppressNulls", false);
        setField(term10579, term10579.getClass(), "_suppressableValue", null);
        setField(term10579, term10579.getClass(), "_includeInViews", null);
        setField(term10579, term10579.getClass(), "_typeSerializer", null);
        setField(term10579, term10579.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term10579, term10579.getClass(), "_isRequired", false);
        term10580 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setField(term10580, term10580.getClass(), "_member", null);
        setField(term10580, term10580.getClass(), "_contextAnnotations", null);
        setField(term10580, term10580.getClass(), "_declaredType", null);
        setField(term10580, term10580.getClass(), "_accessorMethod", null);
        setField(term10580, term10580.getClass(), "_field", null);
        setField(term10580, term10580.getClass(), "_internalSettings", null);
        setField(term10580, term10580.getClass(), "_name", null);
        setField(term10580, term10580.getClass(), "_wrapperName", null);
        setField(term10580, term10580.getClass(), "_cfgSerializationType", null);
        setField(term10580, term10580.getClass(), "_serializer", null);
        setField(term10580, term10580.getClass(), "_nullSerializer", null);
        setField(term10580, term10580.getClass(), "_dynamicSerializers", null);
        setBooleanField(term10580, term10580.getClass(), "_suppressNulls", false);
        setField(term10580, term10580.getClass(), "_suppressableValue", null);
        setField(term10580, term10580.getClass(), "_includeInViews", null);
        setField(term10580, term10580.getClass(), "_typeSerializer", null);
        setField(term10580, term10580.getClass(), "_nonTrivialBaseType", null);
        setBooleanField(term10580, term10580.getClass(), "_isRequired", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter");
        Object[] args = new Object[1];
        args[0] = term10297;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10579));
        assertTrue(recursiveEquals(term10297, term10580));
    }

};
