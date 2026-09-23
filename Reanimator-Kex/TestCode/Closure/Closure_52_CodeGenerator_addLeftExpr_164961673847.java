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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addLeftExpr_164961673847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041;
     Object term1052;
     Object term1073;
     Object enum10;

    public CodeGenerator_addLeftExpr_164961673847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1042 = new HashMap();
        term1041 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1041, term1041.getClass(), "ESCAPED_JS_STRINGS", term1042);
        setField(term1041, term1041.getClass(), "cc", null);
        setField(term1041, term1041.getClass(), "outputCharsetEncoder", null);
        term1052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1052, term1052.getClass(), "type", 2055867847);
        setIntField(term1054, term1054.getClass(), "type", -184153539);
        setIntField(term1056, term1056.getClass(), "type", 0);
        setField(term1056, term1056.getClass(), "next", null);
        setField(term1056, term1056.getClass(), "first", null);
        setField(term1056, term1056.getClass(), "last", null);
        setField(term1056, term1056.getClass(), "propListHead", null);
        setIntField(term1056, term1056.getClass(), "sourcePosition", 0);
        setField(term1056, term1056.getClass(), "jsType", null);
        setField(term1056, term1056.getClass(), "parent", null);
        setField(term1054, term1054.getClass(), "next", term1056);
        setIntField(term1059, term1059.getClass(), "type", 0);
        setField(term1059, term1059.getClass(), "next", null);
        setField(term1059, term1059.getClass(), "first", null);
        setField(term1059, term1059.getClass(), "last", null);
        setField(term1059, term1059.getClass(), "propListHead", null);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 0);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1054, term1054.getClass(), "first", term1059);
        setIntField(term1062, term1062.getClass(), "type", 0);
        setField(term1062, term1062.getClass(), "next", null);
        setField(term1062, term1062.getClass(), "first", null);
        setField(term1062, term1062.getClass(), "last", null);
        setField(term1062, term1062.getClass(), "propListHead", null);
        setIntField(term1062, term1062.getClass(), "sourcePosition", 0);
        setField(term1062, term1062.getClass(), "jsType", null);
        setField(term1062, term1062.getClass(), "parent", null);
        setField(term1054, term1054.getClass(), "last", term1062);
        setField(term1054, term1054.getClass(), "propListHead", null);
        setIntField(term1054, term1054.getClass(), "sourcePosition", 0);
        setField(term1054, term1054.getClass(), "jsType", null);
        setField(term1054, term1054.getClass(), "parent", null);
        setField(term1052, term1052.getClass(), "next", term1054);
        setIntField(term1066, term1066.getClass(), "type", 0);
        setField(term1066, term1066.getClass(), "next", null);
        setField(term1066, term1066.getClass(), "first", null);
        setField(term1066, term1066.getClass(), "last", null);
        setField(term1066, term1066.getClass(), "propListHead", null);
        setIntField(term1066, term1066.getClass(), "sourcePosition", 0);
        setField(term1066, term1066.getClass(), "jsType", null);
        setField(term1066, term1066.getClass(), "parent", null);
        setField(term1052, term1052.getClass(), "first", term1066);
        setIntField(term1069, term1069.getClass(), "type", 0);
        setField(term1069, term1069.getClass(), "next", null);
        setField(term1069, term1069.getClass(), "first", null);
        setField(term1069, term1069.getClass(), "last", null);
        setField(term1069, term1069.getClass(), "propListHead", null);
        setIntField(term1069, term1069.getClass(), "sourcePosition", 0);
        setField(term1069, term1069.getClass(), "jsType", null);
        setField(term1069, term1069.getClass(), "parent", null);
        setField(term1052, term1052.getClass(), "last", term1069);
        setField(term1052, term1052.getClass(), "propListHead", null);
        setIntField(term1052, term1052.getClass(), "sourcePosition", 0);
        setField(term1052, term1052.getClass(), "jsType", null);
        setField(term1052, term1052.getClass(), "parent", null);
        term1073 = new Integer(1596070772);
        Class<? extends Object> term6249 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term6248 = ((Class) term6249).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term6248).setAccessible(true);
        enum10 = ((Field) term6248).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1052;
        args[1] = term1073;
        args[2] = enum10;
        try {
            callMethod(klass, "addLeftExpr", argTypes, term1041, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


