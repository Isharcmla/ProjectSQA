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

public class TypeCheck_visit_859524784365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89326;
     Object term89396;
     Object term89577;
     Object term89578;

    public TypeCheck_visit_859524784365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89326 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term89396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89396, term89396.getClass(), "type", 120);
        term89577 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term89577, term89577.getClass(), "compiler", null);
        setField(term89577, term89577.getClass(), "validator", null);
        setField(term89577, term89577.getClass(), "reverseInterpreter", null);
        setField(term89577, term89577.getClass(), "typeRegistry", null);
        setField(term89577, term89577.getClass(), "topScope", null);
        setField(term89577, term89577.getClass(), "scopeCreator", null);
        setField(term89577, term89577.getClass(), "reportMissingOverride", null);
        setField(term89577, term89577.getClass(), "reportUnknownTypes", null);
        setBooleanField(term89577, term89577.getClass(), "reportMissingProperties", false);
        setField(term89577, term89577.getClass(), "inferJSDocInfo", null);
        setIntField(term89577, term89577.getClass(), "typedCount", 0);
        setIntField(term89577, term89577.getClass(), "nullCount", 0);
        setIntField(term89577, term89577.getClass(), "unknownCount", 0);
        setBooleanField(term89577, term89577.getClass(), "inExterns", false);
        setIntField(term89577, term89577.getClass(), "noTypeCheckSection", 0);
        term89578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89578, term89578.getClass(), "type", 120);
        setField(term89578, term89578.getClass(), "next", null);
        setField(term89578, term89578.getClass(), "first", null);
        setField(term89578, term89578.getClass(), "last", null);
        setField(term89578, term89578.getClass(), "propListHead", null);
        setIntField(term89578, term89578.getClass(), "sourcePosition", 0);
        setField(term89578, term89578.getClass(), "jsType", null);
        setField(term89578, term89578.getClass(), "parent", null);
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
        args[1] = term89396;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term89326, args);
        assertTrue(recursiveEquals(term89326, term89577));
        assertTrue(recursiveEquals(term89396, null));
    }

};


