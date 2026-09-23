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

public class TypeCheck_visit_859524784860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221308;
     Object term221400;
     Object term221416;
     Object term221417;

    public TypeCheck_visit_859524784860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221308 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term221400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term221400, term221400.getClass(), "type", 113);
        term221416 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term221416, term221416.getClass(), "compiler", null);
        setField(term221416, term221416.getClass(), "validator", null);
        setField(term221416, term221416.getClass(), "reverseInterpreter", null);
        setField(term221416, term221416.getClass(), "typeRegistry", null);
        setField(term221416, term221416.getClass(), "topScope", null);
        setField(term221416, term221416.getClass(), "scopeCreator", null);
        setField(term221416, term221416.getClass(), "reportMissingOverride", null);
        setField(term221416, term221416.getClass(), "reportUnknownTypes", null);
        setBooleanField(term221416, term221416.getClass(), "reportMissingProperties", false);
        setField(term221416, term221416.getClass(), "inferJSDocInfo", null);
        setIntField(term221416, term221416.getClass(), "typedCount", 0);
        setIntField(term221416, term221416.getClass(), "nullCount", 0);
        setIntField(term221416, term221416.getClass(), "unknownCount", 0);
        setBooleanField(term221416, term221416.getClass(), "inExterns", false);
        setIntField(term221416, term221416.getClass(), "noTypeCheckSection", 0);
        term221417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term221417, term221417.getClass(), "str", null);
        setIntField(term221417, term221417.getClass(), "type", 113);
        setField(term221417, term221417.getClass(), "next", null);
        setField(term221417, term221417.getClass(), "first", null);
        setField(term221417, term221417.getClass(), "last", null);
        setField(term221417, term221417.getClass(), "propListHead", null);
        setIntField(term221417, term221417.getClass(), "sourcePosition", 0);
        setField(term221417, term221417.getClass(), "jsType", null);
        setField(term221417, term221417.getClass(), "parent", null);
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
        args[1] = term221400;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term221308, args);
        assertTrue(recursiveEquals(term221308, term221416));
        assertTrue(recursiveEquals(term221400, null));
    }

};


