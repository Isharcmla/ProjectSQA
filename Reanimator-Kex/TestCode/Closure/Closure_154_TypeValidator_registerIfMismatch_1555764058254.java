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

public class TypeValidator_registerIfMismatch_1555764058254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81834;
     Object term81990;
     Object term82014;
     Object term82015;
     Object term82016;

    public TypeValidator_registerIfMismatch_1555764058254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81834 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term81990 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term81990, term81990.getClass(), "unknown", true);
        term82014 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term82014, term82014.getClass(), "compiler", null);
        setField(term82014, term82014.getClass(), "typeRegistry", null);
        setField(term82014, term82014.getClass(), "allValueTypes", null);
        setBooleanField(term82014, term82014.getClass(), "shouldReport", false);
        setField(term82014, term82014.getClass(), "nullOrUndefined", null);
        setField(term82014, term82014.getClass(), "mismatches", null);
        term82015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term82015, term82015.getClass(), "call", null);
        setField(term82015, term82015.getClass(), "prototype", null);
        setField(term82015, term82015.getClass(), "kind", null);
        setField(term82015, term82015.getClass(), "typeOfThis", null);
        setField(term82015, term82015.getClass(), "source", null);
        setField(term82015, term82015.getClass(), "implementedInterfaces", null);
        setField(term82015, term82015.getClass(), "subTypes", null);
        setField(term82015, term82015.getClass(), "templateTypeName", null);
        setField(term82015, term82015.getClass(), "className", null);
        setField(term82015, term82015.getClass(), "properties", null);
        setBooleanField(term82015, term82015.getClass(), "nativeType", false);
        setField(term82015, term82015.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82015, term82015.getClass(), "prettyPrint", false);
        setBooleanField(term82015, term82015.getClass(), "visited", false);
        setField(term82015, term82015.getClass(), "docInfo", null);
        setBooleanField(term82015, term82015.getClass(), "unknown", false);
        setBooleanField(term82015, term82015.getClass(), "resolved", false);
        setField(term82015, term82015.getClass(), "resolveResult", null);
        setField(term82015, term82015.getClass(), "registry", null);
        term82016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term82016, term82016.getClass(), "call", null);
        setField(term82016, term82016.getClass(), "prototype", null);
        setField(term82016, term82016.getClass(), "kind", null);
        setField(term82016, term82016.getClass(), "typeOfThis", null);
        setField(term82016, term82016.getClass(), "source", null);
        setField(term82016, term82016.getClass(), "implementedInterfaces", null);
        setField(term82016, term82016.getClass(), "subTypes", null);
        setField(term82016, term82016.getClass(), "templateTypeName", null);
        setField(term82016, term82016.getClass(), "className", null);
        setField(term82016, term82016.getClass(), "properties", null);
        setBooleanField(term82016, term82016.getClass(), "nativeType", false);
        setField(term82016, term82016.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term82016, term82016.getClass(), "prettyPrint", false);
        setBooleanField(term82016, term82016.getClass(), "visited", false);
        setField(term82016, term82016.getClass(), "docInfo", null);
        setBooleanField(term82016, term82016.getClass(), "unknown", false);
        setBooleanField(term82016, term82016.getClass(), "resolved", false);
        setField(term82016, term82016.getClass(), "resolveResult", null);
        setField(term82016, term82016.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term81990;
        args[1] = term81990;
        callMethod(klass, "registerIfMismatch", argTypes, term81834, args);
        assertTrue(recursiveEquals(term81834, term82014));
        assertTrue(recursiveEquals(term81990, term82015));
        assertTrue(recursiveEquals(term81990, term82016));
    }

};


