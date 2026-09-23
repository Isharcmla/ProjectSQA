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

public class TypeCheck_visit_859524784482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146660;
     Object term146730;
     Object term146746;
     Object term146747;

    public TypeCheck_visit_859524784482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146660 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term146730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146730, term146730.getClass(), "type", 117);
        term146746 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term146746, term146746.getClass(), "compiler", null);
        setField(term146746, term146746.getClass(), "validator", null);
        setField(term146746, term146746.getClass(), "reverseInterpreter", null);
        setField(term146746, term146746.getClass(), "typeRegistry", null);
        setField(term146746, term146746.getClass(), "topScope", null);
        setField(term146746, term146746.getClass(), "scopeCreator", null);
        setField(term146746, term146746.getClass(), "reportMissingOverride", null);
        setField(term146746, term146746.getClass(), "reportUnknownTypes", null);
        setBooleanField(term146746, term146746.getClass(), "reportMissingProperties", false);
        setField(term146746, term146746.getClass(), "inferJSDocInfo", null);
        setIntField(term146746, term146746.getClass(), "typedCount", 0);
        setIntField(term146746, term146746.getClass(), "nullCount", 0);
        setIntField(term146746, term146746.getClass(), "unknownCount", 0);
        setBooleanField(term146746, term146746.getClass(), "inExterns", false);
        setIntField(term146746, term146746.getClass(), "noTypeCheckSection", 0);
        term146747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term146747, term146747.getClass(), "type", 117);
        setField(term146747, term146747.getClass(), "next", null);
        setField(term146747, term146747.getClass(), "first", null);
        setField(term146747, term146747.getClass(), "last", null);
        setField(term146747, term146747.getClass(), "propListHead", null);
        setIntField(term146747, term146747.getClass(), "sourcePosition", 0);
        setField(term146747, term146747.getClass(), "jsType", null);
        setField(term146747, term146747.getClass(), "parent", null);
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
        args[1] = term146730;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term146660, args);
        assertTrue(recursiveEquals(term146660, term146746));
        assertTrue(recursiveEquals(term146730, null));
    }

};


