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
import java.lang.Object;

public class TypeCheck_visit_859524784838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225734;
     Object term225804;
     Object term225924;
     Object term225925;

    public TypeCheck_visit_859524784838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225734 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term225734, term225734.getClass(), "inExterns", false);
        term225804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term225804, term225804.getClass(), "type", 148);
        setField(term225804, term225804.getClass(), "jsType", term225896);
        term225924 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term225924, term225924.getClass(), "compiler", null);
        setField(term225924, term225924.getClass(), "validator", null);
        setField(term225924, term225924.getClass(), "reverseInterpreter", null);
        setField(term225924, term225924.getClass(), "typeRegistry", null);
        setField(term225924, term225924.getClass(), "topScope", null);
        setField(term225924, term225924.getClass(), "scopeCreator", null);
        setField(term225924, term225924.getClass(), "reportMissingOverride", null);
        setField(term225924, term225924.getClass(), "reportUnknownTypes", null);
        setBooleanField(term225924, term225924.getClass(), "reportMissingProperties", false);
        setField(term225924, term225924.getClass(), "inferJSDocInfo", null);
        setIntField(term225924, term225924.getClass(), "typedCount", 1);
        setIntField(term225924, term225924.getClass(), "nullCount", 0);
        setIntField(term225924, term225924.getClass(), "unknownCount", 0);
        setBooleanField(term225924, term225924.getClass(), "inExterns", false);
        setIntField(term225924, term225924.getClass(), "noTypeCheckSection", 0);
        term225925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term225926 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setIntField(term225925, term225925.getClass(), "type", 148);
        setField(term225925, term225925.getClass(), "next", null);
        setField(term225925, term225925.getClass(), "first", null);
        setField(term225925, term225925.getClass(), "last", null);
        setField(term225925, term225925.getClass(), "propListHead", null);
        setIntField(term225925, term225925.getClass(), "sourcePosition", 0);
        setBooleanField(term225926, term225926.getClass(), "resolved", false);
        setField(term225926, term225926.getClass(), "resolveResult", null);
        setField(term225926, term225926.getClass(), "templateKeys", null);
        setField(term225926, term225926.getClass(), "templatizedTypes", null);
        setBooleanField(term225926, term225926.getClass(), "inTemplatedCheckVisit", false);
        setField(term225926, term225926.getClass(), "registry", null);
        setField(term225925, term225925.getClass(), "jsType", term225926);
        setField(term225925, term225925.getClass(), "parent", null);
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
        args[1] = term225804;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term225734, args);
        assertTrue(recursiveEquals(term225734, term225924));
        assertTrue(recursiveEquals(term225804, null));
    }

};


