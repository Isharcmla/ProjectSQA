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

public class TypeCheck_isPropertyTest_657275882389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94154;
     Object term94224;
     Object term94415;
     Object term94416;

    public TypeCheck_isPropertyTest_657275882389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94154 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term94224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term94224, term94224.getClass(), "parent", term94224);
        setIntField(term94224, term94224.getClass(), "type", 26);
        term94415 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term94415, term94415.getClass(), "compiler", null);
        setField(term94415, term94415.getClass(), "validator", null);
        setField(term94415, term94415.getClass(), "reverseInterpreter", null);
        setField(term94415, term94415.getClass(), "typeRegistry", null);
        setField(term94415, term94415.getClass(), "topScope", null);
        setField(term94415, term94415.getClass(), "scopeCreator", null);
        setField(term94415, term94415.getClass(), "reportMissingOverride", null);
        setField(term94415, term94415.getClass(), "reportUnknownTypes", null);
        setBooleanField(term94415, term94415.getClass(), "reportMissingProperties", false);
        setField(term94415, term94415.getClass(), "inferJSDocInfo", null);
        setIntField(term94415, term94415.getClass(), "typedCount", 0);
        setIntField(term94415, term94415.getClass(), "nullCount", 0);
        setIntField(term94415, term94415.getClass(), "unknownCount", 0);
        setBooleanField(term94415, term94415.getClass(), "inExterns", false);
        setIntField(term94415, term94415.getClass(), "noTypeCheckSection", 0);
        term94416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term94416, term94416.getClass(), "type", 26);
        setField(term94416, term94416.getClass(), "next", null);
        setField(term94416, term94416.getClass(), "first", null);
        setField(term94416, term94416.getClass(), "last", null);
        setField(term94416, term94416.getClass(), "propListHead", null);
        setIntField(term94416, term94416.getClass(), "sourcePosition", 0);
        setField(term94416, term94416.getClass(), "jsType", null);
        setField(term94416, term94416.getClass(), "parent", term94416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term94224;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term94154, args);
        assertTrue(recursiveEquals(term94154, term94415));
        assertTrue(recursiveEquals(term94224, term94416));
        assertTrue(recursiveEquals(retValue, false));
    }

};


