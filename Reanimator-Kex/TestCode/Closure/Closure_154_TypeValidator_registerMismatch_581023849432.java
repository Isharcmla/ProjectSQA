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
import java.lang.Object;

public class TypeValidator_registerMismatch_581023849432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206477;
     Object term206728;
     Object term206841;
     Object term206842;
     Object term206844;

    public TypeValidator_registerMismatch_581023849432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206477 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term206728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term206780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term206728, term206728.getClass(), "referencedType", term206780);
        term206841 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term206841, term206841.getClass(), "compiler", null);
        setField(term206841, term206841.getClass(), "typeRegistry", null);
        setField(term206841, term206841.getClass(), "allValueTypes", null);
        setBooleanField(term206841, term206841.getClass(), "shouldReport", false);
        setField(term206841, term206841.getClass(), "nullOrUndefined", null);
        setField(term206841, term206841.getClass(), "mismatches", null);
        term206842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term206843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term206842, term206842.getClass(), "indexType", null);
        setField(term206843, term206843.getClass(), "call", null);
        setField(term206843, term206843.getClass(), "prototype", null);
        setField(term206843, term206843.getClass(), "kind", null);
        setField(term206843, term206843.getClass(), "typeOfThis", null);
        setField(term206843, term206843.getClass(), "source", null);
        setField(term206843, term206843.getClass(), "implementedInterfaces", null);
        setField(term206843, term206843.getClass(), "subTypes", null);
        setField(term206843, term206843.getClass(), "templateTypeName", null);
        setField(term206843, term206843.getClass(), "className", null);
        setField(term206843, term206843.getClass(), "properties", null);
        setBooleanField(term206843, term206843.getClass(), "nativeType", false);
        setField(term206843, term206843.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term206843, term206843.getClass(), "prettyPrint", false);
        setBooleanField(term206843, term206843.getClass(), "visited", false);
        setField(term206843, term206843.getClass(), "docInfo", null);
        setBooleanField(term206843, term206843.getClass(), "unknown", false);
        setBooleanField(term206843, term206843.getClass(), "resolved", false);
        setField(term206843, term206843.getClass(), "resolveResult", null);
        setField(term206843, term206843.getClass(), "registry", null);
        setField(term206842, term206842.getClass(), "referencedType", term206843);
        setField(term206842, term206842.getClass(), "referencedObjType", null);
        setBooleanField(term206842, term206842.getClass(), "visited", false);
        setField(term206842, term206842.getClass(), "docInfo", null);
        setBooleanField(term206842, term206842.getClass(), "unknown", false);
        setBooleanField(term206842, term206842.getClass(), "resolved", false);
        setField(term206842, term206842.getClass(), "resolveResult", null);
        setField(term206842, term206842.getClass(), "registry", null);
        term206844 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term206845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term206844, term206844.getClass(), "indexType", null);
        setField(term206845, term206845.getClass(), "call", null);
        setField(term206845, term206845.getClass(), "prototype", null);
        setField(term206845, term206845.getClass(), "kind", null);
        setField(term206845, term206845.getClass(), "typeOfThis", null);
        setField(term206845, term206845.getClass(), "source", null);
        setField(term206845, term206845.getClass(), "implementedInterfaces", null);
        setField(term206845, term206845.getClass(), "subTypes", null);
        setField(term206845, term206845.getClass(), "templateTypeName", null);
        setField(term206845, term206845.getClass(), "className", null);
        setField(term206845, term206845.getClass(), "properties", null);
        setBooleanField(term206845, term206845.getClass(), "nativeType", false);
        setField(term206845, term206845.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term206845, term206845.getClass(), "prettyPrint", false);
        setBooleanField(term206845, term206845.getClass(), "visited", false);
        setField(term206845, term206845.getClass(), "docInfo", null);
        setBooleanField(term206845, term206845.getClass(), "unknown", false);
        setBooleanField(term206845, term206845.getClass(), "resolved", false);
        setField(term206845, term206845.getClass(), "resolveResult", null);
        setField(term206845, term206845.getClass(), "registry", null);
        setField(term206844, term206844.getClass(), "referencedType", term206845);
        setField(term206844, term206844.getClass(), "referencedObjType", null);
        setBooleanField(term206844, term206844.getClass(), "visited", false);
        setField(term206844, term206844.getClass(), "docInfo", null);
        setBooleanField(term206844, term206844.getClass(), "unknown", false);
        setBooleanField(term206844, term206844.getClass(), "resolved", false);
        setField(term206844, term206844.getClass(), "resolveResult", null);
        setField(term206844, term206844.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term206728;
        args[1] = term206728;
        callMethod(klass, "registerMismatch", argTypes, term206477, args);
        assertTrue(recursiveEquals(term206477, term206841));
        assertTrue(recursiveEquals(term206728, term206842));
        assertTrue(recursiveEquals(term206728, term206844));
    }

};


