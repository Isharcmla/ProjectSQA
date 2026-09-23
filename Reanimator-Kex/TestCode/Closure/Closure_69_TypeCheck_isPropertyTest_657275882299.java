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

public class TypeCheck_isPropertyTest_657275882299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84250;
     Object term84320;
     Object term84506;
     Object term84507;

    public TypeCheck_isPropertyTest_657275882299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84250 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term84320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84320, term84320.getClass(), "parent", term84320);
        setIntField(term84320, term84320.getClass(), "type", 114);
        term84506 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term84506, term84506.getClass(), "compiler", null);
        setField(term84506, term84506.getClass(), "validator", null);
        setField(term84506, term84506.getClass(), "reverseInterpreter", null);
        setField(term84506, term84506.getClass(), "typeRegistry", null);
        setField(term84506, term84506.getClass(), "topScope", null);
        setField(term84506, term84506.getClass(), "scopeCreator", null);
        setField(term84506, term84506.getClass(), "reportMissingOverride", null);
        setField(term84506, term84506.getClass(), "reportUnknownTypes", null);
        setBooleanField(term84506, term84506.getClass(), "reportMissingProperties", false);
        setField(term84506, term84506.getClass(), "inferJSDocInfo", null);
        setIntField(term84506, term84506.getClass(), "typedCount", 0);
        setIntField(term84506, term84506.getClass(), "nullCount", 0);
        setIntField(term84506, term84506.getClass(), "unknownCount", 0);
        setBooleanField(term84506, term84506.getClass(), "inExterns", false);
        setIntField(term84506, term84506.getClass(), "noTypeCheckSection", 0);
        term84507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84507, term84507.getClass(), "type", 114);
        setField(term84507, term84507.getClass(), "next", null);
        setField(term84507, term84507.getClass(), "first", null);
        setField(term84507, term84507.getClass(), "last", null);
        setField(term84507, term84507.getClass(), "propListHead", null);
        setIntField(term84507, term84507.getClass(), "sourcePosition", 0);
        setField(term84507, term84507.getClass(), "jsType", null);
        setField(term84507, term84507.getClass(), "parent", term84507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term84320;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term84250, args);
        assertTrue(recursiveEquals(term84250, term84506));
        assertTrue(recursiveEquals(term84320, term84507));
        assertTrue(recursiveEquals(retValue, false));
    }

};


