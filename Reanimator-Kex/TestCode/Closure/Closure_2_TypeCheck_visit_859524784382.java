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

public class TypeCheck_visit_859524784382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91438;
     Object term91508;
     Object term91526;
     Object term91527;

    public TypeCheck_visit_859524784382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91438 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term91508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91508, term91508.getClass(), "type", 148);
        term91526 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term91526, term91526.getClass(), "compiler", null);
        setField(term91526, term91526.getClass(), "validator", null);
        setField(term91526, term91526.getClass(), "reverseInterpreter", null);
        setField(term91526, term91526.getClass(), "typeRegistry", null);
        setField(term91526, term91526.getClass(), "topScope", null);
        setField(term91526, term91526.getClass(), "scopeCreator", null);
        setField(term91526, term91526.getClass(), "reportMissingOverride", null);
        setField(term91526, term91526.getClass(), "reportUnknownTypes", null);
        setBooleanField(term91526, term91526.getClass(), "reportMissingProperties", false);
        setField(term91526, term91526.getClass(), "inferJSDocInfo", null);
        setIntField(term91526, term91526.getClass(), "typedCount", 0);
        setIntField(term91526, term91526.getClass(), "nullCount", 1);
        setIntField(term91526, term91526.getClass(), "unknownCount", 0);
        setBooleanField(term91526, term91526.getClass(), "inExterns", false);
        setIntField(term91526, term91526.getClass(), "noTypeCheckSection", 0);
        term91527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91527, term91527.getClass(), "type", 148);
        setField(term91527, term91527.getClass(), "next", null);
        setField(term91527, term91527.getClass(), "first", null);
        setField(term91527, term91527.getClass(), "last", null);
        setField(term91527, term91527.getClass(), "propListHead", null);
        setIntField(term91527, term91527.getClass(), "sourcePosition", 0);
        setField(term91527, term91527.getClass(), "jsType", null);
        setField(term91527, term91527.getClass(), "parent", null);
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
        args[1] = term91508;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term91438, args);
        assertTrue(recursiveEquals(term91438, term91526));
        assertTrue(recursiveEquals(term91508, null));
    }

};


