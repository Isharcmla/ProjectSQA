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

public class TypeCheck_isPropertyTest_657275882462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113892;
     Object term113984;
     Object term114014;
     Object term114015;

    public TypeCheck_isPropertyTest_657275882462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113892 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term113984 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term113984, term113984.getClass(), "parent", term113984);
        setIntField(term113984, term113984.getClass(), "type", 26);
        term114014 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term114014, term114014.getClass(), "compiler", null);
        setField(term114014, term114014.getClass(), "validator", null);
        setField(term114014, term114014.getClass(), "reverseInterpreter", null);
        setField(term114014, term114014.getClass(), "typeRegistry", null);
        setField(term114014, term114014.getClass(), "topScope", null);
        setField(term114014, term114014.getClass(), "scopeCreator", null);
        setField(term114014, term114014.getClass(), "reportMissingOverride", null);
        setField(term114014, term114014.getClass(), "reportUnknownTypes", null);
        setBooleanField(term114014, term114014.getClass(), "reportMissingProperties", false);
        setField(term114014, term114014.getClass(), "inferJSDocInfo", null);
        setIntField(term114014, term114014.getClass(), "typedCount", 0);
        setIntField(term114014, term114014.getClass(), "nullCount", 0);
        setIntField(term114014, term114014.getClass(), "unknownCount", 0);
        setBooleanField(term114014, term114014.getClass(), "inExterns", false);
        setIntField(term114014, term114014.getClass(), "noTypeCheckSection", 0);
        term114015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term114015, term114015.getClass(), "number", 0.0);
        setIntField(term114015, term114015.getClass(), "type", 26);
        setField(term114015, term114015.getClass(), "next", null);
        setField(term114015, term114015.getClass(), "first", null);
        setField(term114015, term114015.getClass(), "last", null);
        setField(term114015, term114015.getClass(), "propListHead", null);
        setIntField(term114015, term114015.getClass(), "sourcePosition", 0);
        setField(term114015, term114015.getClass(), "jsType", null);
        setField(term114015, term114015.getClass(), "parent", term114015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term113984;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term113892, args);
        assertTrue(recursiveEquals(term113892, term114014));
        assertTrue(recursiveEquals(term113984, term114015));
        assertTrue(recursiveEquals(retValue, false));
    }

};


