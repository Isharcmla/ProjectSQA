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

public class TypeValidator_expectBitwiseable_1013517081123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45114;
     Object term45212;
     Object term45630;
     Object term45631;

    public TypeValidator_expectBitwiseable_1013517081123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45114 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term45212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term45630 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term45630, term45630.getClass(), "compiler", null);
        setField(term45630, term45630.getClass(), "typeRegistry", null);
        setField(term45630, term45630.getClass(), "allValueTypes", null);
        setBooleanField(term45630, term45630.getClass(), "shouldReport", false);
        setField(term45630, term45630.getClass(), "nullOrUndefined", null);
        setField(term45630, term45630.getClass(), "mismatches", null);
        term45631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term45631, term45631.getClass(), "isChecked", false);
        setBooleanField(term45631, term45631.getClass(), "visited", false);
        setField(term45631, term45631.getClass(), "docInfo", null);
        setBooleanField(term45631, term45631.getClass(), "unknown", false);
        setBooleanField(term45631, term45631.getClass(), "resolved", false);
        setField(term45631, term45631.getClass(), "resolveResult", null);
        setField(term45631, term45631.getClass(), "templateTypeMap", null);
        setBooleanField(term45631, term45631.getClass(), "inTemplatedCheckVisit", false);
        setField(term45631, term45631.getClass(), "registry", null);
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
        args[2] = term45212;
        args[3] = null;
        callMethod(klass, "expectBitwiseable", argTypes, term45114, args);
        assertTrue(recursiveEquals(term45114, term45630));
        assertTrue(recursiveEquals(term45212, null));
    }

};


