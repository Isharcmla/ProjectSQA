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

public class TypeCheck_visit_859524784308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74808;
     Object term74878;
     Object term74895;
     Object term74896;

    public TypeCheck_visit_859524784308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74808 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term74878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74878, term74878.getClass(), "type", 126);
        term74895 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term74895, term74895.getClass(), "compiler", null);
        setField(term74895, term74895.getClass(), "validator", null);
        setField(term74895, term74895.getClass(), "reverseInterpreter", null);
        setField(term74895, term74895.getClass(), "typeRegistry", null);
        setField(term74895, term74895.getClass(), "topScope", null);
        setField(term74895, term74895.getClass(), "scopeCreator", null);
        setField(term74895, term74895.getClass(), "reportMissingOverride", null);
        setBooleanField(term74895, term74895.getClass(), "reportUnknownTypes", false);
        setBooleanField(term74895, term74895.getClass(), "reportMissingProperties", false);
        setField(term74895, term74895.getClass(), "inferJSDocInfo", null);
        setIntField(term74895, term74895.getClass(), "typedCount", 0);
        setIntField(term74895, term74895.getClass(), "nullCount", 0);
        setIntField(term74895, term74895.getClass(), "unknownCount", 0);
        setBooleanField(term74895, term74895.getClass(), "inExterns", false);
        setIntField(term74895, term74895.getClass(), "noTypeCheckSection", 0);
        setField(term74895, term74895.getClass(), "editDistance", null);
        term74896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74896, term74896.getClass(), "type", 126);
        setField(term74896, term74896.getClass(), "next", null);
        setField(term74896, term74896.getClass(), "first", null);
        setField(term74896, term74896.getClass(), "last", null);
        setField(term74896, term74896.getClass(), "propListHead", null);
        setIntField(term74896, term74896.getClass(), "sourcePosition", 0);
        setField(term74896, term74896.getClass(), "jsType", null);
        setField(term74896, term74896.getClass(), "parent", null);
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
        args[1] = term74878;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term74808, args);
        assertTrue(recursiveEquals(term74808, term74895));
        assertTrue(recursiveEquals(term74878, null));
    }

};


