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

public class TypeCheck_visit_859524784788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202330;
     Object term202400;
     Object term202672;
     Object term202673;

    public TypeCheck_visit_859524784788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202330 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term202400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term202400, term202400.getClass(), "type", 113);
        term202672 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term202672, term202672.getClass(), "compiler", null);
        setField(term202672, term202672.getClass(), "validator", null);
        setField(term202672, term202672.getClass(), "reverseInterpreter", null);
        setField(term202672, term202672.getClass(), "typeRegistry", null);
        setField(term202672, term202672.getClass(), "topScope", null);
        setField(term202672, term202672.getClass(), "scopeCreator", null);
        setField(term202672, term202672.getClass(), "reportMissingOverride", null);
        setField(term202672, term202672.getClass(), "reportUnknownTypes", null);
        setBooleanField(term202672, term202672.getClass(), "reportMissingProperties", false);
        setField(term202672, term202672.getClass(), "inferJSDocInfo", null);
        setIntField(term202672, term202672.getClass(), "typedCount", 0);
        setIntField(term202672, term202672.getClass(), "nullCount", 0);
        setIntField(term202672, term202672.getClass(), "unknownCount", 0);
        setBooleanField(term202672, term202672.getClass(), "inExterns", false);
        setIntField(term202672, term202672.getClass(), "noTypeCheckSection", 0);
        term202673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term202673, term202673.getClass(), "type", 113);
        setField(term202673, term202673.getClass(), "next", null);
        setField(term202673, term202673.getClass(), "first", null);
        setField(term202673, term202673.getClass(), "last", null);
        setField(term202673, term202673.getClass(), "propListHead", null);
        setIntField(term202673, term202673.getClass(), "sourcePosition", 0);
        setField(term202673, term202673.getClass(), "jsType", null);
        setField(term202673, term202673.getClass(), "parent", null);
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
        args[1] = term202400;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term202330, args);
        assertTrue(recursiveEquals(term202330, term202672));
        assertTrue(recursiveEquals(term202400, null));
    }

};


