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

public class TypeCheck_visit_8595247841505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489832;
     Object term489924;
     Object term490112;
     Object term490113;

    public TypeCheck_visit_8595247841505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term489832 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term489924 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term489924, term489924.getClass(), "type", 124);
        term490112 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term490112, term490112.getClass(), "compiler", null);
        setField(term490112, term490112.getClass(), "validator", null);
        setField(term490112, term490112.getClass(), "reverseInterpreter", null);
        setField(term490112, term490112.getClass(), "typeRegistry", null);
        setField(term490112, term490112.getClass(), "topScope", null);
        setField(term490112, term490112.getClass(), "scopeCreator", null);
        setField(term490112, term490112.getClass(), "reportMissingOverride", null);
        setField(term490112, term490112.getClass(), "reportUnknownTypes", null);
        setBooleanField(term490112, term490112.getClass(), "reportMissingProperties", false);
        setField(term490112, term490112.getClass(), "inferJSDocInfo", null);
        setIntField(term490112, term490112.getClass(), "typedCount", 0);
        setIntField(term490112, term490112.getClass(), "nullCount", 0);
        setIntField(term490112, term490112.getClass(), "unknownCount", 0);
        setBooleanField(term490112, term490112.getClass(), "inExterns", false);
        setIntField(term490112, term490112.getClass(), "noTypeCheckSection", 0);
        term490113 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term490113, term490113.getClass(), "number", 0.0);
        setIntField(term490113, term490113.getClass(), "type", 124);
        setField(term490113, term490113.getClass(), "next", null);
        setField(term490113, term490113.getClass(), "first", null);
        setField(term490113, term490113.getClass(), "last", null);
        setField(term490113, term490113.getClass(), "propListHead", null);
        setIntField(term490113, term490113.getClass(), "sourcePosition", 0);
        setField(term490113, term490113.getClass(), "jsType", null);
        setField(term490113, term490113.getClass(), "parent", null);
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
        args[1] = term489924;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term489832, args);
        assertTrue(recursiveEquals(term489832, term490112));
        assertTrue(recursiveEquals(term489924, null));
    }

};


