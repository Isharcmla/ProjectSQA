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

public class TypeCheck_visit_859524784432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105184;
     Object term105254;
     Object term105270;
     Object term105271;

    public TypeCheck_visit_859524784432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105184 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term105254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105254, term105254.getClass(), "type", 83);
        term105270 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term105270, term105270.getClass(), "compiler", null);
        setField(term105270, term105270.getClass(), "validator", null);
        setField(term105270, term105270.getClass(), "reverseInterpreter", null);
        setField(term105270, term105270.getClass(), "typeRegistry", null);
        setField(term105270, term105270.getClass(), "topScope", null);
        setField(term105270, term105270.getClass(), "scopeCreator", null);
        setField(term105270, term105270.getClass(), "reportMissingOverride", null);
        setField(term105270, term105270.getClass(), "reportUnknownTypes", null);
        setBooleanField(term105270, term105270.getClass(), "reportMissingProperties", false);
        setField(term105270, term105270.getClass(), "inferJSDocInfo", null);
        setIntField(term105270, term105270.getClass(), "typedCount", 0);
        setIntField(term105270, term105270.getClass(), "nullCount", 0);
        setIntField(term105270, term105270.getClass(), "unknownCount", 0);
        setBooleanField(term105270, term105270.getClass(), "inExterns", false);
        setIntField(term105270, term105270.getClass(), "noTypeCheckSection", 0);
        term105271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term105271, term105271.getClass(), "type", 83);
        setField(term105271, term105271.getClass(), "next", null);
        setField(term105271, term105271.getClass(), "first", null);
        setField(term105271, term105271.getClass(), "last", null);
        setField(term105271, term105271.getClass(), "propListHead", null);
        setIntField(term105271, term105271.getClass(), "sourcePosition", 0);
        setField(term105271, term105271.getClass(), "jsType", null);
        setField(term105271, term105271.getClass(), "parent", null);
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
        args[1] = term105254;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term105184, args);
        assertTrue(recursiveEquals(term105184, term105270));
        assertTrue(recursiveEquals(term105254, null));
    }

};


