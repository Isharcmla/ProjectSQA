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

public class TypeCheck_visit_859524784495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124875;
     Object term124945;
     Object term125338;
     Object term125339;

    public TypeCheck_visit_859524784495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124875 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term124945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term124945, term124945.getClass(), "type", 110);
        term125338 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term125338, term125338.getClass(), "compiler", null);
        setField(term125338, term125338.getClass(), "validator", null);
        setField(term125338, term125338.getClass(), "reverseInterpreter", null);
        setField(term125338, term125338.getClass(), "typeRegistry", null);
        setField(term125338, term125338.getClass(), "topScope", null);
        setField(term125338, term125338.getClass(), "scopeCreator", null);
        setField(term125338, term125338.getClass(), "reportMissingOverride", null);
        setField(term125338, term125338.getClass(), "reportUnknownTypes", null);
        setBooleanField(term125338, term125338.getClass(), "reportMissingProperties", false);
        setField(term125338, term125338.getClass(), "inferJSDocInfo", null);
        setIntField(term125338, term125338.getClass(), "typedCount", 0);
        setIntField(term125338, term125338.getClass(), "nullCount", 0);
        setIntField(term125338, term125338.getClass(), "unknownCount", 0);
        setBooleanField(term125338, term125338.getClass(), "inExterns", false);
        setIntField(term125338, term125338.getClass(), "noTypeCheckSection", 0);
        term125339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125339, term125339.getClass(), "type", 110);
        setField(term125339, term125339.getClass(), "next", null);
        setField(term125339, term125339.getClass(), "first", null);
        setField(term125339, term125339.getClass(), "last", null);
        setField(term125339, term125339.getClass(), "propListHead", null);
        setIntField(term125339, term125339.getClass(), "sourcePosition", 0);
        setField(term125339, term125339.getClass(), "jsType", null);
        setField(term125339, term125339.getClass(), "parent", null);
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
        args[1] = term124945;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term124875, args);
        assertTrue(recursiveEquals(term124875, term125338));
        assertTrue(recursiveEquals(term124945, null));
    }

};


