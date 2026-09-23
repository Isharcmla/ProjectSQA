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

public class TypeValidator_expectStringOrNumber_433192725135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31483;
     Object term31587;
     Object term32355;
     Object term32356;

    public TypeValidator_expectStringOrNumber_433192725135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31483 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term31587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term32355 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term32355, term32355.getClass(), "compiler", null);
        setField(term32355, term32355.getClass(), "typeRegistry", null);
        setField(term32355, term32355.getClass(), "allValueTypes", null);
        setBooleanField(term32355, term32355.getClass(), "shouldReport", false);
        setField(term32355, term32355.getClass(), "nullOrUndefined", null);
        setField(term32355, term32355.getClass(), "mismatches", null);
        term32356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term32356, term32356.getClass(), "call", null);
        setField(term32356, term32356.getClass(), "prototypeSlot", null);
        setField(term32356, term32356.getClass(), "kind", null);
        setField(term32356, term32356.getClass(), "propAccess", null);
        setField(term32356, term32356.getClass(), "typeOfThis", null);
        setField(term32356, term32356.getClass(), "source", null);
        setField(term32356, term32356.getClass(), "implementedInterfaces", null);
        setField(term32356, term32356.getClass(), "extendedInterfaces", null);
        setField(term32356, term32356.getClass(), "subTypes", null);
        setField(term32356, term32356.getClass(), "className", null);
        setField(term32356, term32356.getClass(), "properties", null);
        setBooleanField(term32356, term32356.getClass(), "nativeType", false);
        setField(term32356, term32356.getClass(), "implicitPrototypeFallback", null);
        setField(term32356, term32356.getClass(), "ownerFunction", null);
        setBooleanField(term32356, term32356.getClass(), "prettyPrint", false);
        setBooleanField(term32356, term32356.getClass(), "visited", false);
        setField(term32356, term32356.getClass(), "docInfo", null);
        setBooleanField(term32356, term32356.getClass(), "unknown", false);
        setBooleanField(term32356, term32356.getClass(), "resolved", false);
        setField(term32356, term32356.getClass(), "resolveResult", null);
        setField(term32356, term32356.getClass(), "templateKeys", null);
        setField(term32356, term32356.getClass(), "templatizedTypes", null);
        setBooleanField(term32356, term32356.getClass(), "inTemplatedCheckVisit", false);
        setField(term32356, term32356.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term31587;
        args[3] = null;
        callMethod(klass, "expectStringOrNumber", argTypes, term31483, args);
        assertTrue(recursiveEquals(term31483, term32355));
        assertTrue(recursiveEquals(term31587, null));
    }

};


