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

public class TypeValidator_expectUndeclaredVariable_59719754240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75849;
     Object term75987;
     Object term76069;
     Object term76090;
     Object term76091;
     Object term76092;
     Object term76093;

    public TypeValidator_expectUndeclaredVariable_59719754240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75849 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term75987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term75987, term75987.getClass(), "type", 33);
        setField(term75987, term75987.getClass(), "propListHead", null);
        term76069 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        term76090 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term76090, term76090.getClass(), "compiler", null);
        setField(term76090, term76090.getClass(), "typeRegistry", null);
        setField(term76090, term76090.getClass(), "allValueTypes", null);
        setBooleanField(term76090, term76090.getClass(), "shouldReport", false);
        setField(term76090, term76090.getClass(), "nullOrUndefined", null);
        setField(term76090, term76090.getClass(), "mismatches", null);
        term76091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term76091, term76091.getClass(), "number", 0.0);
        setIntField(term76091, term76091.getClass(), "type", 33);
        setField(term76091, term76091.getClass(), "next", null);
        setField(term76091, term76091.getClass(), "first", null);
        setField(term76091, term76091.getClass(), "last", null);
        setField(term76091, term76091.getClass(), "propListHead", null);
        setIntField(term76091, term76091.getClass(), "sourcePosition", 0);
        setField(term76091, term76091.getClass(), "jsType", null);
        setField(term76091, term76091.getClass(), "parent", null);
        term76092 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term76092, term76092.getClass(), "number", 0.0);
        setIntField(term76092, term76092.getClass(), "type", 33);
        setField(term76092, term76092.getClass(), "next", null);
        setField(term76092, term76092.getClass(), "first", null);
        setField(term76092, term76092.getClass(), "last", null);
        setField(term76092, term76092.getClass(), "propListHead", null);
        setIntField(term76092, term76092.getClass(), "sourcePosition", 0);
        setField(term76092, term76092.getClass(), "jsType", null);
        setField(term76092, term76092.getClass(), "parent", null);
        term76093 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term76093, term76093.getClass(), "name", null);
        setField(term76093, term76093.getClass(), "nameNode", null);
        setField(term76093, term76093.getClass(), "type", null);
        setField(term76093, term76093.getClass(), "info", null);
        setBooleanField(term76093, term76093.getClass(), "typeInferred", false);
        setField(term76093, term76093.getClass(), "input", null);
        setBooleanField(term76093, term76093.getClass(), "isDefine", false);
        setIntField(term76093, term76093.getClass(), "index", 0);
        setField(term76093, term76093.getClass(), "scope", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term75987;
        args[2] = term75987;
        args[3] = term76069;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "expectUndeclaredVariable", argTypes, term75849, args);
        assertTrue(recursiveEquals(term75849, term76090));
        assertTrue(recursiveEquals(term75987, term76092));
        assertTrue(recursiveEquals(term75987, term76093));
        assertTrue(recursiveEquals(term76069, null));
    }

};


