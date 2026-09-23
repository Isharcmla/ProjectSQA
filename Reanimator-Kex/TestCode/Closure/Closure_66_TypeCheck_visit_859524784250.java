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

public class TypeCheck_visit_859524784250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66491;
     Object term66561;
     Object term66600;
     Object term66601;

    public TypeCheck_visit_859524784250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66491 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term66561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66561, term66561.getClass(), "type", 115);
        term66600 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term66600, term66600.getClass(), "compiler", null);
        setField(term66600, term66600.getClass(), "validator", null);
        setField(term66600, term66600.getClass(), "reverseInterpreter", null);
        setField(term66600, term66600.getClass(), "typeRegistry", null);
        setField(term66600, term66600.getClass(), "topScope", null);
        setField(term66600, term66600.getClass(), "scopeCreator", null);
        setField(term66600, term66600.getClass(), "reportMissingOverride", null);
        setField(term66600, term66600.getClass(), "reportUnknownTypes", null);
        setBooleanField(term66600, term66600.getClass(), "reportMissingProperties", false);
        setField(term66600, term66600.getClass(), "inferJSDocInfo", null);
        setIntField(term66600, term66600.getClass(), "typedCount", 0);
        setIntField(term66600, term66600.getClass(), "nullCount", 0);
        setIntField(term66600, term66600.getClass(), "unknownCount", 0);
        setBooleanField(term66600, term66600.getClass(), "inExterns", false);
        setIntField(term66600, term66600.getClass(), "noTypeCheckSection", 0);
        term66601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term66601, term66601.getClass(), "type", 115);
        setField(term66601, term66601.getClass(), "next", null);
        setField(term66601, term66601.getClass(), "first", null);
        setField(term66601, term66601.getClass(), "last", null);
        setField(term66601, term66601.getClass(), "propListHead", null);
        setIntField(term66601, term66601.getClass(), "sourcePosition", 0);
        setField(term66601, term66601.getClass(), "jsType", null);
        setField(term66601, term66601.getClass(), "parent", null);
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
        args[1] = term66561;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term66491, args);
        assertTrue(recursiveEquals(term66491, term66600));
        assertTrue(recursiveEquals(term66561, null));
    }

};


