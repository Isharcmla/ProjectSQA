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

public class TypeCheck_visit_859524784437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119308;
     Object term119400;
     Object term119416;
     Object term119417;

    public TypeCheck_visit_859524784437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119308 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term119400 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term119400, term119400.getClass(), "type", 77);
        term119416 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term119416, term119416.getClass(), "compiler", null);
        setField(term119416, term119416.getClass(), "validator", null);
        setField(term119416, term119416.getClass(), "reverseInterpreter", null);
        setField(term119416, term119416.getClass(), "typeRegistry", null);
        setField(term119416, term119416.getClass(), "topScope", null);
        setField(term119416, term119416.getClass(), "scopeCreator", null);
        setField(term119416, term119416.getClass(), "reportMissingOverride", null);
        setField(term119416, term119416.getClass(), "reportUnknownTypes", null);
        setBooleanField(term119416, term119416.getClass(), "reportMissingProperties", false);
        setField(term119416, term119416.getClass(), "inferJSDocInfo", null);
        setIntField(term119416, term119416.getClass(), "typedCount", 0);
        setIntField(term119416, term119416.getClass(), "nullCount", 0);
        setIntField(term119416, term119416.getClass(), "unknownCount", 0);
        setBooleanField(term119416, term119416.getClass(), "inExterns", false);
        setIntField(term119416, term119416.getClass(), "noTypeCheckSection", 0);
        term119417 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term119417, term119417.getClass(), "str", null);
        setIntField(term119417, term119417.getClass(), "type", 77);
        setField(term119417, term119417.getClass(), "next", null);
        setField(term119417, term119417.getClass(), "first", null);
        setField(term119417, term119417.getClass(), "last", null);
        setField(term119417, term119417.getClass(), "propListHead", null);
        setIntField(term119417, term119417.getClass(), "sourcePosition", 0);
        setField(term119417, term119417.getClass(), "jsType", null);
        setField(term119417, term119417.getClass(), "parent", null);
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
        args[1] = term119400;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term119308, args);
        assertTrue(recursiveEquals(term119308, term119416));
        assertTrue(recursiveEquals(term119400, null));
    }

};


