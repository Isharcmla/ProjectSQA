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
import java.lang.Object;

public class TypeCheck_shouldTraverse_435604074536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141033;
     Object term141215;
     Object term141239;
     Object term141241;

    public TypeCheck_shouldTraverse_435604074536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141033 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term141123 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term141033, term141033.getClass(), "validator", term141123);
        setIntField(term141033, term141033.getClass(), "noTypeCheckSection", 0);
        term141215 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term141215, term141215.getClass(), "type", 132);
        setField(term141215, term141215.getClass(), "propListHead", null);
        term141239 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term141240 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term141239, term141239.getClass(), "compiler", null);
        setField(term141240, term141240.getClass(), "compiler", null);
        setField(term141240, term141240.getClass(), "typeRegistry", null);
        setField(term141240, term141240.getClass(), "allValueTypes", null);
        setBooleanField(term141240, term141240.getClass(), "shouldReport", true);
        setField(term141240, term141240.getClass(), "nullOrUndefined", null);
        setField(term141240, term141240.getClass(), "mismatches", null);
        setField(term141239, term141239.getClass(), "validator", term141240);
        setField(term141239, term141239.getClass(), "reverseInterpreter", null);
        setField(term141239, term141239.getClass(), "typeRegistry", null);
        setField(term141239, term141239.getClass(), "topScope", null);
        setField(term141239, term141239.getClass(), "scopeCreator", null);
        setField(term141239, term141239.getClass(), "reportMissingOverride", null);
        setField(term141239, term141239.getClass(), "reportUnknownTypes", null);
        setBooleanField(term141239, term141239.getClass(), "reportMissingProperties", false);
        setField(term141239, term141239.getClass(), "inferJSDocInfo", null);
        setIntField(term141239, term141239.getClass(), "typedCount", 0);
        setIntField(term141239, term141239.getClass(), "nullCount", 0);
        setIntField(term141239, term141239.getClass(), "unknownCount", 0);
        setBooleanField(term141239, term141239.getClass(), "inExterns", false);
        setIntField(term141239, term141239.getClass(), "noTypeCheckSection", 0);
        term141241 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term141241, term141241.getClass(), "str", null);
        setIntField(term141241, term141241.getClass(), "type", 132);
        setField(term141241, term141241.getClass(), "next", null);
        setField(term141241, term141241.getClass(), "first", null);
        setField(term141241, term141241.getClass(), "last", null);
        setField(term141241, term141241.getClass(), "propListHead", null);
        setIntField(term141241, term141241.getClass(), "sourcePosition", 0);
        setField(term141241, term141241.getClass(), "jsType", null);
        setField(term141241, term141241.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term141215;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term141033, args);
        assertTrue(recursiveEquals(term141033, term141239));
        assertTrue(recursiveEquals(term141215, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


