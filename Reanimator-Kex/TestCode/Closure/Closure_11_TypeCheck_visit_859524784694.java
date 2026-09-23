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

public class TypeCheck_visit_859524784694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177832;
     Object term177924;
     Object term178052;
     Object term178053;

    public TypeCheck_visit_859524784694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177832 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term177924 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term177924, term177924.getClass(), "type", 124);
        term178052 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term178052, term178052.getClass(), "compiler", null);
        setField(term178052, term178052.getClass(), "validator", null);
        setField(term178052, term178052.getClass(), "reverseInterpreter", null);
        setField(term178052, term178052.getClass(), "typeRegistry", null);
        setField(term178052, term178052.getClass(), "topScope", null);
        setField(term178052, term178052.getClass(), "scopeCreator", null);
        setField(term178052, term178052.getClass(), "reportMissingOverride", null);
        setField(term178052, term178052.getClass(), "reportUnknownTypes", null);
        setBooleanField(term178052, term178052.getClass(), "reportMissingProperties", false);
        setField(term178052, term178052.getClass(), "inferJSDocInfo", null);
        setIntField(term178052, term178052.getClass(), "typedCount", 0);
        setIntField(term178052, term178052.getClass(), "nullCount", 0);
        setIntField(term178052, term178052.getClass(), "unknownCount", 0);
        setBooleanField(term178052, term178052.getClass(), "inExterns", false);
        setIntField(term178052, term178052.getClass(), "noTypeCheckSection", 0);
        term178053 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term178053, term178053.getClass(), "str", null);
        setIntField(term178053, term178053.getClass(), "type", 124);
        setField(term178053, term178053.getClass(), "next", null);
        setField(term178053, term178053.getClass(), "first", null);
        setField(term178053, term178053.getClass(), "last", null);
        setField(term178053, term178053.getClass(), "propListHead", null);
        setIntField(term178053, term178053.getClass(), "sourcePosition", 0);
        setField(term178053, term178053.getClass(), "jsType", null);
        setField(term178053, term178053.getClass(), "parent", null);
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
        args[1] = term177924;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term177832, args);
        assertTrue(recursiveEquals(term177832, term178052));
        assertTrue(recursiveEquals(term177924, null));
    }

};


