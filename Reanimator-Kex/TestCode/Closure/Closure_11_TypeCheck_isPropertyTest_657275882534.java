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

public class TypeCheck_isPropertyTest_657275882534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135695;
     Object term135765;
     Object term135789;
     Object term135790;

    public TypeCheck_isPropertyTest_657275882534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135695 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term135765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term135765, term135765.getClass(), "parent", term135765);
        setIntField(term135765, term135765.getClass(), "type", 114);
        setField(term135765, term135765.getClass(), "last", term135765);
        term135789 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term135789, term135789.getClass(), "compiler", null);
        setField(term135789, term135789.getClass(), "validator", null);
        setField(term135789, term135789.getClass(), "reverseInterpreter", null);
        setField(term135789, term135789.getClass(), "typeRegistry", null);
        setField(term135789, term135789.getClass(), "topScope", null);
        setField(term135789, term135789.getClass(), "scopeCreator", null);
        setField(term135789, term135789.getClass(), "reportMissingOverride", null);
        setField(term135789, term135789.getClass(), "reportUnknownTypes", null);
        setBooleanField(term135789, term135789.getClass(), "reportMissingProperties", false);
        setField(term135789, term135789.getClass(), "inferJSDocInfo", null);
        setIntField(term135789, term135789.getClass(), "typedCount", 0);
        setIntField(term135789, term135789.getClass(), "nullCount", 0);
        setIntField(term135789, term135789.getClass(), "unknownCount", 0);
        setBooleanField(term135789, term135789.getClass(), "inExterns", false);
        setIntField(term135789, term135789.getClass(), "noTypeCheckSection", 0);
        term135790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term135790, term135790.getClass(), "type", 114);
        setField(term135790, term135790.getClass(), "next", null);
        setField(term135790, term135790.getClass(), "first", null);
        setField(term135790, term135790.getClass(), "last", term135790);
        setField(term135790, term135790.getClass(), "propListHead", null);
        setIntField(term135790, term135790.getClass(), "sourcePosition", 0);
        setField(term135790, term135790.getClass(), "jsType", null);
        setField(term135790, term135790.getClass(), "parent", term135790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term135765;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term135695, args);
        assertTrue(recursiveEquals(term135695, term135789));
        assertTrue(recursiveEquals(term135765, term135790));
        assertTrue(recursiveEquals(retValue, true));
    }

};


