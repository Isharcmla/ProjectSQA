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

public class TypeCheck_visit_8595247841278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384000;
     Object term384092;
     Object term384184;
     Object term384209;
     Object term384210;
     Object term384211;

    public TypeCheck_visit_8595247841278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384000 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term384092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term384092, term384092.getClass(), "type", 38);
        term384184 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term384184, term384184.getClass(), "type", 118);
        term384209 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term384209, term384209.getClass(), "compiler", null);
        setField(term384209, term384209.getClass(), "validator", null);
        setField(term384209, term384209.getClass(), "reverseInterpreter", null);
        setField(term384209, term384209.getClass(), "typeRegistry", null);
        setField(term384209, term384209.getClass(), "topScope", null);
        setField(term384209, term384209.getClass(), "scopeCreator", null);
        setField(term384209, term384209.getClass(), "reportMissingOverride", null);
        setField(term384209, term384209.getClass(), "reportUnknownTypes", null);
        setBooleanField(term384209, term384209.getClass(), "reportMissingProperties", false);
        setField(term384209, term384209.getClass(), "inferJSDocInfo", null);
        setIntField(term384209, term384209.getClass(), "typedCount", 0);
        setIntField(term384209, term384209.getClass(), "nullCount", 0);
        setIntField(term384209, term384209.getClass(), "unknownCount", 0);
        setBooleanField(term384209, term384209.getClass(), "inExterns", false);
        setIntField(term384209, term384209.getClass(), "noTypeCheckSection", 0);
        term384210 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term384210, term384210.getClass(), "str", null);
        setIntField(term384210, term384210.getClass(), "type", 38);
        setField(term384210, term384210.getClass(), "next", null);
        setField(term384210, term384210.getClass(), "first", null);
        setField(term384210, term384210.getClass(), "last", null);
        setField(term384210, term384210.getClass(), "propListHead", null);
        setIntField(term384210, term384210.getClass(), "sourcePosition", 0);
        setField(term384210, term384210.getClass(), "jsType", null);
        setField(term384210, term384210.getClass(), "parent", null);
        term384211 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term384211, term384211.getClass(), "str", null);
        setIntField(term384211, term384211.getClass(), "type", 118);
        setField(term384211, term384211.getClass(), "next", null);
        setField(term384211, term384211.getClass(), "first", null);
        setField(term384211, term384211.getClass(), "last", null);
        setField(term384211, term384211.getClass(), "propListHead", null);
        setIntField(term384211, term384211.getClass(), "sourcePosition", 0);
        setField(term384211, term384211.getClass(), "jsType", null);
        setField(term384211, term384211.getClass(), "parent", null);
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
        args[1] = term384092;
        args[2] = term384184;
        callMethod(klass, "visit", argTypes, term384000, args);
        assertTrue(recursiveEquals(term384000, term384209));
        assertTrue(recursiveEquals(term384092, term384211));
        assertTrue(recursiveEquals(term384184, null));
    }

};


