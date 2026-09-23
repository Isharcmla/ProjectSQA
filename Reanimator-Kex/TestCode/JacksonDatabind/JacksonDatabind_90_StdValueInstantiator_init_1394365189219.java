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

public class StdValueInstantiator_init_1394365189219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201183;

    public StdValueInstantiator_init_1394365189219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term201079 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term201219 = Class.forName((String) "com.fasterxml.jackson.databind.type.MapType");
        Class<? extends Object> term201385 = Class.forName((String) "java.lang.String");
        Class<? extends Object> term202693 = Class.forName((String) "java.lang.ProcessHandle$Info");
        Class term202684 = Array.newInstance(term202693, 0).getClass();
        Class term202669 = Array.newInstance(term202684, 0).getClass();
        Class term201551 = Array.newInstance(term202669, 0).getClass();
        term201183 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term201349 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term201515 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term201687 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term201183, term201183.getClass(), "_class", term201219);
        setField(term201349, term201349.getClass(), "_canonicalName", null);
        setField(term201349, term201349.getClass(), "_class", term201385);
        setField(term201515, term201515.getClass(), "_canonicalName", null);
        setField(term201515, term201515.getClass(), "_class", term201551);
        setField(term201515, term201515.getClass(), "_keyType", term201687);
        setField(term201349, term201349.getClass(), "_keyType", term201515);
        setField(term201183, term201183.getClass(), "_referencedType", term201349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term201183;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


