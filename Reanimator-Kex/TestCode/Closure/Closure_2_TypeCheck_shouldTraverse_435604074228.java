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

public class TypeCheck_shouldTraverse_435604074228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57295;
     Object term57387;
     Object term57658;
     Object term57659;

    public TypeCheck_shouldTraverse_435604074228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57295 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term57387 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term57658 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term57658, term57658.getClass(), "compiler", null);
        setField(term57658, term57658.getClass(), "validator", null);
        setField(term57658, term57658.getClass(), "reverseInterpreter", null);
        setField(term57658, term57658.getClass(), "typeRegistry", null);
        setField(term57658, term57658.getClass(), "topScope", null);
        setField(term57658, term57658.getClass(), "scopeCreator", null);
        setField(term57658, term57658.getClass(), "reportMissingOverride", null);
        setField(term57658, term57658.getClass(), "reportUnknownTypes", null);
        setBooleanField(term57658, term57658.getClass(), "reportMissingProperties", false);
        setField(term57658, term57658.getClass(), "inferJSDocInfo", null);
        setIntField(term57658, term57658.getClass(), "typedCount", 0);
        setIntField(term57658, term57658.getClass(), "nullCount", 0);
        setIntField(term57658, term57658.getClass(), "unknownCount", 0);
        setBooleanField(term57658, term57658.getClass(), "inExterns", false);
        setIntField(term57658, term57658.getClass(), "noTypeCheckSection", 0);
        term57659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term57659, term57659.getClass(), "number", 0.0);
        setIntField(term57659, term57659.getClass(), "type", 0);
        setField(term57659, term57659.getClass(), "next", null);
        setField(term57659, term57659.getClass(), "first", null);
        setField(term57659, term57659.getClass(), "last", null);
        setField(term57659, term57659.getClass(), "propListHead", null);
        setIntField(term57659, term57659.getClass(), "sourcePosition", 0);
        setField(term57659, term57659.getClass(), "jsType", null);
        setField(term57659, term57659.getClass(), "parent", null);
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
        args[1] = term57387;
        args[2] = null;
        Object retValue = callMethod(klass, "shouldTraverse", argTypes, term57295, args);
        assertTrue(recursiveEquals(term57295, term57658));
        assertTrue(recursiveEquals(term57387, null));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


