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

public class TypeCheck_visit_859524784190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91783;
     Object term91853;
     Object term91876;
     Object term91877;

    public TypeCheck_visit_859524784190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91783 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term91853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91853, term91853.getClass(), "type", 77);
        term91876 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term91876, term91876.getClass(), "compiler", null);
        setField(term91876, term91876.getClass(), "validator", null);
        setField(term91876, term91876.getClass(), "reverseInterpreter", null);
        setField(term91876, term91876.getClass(), "typeRegistry", null);
        setField(term91876, term91876.getClass(), "topScope", null);
        setField(term91876, term91876.getClass(), "scopeCreator", null);
        setField(term91876, term91876.getClass(), "reportMissingOverride", null);
        setField(term91876, term91876.getClass(), "reportUnknownTypes", null);
        setBooleanField(term91876, term91876.getClass(), "reportMissingProperties", false);
        setField(term91876, term91876.getClass(), "inferJSDocInfo", null);
        setIntField(term91876, term91876.getClass(), "typedCount", 0);
        setIntField(term91876, term91876.getClass(), "nullCount", 0);
        setIntField(term91876, term91876.getClass(), "unknownCount", 0);
        setBooleanField(term91876, term91876.getClass(), "inExterns", false);
        setIntField(term91876, term91876.getClass(), "noTypeCheckSection", 0);
        term91877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term91877, term91877.getClass(), "type", 77);
        setField(term91877, term91877.getClass(), "next", null);
        setField(term91877, term91877.getClass(), "first", null);
        setField(term91877, term91877.getClass(), "last", null);
        setField(term91877, term91877.getClass(), "propListHead", null);
        setIntField(term91877, term91877.getClass(), "sourcePosition", 0);
        setField(term91877, term91877.getClass(), "jsType", null);
        setField(term91877, term91877.getClass(), "parent", null);
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
        args[1] = term91853;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term91783, args);
        assertTrue(recursiveEquals(term91783, term91876));
        assertTrue(recursiveEquals(term91853, null));
    }

};


