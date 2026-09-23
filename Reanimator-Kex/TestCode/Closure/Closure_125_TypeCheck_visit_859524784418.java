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

public class TypeCheck_visit_859524784418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103790;
     Object term103860;
     Object term103877;
     Object term103878;

    public TypeCheck_visit_859524784418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103790 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term103860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103860, term103860.getClass(), "type", 113);
        term103877 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term103877, term103877.getClass(), "compiler", null);
        setField(term103877, term103877.getClass(), "validator", null);
        setField(term103877, term103877.getClass(), "reverseInterpreter", null);
        setField(term103877, term103877.getClass(), "typeRegistry", null);
        setField(term103877, term103877.getClass(), "topScope", null);
        setField(term103877, term103877.getClass(), "scopeCreator", null);
        setField(term103877, term103877.getClass(), "reportMissingOverride", null);
        setBooleanField(term103877, term103877.getClass(), "reportUnknownTypes", false);
        setBooleanField(term103877, term103877.getClass(), "reportMissingProperties", false);
        setField(term103877, term103877.getClass(), "inferJSDocInfo", null);
        setIntField(term103877, term103877.getClass(), "typedCount", 0);
        setIntField(term103877, term103877.getClass(), "nullCount", 0);
        setIntField(term103877, term103877.getClass(), "unknownCount", 0);
        setBooleanField(term103877, term103877.getClass(), "inExterns", false);
        setIntField(term103877, term103877.getClass(), "noTypeCheckSection", 0);
        setField(term103877, term103877.getClass(), "editDistance", null);
        term103878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term103878, term103878.getClass(), "type", 113);
        setField(term103878, term103878.getClass(), "next", null);
        setField(term103878, term103878.getClass(), "first", null);
        setField(term103878, term103878.getClass(), "last", null);
        setField(term103878, term103878.getClass(), "propListHead", null);
        setIntField(term103878, term103878.getClass(), "sourcePosition", 0);
        setField(term103878, term103878.getClass(), "jsType", null);
        setField(term103878, term103878.getClass(), "parent", null);
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
        args[1] = term103860;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term103790, args);
        assertTrue(recursiveEquals(term103790, term103877));
        assertTrue(recursiveEquals(term103860, null));
    }

};


