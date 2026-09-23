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

public class TypeCheck_isPropertyTest_6572758821217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359796;
     Object term359888;
     Object term362067;
     Object term362068;

    public TypeCheck_isPropertyTest_6572758821217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359796 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term359888 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term359980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term360072 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term359980, term359980.getClass(), "type", 26);
        setField(term359980, term359980.getClass(), "parent", term360072);
        setField(term359888, term359888.getClass(), "parent", term359980);
        term362067 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term362067, term362067.getClass(), "compiler", null);
        setField(term362067, term362067.getClass(), "validator", null);
        setField(term362067, term362067.getClass(), "reverseInterpreter", null);
        setField(term362067, term362067.getClass(), "typeRegistry", null);
        setField(term362067, term362067.getClass(), "topScope", null);
        setField(term362067, term362067.getClass(), "scopeCreator", null);
        setField(term362067, term362067.getClass(), "reportMissingOverride", null);
        setField(term362067, term362067.getClass(), "reportUnknownTypes", null);
        setBooleanField(term362067, term362067.getClass(), "reportMissingProperties", false);
        setField(term362067, term362067.getClass(), "inferJSDocInfo", null);
        setIntField(term362067, term362067.getClass(), "typedCount", 0);
        setIntField(term362067, term362067.getClass(), "nullCount", 0);
        setIntField(term362067, term362067.getClass(), "unknownCount", 0);
        setBooleanField(term362067, term362067.getClass(), "inExterns", false);
        setIntField(term362067, term362067.getClass(), "noTypeCheckSection", 0);
        term362068 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term362069 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term362070 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term362068, term362068.getClass(), "number", 0.0);
        setIntField(term362068, term362068.getClass(), "type", 0);
        setField(term362068, term362068.getClass(), "next", null);
        setField(term362068, term362068.getClass(), "first", null);
        setField(term362068, term362068.getClass(), "last", null);
        setField(term362068, term362068.getClass(), "propListHead", null);
        setIntField(term362068, term362068.getClass(), "sourcePosition", 0);
        setField(term362068, term362068.getClass(), "jsType", null);
        setDoubleField(term362069, term362069.getClass(), "number", 0.0);
        setIntField(term362069, term362069.getClass(), "type", 26);
        setField(term362069, term362069.getClass(), "next", null);
        setField(term362069, term362069.getClass(), "first", null);
        setField(term362069, term362069.getClass(), "last", null);
        setField(term362069, term362069.getClass(), "propListHead", null);
        setIntField(term362069, term362069.getClass(), "sourcePosition", 0);
        setField(term362069, term362069.getClass(), "jsType", null);
        setDoubleField(term362070, term362070.getClass(), "number", 0.0);
        setIntField(term362070, term362070.getClass(), "type", 0);
        setField(term362070, term362070.getClass(), "next", null);
        setField(term362070, term362070.getClass(), "first", null);
        setField(term362070, term362070.getClass(), "last", null);
        setField(term362070, term362070.getClass(), "propListHead", null);
        setIntField(term362070, term362070.getClass(), "sourcePosition", 0);
        setField(term362070, term362070.getClass(), "jsType", null);
        setField(term362070, term362070.getClass(), "parent", null);
        setField(term362069, term362069.getClass(), "parent", term362070);
        setField(term362068, term362068.getClass(), "parent", term362069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term359888;
        Object retValue = callMethod(klass, "isPropertyTest", argTypes, term359796, args);
        assertTrue(recursiveEquals(term359796, term362067));
        assertTrue(recursiveEquals(term359888, term362068));
        assertTrue(recursiveEquals(retValue, false));
    }

};


