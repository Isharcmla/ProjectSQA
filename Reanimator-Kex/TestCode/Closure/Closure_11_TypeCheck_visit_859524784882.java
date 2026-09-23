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

public class TypeCheck_visit_859524784882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229220;
     Object term229290;
     Object term229360;
     Object term229669;
     Object term229670;
     Object term229671;

    public TypeCheck_visit_859524784882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229220 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term229290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term229290, term229290.getClass(), "type", 38);
        term229360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term229360, term229360.getClass(), "type", 105);
        term229669 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term229669, term229669.getClass(), "compiler", null);
        setField(term229669, term229669.getClass(), "validator", null);
        setField(term229669, term229669.getClass(), "reverseInterpreter", null);
        setField(term229669, term229669.getClass(), "typeRegistry", null);
        setField(term229669, term229669.getClass(), "topScope", null);
        setField(term229669, term229669.getClass(), "scopeCreator", null);
        setField(term229669, term229669.getClass(), "reportMissingOverride", null);
        setField(term229669, term229669.getClass(), "reportUnknownTypes", null);
        setBooleanField(term229669, term229669.getClass(), "reportMissingProperties", false);
        setField(term229669, term229669.getClass(), "inferJSDocInfo", null);
        setIntField(term229669, term229669.getClass(), "typedCount", 0);
        setIntField(term229669, term229669.getClass(), "nullCount", 0);
        setIntField(term229669, term229669.getClass(), "unknownCount", 0);
        setBooleanField(term229669, term229669.getClass(), "inExterns", false);
        setIntField(term229669, term229669.getClass(), "noTypeCheckSection", 0);
        term229670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term229670, term229670.getClass(), "type", 38);
        setField(term229670, term229670.getClass(), "next", null);
        setField(term229670, term229670.getClass(), "first", null);
        setField(term229670, term229670.getClass(), "last", null);
        setField(term229670, term229670.getClass(), "propListHead", null);
        setIntField(term229670, term229670.getClass(), "sourcePosition", 0);
        setField(term229670, term229670.getClass(), "jsType", null);
        setField(term229670, term229670.getClass(), "parent", null);
        term229671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term229671, term229671.getClass(), "type", 105);
        setField(term229671, term229671.getClass(), "next", null);
        setField(term229671, term229671.getClass(), "first", null);
        setField(term229671, term229671.getClass(), "last", null);
        setField(term229671, term229671.getClass(), "propListHead", null);
        setIntField(term229671, term229671.getClass(), "sourcePosition", 0);
        setField(term229671, term229671.getClass(), "jsType", null);
        setField(term229671, term229671.getClass(), "parent", null);
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
        args[1] = term229290;
        args[2] = term229360;
        callMethod(klass, "visit", argTypes, term229220, args);
        assertTrue(recursiveEquals(term229220, term229669));
        assertTrue(recursiveEquals(term229290, term229671));
        assertTrue(recursiveEquals(term229360, null));
    }

};


