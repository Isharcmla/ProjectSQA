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

public class TypeCheck_visit_859524784613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167700;
     Object term167792;
     Object term167973;
     Object term167974;

    public TypeCheck_visit_859524784613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167700 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term167792 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term167792, term167792.getClass(), "type", 153);
        term167973 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term167973, term167973.getClass(), "compiler", null);
        setField(term167973, term167973.getClass(), "validator", null);
        setField(term167973, term167973.getClass(), "reverseInterpreter", null);
        setField(term167973, term167973.getClass(), "typeRegistry", null);
        setField(term167973, term167973.getClass(), "topScope", null);
        setField(term167973, term167973.getClass(), "scopeCreator", null);
        setField(term167973, term167973.getClass(), "reportMissingOverride", null);
        setField(term167973, term167973.getClass(), "reportUnknownTypes", null);
        setBooleanField(term167973, term167973.getClass(), "reportMissingProperties", false);
        setField(term167973, term167973.getClass(), "inferJSDocInfo", null);
        setIntField(term167973, term167973.getClass(), "typedCount", 0);
        setIntField(term167973, term167973.getClass(), "nullCount", 0);
        setIntField(term167973, term167973.getClass(), "unknownCount", 0);
        setBooleanField(term167973, term167973.getClass(), "inExterns", false);
        setIntField(term167973, term167973.getClass(), "noTypeCheckSection", 0);
        term167974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term167974, term167974.getClass(), "str", null);
        setIntField(term167974, term167974.getClass(), "type", 153);
        setField(term167974, term167974.getClass(), "next", null);
        setField(term167974, term167974.getClass(), "first", null);
        setField(term167974, term167974.getClass(), "last", null);
        setField(term167974, term167974.getClass(), "propListHead", null);
        setIntField(term167974, term167974.getClass(), "sourcePosition", 0);
        setField(term167974, term167974.getClass(), "jsType", null);
        setField(term167974, term167974.getClass(), "parent", null);
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
        args[1] = term167792;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term167700, args);
        assertTrue(recursiveEquals(term167700, term167973));
        assertTrue(recursiveEquals(term167792, null));
    }

};


