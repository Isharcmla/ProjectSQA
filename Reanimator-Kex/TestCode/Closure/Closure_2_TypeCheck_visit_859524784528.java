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

public class TypeCheck_visit_859524784528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138760;
     Object term138830;
     Object term139108;
     Object term139109;

    public TypeCheck_visit_859524784528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138760 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term138830 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138830, term138830.getClass(), "type", 108);
        term139108 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term139108, term139108.getClass(), "compiler", null);
        setField(term139108, term139108.getClass(), "validator", null);
        setField(term139108, term139108.getClass(), "reverseInterpreter", null);
        setField(term139108, term139108.getClass(), "typeRegistry", null);
        setField(term139108, term139108.getClass(), "topScope", null);
        setField(term139108, term139108.getClass(), "scopeCreator", null);
        setField(term139108, term139108.getClass(), "reportMissingOverride", null);
        setField(term139108, term139108.getClass(), "reportUnknownTypes", null);
        setBooleanField(term139108, term139108.getClass(), "reportMissingProperties", false);
        setField(term139108, term139108.getClass(), "inferJSDocInfo", null);
        setIntField(term139108, term139108.getClass(), "typedCount", 0);
        setIntField(term139108, term139108.getClass(), "nullCount", 0);
        setIntField(term139108, term139108.getClass(), "unknownCount", 0);
        setBooleanField(term139108, term139108.getClass(), "inExterns", false);
        setIntField(term139108, term139108.getClass(), "noTypeCheckSection", 0);
        term139109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term139109, term139109.getClass(), "type", 108);
        setField(term139109, term139109.getClass(), "next", null);
        setField(term139109, term139109.getClass(), "first", null);
        setField(term139109, term139109.getClass(), "last", null);
        setField(term139109, term139109.getClass(), "propListHead", null);
        setIntField(term139109, term139109.getClass(), "sourcePosition", 0);
        setField(term139109, term139109.getClass(), "jsType", null);
        setField(term139109, term139109.getClass(), "parent", null);
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
        args[1] = term138830;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term138760, args);
        assertTrue(recursiveEquals(term138760, term139108));
        assertTrue(recursiveEquals(term138830, null));
    }

};


