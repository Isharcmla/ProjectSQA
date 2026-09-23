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

public class TypeValidator_expectValidTypeofName_35630298899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23722;
     Object term23812;
     Object term24874;
     Object term24875;

    public TypeValidator_expectValidTypeofName_35630298899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23722 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term23812 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term24874 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term24874, term24874.getClass(), "compiler", null);
        setField(term24874, term24874.getClass(), "typeRegistry", null);
        setField(term24874, term24874.getClass(), "allValueTypes", null);
        setBooleanField(term24874, term24874.getClass(), "shouldReport", false);
        setField(term24874, term24874.getClass(), "nullOrUndefined", null);
        setField(term24874, term24874.getClass(), "mismatches", null);
        term24875 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term24875, term24875.getClass(), "compiler", null);
        setField(term24875, term24875.getClass(), "callback", null);
        setField(term24875, term24875.getClass(), "curNode", null);
        setField(term24875, term24875.getClass(), "scopes", null);
        setField(term24875, term24875.getClass(), "scopeRoots", null);
        setField(term24875, term24875.getClass(), "cfgs", null);
        setField(term24875, term24875.getClass(), "sourceName", null);
        setField(term24875, term24875.getClass(), "inputId", null);
        setField(term24875, term24875.getClass(), "scopeCreator", null);
        setField(term24875, term24875.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term23812;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "expectValidTypeofName", argTypes, term23722, args);
        assertTrue(recursiveEquals(term23722, term24874));
        assertTrue(recursiveEquals(term23812, term24875));
    }

};


