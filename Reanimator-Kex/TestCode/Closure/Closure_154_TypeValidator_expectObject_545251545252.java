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

public class TypeValidator_expectObject_545251545252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81609;
     Object term81713;
     Object term81725;
     Object term81726;

    public TypeValidator_expectObject_545251545252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81609 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term81713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term81725 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term81725, term81725.getClass(), "compiler", null);
        setField(term81725, term81725.getClass(), "typeRegistry", null);
        setField(term81725, term81725.getClass(), "allValueTypes", null);
        setBooleanField(term81725, term81725.getClass(), "shouldReport", false);
        setField(term81725, term81725.getClass(), "nullOrUndefined", null);
        setField(term81725, term81725.getClass(), "mismatches", null);
        term81726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term81726, term81726.getClass(), "call", null);
        setField(term81726, term81726.getClass(), "prototype", null);
        setField(term81726, term81726.getClass(), "kind", null);
        setField(term81726, term81726.getClass(), "typeOfThis", null);
        setField(term81726, term81726.getClass(), "source", null);
        setField(term81726, term81726.getClass(), "implementedInterfaces", null);
        setField(term81726, term81726.getClass(), "subTypes", null);
        setField(term81726, term81726.getClass(), "templateTypeName", null);
        setField(term81726, term81726.getClass(), "className", null);
        setField(term81726, term81726.getClass(), "properties", null);
        setBooleanField(term81726, term81726.getClass(), "nativeType", false);
        setField(term81726, term81726.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term81726, term81726.getClass(), "prettyPrint", false);
        setBooleanField(term81726, term81726.getClass(), "visited", false);
        setField(term81726, term81726.getClass(), "docInfo", null);
        setBooleanField(term81726, term81726.getClass(), "unknown", false);
        setBooleanField(term81726, term81726.getClass(), "resolved", false);
        setField(term81726, term81726.getClass(), "resolveResult", null);
        setField(term81726, term81726.getClass(), "registry", null);
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
        args[2] = term81713;
        args[3] = null;
        Object retValue = callMethod(klass, "expectObject", argTypes, term81609, args);
        assertTrue(recursiveEquals(term81609, term81725));
        assertTrue(recursiveEquals(term81713, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


