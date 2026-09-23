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

public class TypeValidator_expectNotNullOrUndefined_1445320069108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26554;
     Object term26648;
     Object term26662;
     Object term26663;

    public TypeValidator_expectNotNullOrUndefined_1445320069108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26554 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term26648 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term26662 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term26662, term26662.getClass(), "compiler", null);
        setField(term26662, term26662.getClass(), "typeRegistry", null);
        setField(term26662, term26662.getClass(), "allValueTypes", null);
        setBooleanField(term26662, term26662.getClass(), "shouldReport", false);
        setField(term26662, term26662.getClass(), "nullOrUndefined", null);
        setField(term26662, term26662.getClass(), "mismatches", null);
        term26663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term26663, term26663.getClass(), "parameters", null);
        setField(term26663, term26663.getClass(), "returnType", null);
        setBooleanField(term26663, term26663.getClass(), "returnTypeInferred", false);
        setBooleanField(term26663, term26663.getClass(), "resolved", false);
        setField(term26663, term26663.getClass(), "resolveResult", null);
        setField(term26663, term26663.getClass(), "templateKeys", null);
        setField(term26663, term26663.getClass(), "templatizedTypes", null);
        setBooleanField(term26663, term26663.getClass(), "inTemplatedCheckVisit", false);
        setField(term26663, term26663.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term26648;
        args[3] = null;
        args[4] = null;
        Object retValue = callMethod(klass, "expectNotNullOrUndefined", argTypes, term26554, args);
        assertTrue(recursiveEquals(term26554, term26662));
        assertTrue(recursiveEquals(term26648, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


