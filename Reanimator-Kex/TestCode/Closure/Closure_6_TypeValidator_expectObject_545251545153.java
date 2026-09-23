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

public class TypeValidator_expectObject_545251545153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36869;
     Object term36959;
     Object term37595;
     Object term37596;

    public TypeValidator_expectObject_545251545153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36869 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term36959 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term37595 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term37595, term37595.getClass(), "compiler", null);
        setField(term37595, term37595.getClass(), "typeRegistry", null);
        setField(term37595, term37595.getClass(), "allValueTypes", null);
        setBooleanField(term37595, term37595.getClass(), "shouldReport", false);
        setField(term37595, term37595.getClass(), "nullOrUndefined", null);
        setField(term37595, term37595.getClass(), "mismatches", null);
        term37596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term37596, term37596.getClass(), "resolved", false);
        setField(term37596, term37596.getClass(), "resolveResult", null);
        setField(term37596, term37596.getClass(), "templateKeys", null);
        setField(term37596, term37596.getClass(), "templatizedTypes", null);
        setBooleanField(term37596, term37596.getClass(), "inTemplatedCheckVisit", false);
        setField(term37596, term37596.getClass(), "registry", null);
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
        args[2] = term36959;
        args[3] = null;
        Object retValue = callMethod(klass, "expectObject", argTypes, term36869, args);
        assertTrue(recursiveEquals(term36869, term37595));
        assertTrue(recursiveEquals(term36959, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


