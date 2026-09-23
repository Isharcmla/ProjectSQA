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

public class TypeCheck_isPropertyTest_657275882111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26840;
     Object term26910;
     Object term27338;
     Object term27339;

    public TypeCheck_isPropertyTest_657275882111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26840 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term26910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26910, term26910.getClass(), "parent", term26910);
        term27338 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term27338, term27338.getClass(), "compiler", null);
        setField(term27338, term27338.getClass(), "validator", null);
        setField(term27338, term27338.getClass(), "reverseInterpreter", null);
        setField(term27338, term27338.getClass(), "typeRegistry", null);
        setField(term27338, term27338.getClass(), "topScope", null);
        setField(term27338, term27338.getClass(), "scopeCreator", null);
        setField(term27338, term27338.getClass(), "reportMissingOverride", null);
        setField(term27338, term27338.getClass(), "reportUnknownTypes", null);
        setBooleanField(term27338, term27338.getClass(), "reportMissingProperties", false);
        setField(term27338, term27338.getClass(), "inferJSDocInfo", null);
        setIntField(term27338, term27338.getClass(), "typedCount", 0);
        setIntField(term27338, term27338.getClass(), "nullCount", 0);
        setIntField(term27338, term27338.getClass(), "unknownCount", 0);
        setBooleanField(term27338, term27338.getClass(), "inExterns", false);
        setIntField(term27338, term27338.getClass(), "noTypeCheckSection", 0);
        term27339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27339, term27339.getClass(), "type", 0);
        setField(term27339, term27339.getClass(), "next", null);
        setField(term27339, term27339.getClass(), "first", null);
        setField(term27339, term27339.getClass(), "last", null);
        setField(term27339, term27339.getClass(), "propListHead", null);
        setIntField(term27339, term27339.getClass(), "sourcePosition", 0);
        setField(term27339, term27339.getClass(), "jsType", null);
        setField(term27339, term27339.getClass(), "parent", term27339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26910;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term26840, args);
        assertTrue(recursiveEquals(term26840, term27338));
        assertTrue(recursiveEquals(term26910, term27339));
        assertTrue(recursiveEquals(retValue, false));
    }

};


