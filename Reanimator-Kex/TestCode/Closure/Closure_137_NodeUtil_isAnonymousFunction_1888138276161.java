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

public class NodeUtil_isAnonymousFunction_1888138276161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1570;
     Object term9533;

    public NodeUtil_isAnonymousFunction_1888138276161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1583 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1593 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1570, term1570.getClass(), "type", -497534255);
        setIntField(term1572, term1572.getClass(), "type", -1955400589);
        setIntField(term1574, term1574.getClass(), "type", 0);
        setField(term1574, term1574.getClass(), "next", null);
        setField(term1574, term1574.getClass(), "first", null);
        setField(term1574, term1574.getClass(), "last", null);
        setField(term1574, term1574.getClass(), "propListHead", null);
        setIntField(term1574, term1574.getClass(), "sourcePosition", 0);
        setField(term1574, term1574.getClass(), "jsType", null);
        setField(term1574, term1574.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "next", term1574);
        setIntField(term1577, term1577.getClass(), "type", 0);
        setField(term1577, term1577.getClass(), "next", null);
        setField(term1577, term1577.getClass(), "first", null);
        setField(term1577, term1577.getClass(), "last", null);
        setField(term1577, term1577.getClass(), "propListHead", null);
        setIntField(term1577, term1577.getClass(), "sourcePosition", 0);
        setField(term1577, term1577.getClass(), "jsType", null);
        setField(term1577, term1577.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "first", term1577);
        setIntField(term1580, term1580.getClass(), "type", 0);
        setField(term1580, term1580.getClass(), "next", null);
        setField(term1580, term1580.getClass(), "first", null);
        setField(term1580, term1580.getClass(), "last", null);
        setField(term1580, term1580.getClass(), "propListHead", null);
        setIntField(term1580, term1580.getClass(), "sourcePosition", 0);
        setField(term1580, term1580.getClass(), "jsType", null);
        setField(term1580, term1580.getClass(), "parent", null);
        setField(term1572, term1572.getClass(), "last", term1580);
        setField(term1583, term1583.getClass(), "next", null);
        setIntField(term1583, term1583.getClass(), "type", 0);
        setIntField(term1583, term1583.getClass(), "intValue", 0);
        setField(term1583, term1583.getClass(), "objectValue", null);
        setField(term1572, term1572.getClass(), "propListHead", term1583);
        setIntField(term1572, term1572.getClass(), "sourcePosition", -711507760);
        setField(term1572, term1572.getClass(), "jsType", null);
        setField(term1572, term1572.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "next", term1572);
        setIntField(term1587, term1587.getClass(), "type", 0);
        setField(term1587, term1587.getClass(), "next", null);
        setField(term1587, term1587.getClass(), "first", null);
        setField(term1587, term1587.getClass(), "last", null);
        setField(term1587, term1587.getClass(), "propListHead", null);
        setIntField(term1587, term1587.getClass(), "sourcePosition", 0);
        setField(term1587, term1587.getClass(), "jsType", null);
        setField(term1587, term1587.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "first", term1587);
        setIntField(term1590, term1590.getClass(), "type", 0);
        setField(term1590, term1590.getClass(), "next", null);
        setField(term1590, term1590.getClass(), "first", null);
        setField(term1590, term1590.getClass(), "last", null);
        setField(term1590, term1590.getClass(), "propListHead", null);
        setIntField(term1590, term1590.getClass(), "sourcePosition", 0);
        setField(term1590, term1590.getClass(), "jsType", null);
        setField(term1590, term1590.getClass(), "parent", null);
        setField(term1570, term1570.getClass(), "last", term1590);
        setField(term1593, term1593.getClass(), "next", null);
        setIntField(term1593, term1593.getClass(), "type", 0);
        setIntField(term1593, term1593.getClass(), "intValue", 0);
        setField(term1593, term1593.getClass(), "objectValue", null);
        setField(term1570, term1570.getClass(), "propListHead", term1593);
        setIntField(term1570, term1570.getClass(), "sourcePosition", 1053773809);
        setField(term1570, term1570.getClass(), "jsType", null);
        setField(term1570, term1570.getClass(), "parent", null);
        term9533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9538 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9540 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9541 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9533, term9533.getClass(), "type", -497534255);
        setIntField(term9534, term9534.getClass(), "type", -1955400589);
        setIntField(term9535, term9535.getClass(), "type", 0);
        setField(term9535, term9535.getClass(), "next", null);
        setField(term9535, term9535.getClass(), "first", null);
        setField(term9535, term9535.getClass(), "last", null);
        setField(term9535, term9535.getClass(), "propListHead", null);
        setIntField(term9535, term9535.getClass(), "sourcePosition", 0);
        setField(term9535, term9535.getClass(), "jsType", null);
        setField(term9535, term9535.getClass(), "parent", null);
        setField(term9534, term9534.getClass(), "next", term9535);
        setIntField(term9536, term9536.getClass(), "type", 0);
        setField(term9536, term9536.getClass(), "next", null);
        setField(term9536, term9536.getClass(), "first", null);
        setField(term9536, term9536.getClass(), "last", null);
        setField(term9536, term9536.getClass(), "propListHead", null);
        setIntField(term9536, term9536.getClass(), "sourcePosition", 0);
        setField(term9536, term9536.getClass(), "jsType", null);
        setField(term9536, term9536.getClass(), "parent", null);
        setField(term9534, term9534.getClass(), "first", term9536);
        setIntField(term9537, term9537.getClass(), "type", 0);
        setField(term9537, term9537.getClass(), "next", null);
        setField(term9537, term9537.getClass(), "first", null);
        setField(term9537, term9537.getClass(), "last", null);
        setField(term9537, term9537.getClass(), "propListHead", null);
        setIntField(term9537, term9537.getClass(), "sourcePosition", 0);
        setField(term9537, term9537.getClass(), "jsType", null);
        setField(term9537, term9537.getClass(), "parent", null);
        setField(term9534, term9534.getClass(), "last", term9537);
        setField(term9538, term9538.getClass(), "next", null);
        setIntField(term9538, term9538.getClass(), "type", 0);
        setIntField(term9538, term9538.getClass(), "intValue", 0);
        setField(term9538, term9538.getClass(), "objectValue", null);
        setField(term9534, term9534.getClass(), "propListHead", term9538);
        setIntField(term9534, term9534.getClass(), "sourcePosition", -711507760);
        setField(term9534, term9534.getClass(), "jsType", null);
        setField(term9534, term9534.getClass(), "parent", null);
        setField(term9533, term9533.getClass(), "next", term9534);
        setIntField(term9539, term9539.getClass(), "type", 0);
        setField(term9539, term9539.getClass(), "next", null);
        setField(term9539, term9539.getClass(), "first", null);
        setField(term9539, term9539.getClass(), "last", null);
        setField(term9539, term9539.getClass(), "propListHead", null);
        setIntField(term9539, term9539.getClass(), "sourcePosition", 0);
        setField(term9539, term9539.getClass(), "jsType", null);
        setField(term9539, term9539.getClass(), "parent", null);
        setField(term9533, term9533.getClass(), "first", term9539);
        setIntField(term9540, term9540.getClass(), "type", 0);
        setField(term9540, term9540.getClass(), "next", null);
        setField(term9540, term9540.getClass(), "first", null);
        setField(term9540, term9540.getClass(), "last", null);
        setField(term9540, term9540.getClass(), "propListHead", null);
        setIntField(term9540, term9540.getClass(), "sourcePosition", 0);
        setField(term9540, term9540.getClass(), "jsType", null);
        setField(term9540, term9540.getClass(), "parent", null);
        setField(term9533, term9533.getClass(), "last", term9540);
        setField(term9541, term9541.getClass(), "next", null);
        setIntField(term9541, term9541.getClass(), "type", 0);
        setIntField(term9541, term9541.getClass(), "intValue", 0);
        setField(term9541, term9541.getClass(), "objectValue", null);
        setField(term9533, term9533.getClass(), "propListHead", term9541);
        setIntField(term9533, term9533.getClass(), "sourcePosition", 1053773809);
        setField(term9533, term9533.getClass(), "jsType", null);
        setField(term9533, term9533.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1570;
        Object retValue = callMethod(klass, "isAnonymousFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term1570, term9533));
        assertTrue(recursiveEquals(retValue, false));
    }

};


