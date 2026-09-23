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

public class TypeValidator_expectCanAssignTo_39591095068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6838;

    public TypeValidator_expectCanAssignTo_39591095068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6838 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term6838, term6838.getClass(), "compiler", null);
        setField(term6838, term6838.getClass(), "typeRegistry", null);
        setField(term6838, term6838.getClass(), "allValueTypes", null);
        setBooleanField(term6838, term6838.getClass(), "shouldReport", false);
        setField(term6838, term6838.getClass(), "nullOrUndefined", null);
        setField(term6838, term6838.getClass(), "mismatches", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[3] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            callMethod(klass, "expectCanAssignTo", argTypes, term6838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


