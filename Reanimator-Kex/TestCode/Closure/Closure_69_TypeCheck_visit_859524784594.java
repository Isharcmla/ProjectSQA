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

public class TypeCheck_visit_859524784594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184643;
     Object term184713;
     Object term184783;
     Object term184806;
     Object term184807;
     Object term184808;

    public TypeCheck_visit_859524784594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184643 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term184713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184713, term184713.getClass(), "type", 38);
        term184783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184783, term184783.getClass(), "type", 120);
        term184806 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term184806, term184806.getClass(), "compiler", null);
        setField(term184806, term184806.getClass(), "validator", null);
        setField(term184806, term184806.getClass(), "reverseInterpreter", null);
        setField(term184806, term184806.getClass(), "typeRegistry", null);
        setField(term184806, term184806.getClass(), "topScope", null);
        setField(term184806, term184806.getClass(), "scopeCreator", null);
        setField(term184806, term184806.getClass(), "reportMissingOverride", null);
        setField(term184806, term184806.getClass(), "reportUnknownTypes", null);
        setBooleanField(term184806, term184806.getClass(), "reportMissingProperties", false);
        setField(term184806, term184806.getClass(), "inferJSDocInfo", null);
        setIntField(term184806, term184806.getClass(), "typedCount", 0);
        setIntField(term184806, term184806.getClass(), "nullCount", 0);
        setIntField(term184806, term184806.getClass(), "unknownCount", 0);
        setBooleanField(term184806, term184806.getClass(), "inExterns", false);
        setIntField(term184806, term184806.getClass(), "noTypeCheckSection", 0);
        term184807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184807, term184807.getClass(), "type", 38);
        setField(term184807, term184807.getClass(), "next", null);
        setField(term184807, term184807.getClass(), "first", null);
        setField(term184807, term184807.getClass(), "last", null);
        setField(term184807, term184807.getClass(), "propListHead", null);
        setIntField(term184807, term184807.getClass(), "sourcePosition", 0);
        setField(term184807, term184807.getClass(), "jsType", null);
        setField(term184807, term184807.getClass(), "parent", null);
        term184808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184808, term184808.getClass(), "type", 120);
        setField(term184808, term184808.getClass(), "next", null);
        setField(term184808, term184808.getClass(), "first", null);
        setField(term184808, term184808.getClass(), "last", null);
        setField(term184808, term184808.getClass(), "propListHead", null);
        setIntField(term184808, term184808.getClass(), "sourcePosition", 0);
        setField(term184808, term184808.getClass(), "jsType", null);
        setField(term184808, term184808.getClass(), "parent", null);
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
        args[1] = term184713;
        args[2] = term184783;
        callMethod(klass, "visit", argTypes, term184643, args);
        assertTrue(recursiveEquals(term184643, term184806));
        assertTrue(recursiveEquals(term184713, term184808));
        assertTrue(recursiveEquals(term184783, null));
    }

};


