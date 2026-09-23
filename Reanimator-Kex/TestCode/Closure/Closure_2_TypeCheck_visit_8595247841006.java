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

public class TypeCheck_visit_8595247841006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284809;
     Object term284901;
     Object term284917;
     Object term284918;

    public TypeCheck_visit_8595247841006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284809 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term284901 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term284901, term284901.getClass(), "type", 112);
        term284917 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term284917, term284917.getClass(), "compiler", null);
        setField(term284917, term284917.getClass(), "validator", null);
        setField(term284917, term284917.getClass(), "reverseInterpreter", null);
        setField(term284917, term284917.getClass(), "typeRegistry", null);
        setField(term284917, term284917.getClass(), "topScope", null);
        setField(term284917, term284917.getClass(), "scopeCreator", null);
        setField(term284917, term284917.getClass(), "reportMissingOverride", null);
        setField(term284917, term284917.getClass(), "reportUnknownTypes", null);
        setBooleanField(term284917, term284917.getClass(), "reportMissingProperties", false);
        setField(term284917, term284917.getClass(), "inferJSDocInfo", null);
        setIntField(term284917, term284917.getClass(), "typedCount", 0);
        setIntField(term284917, term284917.getClass(), "nullCount", 0);
        setIntField(term284917, term284917.getClass(), "unknownCount", 0);
        setBooleanField(term284917, term284917.getClass(), "inExterns", false);
        setIntField(term284917, term284917.getClass(), "noTypeCheckSection", 0);
        term284918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term284918, term284918.getClass(), "str", null);
        setIntField(term284918, term284918.getClass(), "type", 112);
        setField(term284918, term284918.getClass(), "next", null);
        setField(term284918, term284918.getClass(), "first", null);
        setField(term284918, term284918.getClass(), "last", null);
        setField(term284918, term284918.getClass(), "propListHead", null);
        setIntField(term284918, term284918.getClass(), "sourcePosition", 0);
        setField(term284918, term284918.getClass(), "jsType", null);
        setField(term284918, term284918.getClass(), "parent", null);
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
        args[1] = term284901;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term284809, args);
        assertTrue(recursiveEquals(term284809, term284917));
        assertTrue(recursiveEquals(term284901, null));
    }

};


