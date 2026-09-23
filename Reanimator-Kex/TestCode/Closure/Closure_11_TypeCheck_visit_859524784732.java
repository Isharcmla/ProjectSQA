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

public class TypeCheck_visit_859524784732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186116;
     Object term186186;
     Object term186202;
     Object term186203;

    public TypeCheck_visit_859524784732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186116 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term186186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term186186, term186186.getClass(), "type", 77);
        term186202 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term186202, term186202.getClass(), "compiler", null);
        setField(term186202, term186202.getClass(), "validator", null);
        setField(term186202, term186202.getClass(), "reverseInterpreter", null);
        setField(term186202, term186202.getClass(), "typeRegistry", null);
        setField(term186202, term186202.getClass(), "topScope", null);
        setField(term186202, term186202.getClass(), "scopeCreator", null);
        setField(term186202, term186202.getClass(), "reportMissingOverride", null);
        setField(term186202, term186202.getClass(), "reportUnknownTypes", null);
        setBooleanField(term186202, term186202.getClass(), "reportMissingProperties", false);
        setField(term186202, term186202.getClass(), "inferJSDocInfo", null);
        setIntField(term186202, term186202.getClass(), "typedCount", 0);
        setIntField(term186202, term186202.getClass(), "nullCount", 0);
        setIntField(term186202, term186202.getClass(), "unknownCount", 0);
        setBooleanField(term186202, term186202.getClass(), "inExterns", false);
        setIntField(term186202, term186202.getClass(), "noTypeCheckSection", 0);
        term186203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term186203, term186203.getClass(), "type", 77);
        setField(term186203, term186203.getClass(), "next", null);
        setField(term186203, term186203.getClass(), "first", null);
        setField(term186203, term186203.getClass(), "last", null);
        setField(term186203, term186203.getClass(), "propListHead", null);
        setIntField(term186203, term186203.getClass(), "sourcePosition", 0);
        setField(term186203, term186203.getClass(), "jsType", null);
        setField(term186203, term186203.getClass(), "parent", null);
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
        args[1] = term186186;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term186116, args);
        assertTrue(recursiveEquals(term186116, term186202));
        assertTrue(recursiveEquals(term186186, null));
    }

};


