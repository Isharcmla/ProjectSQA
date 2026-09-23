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

public class TypeCheck_visit_859524784940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262413;
     Object term262505;
     Object term262893;
     Object term262894;

    public TypeCheck_visit_859524784940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262413 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term262505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term262505, term262505.getClass(), "type", 126);
        term262893 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term262893, term262893.getClass(), "compiler", null);
        setField(term262893, term262893.getClass(), "validator", null);
        setField(term262893, term262893.getClass(), "reverseInterpreter", null);
        setField(term262893, term262893.getClass(), "typeRegistry", null);
        setField(term262893, term262893.getClass(), "topScope", null);
        setField(term262893, term262893.getClass(), "scopeCreator", null);
        setField(term262893, term262893.getClass(), "reportMissingOverride", null);
        setField(term262893, term262893.getClass(), "reportUnknownTypes", null);
        setBooleanField(term262893, term262893.getClass(), "reportMissingProperties", false);
        setField(term262893, term262893.getClass(), "inferJSDocInfo", null);
        setIntField(term262893, term262893.getClass(), "typedCount", 0);
        setIntField(term262893, term262893.getClass(), "nullCount", 0);
        setIntField(term262893, term262893.getClass(), "unknownCount", 0);
        setBooleanField(term262893, term262893.getClass(), "inExterns", false);
        setIntField(term262893, term262893.getClass(), "noTypeCheckSection", 0);
        term262894 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term262894, term262894.getClass(), "number", 0.0);
        setIntField(term262894, term262894.getClass(), "type", 126);
        setField(term262894, term262894.getClass(), "next", null);
        setField(term262894, term262894.getClass(), "first", null);
        setField(term262894, term262894.getClass(), "last", null);
        setField(term262894, term262894.getClass(), "propListHead", null);
        setIntField(term262894, term262894.getClass(), "sourcePosition", 0);
        setField(term262894, term262894.getClass(), "jsType", null);
        setField(term262894, term262894.getClass(), "parent", null);
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
        args[1] = term262505;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term262413, args);
        assertTrue(recursiveEquals(term262413, term262893));
        assertTrue(recursiveEquals(term262505, null));
    }

};


