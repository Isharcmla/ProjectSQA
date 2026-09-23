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

public class TypeValidator_expectCanAssignTo_395910950105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24233;
     Object term24321;
     Object term24761;
     Object term24762;

    public TypeValidator_expectCanAssignTo_395910950105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24233 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term24321 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term24761 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term24761, term24761.getClass(), "compiler", null);
        setField(term24761, term24761.getClass(), "typeRegistry", null);
        setField(term24761, term24761.getClass(), "allValueTypes", null);
        setBooleanField(term24761, term24761.getClass(), "shouldReport", false);
        setField(term24761, term24761.getClass(), "nullOrUndefined", null);
        setField(term24761, term24761.getClass(), "mismatches", null);
        term24762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term24762, term24762.getClass(), "call", null);
        setField(term24762, term24762.getClass(), "prototype", null);
        setField(term24762, term24762.getClass(), "kind", null);
        setField(term24762, term24762.getClass(), "typeOfThis", null);
        setField(term24762, term24762.getClass(), "source", null);
        setField(term24762, term24762.getClass(), "implementedInterfaces", null);
        setField(term24762, term24762.getClass(), "subTypes", null);
        setField(term24762, term24762.getClass(), "templateTypeName", null);
        setField(term24762, term24762.getClass(), "className", null);
        setField(term24762, term24762.getClass(), "properties", null);
        setBooleanField(term24762, term24762.getClass(), "nativeType", false);
        setField(term24762, term24762.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term24762, term24762.getClass(), "prettyPrint", false);
        setBooleanField(term24762, term24762.getClass(), "visited", false);
        setField(term24762, term24762.getClass(), "docInfo", null);
        setBooleanField(term24762, term24762.getClass(), "unknown", false);
        setBooleanField(term24762, term24762.getClass(), "resolved", false);
        setField(term24762, term24762.getClass(), "resolveResult", null);
        setField(term24762, term24762.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term24321;
        args[3] = null;
        args[4] = null;
        Object retValue = callMethod(klass, "expectCanAssignTo", argTypes, term24233, args);
        assertTrue(recursiveEquals(term24233, term24761));
        assertTrue(recursiveEquals(term24321, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


