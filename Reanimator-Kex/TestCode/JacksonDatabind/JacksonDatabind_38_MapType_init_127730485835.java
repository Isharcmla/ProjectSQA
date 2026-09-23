package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class MapType_init_127730485835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4492;
     Object term4754;
     Object term4755;

    public MapType_init_127730485835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4400 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term4492 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term4754 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term4754, term4754.getClass(), "_keyType", null);
        setField(term4754, term4754.getClass(), "_valueType", null);
        setField(term4754, term4754.getClass(), "_superClass", null);
        setField(term4754, term4754.getClass(), "_superInterfaces", null);
        setField(term4754, term4754.getClass(), "_bindings", null);
        setField(term4754, term4754.getClass(), "_canonicalName", null);
        setField(term4754, term4754.getClass(), "_class", null);
        setIntField(term4754, term4754.getClass(), "_hash", 0);
        setField(term4754, term4754.getClass(), "_valueHandler", null);
        setField(term4754, term4754.getClass(), "_typeHandler", null);
        setBooleanField(term4754, term4754.getClass(), "_asStatic", false);
        term4755 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term4755, term4755.getClass(), "_keyType", null);
        setField(term4755, term4755.getClass(), "_valueType", null);
        setField(term4755, term4755.getClass(), "_superClass", null);
        setField(term4755, term4755.getClass(), "_superInterfaces", null);
        setField(term4755, term4755.getClass(), "_bindings", null);
        setField(term4755, term4755.getClass(), "_canonicalName", null);
        setField(term4755, term4755.getClass(), "_class", null);
        setIntField(term4755, term4755.getClass(), "_hash", 0);
        setField(term4755, term4755.getClass(), "_valueHandler", null);
        setField(term4755, term4755.getClass(), "_typeHandler", null);
        setBooleanField(term4755, term4755.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term4492;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4754));
        assertTrue(recursiveEquals(term4492, term4755));
    }

};


