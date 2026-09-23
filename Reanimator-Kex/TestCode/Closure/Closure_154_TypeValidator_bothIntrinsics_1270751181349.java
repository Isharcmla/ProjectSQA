package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class TypeValidator_bothIntrinsics_1270751181349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130841;
     Object term130953;
     Object term131170;
     Object term131171;

    public TypeValidator_bothIntrinsics_1270751181349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130841 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term130953 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        term131170 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term131170, term131170.getClass(), "compiler", null);
        setField(term131170, term131170.getClass(), "typeRegistry", null);
        setField(term131170, term131170.getClass(), "allValueTypes", null);
        setBooleanField(term131170, term131170.getClass(), "shouldReport", false);
        setField(term131170, term131170.getClass(), "nullOrUndefined", null);
        setField(term131170, term131170.getClass(), "mismatches", null);
        term131171 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term131171, term131171.getClass(), "constructor", null);
        setField(term131171, term131171.getClass(), "className", null);
        setField(term131171, term131171.getClass(), "properties", null);
        setBooleanField(term131171, term131171.getClass(), "nativeType", false);
        setField(term131171, term131171.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term131171, term131171.getClass(), "prettyPrint", false);
        setBooleanField(term131171, term131171.getClass(), "visited", false);
        setField(term131171, term131171.getClass(), "docInfo", null);
        setBooleanField(term131171, term131171.getClass(), "unknown", false);
        setBooleanField(term131171, term131171.getClass(), "resolved", false);
        setField(term131171, term131171.getClass(), "resolveResult", null);
        setField(term131171, term131171.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term130953;
        Object retValue = callMethod(klass, "bothIntrinsics", argTypes, term130841, args);
        assertTrue(recursiveEquals(term130841, term131170));
        assertTrue(recursiveEquals(term130953, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


