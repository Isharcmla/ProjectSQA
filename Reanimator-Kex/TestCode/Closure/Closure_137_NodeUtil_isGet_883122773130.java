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

public class NodeUtil_isGet_883122773130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652;
     Object term6342;

    public NodeUtil_isGet_883122773130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term665 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term652, term652.getClass(), "type", 199287428);
        setIntField(term654, term654.getClass(), "type", 1745276158);
        setIntField(term656, term656.getClass(), "type", 0);
        setField(term656, term656.getClass(), "next", null);
        setField(term656, term656.getClass(), "first", null);
        setField(term656, term656.getClass(), "last", null);
        setField(term656, term656.getClass(), "propListHead", null);
        setIntField(term656, term656.getClass(), "sourcePosition", 0);
        setField(term656, term656.getClass(), "jsType", null);
        setField(term656, term656.getClass(), "parent", null);
        setField(term654, term654.getClass(), "next", term656);
        setIntField(term659, term659.getClass(), "type", 0);
        setField(term659, term659.getClass(), "next", null);
        setField(term659, term659.getClass(), "first", null);
        setField(term659, term659.getClass(), "last", null);
        setField(term659, term659.getClass(), "propListHead", null);
        setIntField(term659, term659.getClass(), "sourcePosition", 0);
        setField(term659, term659.getClass(), "jsType", null);
        setField(term659, term659.getClass(), "parent", null);
        setField(term654, term654.getClass(), "first", term659);
        setIntField(term662, term662.getClass(), "type", 0);
        setField(term662, term662.getClass(), "next", null);
        setField(term662, term662.getClass(), "first", null);
        setField(term662, term662.getClass(), "last", null);
        setField(term662, term662.getClass(), "propListHead", null);
        setIntField(term662, term662.getClass(), "sourcePosition", 0);
        setField(term662, term662.getClass(), "jsType", null);
        setField(term662, term662.getClass(), "parent", null);
        setField(term654, term654.getClass(), "last", term662);
        setField(term665, term665.getClass(), "next", null);
        setIntField(term665, term665.getClass(), "type", 0);
        setIntField(term665, term665.getClass(), "intValue", 0);
        setField(term665, term665.getClass(), "objectValue", null);
        setField(term654, term654.getClass(), "propListHead", term665);
        setIntField(term654, term654.getClass(), "sourcePosition", 1236004505);
        setField(term654, term654.getClass(), "jsType", null);
        setField(term654, term654.getClass(), "parent", null);
        setField(term652, term652.getClass(), "next", term654);
        setIntField(term669, term669.getClass(), "type", 0);
        setField(term669, term669.getClass(), "next", null);
        setField(term669, term669.getClass(), "first", null);
        setField(term669, term669.getClass(), "last", null);
        setField(term669, term669.getClass(), "propListHead", null);
        setIntField(term669, term669.getClass(), "sourcePosition", 0);
        setField(term669, term669.getClass(), "jsType", null);
        setField(term669, term669.getClass(), "parent", null);
        setField(term652, term652.getClass(), "first", term669);
        setIntField(term672, term672.getClass(), "type", 0);
        setField(term672, term672.getClass(), "next", null);
        setField(term672, term672.getClass(), "first", null);
        setField(term672, term672.getClass(), "last", null);
        setField(term672, term672.getClass(), "propListHead", null);
        setIntField(term672, term672.getClass(), "sourcePosition", 0);
        setField(term672, term672.getClass(), "jsType", null);
        setField(term672, term672.getClass(), "parent", null);
        setField(term652, term652.getClass(), "last", term672);
        setField(term675, term675.getClass(), "next", null);
        setIntField(term675, term675.getClass(), "type", 0);
        setIntField(term675, term675.getClass(), "intValue", 0);
        setField(term675, term675.getClass(), "objectValue", null);
        setField(term652, term652.getClass(), "propListHead", term675);
        setIntField(term652, term652.getClass(), "sourcePosition", 1050765721);
        setField(term652, term652.getClass(), "jsType", null);
        setField(term652, term652.getClass(), "parent", null);
        term6342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6347 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6350 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6342, term6342.getClass(), "type", 199287428);
        setIntField(term6343, term6343.getClass(), "type", 1745276158);
        setIntField(term6344, term6344.getClass(), "type", 0);
        setField(term6344, term6344.getClass(), "next", null);
        setField(term6344, term6344.getClass(), "first", null);
        setField(term6344, term6344.getClass(), "last", null);
        setField(term6344, term6344.getClass(), "propListHead", null);
        setIntField(term6344, term6344.getClass(), "sourcePosition", 0);
        setField(term6344, term6344.getClass(), "jsType", null);
        setField(term6344, term6344.getClass(), "parent", null);
        setField(term6343, term6343.getClass(), "next", term6344);
        setIntField(term6345, term6345.getClass(), "type", 0);
        setField(term6345, term6345.getClass(), "next", null);
        setField(term6345, term6345.getClass(), "first", null);
        setField(term6345, term6345.getClass(), "last", null);
        setField(term6345, term6345.getClass(), "propListHead", null);
        setIntField(term6345, term6345.getClass(), "sourcePosition", 0);
        setField(term6345, term6345.getClass(), "jsType", null);
        setField(term6345, term6345.getClass(), "parent", null);
        setField(term6343, term6343.getClass(), "first", term6345);
        setIntField(term6346, term6346.getClass(), "type", 0);
        setField(term6346, term6346.getClass(), "next", null);
        setField(term6346, term6346.getClass(), "first", null);
        setField(term6346, term6346.getClass(), "last", null);
        setField(term6346, term6346.getClass(), "propListHead", null);
        setIntField(term6346, term6346.getClass(), "sourcePosition", 0);
        setField(term6346, term6346.getClass(), "jsType", null);
        setField(term6346, term6346.getClass(), "parent", null);
        setField(term6343, term6343.getClass(), "last", term6346);
        setField(term6347, term6347.getClass(), "next", null);
        setIntField(term6347, term6347.getClass(), "type", 0);
        setIntField(term6347, term6347.getClass(), "intValue", 0);
        setField(term6347, term6347.getClass(), "objectValue", null);
        setField(term6343, term6343.getClass(), "propListHead", term6347);
        setIntField(term6343, term6343.getClass(), "sourcePosition", 1236004505);
        setField(term6343, term6343.getClass(), "jsType", null);
        setField(term6343, term6343.getClass(), "parent", null);
        setField(term6342, term6342.getClass(), "next", term6343);
        setIntField(term6348, term6348.getClass(), "type", 0);
        setField(term6348, term6348.getClass(), "next", null);
        setField(term6348, term6348.getClass(), "first", null);
        setField(term6348, term6348.getClass(), "last", null);
        setField(term6348, term6348.getClass(), "propListHead", null);
        setIntField(term6348, term6348.getClass(), "sourcePosition", 0);
        setField(term6348, term6348.getClass(), "jsType", null);
        setField(term6348, term6348.getClass(), "parent", null);
        setField(term6342, term6342.getClass(), "first", term6348);
        setIntField(term6349, term6349.getClass(), "type", 0);
        setField(term6349, term6349.getClass(), "next", null);
        setField(term6349, term6349.getClass(), "first", null);
        setField(term6349, term6349.getClass(), "last", null);
        setField(term6349, term6349.getClass(), "propListHead", null);
        setIntField(term6349, term6349.getClass(), "sourcePosition", 0);
        setField(term6349, term6349.getClass(), "jsType", null);
        setField(term6349, term6349.getClass(), "parent", null);
        setField(term6342, term6342.getClass(), "last", term6349);
        setField(term6350, term6350.getClass(), "next", null);
        setIntField(term6350, term6350.getClass(), "type", 0);
        setIntField(term6350, term6350.getClass(), "intValue", 0);
        setField(term6350, term6350.getClass(), "objectValue", null);
        setField(term6342, term6342.getClass(), "propListHead", term6350);
        setIntField(term6342, term6342.getClass(), "sourcePosition", 1050765721);
        setField(term6342, term6342.getClass(), "jsType", null);
        setField(term6342, term6342.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term652;
        Object retValue = callMethod(klass, "isGet", argTypes, null, args);
        assertTrue(recursiveEquals(term652, term6342));
        assertTrue(recursiveEquals(retValue, false));
    }

};


