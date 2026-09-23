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

public class TypeValidator_expectValidTypeofName_356302988106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41453;
     Object term41543;
     Object term41964;
     Object term41965;

    public TypeValidator_expectValidTypeofName_356302988106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41453 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term41543 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term41964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term41964, term41964.getClass(), "compiler", null);
        setField(term41964, term41964.getClass(), "typeRegistry", null);
        setField(term41964, term41964.getClass(), "allValueTypes", null);
        setBooleanField(term41964, term41964.getClass(), "shouldReport", false);
        setField(term41964, term41964.getClass(), "nullOrUndefined", null);
        setField(term41964, term41964.getClass(), "mismatches", null);
        term41965 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term41965, term41965.getClass(), "compiler", null);
        setField(term41965, term41965.getClass(), "callback", null);
        setField(term41965, term41965.getClass(), "curNode", null);
        setField(term41965, term41965.getClass(), "scopes", null);
        setField(term41965, term41965.getClass(), "scopeRoots", null);
        setField(term41965, term41965.getClass(), "cfgs", null);
        setField(term41965, term41965.getClass(), "sourceName", null);
        setField(term41965, term41965.getClass(), "inputId", null);
        setField(term41965, term41965.getClass(), "scopeCreator", null);
        setField(term41965, term41965.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term41543;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "expectValidTypeofName", argTypes, term41453, args);
        assertTrue(recursiveEquals(term41453, term41964));
        assertTrue(recursiveEquals(term41543, term41965));
    }

};


