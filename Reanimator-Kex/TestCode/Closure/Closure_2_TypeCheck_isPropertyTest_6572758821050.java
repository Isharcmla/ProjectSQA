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
import java.lang.Object;

public class TypeCheck_isPropertyTest_6572758821050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300145;
     Object term300237;
     Object term300463;
     Object term300464;

    public TypeCheck_isPropertyTest_6572758821050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300145 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term300237 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300329 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300421 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term300329, term300329.getClass(), "type", 26);
        setField(term300329, term300329.getClass(), "parent", term300421);
        setField(term300237, term300237.getClass(), "parent", term300329);
        term300463 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term300463, term300463.getClass(), "compiler", null);
        setField(term300463, term300463.getClass(), "validator", null);
        setField(term300463, term300463.getClass(), "reverseInterpreter", null);
        setField(term300463, term300463.getClass(), "typeRegistry", null);
        setField(term300463, term300463.getClass(), "topScope", null);
        setField(term300463, term300463.getClass(), "scopeCreator", null);
        setField(term300463, term300463.getClass(), "reportMissingOverride", null);
        setField(term300463, term300463.getClass(), "reportUnknownTypes", null);
        setBooleanField(term300463, term300463.getClass(), "reportMissingProperties", false);
        setField(term300463, term300463.getClass(), "inferJSDocInfo", null);
        setIntField(term300463, term300463.getClass(), "typedCount", 0);
        setIntField(term300463, term300463.getClass(), "nullCount", 0);
        setIntField(term300463, term300463.getClass(), "unknownCount", 0);
        setBooleanField(term300463, term300463.getClass(), "inExterns", false);
        setIntField(term300463, term300463.getClass(), "noTypeCheckSection", 0);
        term300464 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300465 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term300466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term300464, term300464.getClass(), "number", 0.0);
        setIntField(term300464, term300464.getClass(), "type", 0);
        setField(term300464, term300464.getClass(), "next", null);
        setField(term300464, term300464.getClass(), "first", null);
        setField(term300464, term300464.getClass(), "last", null);
        setField(term300464, term300464.getClass(), "propListHead", null);
        setIntField(term300464, term300464.getClass(), "sourcePosition", 0);
        setField(term300464, term300464.getClass(), "jsType", null);
        setDoubleField(term300465, term300465.getClass(), "number", 0.0);
        setIntField(term300465, term300465.getClass(), "type", 26);
        setField(term300465, term300465.getClass(), "next", null);
        setField(term300465, term300465.getClass(), "first", null);
        setField(term300465, term300465.getClass(), "last", null);
        setField(term300465, term300465.getClass(), "propListHead", null);
        setIntField(term300465, term300465.getClass(), "sourcePosition", 0);
        setField(term300465, term300465.getClass(), "jsType", null);
        setField(term300466, term300466.getClass(), "str", null);
        setIntField(term300466, term300466.getClass(), "type", 0);
        setField(term300466, term300466.getClass(), "next", null);
        setField(term300466, term300466.getClass(), "first", null);
        setField(term300466, term300466.getClass(), "last", null);
        setField(term300466, term300466.getClass(), "propListHead", null);
        setIntField(term300466, term300466.getClass(), "sourcePosition", 0);
        setField(term300466, term300466.getClass(), "jsType", null);
        setField(term300466, term300466.getClass(), "parent", null);
        setField(term300465, term300465.getClass(), "parent", term300466);
        setField(term300464, term300464.getClass(), "parent", term300465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term300237;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term300145, args);
        assertTrue(recursiveEquals(term300145, term300463));
        assertTrue(recursiveEquals(term300237, term300464));
        assertTrue(recursiveEquals(retValue, false));
    }

};


