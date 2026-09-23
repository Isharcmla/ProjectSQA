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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeValidator_expectValidTypeofName_35630298855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1149;

    public TypeValidator_expectValidTypeofName_35630298855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1149 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term1149, term1149.getClass(), "compiler", null);
        setField(term1149, term1149.getClass(), "typeRegistry", null);
        setField(term1149, term1149.getClass(), "allValueTypes", null);
        setBooleanField(term1149, term1149.getClass(), "shouldReport", false);
        setField(term1149, term1149.getClass(), "nullOrUndefined", null);
        setField(term1149, term1149.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "expectValidTypeofName", argTypes, term1149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


