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

public class TypeCheck_visit_859524784280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66359;
     Object term66429;
     Object term66445;
     Object term66446;

    public TypeCheck_visit_859524784280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66359 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term66429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66429, term66429.getClass(), "type", 130);
        term66445 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term66445, term66445.getClass(), "compiler", null);
        setField(term66445, term66445.getClass(), "validator", null);
        setField(term66445, term66445.getClass(), "reverseInterpreter", null);
        setField(term66445, term66445.getClass(), "typeRegistry", null);
        setField(term66445, term66445.getClass(), "topScope", null);
        setField(term66445, term66445.getClass(), "scopeCreator", null);
        setField(term66445, term66445.getClass(), "reportMissingOverride", null);
        setField(term66445, term66445.getClass(), "reportUnknownTypes", null);
        setBooleanField(term66445, term66445.getClass(), "reportMissingProperties", false);
        setField(term66445, term66445.getClass(), "inferJSDocInfo", null);
        setIntField(term66445, term66445.getClass(), "typedCount", 0);
        setIntField(term66445, term66445.getClass(), "nullCount", 0);
        setIntField(term66445, term66445.getClass(), "unknownCount", 0);
        setBooleanField(term66445, term66445.getClass(), "inExterns", false);
        setIntField(term66445, term66445.getClass(), "noTypeCheckSection", 0);
        term66446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66446, term66446.getClass(), "type", 130);
        setField(term66446, term66446.getClass(), "next", null);
        setField(term66446, term66446.getClass(), "first", null);
        setField(term66446, term66446.getClass(), "last", null);
        setField(term66446, term66446.getClass(), "propListHead", null);
        setIntField(term66446, term66446.getClass(), "sourcePosition", 0);
        setField(term66446, term66446.getClass(), "jsType", null);
        setField(term66446, term66446.getClass(), "parent", null);
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
        args[1] = term66429;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term66359, args);
        assertTrue(recursiveEquals(term66359, term66445));
        assertTrue(recursiveEquals(term66429, null));
    }

};


