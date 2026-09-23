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

public class TypeCheck_visit_859524784930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245103;
     Object term245195;
     Object term245211;
     Object term245212;

    public TypeCheck_visit_859524784930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245103 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term245195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term245195, term245195.getClass(), "type", 110);
        term245211 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term245211, term245211.getClass(), "compiler", null);
        setField(term245211, term245211.getClass(), "validator", null);
        setField(term245211, term245211.getClass(), "reverseInterpreter", null);
        setField(term245211, term245211.getClass(), "typeRegistry", null);
        setField(term245211, term245211.getClass(), "topScope", null);
        setField(term245211, term245211.getClass(), "scopeCreator", null);
        setField(term245211, term245211.getClass(), "reportMissingOverride", null);
        setField(term245211, term245211.getClass(), "reportUnknownTypes", null);
        setBooleanField(term245211, term245211.getClass(), "reportMissingProperties", false);
        setField(term245211, term245211.getClass(), "inferJSDocInfo", null);
        setIntField(term245211, term245211.getClass(), "typedCount", 0);
        setIntField(term245211, term245211.getClass(), "nullCount", 0);
        setIntField(term245211, term245211.getClass(), "unknownCount", 0);
        setBooleanField(term245211, term245211.getClass(), "inExterns", false);
        setIntField(term245211, term245211.getClass(), "noTypeCheckSection", 0);
        term245212 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term245212, term245212.getClass(), "str", null);
        setIntField(term245212, term245212.getClass(), "type", 110);
        setField(term245212, term245212.getClass(), "next", null);
        setField(term245212, term245212.getClass(), "first", null);
        setField(term245212, term245212.getClass(), "last", null);
        setField(term245212, term245212.getClass(), "propListHead", null);
        setIntField(term245212, term245212.getClass(), "sourcePosition", 0);
        setField(term245212, term245212.getClass(), "jsType", null);
        setField(term245212, term245212.getClass(), "parent", null);
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
        args[1] = term245195;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term245103, args);
        assertTrue(recursiveEquals(term245103, term245211));
        assertTrue(recursiveEquals(term245195, null));
    }

};


