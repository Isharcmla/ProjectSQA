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

public class TypeCheck_isPropertyTest_657275882289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81839;
     Object term81909;
     Object term82374;
     Object term82375;

    public TypeCheck_isPropertyTest_657275882289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81839 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term81909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81909, term81909.getClass(), "parent", term81909);
        setIntField(term81909, term81909.getClass(), "type", 52);
        term82374 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term82374, term82374.getClass(), "compiler", null);
        setField(term82374, term82374.getClass(), "validator", null);
        setField(term82374, term82374.getClass(), "reverseInterpreter", null);
        setField(term82374, term82374.getClass(), "typeRegistry", null);
        setField(term82374, term82374.getClass(), "topScope", null);
        setField(term82374, term82374.getClass(), "scopeCreator", null);
        setField(term82374, term82374.getClass(), "reportMissingOverride", null);
        setField(term82374, term82374.getClass(), "reportUnknownTypes", null);
        setBooleanField(term82374, term82374.getClass(), "reportMissingProperties", false);
        setField(term82374, term82374.getClass(), "inferJSDocInfo", null);
        setIntField(term82374, term82374.getClass(), "typedCount", 0);
        setIntField(term82374, term82374.getClass(), "nullCount", 0);
        setIntField(term82374, term82374.getClass(), "unknownCount", 0);
        setBooleanField(term82374, term82374.getClass(), "inExterns", false);
        setIntField(term82374, term82374.getClass(), "noTypeCheckSection", 0);
        term82375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82375, term82375.getClass(), "type", 52);
        setField(term82375, term82375.getClass(), "next", null);
        setField(term82375, term82375.getClass(), "first", null);
        setField(term82375, term82375.getClass(), "last", null);
        setField(term82375, term82375.getClass(), "propListHead", null);
        setIntField(term82375, term82375.getClass(), "sourcePosition", 0);
        setField(term82375, term82375.getClass(), "jsType", null);
        setField(term82375, term82375.getClass(), "parent", term82375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81909;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term81839, args);
        assertTrue(recursiveEquals(term81839, term82374));
        assertTrue(recursiveEquals(term81909, term82375));
        assertTrue(recursiveEquals(retValue, true));
    }

};


