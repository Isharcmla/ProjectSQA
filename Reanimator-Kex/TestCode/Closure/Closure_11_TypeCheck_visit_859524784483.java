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

public class TypeCheck_visit_859524784483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121375;
     Object term121467;
     Object term121671;
     Object term121672;

    public TypeCheck_visit_859524784483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121375 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term121467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term121467, term121467.getClass(), "type", 130);
        term121671 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term121671, term121671.getClass(), "compiler", null);
        setField(term121671, term121671.getClass(), "validator", null);
        setField(term121671, term121671.getClass(), "reverseInterpreter", null);
        setField(term121671, term121671.getClass(), "typeRegistry", null);
        setField(term121671, term121671.getClass(), "topScope", null);
        setField(term121671, term121671.getClass(), "scopeCreator", null);
        setField(term121671, term121671.getClass(), "reportMissingOverride", null);
        setField(term121671, term121671.getClass(), "reportUnknownTypes", null);
        setBooleanField(term121671, term121671.getClass(), "reportMissingProperties", false);
        setField(term121671, term121671.getClass(), "inferJSDocInfo", null);
        setIntField(term121671, term121671.getClass(), "typedCount", 0);
        setIntField(term121671, term121671.getClass(), "nullCount", 0);
        setIntField(term121671, term121671.getClass(), "unknownCount", 0);
        setBooleanField(term121671, term121671.getClass(), "inExterns", false);
        setIntField(term121671, term121671.getClass(), "noTypeCheckSection", 0);
        term121672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term121672, term121672.getClass(), "str", null);
        setIntField(term121672, term121672.getClass(), "type", 130);
        setField(term121672, term121672.getClass(), "next", null);
        setField(term121672, term121672.getClass(), "first", null);
        setField(term121672, term121672.getClass(), "last", null);
        setField(term121672, term121672.getClass(), "propListHead", null);
        setIntField(term121672, term121672.getClass(), "sourcePosition", 0);
        setField(term121672, term121672.getClass(), "jsType", null);
        setField(term121672, term121672.getClass(), "parent", null);
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
        args[1] = term121467;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term121375, args);
        assertTrue(recursiveEquals(term121375, term121671));
        assertTrue(recursiveEquals(term121467, null));
    }

};


