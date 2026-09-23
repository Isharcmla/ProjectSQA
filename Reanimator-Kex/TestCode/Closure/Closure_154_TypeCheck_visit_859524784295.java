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

public class TypeCheck_visit_859524784295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83436;
     Object term83506;
     Object term83522;
     Object term83523;

    public TypeCheck_visit_859524784295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83436 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term83506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83506, term83506.getClass(), "type", 49);
        term83522 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term83522, term83522.getClass(), "compiler", null);
        setField(term83522, term83522.getClass(), "validator", null);
        setField(term83522, term83522.getClass(), "reverseInterpreter", null);
        setField(term83522, term83522.getClass(), "typeRegistry", null);
        setField(term83522, term83522.getClass(), "topScope", null);
        setField(term83522, term83522.getClass(), "scopeCreator", null);
        setField(term83522, term83522.getClass(), "reportMissingOverride", null);
        setField(term83522, term83522.getClass(), "reportUnknownTypes", null);
        setBooleanField(term83522, term83522.getClass(), "reportMissingProperties", false);
        setField(term83522, term83522.getClass(), "inferJSDocInfo", null);
        setIntField(term83522, term83522.getClass(), "typedCount", 0);
        setIntField(term83522, term83522.getClass(), "nullCount", 0);
        setIntField(term83522, term83522.getClass(), "unknownCount", 0);
        setBooleanField(term83522, term83522.getClass(), "inExterns", false);
        setIntField(term83522, term83522.getClass(), "noTypeCheckSection", 0);
        term83523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term83523, term83523.getClass(), "type", 49);
        setField(term83523, term83523.getClass(), "next", null);
        setField(term83523, term83523.getClass(), "first", null);
        setField(term83523, term83523.getClass(), "last", null);
        setField(term83523, term83523.getClass(), "propListHead", null);
        setIntField(term83523, term83523.getClass(), "sourcePosition", 0);
        setField(term83523, term83523.getClass(), "jsType", null);
        setField(term83523, term83523.getClass(), "parent", null);
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
        args[1] = term83506;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term83436, args);
        assertTrue(recursiveEquals(term83436, term83522));
        assertTrue(recursiveEquals(term83506, null));
    }

};


