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

public class TypeCheck_isPropertyTest_657275882420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100748;
     Object term100818;
     Object term101094;
     Object term101095;

    public TypeCheck_isPropertyTest_657275882420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100748 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term100818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100818, term100818.getClass(), "parent", term100818);
        setIntField(term100818, term100818.getClass(), "type", 98);
        term101094 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term101094, term101094.getClass(), "compiler", null);
        setField(term101094, term101094.getClass(), "validator", null);
        setField(term101094, term101094.getClass(), "reverseInterpreter", null);
        setField(term101094, term101094.getClass(), "typeRegistry", null);
        setField(term101094, term101094.getClass(), "topScope", null);
        setField(term101094, term101094.getClass(), "scopeCreator", null);
        setField(term101094, term101094.getClass(), "reportMissingOverride", null);
        setField(term101094, term101094.getClass(), "reportUnknownTypes", null);
        setBooleanField(term101094, term101094.getClass(), "reportMissingProperties", false);
        setField(term101094, term101094.getClass(), "inferJSDocInfo", null);
        setIntField(term101094, term101094.getClass(), "typedCount", 0);
        setIntField(term101094, term101094.getClass(), "nullCount", 0);
        setIntField(term101094, term101094.getClass(), "unknownCount", 0);
        setBooleanField(term101094, term101094.getClass(), "inExterns", false);
        setIntField(term101094, term101094.getClass(), "noTypeCheckSection", 0);
        term101095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term101095, term101095.getClass(), "type", 98);
        setField(term101095, term101095.getClass(), "next", null);
        setField(term101095, term101095.getClass(), "first", null);
        setField(term101095, term101095.getClass(), "last", null);
        setField(term101095, term101095.getClass(), "propListHead", null);
        setIntField(term101095, term101095.getClass(), "sourcePosition", 0);
        setField(term101095, term101095.getClass(), "jsType", null);
        setField(term101095, term101095.getClass(), "parent", term101095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term100818;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term100748, args);
        assertTrue(recursiveEquals(term100748, term101094));
        assertTrue(recursiveEquals(term100818, term101095));
        assertTrue(recursiveEquals(retValue, false));
    }

};


