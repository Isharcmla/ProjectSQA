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

public class TypeCheck_visit_859524784688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176551;
     Object term176621;
     Object term176893;
     Object term176894;

    public TypeCheck_visit_859524784688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176551 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term176621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176621, term176621.getClass(), "type", 152);
        term176893 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term176893, term176893.getClass(), "compiler", null);
        setField(term176893, term176893.getClass(), "validator", null);
        setField(term176893, term176893.getClass(), "reverseInterpreter", null);
        setField(term176893, term176893.getClass(), "typeRegistry", null);
        setField(term176893, term176893.getClass(), "topScope", null);
        setField(term176893, term176893.getClass(), "scopeCreator", null);
        setField(term176893, term176893.getClass(), "reportMissingOverride", null);
        setField(term176893, term176893.getClass(), "reportUnknownTypes", null);
        setBooleanField(term176893, term176893.getClass(), "reportMissingProperties", false);
        setField(term176893, term176893.getClass(), "inferJSDocInfo", null);
        setIntField(term176893, term176893.getClass(), "typedCount", 0);
        setIntField(term176893, term176893.getClass(), "nullCount", 0);
        setIntField(term176893, term176893.getClass(), "unknownCount", 0);
        setBooleanField(term176893, term176893.getClass(), "inExterns", false);
        setIntField(term176893, term176893.getClass(), "noTypeCheckSection", 0);
        term176894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term176894, term176894.getClass(), "type", 152);
        setField(term176894, term176894.getClass(), "next", null);
        setField(term176894, term176894.getClass(), "first", null);
        setField(term176894, term176894.getClass(), "last", null);
        setField(term176894, term176894.getClass(), "propListHead", null);
        setIntField(term176894, term176894.getClass(), "sourcePosition", 0);
        setField(term176894, term176894.getClass(), "jsType", null);
        setField(term176894, term176894.getClass(), "parent", null);
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
        args[1] = term176621;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term176551, args);
        assertTrue(recursiveEquals(term176551, term176893));
        assertTrue(recursiveEquals(term176621, null));
    }

};


