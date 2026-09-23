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

public class TypeCheck_visit_859524784569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143824;
     Object term143916;
     Object term144120;
     Object term144121;

    public TypeCheck_visit_859524784569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143824 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term143916 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term143916, term143916.getClass(), "type", 117);
        term144120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term144120, term144120.getClass(), "compiler", null);
        setField(term144120, term144120.getClass(), "validator", null);
        setField(term144120, term144120.getClass(), "reverseInterpreter", null);
        setField(term144120, term144120.getClass(), "typeRegistry", null);
        setField(term144120, term144120.getClass(), "topScope", null);
        setField(term144120, term144120.getClass(), "scopeCreator", null);
        setField(term144120, term144120.getClass(), "reportMissingOverride", null);
        setField(term144120, term144120.getClass(), "reportUnknownTypes", null);
        setBooleanField(term144120, term144120.getClass(), "reportMissingProperties", false);
        setField(term144120, term144120.getClass(), "inferJSDocInfo", null);
        setIntField(term144120, term144120.getClass(), "typedCount", 0);
        setIntField(term144120, term144120.getClass(), "nullCount", 0);
        setIntField(term144120, term144120.getClass(), "unknownCount", 0);
        setBooleanField(term144120, term144120.getClass(), "inExterns", false);
        setIntField(term144120, term144120.getClass(), "noTypeCheckSection", 0);
        term144121 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term144121, term144121.getClass(), "str", null);
        setIntField(term144121, term144121.getClass(), "type", 117);
        setField(term144121, term144121.getClass(), "next", null);
        setField(term144121, term144121.getClass(), "first", null);
        setField(term144121, term144121.getClass(), "last", null);
        setField(term144121, term144121.getClass(), "propListHead", null);
        setIntField(term144121, term144121.getClass(), "sourcePosition", 0);
        setField(term144121, term144121.getClass(), "jsType", null);
        setField(term144121, term144121.getClass(), "parent", null);
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
        args[1] = term143916;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term143824, args);
        assertTrue(recursiveEquals(term143824, term144120));
        assertTrue(recursiveEquals(term143916, null));
    }

};


