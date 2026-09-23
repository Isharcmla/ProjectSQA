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

public class TypeCheck_visit_859524784295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72147;
     Object term72217;
     Object term74063;
     Object term74064;

    public TypeCheck_visit_859524784295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term72217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72217, term72217.getClass(), "type", 77);
        term74063 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term74063, term74063.getClass(), "compiler", null);
        setField(term74063, term74063.getClass(), "validator", null);
        setField(term74063, term74063.getClass(), "reverseInterpreter", null);
        setField(term74063, term74063.getClass(), "typeRegistry", null);
        setField(term74063, term74063.getClass(), "topScope", null);
        setField(term74063, term74063.getClass(), "scopeCreator", null);
        setField(term74063, term74063.getClass(), "reportMissingOverride", null);
        setField(term74063, term74063.getClass(), "reportUnknownTypes", null);
        setBooleanField(term74063, term74063.getClass(), "reportMissingProperties", false);
        setField(term74063, term74063.getClass(), "inferJSDocInfo", null);
        setIntField(term74063, term74063.getClass(), "typedCount", 0);
        setIntField(term74063, term74063.getClass(), "nullCount", 0);
        setIntField(term74063, term74063.getClass(), "unknownCount", 0);
        setBooleanField(term74063, term74063.getClass(), "inExterns", false);
        setIntField(term74063, term74063.getClass(), "noTypeCheckSection", 0);
        term74064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74064, term74064.getClass(), "type", 77);
        setField(term74064, term74064.getClass(), "next", null);
        setField(term74064, term74064.getClass(), "first", null);
        setField(term74064, term74064.getClass(), "last", null);
        setField(term74064, term74064.getClass(), "propListHead", null);
        setIntField(term74064, term74064.getClass(), "sourcePosition", 0);
        setField(term74064, term74064.getClass(), "jsType", null);
        setField(term74064, term74064.getClass(), "parent", null);
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
        args[1] = term72217;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term72147, args);
        assertTrue(recursiveEquals(term72147, term74063));
        assertTrue(recursiveEquals(term72217, null));
    }

};


