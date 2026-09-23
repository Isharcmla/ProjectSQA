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

public class TypeValidator_registerMismatch_581023849448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216417;
     Object term216656;
     Object term216741;
     Object term216742;
     Object term216744;

    public TypeValidator_registerMismatch_581023849448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216417 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term216656 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term216702 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term216656, term216656.getClass(), "referencedType", term216702);
        term216741 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term216741, term216741.getClass(), "compiler", null);
        setField(term216741, term216741.getClass(), "typeRegistry", null);
        setField(term216741, term216741.getClass(), "allValueTypes", null);
        setBooleanField(term216741, term216741.getClass(), "shouldReport", false);
        setField(term216741, term216741.getClass(), "nullOrUndefined", null);
        setField(term216741, term216741.getClass(), "mismatches", null);
        term216742 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term216743 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term216742, term216742.getClass(), "indexType", null);
        setBooleanField(term216743, term216743.getClass(), "resolved", false);
        setField(term216743, term216743.getClass(), "resolveResult", null);
        setField(term216743, term216743.getClass(), "registry", null);
        setField(term216742, term216742.getClass(), "referencedType", term216743);
        setField(term216742, term216742.getClass(), "referencedObjType", null);
        setBooleanField(term216742, term216742.getClass(), "visited", false);
        setField(term216742, term216742.getClass(), "docInfo", null);
        setBooleanField(term216742, term216742.getClass(), "unknown", false);
        setBooleanField(term216742, term216742.getClass(), "resolved", false);
        setField(term216742, term216742.getClass(), "resolveResult", null);
        setField(term216742, term216742.getClass(), "registry", null);
        term216744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term216745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term216744, term216744.getClass(), "indexType", null);
        setBooleanField(term216745, term216745.getClass(), "resolved", false);
        setField(term216745, term216745.getClass(), "resolveResult", null);
        setField(term216745, term216745.getClass(), "registry", null);
        setField(term216744, term216744.getClass(), "referencedType", term216745);
        setField(term216744, term216744.getClass(), "referencedObjType", null);
        setBooleanField(term216744, term216744.getClass(), "visited", false);
        setField(term216744, term216744.getClass(), "docInfo", null);
        setBooleanField(term216744, term216744.getClass(), "unknown", false);
        setBooleanField(term216744, term216744.getClass(), "resolved", false);
        setField(term216744, term216744.getClass(), "resolveResult", null);
        setField(term216744, term216744.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term216656;
        args[1] = term216656;
        callMethod(klass, "registerMismatch", argTypes, term216417, args);
        assertTrue(recursiveEquals(term216417, term216741));
        assertTrue(recursiveEquals(term216656, term216742));
        assertTrue(recursiveEquals(term216656, term216744));
    }

};


