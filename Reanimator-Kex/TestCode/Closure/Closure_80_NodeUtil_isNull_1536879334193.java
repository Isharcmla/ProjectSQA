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

public class NodeUtil_isNull_1536879334193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1049;
     Object term10430;

    public NodeUtil_isNull_1536879334193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1062 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1072 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1049, term1049.getClass(), "type", 499519708);
        setIntField(term1051, term1051.getClass(), "type", 200252898);
        setIntField(term1053, term1053.getClass(), "type", 0);
        setField(term1053, term1053.getClass(), "next", null);
        setField(term1053, term1053.getClass(), "first", null);
        setField(term1053, term1053.getClass(), "last", null);
        setField(term1053, term1053.getClass(), "propListHead", null);
        setIntField(term1053, term1053.getClass(), "sourcePosition", 0);
        setField(term1053, term1053.getClass(), "jsType", null);
        setField(term1053, term1053.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "next", term1053);
        setIntField(term1056, term1056.getClass(), "type", 0);
        setField(term1056, term1056.getClass(), "next", null);
        setField(term1056, term1056.getClass(), "first", null);
        setField(term1056, term1056.getClass(), "last", null);
        setField(term1056, term1056.getClass(), "propListHead", null);
        setIntField(term1056, term1056.getClass(), "sourcePosition", 0);
        setField(term1056, term1056.getClass(), "jsType", null);
        setField(term1056, term1056.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "first", term1056);
        setIntField(term1059, term1059.getClass(), "type", 0);
        setField(term1059, term1059.getClass(), "next", null);
        setField(term1059, term1059.getClass(), "first", null);
        setField(term1059, term1059.getClass(), "last", null);
        setField(term1059, term1059.getClass(), "propListHead", null);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 0);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "last", term1059);
        setField(term1062, term1062.getClass(), "next", null);
        setIntField(term1062, term1062.getClass(), "type", 0);
        setIntField(term1062, term1062.getClass(), "intValue", 0);
        setField(term1062, term1062.getClass(), "objectValue", null);
        setField(term1051, term1051.getClass(), "propListHead", term1062);
        setIntField(term1051, term1051.getClass(), "sourcePosition", -1577069773);
        setField(term1051, term1051.getClass(), "jsType", null);
        setField(term1051, term1051.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "next", term1051);
        setIntField(term1066, term1066.getClass(), "type", 0);
        setField(term1066, term1066.getClass(), "next", null);
        setField(term1066, term1066.getClass(), "first", null);
        setField(term1066, term1066.getClass(), "last", null);
        setField(term1066, term1066.getClass(), "propListHead", null);
        setIntField(term1066, term1066.getClass(), "sourcePosition", 0);
        setField(term1066, term1066.getClass(), "jsType", null);
        setField(term1066, term1066.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "first", term1066);
        setIntField(term1069, term1069.getClass(), "type", 0);
        setField(term1069, term1069.getClass(), "next", null);
        setField(term1069, term1069.getClass(), "first", null);
        setField(term1069, term1069.getClass(), "last", null);
        setField(term1069, term1069.getClass(), "propListHead", null);
        setIntField(term1069, term1069.getClass(), "sourcePosition", 0);
        setField(term1069, term1069.getClass(), "jsType", null);
        setField(term1069, term1069.getClass(), "parent", null);
        setField(term1049, term1049.getClass(), "last", term1069);
        setField(term1072, term1072.getClass(), "next", null);
        setIntField(term1072, term1072.getClass(), "type", 0);
        setIntField(term1072, term1072.getClass(), "intValue", 0);
        setField(term1072, term1072.getClass(), "objectValue", null);
        setField(term1049, term1049.getClass(), "propListHead", term1072);
        setIntField(term1049, term1049.getClass(), "sourcePosition", -266625190);
        setField(term1049, term1049.getClass(), "jsType", null);
        setField(term1049, term1049.getClass(), "parent", null);
        term10430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10435 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10438 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10430, term10430.getClass(), "type", 499519708);
        setIntField(term10431, term10431.getClass(), "type", 200252898);
        setIntField(term10432, term10432.getClass(), "type", 0);
        setField(term10432, term10432.getClass(), "next", null);
        setField(term10432, term10432.getClass(), "first", null);
        setField(term10432, term10432.getClass(), "last", null);
        setField(term10432, term10432.getClass(), "propListHead", null);
        setIntField(term10432, term10432.getClass(), "sourcePosition", 0);
        setField(term10432, term10432.getClass(), "jsType", null);
        setField(term10432, term10432.getClass(), "parent", null);
        setField(term10431, term10431.getClass(), "next", term10432);
        setIntField(term10433, term10433.getClass(), "type", 0);
        setField(term10433, term10433.getClass(), "next", null);
        setField(term10433, term10433.getClass(), "first", null);
        setField(term10433, term10433.getClass(), "last", null);
        setField(term10433, term10433.getClass(), "propListHead", null);
        setIntField(term10433, term10433.getClass(), "sourcePosition", 0);
        setField(term10433, term10433.getClass(), "jsType", null);
        setField(term10433, term10433.getClass(), "parent", null);
        setField(term10431, term10431.getClass(), "first", term10433);
        setIntField(term10434, term10434.getClass(), "type", 0);
        setField(term10434, term10434.getClass(), "next", null);
        setField(term10434, term10434.getClass(), "first", null);
        setField(term10434, term10434.getClass(), "last", null);
        setField(term10434, term10434.getClass(), "propListHead", null);
        setIntField(term10434, term10434.getClass(), "sourcePosition", 0);
        setField(term10434, term10434.getClass(), "jsType", null);
        setField(term10434, term10434.getClass(), "parent", null);
        setField(term10431, term10431.getClass(), "last", term10434);
        setField(term10435, term10435.getClass(), "next", null);
        setIntField(term10435, term10435.getClass(), "type", 0);
        setIntField(term10435, term10435.getClass(), "intValue", 0);
        setField(term10435, term10435.getClass(), "objectValue", null);
        setField(term10431, term10431.getClass(), "propListHead", term10435);
        setIntField(term10431, term10431.getClass(), "sourcePosition", -1577069773);
        setField(term10431, term10431.getClass(), "jsType", null);
        setField(term10431, term10431.getClass(), "parent", null);
        setField(term10430, term10430.getClass(), "next", term10431);
        setIntField(term10436, term10436.getClass(), "type", 0);
        setField(term10436, term10436.getClass(), "next", null);
        setField(term10436, term10436.getClass(), "first", null);
        setField(term10436, term10436.getClass(), "last", null);
        setField(term10436, term10436.getClass(), "propListHead", null);
        setIntField(term10436, term10436.getClass(), "sourcePosition", 0);
        setField(term10436, term10436.getClass(), "jsType", null);
        setField(term10436, term10436.getClass(), "parent", null);
        setField(term10430, term10430.getClass(), "first", term10436);
        setIntField(term10437, term10437.getClass(), "type", 0);
        setField(term10437, term10437.getClass(), "next", null);
        setField(term10437, term10437.getClass(), "first", null);
        setField(term10437, term10437.getClass(), "last", null);
        setField(term10437, term10437.getClass(), "propListHead", null);
        setIntField(term10437, term10437.getClass(), "sourcePosition", 0);
        setField(term10437, term10437.getClass(), "jsType", null);
        setField(term10437, term10437.getClass(), "parent", null);
        setField(term10430, term10430.getClass(), "last", term10437);
        setField(term10438, term10438.getClass(), "next", null);
        setIntField(term10438, term10438.getClass(), "type", 0);
        setIntField(term10438, term10438.getClass(), "intValue", 0);
        setField(term10438, term10438.getClass(), "objectValue", null);
        setField(term10430, term10430.getClass(), "propListHead", term10438);
        setIntField(term10430, term10430.getClass(), "sourcePosition", -266625190);
        setField(term10430, term10430.getClass(), "jsType", null);
        setField(term10430, term10430.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1049;
        Object retValue = callMethod(klass, "isNull", argTypes, null, args);
        assertTrue(recursiveEquals(term1049, term10430));
        assertTrue(recursiveEquals(retValue, false));
    }

};


