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

public class StdValueInstantiator_init_1394365189297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343467;

    public StdValueInstantiator_init_1394365189297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term343363 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Class term343503 = char.class;
        Class<? extends Object> term343681 = Class.forName((String) "java.lang.Object");
        Class<? extends Object> term343847 = Class.forName((String) "java.lang.String");
        term343467 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term343645 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term343811 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term343991 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term343467, term343467.getClass(), "_class", term343503);
        setField(term343645, term343645.getClass(), "_canonicalName", null);
        setField(term343645, term343645.getClass(), "_class", term343681);
        setField(term343811, term343811.getClass(), "_canonicalName", null);
        setField(term343811, term343811.getClass(), "_class", term343847);
        setField(term343811, term343811.getClass(), "_keyType", term343991);
        setField(term343645, term343645.getClass(), "_referencedType", term343811);
        setField(term343467, term343467.getClass(), "_referencedType", term343645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term343467;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


