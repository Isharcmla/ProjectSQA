package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class ArrowType_hasUnknownParamsOrReturn_84411990826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525;
     Object term3601;

    public ArrowType_hasUnknownParamsOrReturn_84411990826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term526, term526.getClass(), "type", 538259104);
        setIntField(term528, term528.getClass(), "type", 96566506);
        setIntField(term530, term530.getClass(), "type", -343325701);
        setIntField(term532, term532.getClass(), "type", 107945604);
        setField(term532, term532.getClass(), "next", null);
        setField(term532, term532.getClass(), "first", null);
        setField(term532, term532.getClass(), "last", null);
        setField(term532, term532.getClass(), "propListHead", null);
        setIntField(term532, term532.getClass(), "sourcePosition", 0);
        setField(term532, term532.getClass(), "jsType", null);
        setField(term532, term532.getClass(), "parent", null);
        setField(term530, term530.getClass(), "next", term532);
        setIntField(term535, term535.getClass(), "type", -2015048153);
        setField(term535, term535.getClass(), "next", null);
        setField(term535, term535.getClass(), "first", term526);
        setField(term535, term535.getClass(), "last", null);
        setField(term535, term535.getClass(), "propListHead", null);
        setIntField(term535, term535.getClass(), "sourcePosition", 0);
        setField(term535, term535.getClass(), "jsType", null);
        setField(term535, term535.getClass(), "parent", null);
        setField(term530, term530.getClass(), "first", term535);
        setIntField(term538, term538.getClass(), "type", 71190297);
        setField(term538, term538.getClass(), "next", null);
        setField(term538, term538.getClass(), "first", term528);
        setField(term538, term538.getClass(), "last", null);
        setField(term538, term538.getClass(), "propListHead", null);
        setIntField(term538, term538.getClass(), "sourcePosition", 0);
        setField(term538, term538.getClass(), "jsType", null);
        setField(term538, term538.getClass(), "parent", null);
        setField(term530, term530.getClass(), "last", term538);
        setField(term530, term530.getClass(), "propListHead", null);
        setIntField(term530, term530.getClass(), "sourcePosition", 0);
        setField(term530, term530.getClass(), "jsType", null);
        setField(term530, term530.getClass(), "parent", null);
        setField(term528, term528.getClass(), "next", term530);
        setField(term528, term528.getClass(), "first", term530);
        setIntField(term542, term542.getClass(), "type", -1963464809);
        setField(term542, term542.getClass(), "next", term538);
        setField(term542, term542.getClass(), "first", term535);
        setField(term542, term542.getClass(), "last", term535);
        setField(term542, term542.getClass(), "propListHead", null);
        setIntField(term542, term542.getClass(), "sourcePosition", 0);
        setField(term542, term542.getClass(), "jsType", null);
        setField(term542, term542.getClass(), "parent", null);
        setField(term528, term528.getClass(), "last", term542);
        setField(term528, term528.getClass(), "propListHead", null);
        setIntField(term528, term528.getClass(), "sourcePosition", 0);
        setField(term528, term528.getClass(), "jsType", null);
        setField(term528, term528.getClass(), "parent", null);
        setField(term526, term526.getClass(), "next", term528);
        setField(term526, term526.getClass(), "first", term535);
        setIntField(term546, term546.getClass(), "type", 0);
        setField(term546, term546.getClass(), "next", null);
        setField(term546, term546.getClass(), "first", null);
        setField(term546, term546.getClass(), "last", null);
        setField(term546, term546.getClass(), "propListHead", null);
        setIntField(term546, term546.getClass(), "sourcePosition", 0);
        setField(term546, term546.getClass(), "jsType", null);
        setField(term546, term546.getClass(), "parent", null);
        setField(term526, term526.getClass(), "last", term546);
        setField(term526, term526.getClass(), "propListHead", null);
        setIntField(term526, term526.getClass(), "sourcePosition", 0);
        setField(term526, term526.getClass(), "jsType", null);
        setField(term526, term526.getClass(), "parent", null);
        setField(term525, term525.getClass(), "parameters", term526);
        setField(term525, term525.getClass(), "returnType", null);
        setBooleanField(term525, term525.getClass(), "returnTypeInferred", false);
        setBooleanField(term525, term525.getClass(), "resolved", false);
        setField(term525, term525.getClass(), "resolveResult", null);
        setField(term525, term525.getClass(), "registry", null);
        term3601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term3602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3602, term3602.getClass(), "type", 538259104);
        setIntField(term3603, term3603.getClass(), "type", 96566506);
        setIntField(term3604, term3604.getClass(), "type", -343325701);
        setIntField(term3605, term3605.getClass(), "type", 107945604);
        setField(term3605, term3605.getClass(), "next", null);
        setField(term3605, term3605.getClass(), "first", null);
        setField(term3605, term3605.getClass(), "last", null);
        setField(term3605, term3605.getClass(), "propListHead", null);
        setIntField(term3605, term3605.getClass(), "sourcePosition", 0);
        setField(term3605, term3605.getClass(), "jsType", null);
        setField(term3605, term3605.getClass(), "parent", null);
        setField(term3604, term3604.getClass(), "next", term3605);
        setIntField(term3606, term3606.getClass(), "type", -2015048153);
        setField(term3606, term3606.getClass(), "next", null);
        setField(term3606, term3606.getClass(), "first", term3602);
        setField(term3606, term3606.getClass(), "last", null);
        setField(term3606, term3606.getClass(), "propListHead", null);
        setIntField(term3606, term3606.getClass(), "sourcePosition", 0);
        setField(term3606, term3606.getClass(), "jsType", null);
        setField(term3606, term3606.getClass(), "parent", null);
        setField(term3604, term3604.getClass(), "first", term3606);
        setIntField(term3607, term3607.getClass(), "type", 71190297);
        setField(term3607, term3607.getClass(), "next", null);
        setField(term3607, term3607.getClass(), "first", term3603);
        setField(term3607, term3607.getClass(), "last", null);
        setField(term3607, term3607.getClass(), "propListHead", null);
        setIntField(term3607, term3607.getClass(), "sourcePosition", 0);
        setField(term3607, term3607.getClass(), "jsType", null);
        setField(term3607, term3607.getClass(), "parent", null);
        setField(term3604, term3604.getClass(), "last", term3607);
        setField(term3604, term3604.getClass(), "propListHead", null);
        setIntField(term3604, term3604.getClass(), "sourcePosition", 0);
        setField(term3604, term3604.getClass(), "jsType", null);
        setField(term3604, term3604.getClass(), "parent", null);
        setField(term3603, term3603.getClass(), "next", term3604);
        setField(term3603, term3603.getClass(), "first", term3604);
        setIntField(term3608, term3608.getClass(), "type", -1963464809);
        setField(term3608, term3608.getClass(), "next", term3607);
        setField(term3608, term3608.getClass(), "first", term3606);
        setField(term3608, term3608.getClass(), "last", term3606);
        setField(term3608, term3608.getClass(), "propListHead", null);
        setIntField(term3608, term3608.getClass(), "sourcePosition", 0);
        setField(term3608, term3608.getClass(), "jsType", null);
        setField(term3608, term3608.getClass(), "parent", null);
        setField(term3603, term3603.getClass(), "last", term3608);
        setField(term3603, term3603.getClass(), "propListHead", null);
        setIntField(term3603, term3603.getClass(), "sourcePosition", 0);
        setField(term3603, term3603.getClass(), "jsType", null);
        setField(term3603, term3603.getClass(), "parent", null);
        setField(term3602, term3602.getClass(), "next", term3603);
        setField(term3602, term3602.getClass(), "first", term3606);
        setIntField(term3609, term3609.getClass(), "type", 0);
        setField(term3609, term3609.getClass(), "next", null);
        setField(term3609, term3609.getClass(), "first", null);
        setField(term3609, term3609.getClass(), "last", null);
        setField(term3609, term3609.getClass(), "propListHead", null);
        setIntField(term3609, term3609.getClass(), "sourcePosition", 0);
        setField(term3609, term3609.getClass(), "jsType", null);
        setField(term3609, term3609.getClass(), "parent", null);
        setField(term3602, term3602.getClass(), "last", term3609);
        setField(term3602, term3602.getClass(), "propListHead", null);
        setIntField(term3602, term3602.getClass(), "sourcePosition", 0);
        setField(term3602, term3602.getClass(), "jsType", null);
        setField(term3602, term3602.getClass(), "parent", null);
        setField(term3601, term3601.getClass(), "parameters", term3602);
        setField(term3601, term3601.getClass(), "returnType", null);
        setBooleanField(term3601, term3601.getClass(), "returnTypeInferred", false);
        setBooleanField(term3601, term3601.getClass(), "resolved", false);
        setField(term3601, term3601.getClass(), "resolveResult", null);
        setField(term3601, term3601.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ArrowType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownParamsOrReturn", argTypes, term525, args);
        assertTrue(recursiveEquals(term525, term3601));
        assertTrue(recursiveEquals(retValue, true));
    }

};


