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

public class TypeCheck_isPropertyTest_6572758821292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389555;
     Object term389625;
     Object term389645;
     Object term389646;

    public TypeCheck_isPropertyTest_6572758821292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389555 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term389625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term389625, term389625.getClass(), "parent", term389625);
        setIntField(term389625, term389625.getClass(), "type", 98);
        term389645 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term389645, term389645.getClass(), "compiler", null);
        setField(term389645, term389645.getClass(), "validator", null);
        setField(term389645, term389645.getClass(), "reverseInterpreter", null);
        setField(term389645, term389645.getClass(), "typeRegistry", null);
        setField(term389645, term389645.getClass(), "topScope", null);
        setField(term389645, term389645.getClass(), "scopeCreator", null);
        setField(term389645, term389645.getClass(), "reportMissingOverride", null);
        setField(term389645, term389645.getClass(), "reportUnknownTypes", null);
        setBooleanField(term389645, term389645.getClass(), "reportMissingProperties", false);
        setField(term389645, term389645.getClass(), "inferJSDocInfo", null);
        setIntField(term389645, term389645.getClass(), "typedCount", 0);
        setIntField(term389645, term389645.getClass(), "nullCount", 0);
        setIntField(term389645, term389645.getClass(), "unknownCount", 0);
        setBooleanField(term389645, term389645.getClass(), "inExterns", false);
        setIntField(term389645, term389645.getClass(), "noTypeCheckSection", 0);
        term389646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term389646, term389646.getClass(), "type", 98);
        setField(term389646, term389646.getClass(), "next", null);
        setField(term389646, term389646.getClass(), "first", null);
        setField(term389646, term389646.getClass(), "last", null);
        setField(term389646, term389646.getClass(), "propListHead", null);
        setIntField(term389646, term389646.getClass(), "sourcePosition", 0);
        setField(term389646, term389646.getClass(), "jsType", null);
        setField(term389646, term389646.getClass(), "parent", term389646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term389625;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term389555, args);
        assertTrue(recursiveEquals(term389555, term389645));
        assertTrue(recursiveEquals(term389625, term389646));
        assertTrue(recursiveEquals(retValue, false));
    }

};


