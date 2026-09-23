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

public class TypeCheck_checkNoTypeCheckSection_1637574393237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58343;
     Object term58503;
     Object term58732;
     Object term58734;

    public TypeCheck_checkNoTypeCheckSection_1637574393237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58343 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term58433 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term58343, term58343.getClass(), "validator", term58433);
        setIntField(term58343, term58343.getClass(), "noTypeCheckSection", 0);
        term58503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58503, term58503.getClass(), "type", 105);
        setField(term58503, term58503.getClass(), "propListHead", null);
        term58732 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term58733 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term58732, term58732.getClass(), "compiler", null);
        setField(term58733, term58733.getClass(), "compiler", null);
        setField(term58733, term58733.getClass(), "typeRegistry", null);
        setField(term58733, term58733.getClass(), "allValueTypes", null);
        setBooleanField(term58733, term58733.getClass(), "shouldReport", true);
        setField(term58733, term58733.getClass(), "nullOrUndefined", null);
        setField(term58733, term58733.getClass(), "mismatches", null);
        setField(term58732, term58732.getClass(), "validator", term58733);
        setField(term58732, term58732.getClass(), "reverseInterpreter", null);
        setField(term58732, term58732.getClass(), "typeRegistry", null);
        setField(term58732, term58732.getClass(), "topScope", null);
        setField(term58732, term58732.getClass(), "scopeCreator", null);
        setField(term58732, term58732.getClass(), "reportMissingOverride", null);
        setField(term58732, term58732.getClass(), "reportUnknownTypes", null);
        setBooleanField(term58732, term58732.getClass(), "reportMissingProperties", false);
        setField(term58732, term58732.getClass(), "inferJSDocInfo", null);
        setIntField(term58732, term58732.getClass(), "typedCount", 0);
        setIntField(term58732, term58732.getClass(), "nullCount", 0);
        setIntField(term58732, term58732.getClass(), "unknownCount", 0);
        setBooleanField(term58732, term58732.getClass(), "inExterns", false);
        setIntField(term58732, term58732.getClass(), "noTypeCheckSection", 0);
        term58734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58734, term58734.getClass(), "type", 105);
        setField(term58734, term58734.getClass(), "next", null);
        setField(term58734, term58734.getClass(), "first", null);
        setField(term58734, term58734.getClass(), "last", null);
        setField(term58734, term58734.getClass(), "propListHead", null);
        setIntField(term58734, term58734.getClass(), "sourcePosition", 0);
        setField(term58734, term58734.getClass(), "jsType", null);
        setField(term58734, term58734.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term58503;
        args[1] = false;
        callMethod(klass, "checkNoTypeCheckSection", argTypes, term58343, args);
        assertTrue(recursiveEquals(term58343, term58732));
        assertTrue(recursiveEquals(term58503, term58734));
    }

};


