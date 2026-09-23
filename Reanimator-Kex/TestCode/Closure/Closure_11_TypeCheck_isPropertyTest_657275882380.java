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

public class TypeCheck_isPropertyTest_657275882380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92650;
     Object term92720;
     Object term93008;
     Object term93009;

    public TypeCheck_isPropertyTest_657275882380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92650 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term92720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term92720, term92720.getClass(), "parent", term92720);
        setIntField(term92720, term92720.getClass(), "type", 52);
        term93008 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term93008, term93008.getClass(), "compiler", null);
        setField(term93008, term93008.getClass(), "validator", null);
        setField(term93008, term93008.getClass(), "reverseInterpreter", null);
        setField(term93008, term93008.getClass(), "typeRegistry", null);
        setField(term93008, term93008.getClass(), "topScope", null);
        setField(term93008, term93008.getClass(), "scopeCreator", null);
        setField(term93008, term93008.getClass(), "reportMissingOverride", null);
        setField(term93008, term93008.getClass(), "reportUnknownTypes", null);
        setBooleanField(term93008, term93008.getClass(), "reportMissingProperties", false);
        setField(term93008, term93008.getClass(), "inferJSDocInfo", null);
        setIntField(term93008, term93008.getClass(), "typedCount", 0);
        setIntField(term93008, term93008.getClass(), "nullCount", 0);
        setIntField(term93008, term93008.getClass(), "unknownCount", 0);
        setBooleanField(term93008, term93008.getClass(), "inExterns", false);
        setIntField(term93008, term93008.getClass(), "noTypeCheckSection", 0);
        term93009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93009, term93009.getClass(), "type", 52);
        setField(term93009, term93009.getClass(), "next", null);
        setField(term93009, term93009.getClass(), "first", null);
        setField(term93009, term93009.getClass(), "last", null);
        setField(term93009, term93009.getClass(), "propListHead", null);
        setIntField(term93009, term93009.getClass(), "sourcePosition", 0);
        setField(term93009, term93009.getClass(), "jsType", null);
        setField(term93009, term93009.getClass(), "parent", term93009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term92720;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term92650, args);
        assertTrue(recursiveEquals(term92650, term93008));
        assertTrue(recursiveEquals(term92720, term93009));
        assertTrue(recursiveEquals(retValue, true));
    }

};


