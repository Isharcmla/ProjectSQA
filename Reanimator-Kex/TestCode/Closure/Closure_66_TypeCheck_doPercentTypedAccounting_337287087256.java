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
import java.lang.Object;

public class TypeCheck_doPercentTypedAccounting_337287087256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67995;
     Object term68065;
     Object term68210;
     Object term68211;

    public TypeCheck_doPercentTypedAccounting_337287087256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67995 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term68065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68177 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term68065, term68065.getClass(), "jsType", term68177);
        term68210 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term68210, term68210.getClass(), "compiler", null);
        setField(term68210, term68210.getClass(), "validator", null);
        setField(term68210, term68210.getClass(), "reverseInterpreter", null);
        setField(term68210, term68210.getClass(), "typeRegistry", null);
        setField(term68210, term68210.getClass(), "topScope", null);
        setField(term68210, term68210.getClass(), "scopeCreator", null);
        setField(term68210, term68210.getClass(), "reportMissingOverride", null);
        setField(term68210, term68210.getClass(), "reportUnknownTypes", null);
        setBooleanField(term68210, term68210.getClass(), "reportMissingProperties", false);
        setField(term68210, term68210.getClass(), "inferJSDocInfo", null);
        setIntField(term68210, term68210.getClass(), "typedCount", 1);
        setIntField(term68210, term68210.getClass(), "nullCount", 0);
        setIntField(term68210, term68210.getClass(), "unknownCount", 0);
        setBooleanField(term68210, term68210.getClass(), "inExterns", false);
        setIntField(term68210, term68210.getClass(), "noTypeCheckSection", 0);
        term68211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68212 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term68211, term68211.getClass(), "type", 0);
        setField(term68211, term68211.getClass(), "next", null);
        setField(term68211, term68211.getClass(), "first", null);
        setField(term68211, term68211.getClass(), "last", null);
        setField(term68211, term68211.getClass(), "propListHead", null);
        setIntField(term68211, term68211.getClass(), "sourcePosition", 0);
        setField(term68212, term68212.getClass(), "constructor", null);
        setField(term68212, term68212.getClass(), "className", null);
        setField(term68212, term68212.getClass(), "properties", null);
        setBooleanField(term68212, term68212.getClass(), "nativeType", false);
        setField(term68212, term68212.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term68212, term68212.getClass(), "prettyPrint", false);
        setBooleanField(term68212, term68212.getClass(), "visited", false);
        setField(term68212, term68212.getClass(), "docInfo", null);
        setBooleanField(term68212, term68212.getClass(), "unknown", false);
        setBooleanField(term68212, term68212.getClass(), "resolved", false);
        setField(term68212, term68212.getClass(), "resolveResult", null);
        setField(term68212, term68212.getClass(), "registry", null);
        setField(term68211, term68211.getClass(), "jsType", term68212);
        setField(term68211, term68211.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term68065;
        callMethod(klass, "doPercentTypedAccounting", argTypes, term67995, args);
        assertTrue(recursiveEquals(term67995, term68210));
        assertTrue(recursiveEquals(term68065, null));
    }

};


