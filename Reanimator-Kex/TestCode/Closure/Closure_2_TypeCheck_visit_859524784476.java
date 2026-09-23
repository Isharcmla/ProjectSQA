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

public class TypeCheck_visit_859524784476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120941;
     Object term121011;
     Object term121571;
     Object term121572;

    public TypeCheck_visit_859524784476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120941 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term121011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121011, term121011.getClass(), "type", 126);
        term121571 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term121571, term121571.getClass(), "compiler", null);
        setField(term121571, term121571.getClass(), "validator", null);
        setField(term121571, term121571.getClass(), "reverseInterpreter", null);
        setField(term121571, term121571.getClass(), "typeRegistry", null);
        setField(term121571, term121571.getClass(), "topScope", null);
        setField(term121571, term121571.getClass(), "scopeCreator", null);
        setField(term121571, term121571.getClass(), "reportMissingOverride", null);
        setField(term121571, term121571.getClass(), "reportUnknownTypes", null);
        setBooleanField(term121571, term121571.getClass(), "reportMissingProperties", false);
        setField(term121571, term121571.getClass(), "inferJSDocInfo", null);
        setIntField(term121571, term121571.getClass(), "typedCount", 0);
        setIntField(term121571, term121571.getClass(), "nullCount", 0);
        setIntField(term121571, term121571.getClass(), "unknownCount", 0);
        setBooleanField(term121571, term121571.getClass(), "inExterns", false);
        setIntField(term121571, term121571.getClass(), "noTypeCheckSection", 0);
        term121572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term121572, term121572.getClass(), "type", 126);
        setField(term121572, term121572.getClass(), "next", null);
        setField(term121572, term121572.getClass(), "first", null);
        setField(term121572, term121572.getClass(), "last", null);
        setField(term121572, term121572.getClass(), "propListHead", null);
        setIntField(term121572, term121572.getClass(), "sourcePosition", 0);
        setField(term121572, term121572.getClass(), "jsType", null);
        setField(term121572, term121572.getClass(), "parent", null);
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
        args[1] = term121011;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term120941, args);
        assertTrue(recursiveEquals(term120941, term121571));
        assertTrue(recursiveEquals(term121011, null));
    }

};


