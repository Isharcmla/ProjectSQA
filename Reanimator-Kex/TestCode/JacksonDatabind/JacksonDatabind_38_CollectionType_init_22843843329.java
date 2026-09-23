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

public class CollectionType_init_22843843329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3901;
     Object term4273;
     Object term4274;

    public CollectionType_init_22843843329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3795 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term3901 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term4273 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term4273, term4273.getClass(), "_elementType", null);
        setField(term4273, term4273.getClass(), "_superClass", null);
        setField(term4273, term4273.getClass(), "_superInterfaces", null);
        setField(term4273, term4273.getClass(), "_bindings", null);
        setField(term4273, term4273.getClass(), "_canonicalName", null);
        setField(term4273, term4273.getClass(), "_class", null);
        setIntField(term4273, term4273.getClass(), "_hash", 0);
        setField(term4273, term4273.getClass(), "_valueHandler", null);
        setField(term4273, term4273.getClass(), "_typeHandler", null);
        setBooleanField(term4273, term4273.getClass(), "_asStatic", false);
        term4274 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term4274, term4274.getClass(), "_elementType", null);
        setField(term4274, term4274.getClass(), "_superClass", null);
        setField(term4274, term4274.getClass(), "_superInterfaces", null);
        setField(term4274, term4274.getClass(), "_bindings", null);
        setField(term4274, term4274.getClass(), "_canonicalName", null);
        setField(term4274, term4274.getClass(), "_class", null);
        setIntField(term4274, term4274.getClass(), "_hash", 0);
        setField(term4274, term4274.getClass(), "_valueHandler", null);
        setField(term4274, term4274.getClass(), "_typeHandler", null);
        setBooleanField(term4274, term4274.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = term3901;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4273));
        assertTrue(recursiveEquals(term3901, term4274));
    }

};


