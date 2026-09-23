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

public class TypeCheck_visit_859524784408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121097;
     Object term121167;
     Object term121183;
     Object term121184;

    public TypeCheck_visit_859524784408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121097 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term121167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121167, term121167.getClass(), "type", 124);
        term121183 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term121183, term121183.getClass(), "compiler", null);
        setField(term121183, term121183.getClass(), "validator", null);
        setField(term121183, term121183.getClass(), "reverseInterpreter", null);
        setField(term121183, term121183.getClass(), "typeRegistry", null);
        setField(term121183, term121183.getClass(), "topScope", null);
        setField(term121183, term121183.getClass(), "scopeCreator", null);
        setField(term121183, term121183.getClass(), "reportMissingOverride", null);
        setField(term121183, term121183.getClass(), "reportUnknownTypes", null);
        setBooleanField(term121183, term121183.getClass(), "reportMissingProperties", false);
        setField(term121183, term121183.getClass(), "inferJSDocInfo", null);
        setIntField(term121183, term121183.getClass(), "typedCount", 0);
        setIntField(term121183, term121183.getClass(), "nullCount", 0);
        setIntField(term121183, term121183.getClass(), "unknownCount", 0);
        setBooleanField(term121183, term121183.getClass(), "inExterns", false);
        setIntField(term121183, term121183.getClass(), "noTypeCheckSection", 0);
        term121184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121184, term121184.getClass(), "type", 124);
        setField(term121184, term121184.getClass(), "next", null);
        setField(term121184, term121184.getClass(), "first", null);
        setField(term121184, term121184.getClass(), "last", null);
        setField(term121184, term121184.getClass(), "propListHead", null);
        setIntField(term121184, term121184.getClass(), "sourcePosition", 0);
        setField(term121184, term121184.getClass(), "jsType", null);
        setField(term121184, term121184.getClass(), "parent", null);
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
        args[1] = term121167;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term121097, args);
        assertTrue(recursiveEquals(term121097, term121183));
        assertTrue(recursiveEquals(term121167, null));
    }

};


