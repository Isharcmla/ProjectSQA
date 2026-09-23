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

public class TypeCheck_visit_859524784424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104917;
     Object term104987;
     Object term105006;
     Object term105007;

    public TypeCheck_visit_859524784424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104917 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term104987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term104987, term104987.getClass(), "type", 148);
        term105006 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term105006, term105006.getClass(), "compiler", null);
        setField(term105006, term105006.getClass(), "validator", null);
        setField(term105006, term105006.getClass(), "reverseInterpreter", null);
        setField(term105006, term105006.getClass(), "typeRegistry", null);
        setField(term105006, term105006.getClass(), "topScope", null);
        setField(term105006, term105006.getClass(), "scopeCreator", null);
        setField(term105006, term105006.getClass(), "reportMissingOverride", null);
        setBooleanField(term105006, term105006.getClass(), "reportUnknownTypes", false);
        setBooleanField(term105006, term105006.getClass(), "reportMissingProperties", false);
        setField(term105006, term105006.getClass(), "inferJSDocInfo", null);
        setIntField(term105006, term105006.getClass(), "typedCount", 0);
        setIntField(term105006, term105006.getClass(), "nullCount", 1);
        setIntField(term105006, term105006.getClass(), "unknownCount", 0);
        setBooleanField(term105006, term105006.getClass(), "inExterns", false);
        setIntField(term105006, term105006.getClass(), "noTypeCheckSection", 0);
        setField(term105006, term105006.getClass(), "editDistance", null);
        term105007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105007, term105007.getClass(), "type", 148);
        setField(term105007, term105007.getClass(), "next", null);
        setField(term105007, term105007.getClass(), "first", null);
        setField(term105007, term105007.getClass(), "last", null);
        setField(term105007, term105007.getClass(), "propListHead", null);
        setIntField(term105007, term105007.getClass(), "sourcePosition", 0);
        setField(term105007, term105007.getClass(), "jsType", null);
        setField(term105007, term105007.getClass(), "parent", null);
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
        args[1] = term104987;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term104917, args);
        assertTrue(recursiveEquals(term104917, term105006));
        assertTrue(recursiveEquals(term104987, null));
    }

};


