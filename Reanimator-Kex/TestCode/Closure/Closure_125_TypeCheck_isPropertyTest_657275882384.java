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

public class TypeCheck_isPropertyTest_657275882384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93254;
     Object term93324;
     Object term93628;
     Object term93629;

    public TypeCheck_isPropertyTest_657275882384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93254 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term93324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term93324, term93324.getClass(), "parent", term93324);
        setIntField(term93324, term93324.getClass(), "type", 113);
        setField(term93324, term93324.getClass(), "first", term93324);
        term93628 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term93628, term93628.getClass(), "compiler", null);
        setField(term93628, term93628.getClass(), "validator", null);
        setField(term93628, term93628.getClass(), "reverseInterpreter", null);
        setField(term93628, term93628.getClass(), "typeRegistry", null);
        setField(term93628, term93628.getClass(), "topScope", null);
        setField(term93628, term93628.getClass(), "scopeCreator", null);
        setField(term93628, term93628.getClass(), "reportMissingOverride", null);
        setBooleanField(term93628, term93628.getClass(), "reportUnknownTypes", false);
        setBooleanField(term93628, term93628.getClass(), "reportMissingProperties", false);
        setField(term93628, term93628.getClass(), "inferJSDocInfo", null);
        setIntField(term93628, term93628.getClass(), "typedCount", 0);
        setIntField(term93628, term93628.getClass(), "nullCount", 0);
        setIntField(term93628, term93628.getClass(), "unknownCount", 0);
        setBooleanField(term93628, term93628.getClass(), "inExterns", false);
        setIntField(term93628, term93628.getClass(), "noTypeCheckSection", 0);
        setField(term93628, term93628.getClass(), "editDistance", null);
        term93629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term93629, term93629.getClass(), "type", 113);
        setField(term93629, term93629.getClass(), "next", null);
        setField(term93629, term93629.getClass(), "first", term93629);
        setField(term93629, term93629.getClass(), "last", null);
        setField(term93629, term93629.getClass(), "propListHead", null);
        setIntField(term93629, term93629.getClass(), "sourcePosition", 0);
        setField(term93629, term93629.getClass(), "jsType", null);
        setField(term93629, term93629.getClass(), "parent", term93629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93324;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term93254, args);
        assertTrue(recursiveEquals(term93254, term93628));
        assertTrue(recursiveEquals(term93324, term93629));
        assertTrue(recursiveEquals(retValue, true));
    }

};


