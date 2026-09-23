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

public class TypeCheck_visit_859524784872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240460;
     Object term240552;
     Object term240568;
     Object term240569;

    public TypeCheck_visit_859524784872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240460 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term240552 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term240552, term240552.getClass(), "type", 110);
        term240568 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term240568, term240568.getClass(), "compiler", null);
        setField(term240568, term240568.getClass(), "validator", null);
        setField(term240568, term240568.getClass(), "reverseInterpreter", null);
        setField(term240568, term240568.getClass(), "typeRegistry", null);
        setField(term240568, term240568.getClass(), "topScope", null);
        setField(term240568, term240568.getClass(), "scopeCreator", null);
        setField(term240568, term240568.getClass(), "reportMissingOverride", null);
        setField(term240568, term240568.getClass(), "reportUnknownTypes", null);
        setBooleanField(term240568, term240568.getClass(), "reportMissingProperties", false);
        setField(term240568, term240568.getClass(), "inferJSDocInfo", null);
        setIntField(term240568, term240568.getClass(), "typedCount", 0);
        setIntField(term240568, term240568.getClass(), "nullCount", 0);
        setIntField(term240568, term240568.getClass(), "unknownCount", 0);
        setBooleanField(term240568, term240568.getClass(), "inExterns", false);
        setIntField(term240568, term240568.getClass(), "noTypeCheckSection", 0);
        term240569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term240569, term240569.getClass(), "str", null);
        setIntField(term240569, term240569.getClass(), "type", 110);
        setField(term240569, term240569.getClass(), "next", null);
        setField(term240569, term240569.getClass(), "first", null);
        setField(term240569, term240569.getClass(), "last", null);
        setField(term240569, term240569.getClass(), "propListHead", null);
        setIntField(term240569, term240569.getClass(), "sourcePosition", 0);
        setField(term240569, term240569.getClass(), "jsType", null);
        setField(term240569, term240569.getClass(), "parent", null);
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
        args[1] = term240552;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term240460, args);
        assertTrue(recursiveEquals(term240460, term240568));
        assertTrue(recursiveEquals(term240552, null));
    }

};


