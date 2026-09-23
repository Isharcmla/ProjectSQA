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

public class TypeCheck_visit_8595247841516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474145;
     Object term474237;
     Object term474254;
     Object term474255;

    public TypeCheck_visit_8595247841516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474145 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term474237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term474237, term474237.getClass(), "type", 117);
        term474254 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term474254, term474254.getClass(), "compiler", null);
        setField(term474254, term474254.getClass(), "validator", null);
        setField(term474254, term474254.getClass(), "reverseInterpreter", null);
        setField(term474254, term474254.getClass(), "typeRegistry", null);
        setField(term474254, term474254.getClass(), "topScope", null);
        setField(term474254, term474254.getClass(), "scopeCreator", null);
        setField(term474254, term474254.getClass(), "reportMissingOverride", null);
        setField(term474254, term474254.getClass(), "reportUnknownTypes", null);
        setBooleanField(term474254, term474254.getClass(), "reportMissingProperties", false);
        setField(term474254, term474254.getClass(), "inferJSDocInfo", null);
        setIntField(term474254, term474254.getClass(), "typedCount", 0);
        setIntField(term474254, term474254.getClass(), "nullCount", 0);
        setIntField(term474254, term474254.getClass(), "unknownCount", 0);
        setBooleanField(term474254, term474254.getClass(), "inExterns", false);
        setIntField(term474254, term474254.getClass(), "noTypeCheckSection", 0);
        term474255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term474255, term474255.getClass(), "number", 0.0);
        setIntField(term474255, term474255.getClass(), "type", 117);
        setField(term474255, term474255.getClass(), "next", null);
        setField(term474255, term474255.getClass(), "first", null);
        setField(term474255, term474255.getClass(), "last", null);
        setField(term474255, term474255.getClass(), "propListHead", null);
        setIntField(term474255, term474255.getClass(), "sourcePosition", 0);
        setField(term474255, term474255.getClass(), "jsType", null);
        setField(term474255, term474255.getClass(), "parent", null);
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
        args[1] = term474237;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term474145, args);
        assertTrue(recursiveEquals(term474145, term474254));
        assertTrue(recursiveEquals(term474237, null));
    }

};


