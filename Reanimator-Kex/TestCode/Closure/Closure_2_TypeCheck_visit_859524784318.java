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

public class TypeCheck_visit_859524784318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78491;
     Object term78561;
     Object term78832;
     Object term78833;

    public TypeCheck_visit_859524784318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78491 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term78561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78561, term78561.getClass(), "type", 120);
        term78832 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term78832, term78832.getClass(), "compiler", null);
        setField(term78832, term78832.getClass(), "validator", null);
        setField(term78832, term78832.getClass(), "reverseInterpreter", null);
        setField(term78832, term78832.getClass(), "typeRegistry", null);
        setField(term78832, term78832.getClass(), "topScope", null);
        setField(term78832, term78832.getClass(), "scopeCreator", null);
        setField(term78832, term78832.getClass(), "reportMissingOverride", null);
        setField(term78832, term78832.getClass(), "reportUnknownTypes", null);
        setBooleanField(term78832, term78832.getClass(), "reportMissingProperties", false);
        setField(term78832, term78832.getClass(), "inferJSDocInfo", null);
        setIntField(term78832, term78832.getClass(), "typedCount", 0);
        setIntField(term78832, term78832.getClass(), "nullCount", 0);
        setIntField(term78832, term78832.getClass(), "unknownCount", 0);
        setBooleanField(term78832, term78832.getClass(), "inExterns", false);
        setIntField(term78832, term78832.getClass(), "noTypeCheckSection", 0);
        term78833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term78833, term78833.getClass(), "type", 120);
        setField(term78833, term78833.getClass(), "next", null);
        setField(term78833, term78833.getClass(), "first", null);
        setField(term78833, term78833.getClass(), "last", null);
        setField(term78833, term78833.getClass(), "propListHead", null);
        setIntField(term78833, term78833.getClass(), "sourcePosition", 0);
        setField(term78833, term78833.getClass(), "jsType", null);
        setField(term78833, term78833.getClass(), "parent", null);
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
        args[1] = term78561;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term78491, args);
        assertTrue(recursiveEquals(term78491, term78832));
        assertTrue(recursiveEquals(term78561, null));
    }

};


