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

public class TypeCheck_isPropertyTest_657275882478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121782;
     Object term121874;
     Object term121904;
     Object term121905;

    public TypeCheck_isPropertyTest_657275882478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121782 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term121874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term121874, term121874.getClass(), "parent", term121874);
        setIntField(term121874, term121874.getClass(), "type", 26);
        term121904 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term121904, term121904.getClass(), "compiler", null);
        setField(term121904, term121904.getClass(), "validator", null);
        setField(term121904, term121904.getClass(), "reverseInterpreter", null);
        setField(term121904, term121904.getClass(), "typeRegistry", null);
        setField(term121904, term121904.getClass(), "topScope", null);
        setField(term121904, term121904.getClass(), "scopeCreator", null);
        setField(term121904, term121904.getClass(), "reportMissingOverride", null);
        setField(term121904, term121904.getClass(), "reportUnknownTypes", null);
        setBooleanField(term121904, term121904.getClass(), "reportMissingProperties", false);
        setField(term121904, term121904.getClass(), "inferJSDocInfo", null);
        setIntField(term121904, term121904.getClass(), "typedCount", 0);
        setIntField(term121904, term121904.getClass(), "nullCount", 0);
        setIntField(term121904, term121904.getClass(), "unknownCount", 0);
        setBooleanField(term121904, term121904.getClass(), "inExterns", false);
        setIntField(term121904, term121904.getClass(), "noTypeCheckSection", 0);
        term121905 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term121905, term121905.getClass(), "number", 0.0);
        setIntField(term121905, term121905.getClass(), "type", 26);
        setField(term121905, term121905.getClass(), "next", null);
        setField(term121905, term121905.getClass(), "first", null);
        setField(term121905, term121905.getClass(), "last", null);
        setField(term121905, term121905.getClass(), "propListHead", null);
        setIntField(term121905, term121905.getClass(), "sourcePosition", 0);
        setField(term121905, term121905.getClass(), "jsType", null);
        setField(term121905, term121905.getClass(), "parent", term121905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term121874;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term121782, args);
        assertTrue(recursiveEquals(term121782, term121904));
        assertTrue(recursiveEquals(term121874, term121905));
        assertTrue(recursiveEquals(retValue, false));
    }

};


