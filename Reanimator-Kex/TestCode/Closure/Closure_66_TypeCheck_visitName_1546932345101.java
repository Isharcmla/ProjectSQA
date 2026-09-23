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

public class TypeCheck_visitName_1546932345101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29475;
     Object term29545;
     Object term29746;
     Object term29747;

    public TypeCheck_visitName_1546932345101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29475 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term29545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29545, term29545.getClass(), "type", 83);
        term29746 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term29746, term29746.getClass(), "compiler", null);
        setField(term29746, term29746.getClass(), "validator", null);
        setField(term29746, term29746.getClass(), "reverseInterpreter", null);
        setField(term29746, term29746.getClass(), "typeRegistry", null);
        setField(term29746, term29746.getClass(), "topScope", null);
        setField(term29746, term29746.getClass(), "scopeCreator", null);
        setField(term29746, term29746.getClass(), "reportMissingOverride", null);
        setField(term29746, term29746.getClass(), "reportUnknownTypes", null);
        setBooleanField(term29746, term29746.getClass(), "reportMissingProperties", false);
        setField(term29746, term29746.getClass(), "inferJSDocInfo", null);
        setIntField(term29746, term29746.getClass(), "typedCount", 0);
        setIntField(term29746, term29746.getClass(), "nullCount", 0);
        setIntField(term29746, term29746.getClass(), "unknownCount", 0);
        setBooleanField(term29746, term29746.getClass(), "inExterns", false);
        setIntField(term29746, term29746.getClass(), "noTypeCheckSection", 0);
        term29747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29747, term29747.getClass(), "type", 83);
        setField(term29747, term29747.getClass(), "next", null);
        setField(term29747, term29747.getClass(), "first", null);
        setField(term29747, term29747.getClass(), "last", null);
        setField(term29747, term29747.getClass(), "propListHead", null);
        setIntField(term29747, term29747.getClass(), "sourcePosition", 0);
        setField(term29747, term29747.getClass(), "jsType", null);
        setField(term29747, term29747.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term29545;
        Object retValue = callMethod(klass, "visitName", argTypes, term29475, args);
        assertTrue(recursiveEquals(term29475, term29746));
        assertTrue(recursiveEquals(term29545, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


