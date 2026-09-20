package com.google.gson;

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
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.EqualityUtils.*;
import java.lang.Object;

public class TypeInfoFactory_extractRealTypes_123012340736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7113;
     Object term7733;
     Object term7732;

    public TypeInfoFactory_extractRealTypes_123012340736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7113 = (Object[]) newArray("java.lang.reflect.Type", 0);
        term7733 = (Object[]) newArray("java.lang.reflect.Type", 0);
        term7732 = (Object[]) newArray("java.lang.reflect.Type", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.reflect.Type"), 0).getClass();
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term7113;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "extractRealTypes", argTypes, null, args);
        assertTrue(recursiveEquals(term7113, term7733));
        assertTrue(recursiveEquals(retValue, term7732));
    }

};
