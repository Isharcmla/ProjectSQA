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

public class TypeCheck_visit_859524784477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120201;
     Object term120293;
     Object term120498;
     Object term120499;

    public TypeCheck_visit_859524784477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120201 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term120293 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term120293, term120293.getClass(), "type", 126);
        term120498 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term120498, term120498.getClass(), "compiler", null);
        setField(term120498, term120498.getClass(), "validator", null);
        setField(term120498, term120498.getClass(), "reverseInterpreter", null);
        setField(term120498, term120498.getClass(), "typeRegistry", null);
        setField(term120498, term120498.getClass(), "topScope", null);
        setField(term120498, term120498.getClass(), "scopeCreator", null);
        setField(term120498, term120498.getClass(), "reportMissingOverride", null);
        setField(term120498, term120498.getClass(), "reportUnknownTypes", null);
        setBooleanField(term120498, term120498.getClass(), "reportMissingProperties", false);
        setField(term120498, term120498.getClass(), "inferJSDocInfo", null);
        setIntField(term120498, term120498.getClass(), "typedCount", 0);
        setIntField(term120498, term120498.getClass(), "nullCount", 0);
        setIntField(term120498, term120498.getClass(), "unknownCount", 0);
        setBooleanField(term120498, term120498.getClass(), "inExterns", false);
        setIntField(term120498, term120498.getClass(), "noTypeCheckSection", 0);
        term120499 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term120499, term120499.getClass(), "number", 0.0);
        setIntField(term120499, term120499.getClass(), "type", 126);
        setField(term120499, term120499.getClass(), "next", null);
        setField(term120499, term120499.getClass(), "first", null);
        setField(term120499, term120499.getClass(), "last", null);
        setField(term120499, term120499.getClass(), "propListHead", null);
        setIntField(term120499, term120499.getClass(), "sourcePosition", 0);
        setField(term120499, term120499.getClass(), "jsType", null);
        setField(term120499, term120499.getClass(), "parent", null);
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
        args[1] = term120293;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term120201, args);
        assertTrue(recursiveEquals(term120201, term120498));
        assertTrue(recursiveEquals(term120293, null));
    }

};


