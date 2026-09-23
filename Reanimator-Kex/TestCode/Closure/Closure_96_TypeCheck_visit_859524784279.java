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

public class TypeCheck_visit_859524784279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122393;
     Object term122463;
     Object term123073;
     Object term123074;

    public TypeCheck_visit_859524784279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122393 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term122463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term122463, term122463.getClass(), "type", 130);
        term123073 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term123073, term123073.getClass(), "compiler", null);
        setField(term123073, term123073.getClass(), "validator", null);
        setField(term123073, term123073.getClass(), "reverseInterpreter", null);
        setField(term123073, term123073.getClass(), "typeRegistry", null);
        setField(term123073, term123073.getClass(), "topScope", null);
        setField(term123073, term123073.getClass(), "scopeCreator", null);
        setField(term123073, term123073.getClass(), "reportMissingOverride", null);
        setField(term123073, term123073.getClass(), "reportUnknownTypes", null);
        setBooleanField(term123073, term123073.getClass(), "reportMissingProperties", false);
        setField(term123073, term123073.getClass(), "inferJSDocInfo", null);
        setIntField(term123073, term123073.getClass(), "typedCount", 0);
        setIntField(term123073, term123073.getClass(), "nullCount", 0);
        setIntField(term123073, term123073.getClass(), "unknownCount", 0);
        setBooleanField(term123073, term123073.getClass(), "inExterns", false);
        setIntField(term123073, term123073.getClass(), "noTypeCheckSection", 0);
        term123074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term123074, term123074.getClass(), "type", 130);
        setField(term123074, term123074.getClass(), "next", null);
        setField(term123074, term123074.getClass(), "first", null);
        setField(term123074, term123074.getClass(), "last", null);
        setField(term123074, term123074.getClass(), "propListHead", null);
        setIntField(term123074, term123074.getClass(), "sourcePosition", 0);
        setField(term123074, term123074.getClass(), "jsType", null);
        setField(term123074, term123074.getClass(), "parent", null);
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
        args[1] = term122463;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term122393, args);
        assertTrue(recursiveEquals(term122393, term123073));
        assertTrue(recursiveEquals(term122463, null));
    }

};


