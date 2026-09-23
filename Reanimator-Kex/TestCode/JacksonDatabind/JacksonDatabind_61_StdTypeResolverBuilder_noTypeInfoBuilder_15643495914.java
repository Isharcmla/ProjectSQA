package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_noTypeInfoBuilder_15643495914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public StdTypeResolverBuilder_noTypeInfoBuilder_15643495914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term130 = ((Class) term131).getDeclaredField((String) "NONE");
        ((Field) term130).setAccessible(true);
        Object enum0 = ((Field) term130).get((Object) null);
        term49 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term49, term49.getClass(), "_idType", enum0);
        setField(term49, term49.getClass(), "_includeAs", null);
        setField(term49, term49.getClass(), "_typeProperty", null);
        setBooleanField(term49, term49.getClass(), "_typeIdVisible", false);
        setField(term49, term49.getClass(), "_defaultImpl", null);
        setField(term49, term49.getClass(), "_customIdResolver", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "noTypeInfoBuilder", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term49));
    }

};


