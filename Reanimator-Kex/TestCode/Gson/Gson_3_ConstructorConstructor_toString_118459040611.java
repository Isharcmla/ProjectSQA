package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.util.HashMap;

public class ConstructorConstructor_toString_118459040611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;
     Object term1653;

    public ConstructorConstructor_toString_118459040611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term36 = new HashMap();
        term35 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term35, term35.getClass(), "instanceCreators", term36);
        HashMap term1654 = new HashMap();
        term1653 = newInstance(Class.forName("com.google.gson.internal.ConstructorConstructor"));
        setField(term1653, term1653.getClass(), "instanceCreators", term1654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.ConstructorConstructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term35, args);
        assertTrue(recursiveEquals(term35, term1653));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};


