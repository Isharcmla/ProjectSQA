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

public class TypeValidator_expectUndeclaredVariable_328555518185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65157;
     Object term65249;
     Object term65331;
     Object term65351;
     Object term65352;
     Object term65353;
     Object term65343;

    public TypeValidator_expectUndeclaredVariable_328555518185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65157 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term65249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term65249, term65249.getClass(), "type", 144);
        term65331 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        term65351 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term65351, term65351.getClass(), "compiler", null);
        setField(term65351, term65351.getClass(), "typeRegistry", null);
        setField(term65351, term65351.getClass(), "allValueTypes", null);
        setBooleanField(term65351, term65351.getClass(), "shouldReport", false);
        setField(term65351, term65351.getClass(), "nullOrUndefined", null);
        setField(term65351, term65351.getClass(), "mismatches", null);
        term65352 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term65352, term65352.getClass(), "number", 0.0);
        setIntField(term65352, term65352.getClass(), "type", 144);
        setField(term65352, term65352.getClass(), "next", null);
        setField(term65352, term65352.getClass(), "first", null);
        setField(term65352, term65352.getClass(), "last", null);
        setField(term65352, term65352.getClass(), "propListHead", null);
        setIntField(term65352, term65352.getClass(), "sourcePosition", 0);
        setField(term65352, term65352.getClass(), "jsType", null);
        setField(term65352, term65352.getClass(), "parent", null);
        term65353 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term65353, term65353.getClass(), "name", null);
        setField(term65353, term65353.getClass(), "nameNode", null);
        setField(term65353, term65353.getClass(), "type", null);
        setBooleanField(term65353, term65353.getClass(), "typeInferred", false);
        setField(term65353, term65353.getClass(), "input", null);
        setIntField(term65353, term65353.getClass(), "index", 0);
        setField(term65353, term65353.getClass(), "scope", null);
        setBooleanField(term65353, term65353.getClass(), "markedEscaped", false);
        setBooleanField(term65353, term65353.getClass(), "markedAssignedExactlyOnce", false);
        term65343 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term65343, term65343.getClass(), "name", null);
        setField(term65343, term65343.getClass(), "nameNode", null);
        setField(term65343, term65343.getClass(), "type", null);
        setBooleanField(term65343, term65343.getClass(), "typeInferred", false);
        setField(term65343, term65343.getClass(), "input", null);
        setIntField(term65343, term65343.getClass(), "index", 0);
        setField(term65343, term65343.getClass(), "scope", null);
        setBooleanField(term65343, term65343.getClass(), "markedEscaped", false);
        setBooleanField(term65343, term65343.getClass(), "markedAssignedExactlyOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CompilerInput");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term65249;
        args[3] = null;
        args[4] = term65331;
        args[5] = null;
        args[6] = null;
        Object retValue = callMethod(klass, "expectUndeclaredVariable", argTypes, term65157, args);
        assertTrue(recursiveEquals(term65157, term65351));
        assertTrue(recursiveEquals(term65249, null));
        assertTrue(recursiveEquals(term65331, null));
        assertTrue(recursiveEquals(retValue, term65343));
    }

};


