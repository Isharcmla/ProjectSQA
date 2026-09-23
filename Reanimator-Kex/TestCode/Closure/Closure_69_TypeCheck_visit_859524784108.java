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

public class TypeCheck_visit_859524784108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30936;
     Object term31006;
     Object term31464;
     Object term31465;

    public TypeCheck_visit_859524784108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30936 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term31006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31006, term31006.getClass(), "type", 108);
        term31464 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term31464, term31464.getClass(), "compiler", null);
        setField(term31464, term31464.getClass(), "validator", null);
        setField(term31464, term31464.getClass(), "reverseInterpreter", null);
        setField(term31464, term31464.getClass(), "typeRegistry", null);
        setField(term31464, term31464.getClass(), "topScope", null);
        setField(term31464, term31464.getClass(), "scopeCreator", null);
        setField(term31464, term31464.getClass(), "reportMissingOverride", null);
        setField(term31464, term31464.getClass(), "reportUnknownTypes", null);
        setBooleanField(term31464, term31464.getClass(), "reportMissingProperties", false);
        setField(term31464, term31464.getClass(), "inferJSDocInfo", null);
        setIntField(term31464, term31464.getClass(), "typedCount", 0);
        setIntField(term31464, term31464.getClass(), "nullCount", 0);
        setIntField(term31464, term31464.getClass(), "unknownCount", 0);
        setBooleanField(term31464, term31464.getClass(), "inExterns", false);
        setIntField(term31464, term31464.getClass(), "noTypeCheckSection", 0);
        term31465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31465, term31465.getClass(), "type", 108);
        setField(term31465, term31465.getClass(), "next", null);
        setField(term31465, term31465.getClass(), "first", null);
        setField(term31465, term31465.getClass(), "last", null);
        setField(term31465, term31465.getClass(), "propListHead", null);
        setIntField(term31465, term31465.getClass(), "sourcePosition", 0);
        setField(term31465, term31465.getClass(), "jsType", null);
        setField(term31465, term31465.getClass(), "parent", null);
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
        args[1] = term31006;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term30936, args);
        assertTrue(recursiveEquals(term30936, term31464));
        assertTrue(recursiveEquals(term31006, null));
    }

};


