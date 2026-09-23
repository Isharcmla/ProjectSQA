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

public class TypeCheck_visit_859524784926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244350;
     Object term244442;
     Object term244458;
     Object term244459;

    public TypeCheck_visit_859524784926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244350 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term244442 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term244442, term244442.getClass(), "type", 114);
        term244458 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term244458, term244458.getClass(), "compiler", null);
        setField(term244458, term244458.getClass(), "validator", null);
        setField(term244458, term244458.getClass(), "reverseInterpreter", null);
        setField(term244458, term244458.getClass(), "typeRegistry", null);
        setField(term244458, term244458.getClass(), "topScope", null);
        setField(term244458, term244458.getClass(), "scopeCreator", null);
        setField(term244458, term244458.getClass(), "reportMissingOverride", null);
        setField(term244458, term244458.getClass(), "reportUnknownTypes", null);
        setBooleanField(term244458, term244458.getClass(), "reportMissingProperties", false);
        setField(term244458, term244458.getClass(), "inferJSDocInfo", null);
        setIntField(term244458, term244458.getClass(), "typedCount", 0);
        setIntField(term244458, term244458.getClass(), "nullCount", 0);
        setIntField(term244458, term244458.getClass(), "unknownCount", 0);
        setBooleanField(term244458, term244458.getClass(), "inExterns", false);
        setIntField(term244458, term244458.getClass(), "noTypeCheckSection", 0);
        term244459 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term244459, term244459.getClass(), "str", null);
        setIntField(term244459, term244459.getClass(), "type", 114);
        setField(term244459, term244459.getClass(), "next", null);
        setField(term244459, term244459.getClass(), "first", null);
        setField(term244459, term244459.getClass(), "last", null);
        setField(term244459, term244459.getClass(), "propListHead", null);
        setIntField(term244459, term244459.getClass(), "sourcePosition", 0);
        setField(term244459, term244459.getClass(), "jsType", null);
        setField(term244459, term244459.getClass(), "parent", null);
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
        args[1] = term244442;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term244350, args);
        assertTrue(recursiveEquals(term244350, term244458));
        assertTrue(recursiveEquals(term244442, null));
    }

};


