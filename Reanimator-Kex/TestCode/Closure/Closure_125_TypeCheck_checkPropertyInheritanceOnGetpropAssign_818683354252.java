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

public class TypeCheck_checkPropertyInheritanceOnGetpropAssign_818683354252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61975;
     Object term62045;
     Object term62061;
     Object term62062;

    public TypeCheck_checkPropertyInheritanceOnGetpropAssign_818683354252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61975 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term62045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term62061 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term62061, term62061.getClass(), "compiler", null);
        setField(term62061, term62061.getClass(), "validator", null);
        setField(term62061, term62061.getClass(), "reverseInterpreter", null);
        setField(term62061, term62061.getClass(), "typeRegistry", null);
        setField(term62061, term62061.getClass(), "topScope", null);
        setField(term62061, term62061.getClass(), "scopeCreator", null);
        setField(term62061, term62061.getClass(), "reportMissingOverride", null);
        setBooleanField(term62061, term62061.getClass(), "reportUnknownTypes", false);
        setBooleanField(term62061, term62061.getClass(), "reportMissingProperties", false);
        setField(term62061, term62061.getClass(), "inferJSDocInfo", null);
        setIntField(term62061, term62061.getClass(), "typedCount", 0);
        setIntField(term62061, term62061.getClass(), "nullCount", 0);
        setIntField(term62061, term62061.getClass(), "unknownCount", 0);
        setBooleanField(term62061, term62061.getClass(), "inExterns", false);
        setIntField(term62061, term62061.getClass(), "noTypeCheckSection", 0);
        setField(term62061, term62061.getClass(), "editDistance", null);
        term62062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term62062, term62062.getClass(), "type", 0);
        setField(term62062, term62062.getClass(), "next", null);
        setField(term62062, term62062.getClass(), "first", null);
        setField(term62062, term62062.getClass(), "last", null);
        setField(term62062, term62062.getClass(), "propListHead", null);
        setIntField(term62062, term62062.getClass(), "sourcePosition", 0);
        setField(term62062, term62062.getClass(), "jsType", null);
        setField(term62062, term62062.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term62045;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "checkPropertyInheritanceOnGetpropAssign", argTypes, term61975, args);
        assertTrue(recursiveEquals(term61975, term62061));
        assertTrue(recursiveEquals(term62045, null));
    }

};


