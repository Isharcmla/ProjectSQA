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

public class NodeUtil_isExprAssign_892465175213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1541;
     Object term12155;

    public NodeUtil_isExprAssign_892465175213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1554 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1564 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1541, term1541.getClass(), "type", -43719302);
        setIntField(term1543, term1543.getClass(), "type", 963694071);
        setIntField(term1545, term1545.getClass(), "type", 0);
        setField(term1545, term1545.getClass(), "next", null);
        setField(term1545, term1545.getClass(), "first", null);
        setField(term1545, term1545.getClass(), "last", null);
        setField(term1545, term1545.getClass(), "propListHead", null);
        setIntField(term1545, term1545.getClass(), "sourcePosition", 0);
        setField(term1545, term1545.getClass(), "jsType", null);
        setField(term1545, term1545.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "next", term1545);
        setIntField(term1548, term1548.getClass(), "type", 0);
        setField(term1548, term1548.getClass(), "next", null);
        setField(term1548, term1548.getClass(), "first", null);
        setField(term1548, term1548.getClass(), "last", null);
        setField(term1548, term1548.getClass(), "propListHead", null);
        setIntField(term1548, term1548.getClass(), "sourcePosition", 0);
        setField(term1548, term1548.getClass(), "jsType", null);
        setField(term1548, term1548.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "first", term1548);
        setIntField(term1551, term1551.getClass(), "type", 0);
        setField(term1551, term1551.getClass(), "next", null);
        setField(term1551, term1551.getClass(), "first", null);
        setField(term1551, term1551.getClass(), "last", null);
        setField(term1551, term1551.getClass(), "propListHead", null);
        setIntField(term1551, term1551.getClass(), "sourcePosition", 0);
        setField(term1551, term1551.getClass(), "jsType", null);
        setField(term1551, term1551.getClass(), "parent", null);
        setField(term1543, term1543.getClass(), "last", term1551);
        setField(term1554, term1554.getClass(), "next", null);
        setIntField(term1554, term1554.getClass(), "type", 0);
        setIntField(term1554, term1554.getClass(), "intValue", 0);
        setField(term1554, term1554.getClass(), "objectValue", null);
        setField(term1543, term1543.getClass(), "propListHead", term1554);
        setIntField(term1543, term1543.getClass(), "sourcePosition", 2128383340);
        setField(term1543, term1543.getClass(), "jsType", null);
        setField(term1543, term1543.getClass(), "parent", null);
        setField(term1541, term1541.getClass(), "next", term1543);
        setIntField(term1558, term1558.getClass(), "type", 0);
        setField(term1558, term1558.getClass(), "next", null);
        setField(term1558, term1558.getClass(), "first", null);
        setField(term1558, term1558.getClass(), "last", null);
        setField(term1558, term1558.getClass(), "propListHead", null);
        setIntField(term1558, term1558.getClass(), "sourcePosition", 0);
        setField(term1558, term1558.getClass(), "jsType", null);
        setField(term1558, term1558.getClass(), "parent", null);
        setField(term1541, term1541.getClass(), "first", term1558);
        setIntField(term1561, term1561.getClass(), "type", 0);
        setField(term1561, term1561.getClass(), "next", null);
        setField(term1561, term1561.getClass(), "first", null);
        setField(term1561, term1561.getClass(), "last", null);
        setField(term1561, term1561.getClass(), "propListHead", null);
        setIntField(term1561, term1561.getClass(), "sourcePosition", 0);
        setField(term1561, term1561.getClass(), "jsType", null);
        setField(term1561, term1561.getClass(), "parent", null);
        setField(term1541, term1541.getClass(), "last", term1561);
        setField(term1564, term1564.getClass(), "next", null);
        setIntField(term1564, term1564.getClass(), "type", 0);
        setIntField(term1564, term1564.getClass(), "intValue", 0);
        setField(term1564, term1564.getClass(), "objectValue", null);
        setField(term1541, term1541.getClass(), "propListHead", term1564);
        setIntField(term1541, term1541.getClass(), "sourcePosition", 1238598518);
        setField(term1541, term1541.getClass(), "jsType", null);
        setField(term1541, term1541.getClass(), "parent", null);
        term12155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12160 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12163 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12155, term12155.getClass(), "type", -43719302);
        setIntField(term12156, term12156.getClass(), "type", 963694071);
        setIntField(term12157, term12157.getClass(), "type", 0);
        setField(term12157, term12157.getClass(), "next", null);
        setField(term12157, term12157.getClass(), "first", null);
        setField(term12157, term12157.getClass(), "last", null);
        setField(term12157, term12157.getClass(), "propListHead", null);
        setIntField(term12157, term12157.getClass(), "sourcePosition", 0);
        setField(term12157, term12157.getClass(), "jsType", null);
        setField(term12157, term12157.getClass(), "parent", null);
        setField(term12156, term12156.getClass(), "next", term12157);
        setIntField(term12158, term12158.getClass(), "type", 0);
        setField(term12158, term12158.getClass(), "next", null);
        setField(term12158, term12158.getClass(), "first", null);
        setField(term12158, term12158.getClass(), "last", null);
        setField(term12158, term12158.getClass(), "propListHead", null);
        setIntField(term12158, term12158.getClass(), "sourcePosition", 0);
        setField(term12158, term12158.getClass(), "jsType", null);
        setField(term12158, term12158.getClass(), "parent", null);
        setField(term12156, term12156.getClass(), "first", term12158);
        setIntField(term12159, term12159.getClass(), "type", 0);
        setField(term12159, term12159.getClass(), "next", null);
        setField(term12159, term12159.getClass(), "first", null);
        setField(term12159, term12159.getClass(), "last", null);
        setField(term12159, term12159.getClass(), "propListHead", null);
        setIntField(term12159, term12159.getClass(), "sourcePosition", 0);
        setField(term12159, term12159.getClass(), "jsType", null);
        setField(term12159, term12159.getClass(), "parent", null);
        setField(term12156, term12156.getClass(), "last", term12159);
        setField(term12160, term12160.getClass(), "next", null);
        setIntField(term12160, term12160.getClass(), "type", 0);
        setIntField(term12160, term12160.getClass(), "intValue", 0);
        setField(term12160, term12160.getClass(), "objectValue", null);
        setField(term12156, term12156.getClass(), "propListHead", term12160);
        setIntField(term12156, term12156.getClass(), "sourcePosition", 2128383340);
        setField(term12156, term12156.getClass(), "jsType", null);
        setField(term12156, term12156.getClass(), "parent", null);
        setField(term12155, term12155.getClass(), "next", term12156);
        setIntField(term12161, term12161.getClass(), "type", 0);
        setField(term12161, term12161.getClass(), "next", null);
        setField(term12161, term12161.getClass(), "first", null);
        setField(term12161, term12161.getClass(), "last", null);
        setField(term12161, term12161.getClass(), "propListHead", null);
        setIntField(term12161, term12161.getClass(), "sourcePosition", 0);
        setField(term12161, term12161.getClass(), "jsType", null);
        setField(term12161, term12161.getClass(), "parent", null);
        setField(term12155, term12155.getClass(), "first", term12161);
        setIntField(term12162, term12162.getClass(), "type", 0);
        setField(term12162, term12162.getClass(), "next", null);
        setField(term12162, term12162.getClass(), "first", null);
        setField(term12162, term12162.getClass(), "last", null);
        setField(term12162, term12162.getClass(), "propListHead", null);
        setIntField(term12162, term12162.getClass(), "sourcePosition", 0);
        setField(term12162, term12162.getClass(), "jsType", null);
        setField(term12162, term12162.getClass(), "parent", null);
        setField(term12155, term12155.getClass(), "last", term12162);
        setField(term12163, term12163.getClass(), "next", null);
        setIntField(term12163, term12163.getClass(), "type", 0);
        setIntField(term12163, term12163.getClass(), "intValue", 0);
        setField(term12163, term12163.getClass(), "objectValue", null);
        setField(term12155, term12155.getClass(), "propListHead", term12163);
        setIntField(term12155, term12155.getClass(), "sourcePosition", 1238598518);
        setField(term12155, term12155.getClass(), "jsType", null);
        setField(term12155, term12155.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1541;
        Object retValue = callMethod(klass, "isExprAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1541, term12155));
        assertTrue(recursiveEquals(retValue, false));
    }

};


