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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class StdValueInstantiator_init_1394365189187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145442;

    public StdValueInstantiator_init_1394365189187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145338 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term145478 = Class.forName((String) "java.lang.Class");
        Class<? extends Object> term145656 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term145822 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer");
        term145442 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term145620 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term145786 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term145442, term145442.getClass(), "_class", term145478);
        setField(term145620, term145620.getClass(), "_canonicalName", null);
        setField(term145620, term145620.getClass(), "_class", term145656);
        setField(term145786, term145786.getClass(), "_canonicalName", null);
        setField(term145786, term145786.getClass(), "_class", term145822);
        setField(term145620, term145620.getClass(), "_referencedType", term145786);
        setField(term145442, term145442.getClass(), "_referencedType", term145620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term145442;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


