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
import java.util.ArrayList;

public class TypeValidator_containsForwardDeclaredUnresolvedName_54046344136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31196;
     Object term31290;
     Object term31363;
     Object term31364;

    public TypeValidator_containsForwardDeclaredUnresolvedName_54046344136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31196 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        ArrayList term31342 = new ArrayList();
        term31290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term31290, term31290.getClass(), "alternates", term31342);
        term31363 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term31363, term31363.getClass(), "compiler", null);
        setField(term31363, term31363.getClass(), "typeRegistry", null);
        setField(term31363, term31363.getClass(), "allValueTypes", null);
        setBooleanField(term31363, term31363.getClass(), "shouldReport", false);
        setField(term31363, term31363.getClass(), "nullOrUndefined", null);
        setField(term31363, term31363.getClass(), "mismatches", null);
        ArrayList term31365 = new ArrayList();
        term31364 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        setField(term31364, term31364.getClass(), "alternates", term31365);
        setIntField(term31364, term31364.getClass(), "hashcode", 0);
        setBooleanField(term31364, term31364.getClass(), "resolved", false);
        setField(term31364, term31364.getClass(), "resolveResult", null);
        setField(term31364, term31364.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term31290;
        Object retValue = callMethod(klass, "containsForwardDeclaredUnresolvedName", argTypes, term31196, args);
        assertTrue(recursiveEquals(term31196, term31363));
        assertTrue(recursiveEquals(term31290, term31364));
        assertTrue(recursiveEquals(retValue, false));
    }

};


