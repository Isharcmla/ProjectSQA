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

public class TypeCheck_visit_859524784590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159561;
     Object term159631;
     Object term159650;
     Object term159651;

    public TypeCheck_visit_859524784590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159561 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term159631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term159631, term159631.getClass(), "type", 147);
        term159650 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term159650, term159650.getClass(), "compiler", null);
        setField(term159650, term159650.getClass(), "validator", null);
        setField(term159650, term159650.getClass(), "reverseInterpreter", null);
        setField(term159650, term159650.getClass(), "typeRegistry", null);
        setField(term159650, term159650.getClass(), "topScope", null);
        setField(term159650, term159650.getClass(), "scopeCreator", null);
        setField(term159650, term159650.getClass(), "reportMissingOverride", null);
        setBooleanField(term159650, term159650.getClass(), "reportUnknownTypes", false);
        setBooleanField(term159650, term159650.getClass(), "reportMissingProperties", false);
        setField(term159650, term159650.getClass(), "inferJSDocInfo", null);
        setIntField(term159650, term159650.getClass(), "typedCount", 0);
        setIntField(term159650, term159650.getClass(), "nullCount", 1);
        setIntField(term159650, term159650.getClass(), "unknownCount", 0);
        setBooleanField(term159650, term159650.getClass(), "inExterns", false);
        setIntField(term159650, term159650.getClass(), "noTypeCheckSection", 0);
        setField(term159650, term159650.getClass(), "editDistance", null);
        term159651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term159651, term159651.getClass(), "type", 147);
        setField(term159651, term159651.getClass(), "next", null);
        setField(term159651, term159651.getClass(), "first", null);
        setField(term159651, term159651.getClass(), "last", null);
        setField(term159651, term159651.getClass(), "propListHead", null);
        setIntField(term159651, term159651.getClass(), "sourcePosition", 0);
        setField(term159651, term159651.getClass(), "jsType", null);
        setField(term159651, term159651.getClass(), "parent", null);
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
        args[1] = term159631;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term159561, args);
        assertTrue(recursiveEquals(term159561, term159650));
        assertTrue(recursiveEquals(term159631, null));
    }

};


