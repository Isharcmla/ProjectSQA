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
import java.lang.String;
import java.lang.Object;

public class TypeBindings_createIfNeeded_236954312113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32647;
     Object term32350;
     Object term33098;
     Object term33149;
     Object term32823;

    public TypeBindings_createIfNeeded_236954312113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32647 = Class.forName((String) "java.util.stream.DoublePipeline$8");
        term32350 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        term33098 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JdkDeserializers");
        term33149 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        term32823 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term32824 = (Object[]) newArray("java.lang.String", 0);
        Object[] term32825 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term32823, term32823.getClass(), "_names", term32824);
        setField(term32823, term32823.getClass(), "_types", term32825);
        setField(term32823, term32823.getClass(), "_unboundVariables", null);
        setIntField(term32823, term32823.getClass(), "_hashCode", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term32647;
        args[1] = term32350;
        Object retValue = callMethod(klass, "createIfNeeded", argTypes, null, args);
        assertTrue(recursiveEquals(term32647, term33098));
        assertTrue(recursiveEquals(term32350, term33149));
        assertTrue(recursiveEquals(retValue, term32823));
    }

};


