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

public class TypeValidator_registerIfMismatch_1963021274117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28095;
     Object term28205;
     Object term28414;
     Object term28415;

    public TypeValidator_registerIfMismatch_1963021274117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28095 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term28205 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        term28414 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term28414, term28414.getClass(), "compiler", null);
        setField(term28414, term28414.getClass(), "typeRegistry", null);
        setField(term28414, term28414.getClass(), "allValueTypes", null);
        setBooleanField(term28414, term28414.getClass(), "shouldReport", false);
        setField(term28414, term28414.getClass(), "nullOrUndefined", null);
        setField(term28414, term28414.getClass(), "mismatches", null);
        term28415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term28415, term28415.getClass(), "parameterType", null);
        setField(term28415, term28415.getClass(), "referencedType", null);
        setField(term28415, term28415.getClass(), "referencedObjType", null);
        setBooleanField(term28415, term28415.getClass(), "visited", false);
        setField(term28415, term28415.getClass(), "docInfo", null);
        setBooleanField(term28415, term28415.getClass(), "unknown", false);
        setBooleanField(term28415, term28415.getClass(), "resolved", false);
        setField(term28415, term28415.getClass(), "resolveResult", null);
        setField(term28415, term28415.getClass(), "templateKeys", null);
        setField(term28415, term28415.getClass(), "templatizedTypes", null);
        setBooleanField(term28415, term28415.getClass(), "inTemplatedCheckVisit", false);
        setField(term28415, term28415.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[3];
        args[0] = term28205;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "registerIfMismatch", argTypes, term28095, args);
        assertTrue(recursiveEquals(term28095, term28414));
        assertTrue(recursiveEquals(term28205, term28415));
    }

};


