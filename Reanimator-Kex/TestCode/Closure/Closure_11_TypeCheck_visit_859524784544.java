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

public class TypeCheck_visit_859524784544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139235;
     Object term139327;
     Object term139344;
     Object term139345;

    public TypeCheck_visit_859524784544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139235 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term139327 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term139327, term139327.getClass(), "type", 152);
        term139344 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term139344, term139344.getClass(), "compiler", null);
        setField(term139344, term139344.getClass(), "validator", null);
        setField(term139344, term139344.getClass(), "reverseInterpreter", null);
        setField(term139344, term139344.getClass(), "typeRegistry", null);
        setField(term139344, term139344.getClass(), "topScope", null);
        setField(term139344, term139344.getClass(), "scopeCreator", null);
        setField(term139344, term139344.getClass(), "reportMissingOverride", null);
        setField(term139344, term139344.getClass(), "reportUnknownTypes", null);
        setBooleanField(term139344, term139344.getClass(), "reportMissingProperties", false);
        setField(term139344, term139344.getClass(), "inferJSDocInfo", null);
        setIntField(term139344, term139344.getClass(), "typedCount", 0);
        setIntField(term139344, term139344.getClass(), "nullCount", 0);
        setIntField(term139344, term139344.getClass(), "unknownCount", 0);
        setBooleanField(term139344, term139344.getClass(), "inExterns", false);
        setIntField(term139344, term139344.getClass(), "noTypeCheckSection", 0);
        term139345 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term139345, term139345.getClass(), "number", 0.0);
        setIntField(term139345, term139345.getClass(), "type", 152);
        setField(term139345, term139345.getClass(), "next", null);
        setField(term139345, term139345.getClass(), "first", null);
        setField(term139345, term139345.getClass(), "last", null);
        setField(term139345, term139345.getClass(), "propListHead", null);
        setIntField(term139345, term139345.getClass(), "sourcePosition", 0);
        setField(term139345, term139345.getClass(), "jsType", null);
        setField(term139345, term139345.getClass(), "parent", null);
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
        args[1] = term139327;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term139235, args);
        assertTrue(recursiveEquals(term139235, term139344));
        assertTrue(recursiveEquals(term139327, null));
    }

};


