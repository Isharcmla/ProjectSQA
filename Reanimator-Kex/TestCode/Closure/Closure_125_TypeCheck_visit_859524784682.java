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

public class TypeCheck_visit_859524784682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183576;
     Object term183668;
     Object term183686;
     Object term183687;

    public TypeCheck_visit_859524784682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183576 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term183668 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term183668, term183668.getClass(), "type", 114);
        term183686 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term183686, term183686.getClass(), "compiler", null);
        setField(term183686, term183686.getClass(), "validator", null);
        setField(term183686, term183686.getClass(), "reverseInterpreter", null);
        setField(term183686, term183686.getClass(), "typeRegistry", null);
        setField(term183686, term183686.getClass(), "topScope", null);
        setField(term183686, term183686.getClass(), "scopeCreator", null);
        setField(term183686, term183686.getClass(), "reportMissingOverride", null);
        setBooleanField(term183686, term183686.getClass(), "reportUnknownTypes", false);
        setBooleanField(term183686, term183686.getClass(), "reportMissingProperties", false);
        setField(term183686, term183686.getClass(), "inferJSDocInfo", null);
        setIntField(term183686, term183686.getClass(), "typedCount", 0);
        setIntField(term183686, term183686.getClass(), "nullCount", 0);
        setIntField(term183686, term183686.getClass(), "unknownCount", 0);
        setBooleanField(term183686, term183686.getClass(), "inExterns", false);
        setIntField(term183686, term183686.getClass(), "noTypeCheckSection", 0);
        setField(term183686, term183686.getClass(), "editDistance", null);
        term183687 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term183687, term183687.getClass(), "number", 0.0);
        setIntField(term183687, term183687.getClass(), "type", 114);
        setField(term183687, term183687.getClass(), "next", null);
        setField(term183687, term183687.getClass(), "first", null);
        setField(term183687, term183687.getClass(), "last", null);
        setField(term183687, term183687.getClass(), "propListHead", null);
        setIntField(term183687, term183687.getClass(), "sourcePosition", 0);
        setField(term183687, term183687.getClass(), "jsType", null);
        setField(term183687, term183687.getClass(), "parent", null);
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
        args[1] = term183668;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term183576, args);
        assertTrue(recursiveEquals(term183576, term183686));
        assertTrue(recursiveEquals(term183668, null));
    }

};


