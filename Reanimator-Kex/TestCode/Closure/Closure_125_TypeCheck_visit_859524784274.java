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

public class TypeCheck_visit_859524784274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67657;
     Object term67727;
     Object term67744;
     Object term67745;

    public TypeCheck_visit_859524784274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67657 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term67727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67727, term67727.getClass(), "type", 108);
        term67744 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term67744, term67744.getClass(), "compiler", null);
        setField(term67744, term67744.getClass(), "validator", null);
        setField(term67744, term67744.getClass(), "reverseInterpreter", null);
        setField(term67744, term67744.getClass(), "typeRegistry", null);
        setField(term67744, term67744.getClass(), "topScope", null);
        setField(term67744, term67744.getClass(), "scopeCreator", null);
        setField(term67744, term67744.getClass(), "reportMissingOverride", null);
        setBooleanField(term67744, term67744.getClass(), "reportUnknownTypes", false);
        setBooleanField(term67744, term67744.getClass(), "reportMissingProperties", false);
        setField(term67744, term67744.getClass(), "inferJSDocInfo", null);
        setIntField(term67744, term67744.getClass(), "typedCount", 0);
        setIntField(term67744, term67744.getClass(), "nullCount", 0);
        setIntField(term67744, term67744.getClass(), "unknownCount", 0);
        setBooleanField(term67744, term67744.getClass(), "inExterns", false);
        setIntField(term67744, term67744.getClass(), "noTypeCheckSection", 0);
        setField(term67744, term67744.getClass(), "editDistance", null);
        term67745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67745, term67745.getClass(), "type", 108);
        setField(term67745, term67745.getClass(), "next", null);
        setField(term67745, term67745.getClass(), "first", null);
        setField(term67745, term67745.getClass(), "last", null);
        setField(term67745, term67745.getClass(), "propListHead", null);
        setIntField(term67745, term67745.getClass(), "sourcePosition", 0);
        setField(term67745, term67745.getClass(), "jsType", null);
        setField(term67745, term67745.getClass(), "parent", null);
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
        args[1] = term67727;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term67657, args);
        assertTrue(recursiveEquals(term67657, term67744));
        assertTrue(recursiveEquals(term67727, null));
    }

};


