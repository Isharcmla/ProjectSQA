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

public class TypeValidator_expectNumber_142805812197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23178;
     Object term23276;
     Object term23475;
     Object term23476;

    public TypeValidator_expectNumber_142805812197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23178 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term23276 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term23475 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term23475, term23475.getClass(), "compiler", null);
        setField(term23475, term23475.getClass(), "typeRegistry", null);
        setField(term23475, term23475.getClass(), "allValueTypes", null);
        setBooleanField(term23475, term23475.getClass(), "shouldReport", false);
        setField(term23475, term23475.getClass(), "nullOrUndefined", null);
        setField(term23475, term23475.getClass(), "mismatches", null);
        term23476 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term23476, term23476.getClass(), "isChecked", false);
        setBooleanField(term23476, term23476.getClass(), "visited", false);
        setField(term23476, term23476.getClass(), "docInfo", null);
        setBooleanField(term23476, term23476.getClass(), "unknown", false);
        setBooleanField(term23476, term23476.getClass(), "resolved", false);
        setField(term23476, term23476.getClass(), "resolveResult", null);
        setField(term23476, term23476.getClass(), "registry", null);
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
        args[2] = term23276;
        args[3] = null;
        callMethod(klass, "expectNumber", argTypes, term23178, args);
        assertTrue(recursiveEquals(term23178, term23475));
        assertTrue(recursiveEquals(term23276, null));
    }

};


