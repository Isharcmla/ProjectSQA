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

public class TypeValidator_registerIfMismatch_1555764058188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59513;
     Object term59617;
     Object term59721;
     Object term59755;
     Object term59756;
     Object term59757;

    public TypeValidator_registerIfMismatch_1555764058188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59513 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term59617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        term59721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term59721, term59721.getClass(), "unknown", false);
        term59755 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term59755, term59755.getClass(), "compiler", null);
        setField(term59755, term59755.getClass(), "typeRegistry", null);
        setField(term59755, term59755.getClass(), "allValueTypes", null);
        setBooleanField(term59755, term59755.getClass(), "shouldReport", false);
        setField(term59755, term59755.getClass(), "nullOrUndefined", null);
        setField(term59755, term59755.getClass(), "mismatches", null);
        term59756 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term59756, term59756.getClass(), "call", null);
        setField(term59756, term59756.getClass(), "prototype", null);
        setField(term59756, term59756.getClass(), "kind", null);
        setField(term59756, term59756.getClass(), "typeOfThis", null);
        setField(term59756, term59756.getClass(), "source", null);
        setField(term59756, term59756.getClass(), "implementedInterfaces", null);
        setField(term59756, term59756.getClass(), "subTypes", null);
        setField(term59756, term59756.getClass(), "templateTypeName", null);
        setField(term59756, term59756.getClass(), "className", null);
        setField(term59756, term59756.getClass(), "properties", null);
        setBooleanField(term59756, term59756.getClass(), "nativeType", false);
        setField(term59756, term59756.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term59756, term59756.getClass(), "prettyPrint", false);
        setBooleanField(term59756, term59756.getClass(), "visited", false);
        setField(term59756, term59756.getClass(), "docInfo", null);
        setBooleanField(term59756, term59756.getClass(), "unknown", false);
        setBooleanField(term59756, term59756.getClass(), "resolved", false);
        setField(term59756, term59756.getClass(), "resolveResult", null);
        setField(term59756, term59756.getClass(), "registry", null);
        term59757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term59757, term59757.getClass(), "call", null);
        setField(term59757, term59757.getClass(), "prototype", null);
        setField(term59757, term59757.getClass(), "kind", null);
        setField(term59757, term59757.getClass(), "typeOfThis", null);
        setField(term59757, term59757.getClass(), "source", null);
        setField(term59757, term59757.getClass(), "implementedInterfaces", null);
        setField(term59757, term59757.getClass(), "subTypes", null);
        setField(term59757, term59757.getClass(), "templateTypeName", null);
        setField(term59757, term59757.getClass(), "className", null);
        setField(term59757, term59757.getClass(), "properties", null);
        setBooleanField(term59757, term59757.getClass(), "nativeType", false);
        setField(term59757, term59757.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term59757, term59757.getClass(), "prettyPrint", false);
        setBooleanField(term59757, term59757.getClass(), "visited", false);
        setField(term59757, term59757.getClass(), "docInfo", null);
        setBooleanField(term59757, term59757.getClass(), "unknown", false);
        setBooleanField(term59757, term59757.getClass(), "resolved", false);
        setField(term59757, term59757.getClass(), "resolveResult", null);
        setField(term59757, term59757.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term59617;
        args[1] = term59721;
        callMethod(klass, "registerIfMismatch", argTypes, term59513, args);
        assertTrue(recursiveEquals(term59513, term59755));
        assertTrue(recursiveEquals(term59617, term59756));
        assertTrue(recursiveEquals(term59721, term59757));
    }

};


