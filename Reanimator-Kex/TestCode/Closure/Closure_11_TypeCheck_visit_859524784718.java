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

public class TypeCheck_visit_859524784718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182752;
     Object term182844;
     Object term182861;
     Object term182862;

    public TypeCheck_visit_859524784718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182752 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term182844 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term182844, term182844.getClass(), "type", 120);
        term182861 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term182861, term182861.getClass(), "compiler", null);
        setField(term182861, term182861.getClass(), "validator", null);
        setField(term182861, term182861.getClass(), "reverseInterpreter", null);
        setField(term182861, term182861.getClass(), "typeRegistry", null);
        setField(term182861, term182861.getClass(), "topScope", null);
        setField(term182861, term182861.getClass(), "scopeCreator", null);
        setField(term182861, term182861.getClass(), "reportMissingOverride", null);
        setField(term182861, term182861.getClass(), "reportUnknownTypes", null);
        setBooleanField(term182861, term182861.getClass(), "reportMissingProperties", false);
        setField(term182861, term182861.getClass(), "inferJSDocInfo", null);
        setIntField(term182861, term182861.getClass(), "typedCount", 0);
        setIntField(term182861, term182861.getClass(), "nullCount", 0);
        setIntField(term182861, term182861.getClass(), "unknownCount", 0);
        setBooleanField(term182861, term182861.getClass(), "inExterns", false);
        setIntField(term182861, term182861.getClass(), "noTypeCheckSection", 0);
        term182862 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term182862, term182862.getClass(), "number", 0.0);
        setIntField(term182862, term182862.getClass(), "type", 120);
        setField(term182862, term182862.getClass(), "next", null);
        setField(term182862, term182862.getClass(), "first", null);
        setField(term182862, term182862.getClass(), "last", null);
        setField(term182862, term182862.getClass(), "propListHead", null);
        setIntField(term182862, term182862.getClass(), "sourcePosition", 0);
        setField(term182862, term182862.getClass(), "jsType", null);
        setField(term182862, term182862.getClass(), "parent", null);
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
        args[1] = term182844;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term182752, args);
        assertTrue(recursiveEquals(term182752, term182861));
        assertTrue(recursiveEquals(term182844, null));
    }

};


