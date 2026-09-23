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

public class TypeCheck_visit_8595247841726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560198;
     Object term560290;
     Object term560382;
     Object term560407;
     Object term560408;
     Object term560409;

    public TypeCheck_visit_8595247841726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560198 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term560290 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term560290, term560290.getClass(), "type", 38);
        term560382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term560382, term560382.getClass(), "type", 118);
        term560407 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term560407, term560407.getClass(), "compiler", null);
        setField(term560407, term560407.getClass(), "validator", null);
        setField(term560407, term560407.getClass(), "reverseInterpreter", null);
        setField(term560407, term560407.getClass(), "typeRegistry", null);
        setField(term560407, term560407.getClass(), "topScope", null);
        setField(term560407, term560407.getClass(), "scopeCreator", null);
        setField(term560407, term560407.getClass(), "reportMissingOverride", null);
        setField(term560407, term560407.getClass(), "reportUnknownTypes", null);
        setBooleanField(term560407, term560407.getClass(), "reportMissingProperties", false);
        setField(term560407, term560407.getClass(), "inferJSDocInfo", null);
        setIntField(term560407, term560407.getClass(), "typedCount", 0);
        setIntField(term560407, term560407.getClass(), "nullCount", 0);
        setIntField(term560407, term560407.getClass(), "unknownCount", 0);
        setBooleanField(term560407, term560407.getClass(), "inExterns", false);
        setIntField(term560407, term560407.getClass(), "noTypeCheckSection", 0);
        term560408 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term560408, term560408.getClass(), "str", null);
        setIntField(term560408, term560408.getClass(), "type", 38);
        setField(term560408, term560408.getClass(), "next", null);
        setField(term560408, term560408.getClass(), "first", null);
        setField(term560408, term560408.getClass(), "last", null);
        setField(term560408, term560408.getClass(), "propListHead", null);
        setIntField(term560408, term560408.getClass(), "sourcePosition", 0);
        setField(term560408, term560408.getClass(), "jsType", null);
        setField(term560408, term560408.getClass(), "parent", null);
        term560409 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term560409, term560409.getClass(), "str", null);
        setIntField(term560409, term560409.getClass(), "type", 118);
        setField(term560409, term560409.getClass(), "next", null);
        setField(term560409, term560409.getClass(), "first", null);
        setField(term560409, term560409.getClass(), "last", null);
        setField(term560409, term560409.getClass(), "propListHead", null);
        setIntField(term560409, term560409.getClass(), "sourcePosition", 0);
        setField(term560409, term560409.getClass(), "jsType", null);
        setField(term560409, term560409.getClass(), "parent", null);
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
        args[1] = term560290;
        args[2] = term560382;
        callMethod(klass, "visit", argTypes, term560198, args);
        assertTrue(recursiveEquals(term560198, term560407));
        assertTrue(recursiveEquals(term560290, term560409));
        assertTrue(recursiveEquals(term560382, null));
    }

};


