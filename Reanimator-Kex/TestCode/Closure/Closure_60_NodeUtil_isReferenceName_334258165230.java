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

public class NodeUtil_isReferenceName_334258165230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1540;
     Object term13624;

    public NodeUtil_isReferenceName_334258165230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1540, term1540.getClass(), "type", -751079123);
        setIntField(term1542, term1542.getClass(), "type", -1632929393);
        setIntField(term1544, term1544.getClass(), "type", 0);
        setField(term1544, term1544.getClass(), "next", null);
        setField(term1544, term1544.getClass(), "first", null);
        setField(term1544, term1544.getClass(), "last", null);
        setField(term1544, term1544.getClass(), "propListHead", null);
        setIntField(term1544, term1544.getClass(), "sourcePosition", 0);
        setField(term1544, term1544.getClass(), "jsType", null);
        setField(term1544, term1544.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "next", term1544);
        setIntField(term1547, term1547.getClass(), "type", 0);
        setField(term1547, term1547.getClass(), "next", null);
        setField(term1547, term1547.getClass(), "first", null);
        setField(term1547, term1547.getClass(), "last", null);
        setField(term1547, term1547.getClass(), "propListHead", null);
        setIntField(term1547, term1547.getClass(), "sourcePosition", 0);
        setField(term1547, term1547.getClass(), "jsType", null);
        setField(term1547, term1547.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "first", term1547);
        setIntField(term1550, term1550.getClass(), "type", 0);
        setField(term1550, term1550.getClass(), "next", null);
        setField(term1550, term1550.getClass(), "first", null);
        setField(term1550, term1550.getClass(), "last", null);
        setField(term1550, term1550.getClass(), "propListHead", null);
        setIntField(term1550, term1550.getClass(), "sourcePosition", 0);
        setField(term1550, term1550.getClass(), "jsType", null);
        setField(term1550, term1550.getClass(), "parent", null);
        setField(term1542, term1542.getClass(), "last", term1550);
        setField(term1542, term1542.getClass(), "propListHead", null);
        setIntField(term1542, term1542.getClass(), "sourcePosition", 0);
        setField(term1542, term1542.getClass(), "jsType", null);
        setField(term1542, term1542.getClass(), "parent", null);
        setField(term1540, term1540.getClass(), "next", term1542);
        setIntField(term1554, term1554.getClass(), "type", 0);
        setField(term1554, term1554.getClass(), "next", null);
        setField(term1554, term1554.getClass(), "first", null);
        setField(term1554, term1554.getClass(), "last", null);
        setField(term1554, term1554.getClass(), "propListHead", null);
        setIntField(term1554, term1554.getClass(), "sourcePosition", 0);
        setField(term1554, term1554.getClass(), "jsType", null);
        setField(term1554, term1554.getClass(), "parent", null);
        setField(term1540, term1540.getClass(), "first", term1554);
        setIntField(term1557, term1557.getClass(), "type", 0);
        setField(term1557, term1557.getClass(), "next", null);
        setField(term1557, term1557.getClass(), "first", null);
        setField(term1557, term1557.getClass(), "last", null);
        setField(term1557, term1557.getClass(), "propListHead", null);
        setIntField(term1557, term1557.getClass(), "sourcePosition", 0);
        setField(term1557, term1557.getClass(), "jsType", null);
        setField(term1557, term1557.getClass(), "parent", null);
        setField(term1540, term1540.getClass(), "last", term1557);
        setField(term1540, term1540.getClass(), "propListHead", null);
        setIntField(term1540, term1540.getClass(), "sourcePosition", 0);
        setField(term1540, term1540.getClass(), "jsType", null);
        setField(term1540, term1540.getClass(), "parent", null);
        term13624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13624, term13624.getClass(), "type", -751079123);
        setIntField(term13625, term13625.getClass(), "type", -1632929393);
        setIntField(term13626, term13626.getClass(), "type", 0);
        setField(term13626, term13626.getClass(), "next", null);
        setField(term13626, term13626.getClass(), "first", null);
        setField(term13626, term13626.getClass(), "last", null);
        setField(term13626, term13626.getClass(), "propListHead", null);
        setIntField(term13626, term13626.getClass(), "sourcePosition", 0);
        setField(term13626, term13626.getClass(), "jsType", null);
        setField(term13626, term13626.getClass(), "parent", null);
        setField(term13625, term13625.getClass(), "next", term13626);
        setIntField(term13627, term13627.getClass(), "type", 0);
        setField(term13627, term13627.getClass(), "next", null);
        setField(term13627, term13627.getClass(), "first", null);
        setField(term13627, term13627.getClass(), "last", null);
        setField(term13627, term13627.getClass(), "propListHead", null);
        setIntField(term13627, term13627.getClass(), "sourcePosition", 0);
        setField(term13627, term13627.getClass(), "jsType", null);
        setField(term13627, term13627.getClass(), "parent", null);
        setField(term13625, term13625.getClass(), "first", term13627);
        setIntField(term13628, term13628.getClass(), "type", 0);
        setField(term13628, term13628.getClass(), "next", null);
        setField(term13628, term13628.getClass(), "first", null);
        setField(term13628, term13628.getClass(), "last", null);
        setField(term13628, term13628.getClass(), "propListHead", null);
        setIntField(term13628, term13628.getClass(), "sourcePosition", 0);
        setField(term13628, term13628.getClass(), "jsType", null);
        setField(term13628, term13628.getClass(), "parent", null);
        setField(term13625, term13625.getClass(), "last", term13628);
        setField(term13625, term13625.getClass(), "propListHead", null);
        setIntField(term13625, term13625.getClass(), "sourcePosition", 0);
        setField(term13625, term13625.getClass(), "jsType", null);
        setField(term13625, term13625.getClass(), "parent", null);
        setField(term13624, term13624.getClass(), "next", term13625);
        setIntField(term13629, term13629.getClass(), "type", 0);
        setField(term13629, term13629.getClass(), "next", null);
        setField(term13629, term13629.getClass(), "first", null);
        setField(term13629, term13629.getClass(), "last", null);
        setField(term13629, term13629.getClass(), "propListHead", null);
        setIntField(term13629, term13629.getClass(), "sourcePosition", 0);
        setField(term13629, term13629.getClass(), "jsType", null);
        setField(term13629, term13629.getClass(), "parent", null);
        setField(term13624, term13624.getClass(), "first", term13629);
        setIntField(term13630, term13630.getClass(), "type", 0);
        setField(term13630, term13630.getClass(), "next", null);
        setField(term13630, term13630.getClass(), "first", null);
        setField(term13630, term13630.getClass(), "last", null);
        setField(term13630, term13630.getClass(), "propListHead", null);
        setIntField(term13630, term13630.getClass(), "sourcePosition", 0);
        setField(term13630, term13630.getClass(), "jsType", null);
        setField(term13630, term13630.getClass(), "parent", null);
        setField(term13624, term13624.getClass(), "last", term13630);
        setField(term13624, term13624.getClass(), "propListHead", null);
        setIntField(term13624, term13624.getClass(), "sourcePosition", 0);
        setField(term13624, term13624.getClass(), "jsType", null);
        setField(term13624, term13624.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1540;
        Object retValue = callMethod(klass, "isReferenceName", argTypes, null, args);
        assertTrue(recursiveEquals(term1540, term13624));
        assertTrue(recursiveEquals(retValue, false));
    }

};


