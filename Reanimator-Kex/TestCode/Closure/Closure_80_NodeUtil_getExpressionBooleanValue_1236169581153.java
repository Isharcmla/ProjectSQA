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
import java.lang.String;

public class NodeUtil_getExpressionBooleanValue_1236169581153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term4517;
     Object enum0;

    public NodeUtil_getExpressionBooleanValue_1236169581153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1, term1.getClass(), "type", 391863371);
        setIntField(term3, term3.getClass(), "type", -2038273078);
        setIntField(term5, term5.getClass(), "type", 0);
        setField(term5, term5.getClass(), "next", null);
        setField(term5, term5.getClass(), "first", null);
        setField(term5, term5.getClass(), "last", null);
        setField(term5, term5.getClass(), "propListHead", null);
        setIntField(term5, term5.getClass(), "sourcePosition", 0);
        setField(term5, term5.getClass(), "jsType", null);
        setField(term5, term5.getClass(), "parent", null);
        setField(term3, term3.getClass(), "next", term5);
        setIntField(term8, term8.getClass(), "type", 0);
        setField(term8, term8.getClass(), "next", null);
        setField(term8, term8.getClass(), "first", null);
        setField(term8, term8.getClass(), "last", null);
        setField(term8, term8.getClass(), "propListHead", null);
        setIntField(term8, term8.getClass(), "sourcePosition", 0);
        setField(term8, term8.getClass(), "jsType", null);
        setField(term8, term8.getClass(), "parent", null);
        setField(term3, term3.getClass(), "first", term8);
        setIntField(term11, term11.getClass(), "type", 0);
        setField(term11, term11.getClass(), "next", null);
        setField(term11, term11.getClass(), "first", null);
        setField(term11, term11.getClass(), "last", null);
        setField(term11, term11.getClass(), "propListHead", null);
        setIntField(term11, term11.getClass(), "sourcePosition", 0);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term3, term3.getClass(), "last", term11);
        setField(term14, term14.getClass(), "next", null);
        setIntField(term14, term14.getClass(), "type", 0);
        setIntField(term14, term14.getClass(), "intValue", 0);
        setField(term14, term14.getClass(), "objectValue", null);
        setField(term3, term3.getClass(), "propListHead", term14);
        setIntField(term3, term3.getClass(), "sourcePosition", 1725571209);
        setField(term3, term3.getClass(), "jsType", null);
        setField(term3, term3.getClass(), "parent", null);
        setField(term1, term1.getClass(), "next", term3);
        setIntField(term18, term18.getClass(), "type", 0);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", null);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term1, term1.getClass(), "first", term18);
        setIntField(term21, term21.getClass(), "type", 0);
        setField(term21, term21.getClass(), "next", null);
        setField(term21, term21.getClass(), "first", null);
        setField(term21, term21.getClass(), "last", null);
        setField(term21, term21.getClass(), "propListHead", null);
        setIntField(term21, term21.getClass(), "sourcePosition", 0);
        setField(term21, term21.getClass(), "jsType", null);
        setField(term21, term21.getClass(), "parent", null);
        setField(term1, term1.getClass(), "last", term21);
        setField(term24, term24.getClass(), "next", null);
        setIntField(term24, term24.getClass(), "type", 0);
        setIntField(term24, term24.getClass(), "intValue", 0);
        setField(term24, term24.getClass(), "objectValue", null);
        setField(term1, term1.getClass(), "propListHead", term24);
        setIntField(term1, term1.getClass(), "sourcePosition", -522618178);
        setField(term1, term1.getClass(), "jsType", null);
        setField(term1, term1.getClass(), "parent", null);
        term4517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4522 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4525 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4517, term4517.getClass(), "type", 391863371);
        setIntField(term4518, term4518.getClass(), "type", -2038273078);
        setIntField(term4519, term4519.getClass(), "type", 0);
        setField(term4519, term4519.getClass(), "next", null);
        setField(term4519, term4519.getClass(), "first", null);
        setField(term4519, term4519.getClass(), "last", null);
        setField(term4519, term4519.getClass(), "propListHead", null);
        setIntField(term4519, term4519.getClass(), "sourcePosition", 0);
        setField(term4519, term4519.getClass(), "jsType", null);
        setField(term4519, term4519.getClass(), "parent", null);
        setField(term4518, term4518.getClass(), "next", term4519);
        setIntField(term4520, term4520.getClass(), "type", 0);
        setField(term4520, term4520.getClass(), "next", null);
        setField(term4520, term4520.getClass(), "first", null);
        setField(term4520, term4520.getClass(), "last", null);
        setField(term4520, term4520.getClass(), "propListHead", null);
        setIntField(term4520, term4520.getClass(), "sourcePosition", 0);
        setField(term4520, term4520.getClass(), "jsType", null);
        setField(term4520, term4520.getClass(), "parent", null);
        setField(term4518, term4518.getClass(), "first", term4520);
        setIntField(term4521, term4521.getClass(), "type", 0);
        setField(term4521, term4521.getClass(), "next", null);
        setField(term4521, term4521.getClass(), "first", null);
        setField(term4521, term4521.getClass(), "last", null);
        setField(term4521, term4521.getClass(), "propListHead", null);
        setIntField(term4521, term4521.getClass(), "sourcePosition", 0);
        setField(term4521, term4521.getClass(), "jsType", null);
        setField(term4521, term4521.getClass(), "parent", null);
        setField(term4518, term4518.getClass(), "last", term4521);
        setField(term4522, term4522.getClass(), "next", null);
        setIntField(term4522, term4522.getClass(), "type", 0);
        setIntField(term4522, term4522.getClass(), "intValue", 0);
        setField(term4522, term4522.getClass(), "objectValue", null);
        setField(term4518, term4518.getClass(), "propListHead", term4522);
        setIntField(term4518, term4518.getClass(), "sourcePosition", 1725571209);
        setField(term4518, term4518.getClass(), "jsType", null);
        setField(term4518, term4518.getClass(), "parent", null);
        setField(term4517, term4517.getClass(), "next", term4518);
        setIntField(term4523, term4523.getClass(), "type", 0);
        setField(term4523, term4523.getClass(), "next", null);
        setField(term4523, term4523.getClass(), "first", null);
        setField(term4523, term4523.getClass(), "last", null);
        setField(term4523, term4523.getClass(), "propListHead", null);
        setIntField(term4523, term4523.getClass(), "sourcePosition", 0);
        setField(term4523, term4523.getClass(), "jsType", null);
        setField(term4523, term4523.getClass(), "parent", null);
        setField(term4517, term4517.getClass(), "first", term4523);
        setIntField(term4524, term4524.getClass(), "type", 0);
        setField(term4524, term4524.getClass(), "next", null);
        setField(term4524, term4524.getClass(), "first", null);
        setField(term4524, term4524.getClass(), "last", null);
        setField(term4524, term4524.getClass(), "propListHead", null);
        setIntField(term4524, term4524.getClass(), "sourcePosition", 0);
        setField(term4524, term4524.getClass(), "jsType", null);
        setField(term4524, term4524.getClass(), "parent", null);
        setField(term4517, term4517.getClass(), "last", term4524);
        setField(term4525, term4525.getClass(), "next", null);
        setIntField(term4525, term4525.getClass(), "type", 0);
        setIntField(term4525, term4525.getClass(), "intValue", 0);
        setField(term4525, term4525.getClass(), "objectValue", null);
        setField(term4517, term4517.getClass(), "propListHead", term4525);
        setIntField(term4517, term4517.getClass(), "sourcePosition", -522618178);
        setField(term4517, term4517.getClass(), "jsType", null);
        setField(term4517, term4517.getClass(), "parent", null);
        Class<? extends Object> term4555 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term4554 = ((Class) term4555).getDeclaredField((String) "UNKNOWN");
        ((Field) term4554).setAccessible(true);
        enum0 = ((Field) term4554).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "getExpressionBooleanValue", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term4517));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


