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

public class TypeCheck_visit_859524784268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66109;
     Object term66179;
     Object term66464;
     Object term66465;

    public TypeCheck_visit_859524784268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66109 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term66179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66179, term66179.getClass(), "type", 154);
        term66464 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term66464, term66464.getClass(), "compiler", null);
        setField(term66464, term66464.getClass(), "validator", null);
        setField(term66464, term66464.getClass(), "reverseInterpreter", null);
        setField(term66464, term66464.getClass(), "typeRegistry", null);
        setField(term66464, term66464.getClass(), "topScope", null);
        setField(term66464, term66464.getClass(), "scopeCreator", null);
        setField(term66464, term66464.getClass(), "reportMissingOverride", null);
        setField(term66464, term66464.getClass(), "reportUnknownTypes", null);
        setBooleanField(term66464, term66464.getClass(), "reportMissingProperties", false);
        setField(term66464, term66464.getClass(), "inferJSDocInfo", null);
        setIntField(term66464, term66464.getClass(), "typedCount", 0);
        setIntField(term66464, term66464.getClass(), "nullCount", 0);
        setIntField(term66464, term66464.getClass(), "unknownCount", 0);
        setBooleanField(term66464, term66464.getClass(), "inExterns", false);
        setIntField(term66464, term66464.getClass(), "noTypeCheckSection", 0);
        term66465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66465, term66465.getClass(), "type", 154);
        setField(term66465, term66465.getClass(), "next", null);
        setField(term66465, term66465.getClass(), "first", null);
        setField(term66465, term66465.getClass(), "last", null);
        setField(term66465, term66465.getClass(), "propListHead", null);
        setIntField(term66465, term66465.getClass(), "sourcePosition", 0);
        setField(term66465, term66465.getClass(), "jsType", null);
        setField(term66465, term66465.getClass(), "parent", null);
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
        args[1] = term66179;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term66109, args);
        assertTrue(recursiveEquals(term66109, term66464));
        assertTrue(recursiveEquals(term66179, null));
    }

};


