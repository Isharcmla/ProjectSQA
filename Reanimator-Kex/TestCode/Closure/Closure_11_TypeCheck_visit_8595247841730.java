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

public class TypeCheck_visit_8595247841730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561157;
     Object term561249;
     Object term561266;
     Object term561267;

    public TypeCheck_visit_8595247841730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561157 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term561249 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term561249, term561249.getClass(), "type", 154);
        term561266 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term561266, term561266.getClass(), "compiler", null);
        setField(term561266, term561266.getClass(), "validator", null);
        setField(term561266, term561266.getClass(), "reverseInterpreter", null);
        setField(term561266, term561266.getClass(), "typeRegistry", null);
        setField(term561266, term561266.getClass(), "topScope", null);
        setField(term561266, term561266.getClass(), "scopeCreator", null);
        setField(term561266, term561266.getClass(), "reportMissingOverride", null);
        setField(term561266, term561266.getClass(), "reportUnknownTypes", null);
        setBooleanField(term561266, term561266.getClass(), "reportMissingProperties", false);
        setField(term561266, term561266.getClass(), "inferJSDocInfo", null);
        setIntField(term561266, term561266.getClass(), "typedCount", 0);
        setIntField(term561266, term561266.getClass(), "nullCount", 0);
        setIntField(term561266, term561266.getClass(), "unknownCount", 0);
        setBooleanField(term561266, term561266.getClass(), "inExterns", false);
        setIntField(term561266, term561266.getClass(), "noTypeCheckSection", 0);
        term561267 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term561267, term561267.getClass(), "number", 0.0);
        setIntField(term561267, term561267.getClass(), "type", 154);
        setField(term561267, term561267.getClass(), "next", null);
        setField(term561267, term561267.getClass(), "first", null);
        setField(term561267, term561267.getClass(), "last", null);
        setField(term561267, term561267.getClass(), "propListHead", null);
        setIntField(term561267, term561267.getClass(), "sourcePosition", 0);
        setField(term561267, term561267.getClass(), "jsType", null);
        setField(term561267, term561267.getClass(), "parent", null);
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
        args[1] = term561249;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term561157, args);
        assertTrue(recursiveEquals(term561157, term561266));
        assertTrue(recursiveEquals(term561249, null));
    }

};


