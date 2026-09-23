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

public class TypeValidator_expectUndeclaredVariable_328555518260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74642;
     Object term74712;
     Object term74782;
     Object term74864;
     Object term74893;
     Object term74894;
     Object term74895;
     Object term74896;
     Object term74885;

    public TypeValidator_expectUndeclaredVariable_328555518260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74642 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term74712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74712, term74712.getClass(), "type", 147);
        setField(term74712, term74712.getClass(), "propListHead", null);
        term74782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term74782, term74782.getClass(), "propListHead", null);
        term74864 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        term74893 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term74893, term74893.getClass(), "compiler", null);
        setField(term74893, term74893.getClass(), "typeRegistry", null);
        setField(term74893, term74893.getClass(), "allValueTypes", null);
        setBooleanField(term74893, term74893.getClass(), "shouldReport", false);
        setField(term74893, term74893.getClass(), "nullOrUndefined", null);
        setField(term74893, term74893.getClass(), "mismatches", null);
        term74894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74894, term74894.getClass(), "type", 147);
        setField(term74894, term74894.getClass(), "next", null);
        setField(term74894, term74894.getClass(), "first", null);
        setField(term74894, term74894.getClass(), "last", null);
        setField(term74894, term74894.getClass(), "propListHead", null);
        setIntField(term74894, term74894.getClass(), "sourcePosition", 0);
        setField(term74894, term74894.getClass(), "jsType", null);
        setField(term74894, term74894.getClass(), "parent", null);
        term74895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74895, term74895.getClass(), "type", 0);
        setField(term74895, term74895.getClass(), "next", null);
        setField(term74895, term74895.getClass(), "first", null);
        setField(term74895, term74895.getClass(), "last", null);
        setField(term74895, term74895.getClass(), "propListHead", null);
        setIntField(term74895, term74895.getClass(), "sourcePosition", 0);
        setField(term74895, term74895.getClass(), "jsType", null);
        setField(term74895, term74895.getClass(), "parent", null);
        term74896 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term74896, term74896.getClass(), "name", null);
        setField(term74896, term74896.getClass(), "nameNode", null);
        setField(term74896, term74896.getClass(), "type", null);
        setBooleanField(term74896, term74896.getClass(), "typeInferred", false);
        setField(term74896, term74896.getClass(), "input", null);
        setIntField(term74896, term74896.getClass(), "index", 0);
        setField(term74896, term74896.getClass(), "scope", null);
        setBooleanField(term74896, term74896.getClass(), "markedEscaped", false);
        setBooleanField(term74896, term74896.getClass(), "markedAssignedExactlyOnce", false);
        term74885 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term74885, term74885.getClass(), "name", null);
        setField(term74885, term74885.getClass(), "nameNode", null);
        setField(term74885, term74885.getClass(), "type", null);
        setBooleanField(term74885, term74885.getClass(), "typeInferred", false);
        setField(term74885, term74885.getClass(), "input", null);
        setIntField(term74885, term74885.getClass(), "index", 0);
        setField(term74885, term74885.getClass(), "scope", null);
        setBooleanField(term74885, term74885.getClass(), "markedEscaped", false);
        setBooleanField(term74885, term74885.getClass(), "markedAssignedExactlyOnce", false);
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
        args[2] = term74712;
        args[3] = term74782;
        args[4] = term74864;
        args[5] = null;
        args[6] = null;
        Object retValue = callMethod(klass, "expectUndeclaredVariable", argTypes, term74642, args);
        assertTrue(recursiveEquals(term74642, term74893));
        assertTrue(recursiveEquals(term74712, term74896));
        assertTrue(recursiveEquals(term74782, null));
        assertTrue(recursiveEquals(term74864, null));
        assertTrue(recursiveEquals(retValue, term74885));
    }

};


