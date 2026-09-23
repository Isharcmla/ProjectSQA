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

public class TypeCheck_visit_859524784348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84047;
     Object term84117;
     Object term84134;
     Object term84135;

    public TypeCheck_visit_859524784348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84047 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term84117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84117, term84117.getClass(), "type", 83);
        term84134 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term84134, term84134.getClass(), "compiler", null);
        setField(term84134, term84134.getClass(), "validator", null);
        setField(term84134, term84134.getClass(), "reverseInterpreter", null);
        setField(term84134, term84134.getClass(), "typeRegistry", null);
        setField(term84134, term84134.getClass(), "topScope", null);
        setField(term84134, term84134.getClass(), "scopeCreator", null);
        setField(term84134, term84134.getClass(), "reportMissingOverride", null);
        setBooleanField(term84134, term84134.getClass(), "reportUnknownTypes", false);
        setBooleanField(term84134, term84134.getClass(), "reportMissingProperties", false);
        setField(term84134, term84134.getClass(), "inferJSDocInfo", null);
        setIntField(term84134, term84134.getClass(), "typedCount", 0);
        setIntField(term84134, term84134.getClass(), "nullCount", 0);
        setIntField(term84134, term84134.getClass(), "unknownCount", 0);
        setBooleanField(term84134, term84134.getClass(), "inExterns", false);
        setIntField(term84134, term84134.getClass(), "noTypeCheckSection", 0);
        setField(term84134, term84134.getClass(), "editDistance", null);
        term84135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84135, term84135.getClass(), "type", 83);
        setField(term84135, term84135.getClass(), "next", null);
        setField(term84135, term84135.getClass(), "first", null);
        setField(term84135, term84135.getClass(), "last", null);
        setField(term84135, term84135.getClass(), "propListHead", null);
        setIntField(term84135, term84135.getClass(), "sourcePosition", 0);
        setField(term84135, term84135.getClass(), "jsType", null);
        setField(term84135, term84135.getClass(), "parent", null);
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
        args[1] = term84117;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term84047, args);
        assertTrue(recursiveEquals(term84047, term84134));
        assertTrue(recursiveEquals(term84117, null));
    }

};


