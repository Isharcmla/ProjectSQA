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
     Object term12449;

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
        term12449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12450 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12452 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12453 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12454 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12457 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12449, term12449.getClass(), "type", -43719302);
        setIntField(term12450, term12450.getClass(), "type", 963694071);
        setIntField(term12451, term12451.getClass(), "type", 0);
        setField(term12451, term12451.getClass(), "next", null);
        setField(term12451, term12451.getClass(), "first", null);
        setField(term12451, term12451.getClass(), "last", null);
        setField(term12451, term12451.getClass(), "propListHead", null);
        setIntField(term12451, term12451.getClass(), "sourcePosition", 0);
        setField(term12451, term12451.getClass(), "jsType", null);
        setField(term12451, term12451.getClass(), "parent", null);
        setField(term12450, term12450.getClass(), "next", term12451);
        setIntField(term12452, term12452.getClass(), "type", 0);
        setField(term12452, term12452.getClass(), "next", null);
        setField(term12452, term12452.getClass(), "first", null);
        setField(term12452, term12452.getClass(), "last", null);
        setField(term12452, term12452.getClass(), "propListHead", null);
        setIntField(term12452, term12452.getClass(), "sourcePosition", 0);
        setField(term12452, term12452.getClass(), "jsType", null);
        setField(term12452, term12452.getClass(), "parent", null);
        setField(term12450, term12450.getClass(), "first", term12452);
        setIntField(term12453, term12453.getClass(), "type", 0);
        setField(term12453, term12453.getClass(), "next", null);
        setField(term12453, term12453.getClass(), "first", null);
        setField(term12453, term12453.getClass(), "last", null);
        setField(term12453, term12453.getClass(), "propListHead", null);
        setIntField(term12453, term12453.getClass(), "sourcePosition", 0);
        setField(term12453, term12453.getClass(), "jsType", null);
        setField(term12453, term12453.getClass(), "parent", null);
        setField(term12450, term12450.getClass(), "last", term12453);
        setField(term12454, term12454.getClass(), "next", null);
        setIntField(term12454, term12454.getClass(), "type", 0);
        setIntField(term12454, term12454.getClass(), "intValue", 0);
        setField(term12454, term12454.getClass(), "objectValue", null);
        setField(term12450, term12450.getClass(), "propListHead", term12454);
        setIntField(term12450, term12450.getClass(), "sourcePosition", 2128383340);
        setField(term12450, term12450.getClass(), "jsType", null);
        setField(term12450, term12450.getClass(), "parent", null);
        setField(term12449, term12449.getClass(), "next", term12450);
        setIntField(term12455, term12455.getClass(), "type", 0);
        setField(term12455, term12455.getClass(), "next", null);
        setField(term12455, term12455.getClass(), "first", null);
        setField(term12455, term12455.getClass(), "last", null);
        setField(term12455, term12455.getClass(), "propListHead", null);
        setIntField(term12455, term12455.getClass(), "sourcePosition", 0);
        setField(term12455, term12455.getClass(), "jsType", null);
        setField(term12455, term12455.getClass(), "parent", null);
        setField(term12449, term12449.getClass(), "first", term12455);
        setIntField(term12456, term12456.getClass(), "type", 0);
        setField(term12456, term12456.getClass(), "next", null);
        setField(term12456, term12456.getClass(), "first", null);
        setField(term12456, term12456.getClass(), "last", null);
        setField(term12456, term12456.getClass(), "propListHead", null);
        setIntField(term12456, term12456.getClass(), "sourcePosition", 0);
        setField(term12456, term12456.getClass(), "jsType", null);
        setField(term12456, term12456.getClass(), "parent", null);
        setField(term12449, term12449.getClass(), "last", term12456);
        setField(term12457, term12457.getClass(), "next", null);
        setIntField(term12457, term12457.getClass(), "type", 0);
        setIntField(term12457, term12457.getClass(), "intValue", 0);
        setField(term12457, term12457.getClass(), "objectValue", null);
        setField(term12449, term12449.getClass(), "propListHead", term12457);
        setIntField(term12449, term12449.getClass(), "sourcePosition", 1238598518);
        setField(term12449, term12449.getClass(), "jsType", null);
        setField(term12449, term12449.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1541;
        Object retValue = callMethod(klass, "isExprAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term1541, term12449));
        assertTrue(recursiveEquals(retValue, false));
    }

};


