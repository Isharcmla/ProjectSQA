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

public class TypeCheck_visit_859524784434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107285;
     Object term107355;
     Object term107371;
     Object term107372;

    public TypeCheck_visit_859524784434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107285 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term107355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term107355, term107355.getClass(), "type", 124);
        term107371 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term107371, term107371.getClass(), "compiler", null);
        setField(term107371, term107371.getClass(), "validator", null);
        setField(term107371, term107371.getClass(), "reverseInterpreter", null);
        setField(term107371, term107371.getClass(), "typeRegistry", null);
        setField(term107371, term107371.getClass(), "topScope", null);
        setField(term107371, term107371.getClass(), "scopeCreator", null);
        setField(term107371, term107371.getClass(), "reportMissingOverride", null);
        setField(term107371, term107371.getClass(), "reportUnknownTypes", null);
        setBooleanField(term107371, term107371.getClass(), "reportMissingProperties", false);
        setField(term107371, term107371.getClass(), "inferJSDocInfo", null);
        setIntField(term107371, term107371.getClass(), "typedCount", 0);
        setIntField(term107371, term107371.getClass(), "nullCount", 0);
        setIntField(term107371, term107371.getClass(), "unknownCount", 0);
        setBooleanField(term107371, term107371.getClass(), "inExterns", false);
        setIntField(term107371, term107371.getClass(), "noTypeCheckSection", 0);
        term107372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term107372, term107372.getClass(), "type", 124);
        setField(term107372, term107372.getClass(), "next", null);
        setField(term107372, term107372.getClass(), "first", null);
        setField(term107372, term107372.getClass(), "last", null);
        setField(term107372, term107372.getClass(), "propListHead", null);
        setIntField(term107372, term107372.getClass(), "sourcePosition", 0);
        setField(term107372, term107372.getClass(), "jsType", null);
        setField(term107372, term107372.getClass(), "parent", null);
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
        args[1] = term107355;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term107285, args);
        assertTrue(recursiveEquals(term107285, term107371));
        assertTrue(recursiveEquals(term107355, null));
    }

};


