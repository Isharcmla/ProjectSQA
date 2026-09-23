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

public class TypeValidator_expectStringOrNumber_433192725132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46914;
     Object term47006;
     Object term47183;
     Object term47184;

    public TypeValidator_expectStringOrNumber_433192725132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46914 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term47006 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        term47183 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term47183, term47183.getClass(), "compiler", null);
        setField(term47183, term47183.getClass(), "typeRegistry", null);
        setField(term47183, term47183.getClass(), "allValueTypes", null);
        setBooleanField(term47183, term47183.getClass(), "shouldReport", false);
        setField(term47183, term47183.getClass(), "nullOrUndefined", null);
        setField(term47183, term47183.getClass(), "mismatches", null);
        term47184 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term47184, term47184.getClass(), "resolved", false);
        setField(term47184, term47184.getClass(), "resolveResult", null);
        setField(term47184, term47184.getClass(), "templateTypeMap", null);
        setBooleanField(term47184, term47184.getClass(), "inTemplatedCheckVisit", false);
        setField(term47184, term47184.getClass(), "registry", null);
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
        args[2] = term47006;
        args[3] = null;
        callMethod(klass, "expectStringOrNumber", argTypes, term46914, args);
        assertTrue(recursiveEquals(term46914, term47183));
        assertTrue(recursiveEquals(term47006, null));
    }

};


