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

public class StdValueInstantiator_init_1394365189307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362072;

    public StdValueInstantiator_init_1394365189307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term361968 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class<? extends Object> term362108 = Class.forName((String) "java.lang.Class");
        Class term362286 = int.class;
        Class<? extends Object> term362464 = Class.forName((String) "com.fasterxml.jackson.databind.type.SimpleType");
        term362072 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term362250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term362428 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term362604 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term362072, term362072.getClass(), "_class", term362108);
        setField(term362250, term362250.getClass(), "_canonicalName", null);
        setField(term362250, term362250.getClass(), "_class", term362286);
        setField(term362428, term362428.getClass(), "_canonicalName", null);
        setField(term362428, term362428.getClass(), "_class", term362464);
        setField(term362428, term362428.getClass(), "_bindings", term362604);
        setField(term362250, term362250.getClass(), "_referencedType", term362428);
        setField(term362072, term362072.getClass(), "_referencedType", term362250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term362072;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


