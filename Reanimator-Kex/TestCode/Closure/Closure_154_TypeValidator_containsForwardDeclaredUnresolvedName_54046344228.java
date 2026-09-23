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

public class TypeValidator_containsForwardDeclaredUnresolvedName_54046344228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72754;
     Object term72866;
     Object term72878;
     Object term72879;

    public TypeValidator_containsForwardDeclaredUnresolvedName_54046344228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72754 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term72866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        term72878 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term72878, term72878.getClass(), "compiler", null);
        setField(term72878, term72878.getClass(), "typeRegistry", null);
        setField(term72878, term72878.getClass(), "allValueTypes", null);
        setBooleanField(term72878, term72878.getClass(), "shouldReport", false);
        setField(term72878, term72878.getClass(), "nullOrUndefined", null);
        setField(term72878, term72878.getClass(), "mismatches", null);
        term72879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term72879, term72879.getClass(), "constructor", null);
        setField(term72879, term72879.getClass(), "className", null);
        setField(term72879, term72879.getClass(), "properties", null);
        setBooleanField(term72879, term72879.getClass(), "nativeType", false);
        setField(term72879, term72879.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term72879, term72879.getClass(), "prettyPrint", false);
        setBooleanField(term72879, term72879.getClass(), "visited", false);
        setField(term72879, term72879.getClass(), "docInfo", null);
        setBooleanField(term72879, term72879.getClass(), "unknown", false);
        setBooleanField(term72879, term72879.getClass(), "resolved", false);
        setField(term72879, term72879.getClass(), "resolveResult", null);
        setField(term72879, term72879.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term72866;
        Object retValue = callMethod(klass, "containsForwardDeclaredUnresolvedName", argTypes, term72754, args);
        assertTrue(recursiveEquals(term72754, term72878));
        assertTrue(recursiveEquals(term72866, term72879));
        assertTrue(recursiveEquals(retValue, false));
    }

};


