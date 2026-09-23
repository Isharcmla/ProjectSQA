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

public class TypeCheck_visit_859524784552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140498;
     Object term140568;
     Object term140847;
     Object term140848;

    public TypeCheck_visit_859524784552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140498 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term140568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140568, term140568.getClass(), "type", 49);
        term140847 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term140847, term140847.getClass(), "compiler", null);
        setField(term140847, term140847.getClass(), "validator", null);
        setField(term140847, term140847.getClass(), "reverseInterpreter", null);
        setField(term140847, term140847.getClass(), "typeRegistry", null);
        setField(term140847, term140847.getClass(), "topScope", null);
        setField(term140847, term140847.getClass(), "scopeCreator", null);
        setField(term140847, term140847.getClass(), "reportMissingOverride", null);
        setField(term140847, term140847.getClass(), "reportUnknownTypes", null);
        setBooleanField(term140847, term140847.getClass(), "reportMissingProperties", false);
        setField(term140847, term140847.getClass(), "inferJSDocInfo", null);
        setIntField(term140847, term140847.getClass(), "typedCount", 0);
        setIntField(term140847, term140847.getClass(), "nullCount", 0);
        setIntField(term140847, term140847.getClass(), "unknownCount", 0);
        setBooleanField(term140847, term140847.getClass(), "inExterns", false);
        setIntField(term140847, term140847.getClass(), "noTypeCheckSection", 0);
        term140848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140848, term140848.getClass(), "type", 49);
        setField(term140848, term140848.getClass(), "next", null);
        setField(term140848, term140848.getClass(), "first", null);
        setField(term140848, term140848.getClass(), "last", null);
        setField(term140848, term140848.getClass(), "propListHead", null);
        setIntField(term140848, term140848.getClass(), "sourcePosition", 0);
        setField(term140848, term140848.getClass(), "jsType", null);
        setField(term140848, term140848.getClass(), "parent", null);
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
        args[1] = term140568;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term140498, args);
        assertTrue(recursiveEquals(term140498, term140847));
        assertTrue(recursiveEquals(term140568, null));
    }

};


