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

public class NodeUtil_isHoistedFunctionDeclaration_1630852851162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1570;
     Object term9558;

    public NodeUtil_isHoistedFunctionDeclaration_1630852851162() {
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
        term9558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9563 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9566 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9558, term9558.getClass(), "type", -497534255);
        setIntField(term9559, term9559.getClass(), "type", -1955400589);
        setIntField(term9560, term9560.getClass(), "type", 0);
        setField(term9560, term9560.getClass(), "next", null);
        setField(term9560, term9560.getClass(), "first", null);
        setField(term9560, term9560.getClass(), "last", null);
        setField(term9560, term9560.getClass(), "propListHead", null);
        setIntField(term9560, term9560.getClass(), "sourcePosition", 0);
        setField(term9560, term9560.getClass(), "jsType", null);
        setField(term9560, term9560.getClass(), "parent", null);
        setField(term9559, term9559.getClass(), "next", term9560);
        setIntField(term9561, term9561.getClass(), "type", 0);
        setField(term9561, term9561.getClass(), "next", null);
        setField(term9561, term9561.getClass(), "first", null);
        setField(term9561, term9561.getClass(), "last", null);
        setField(term9561, term9561.getClass(), "propListHead", null);
        setIntField(term9561, term9561.getClass(), "sourcePosition", 0);
        setField(term9561, term9561.getClass(), "jsType", null);
        setField(term9561, term9561.getClass(), "parent", null);
        setField(term9559, term9559.getClass(), "first", term9561);
        setIntField(term9562, term9562.getClass(), "type", 0);
        setField(term9562, term9562.getClass(), "next", null);
        setField(term9562, term9562.getClass(), "first", null);
        setField(term9562, term9562.getClass(), "last", null);
        setField(term9562, term9562.getClass(), "propListHead", null);
        setIntField(term9562, term9562.getClass(), "sourcePosition", 0);
        setField(term9562, term9562.getClass(), "jsType", null);
        setField(term9562, term9562.getClass(), "parent", null);
        setField(term9559, term9559.getClass(), "last", term9562);
        setField(term9563, term9563.getClass(), "next", null);
        setIntField(term9563, term9563.getClass(), "type", 0);
        setIntField(term9563, term9563.getClass(), "intValue", 0);
        setField(term9563, term9563.getClass(), "objectValue", null);
        setField(term9559, term9559.getClass(), "propListHead", term9563);
        setIntField(term9559, term9559.getClass(), "sourcePosition", -711507760);
        setField(term9559, term9559.getClass(), "jsType", null);
        setField(term9559, term9559.getClass(), "parent", null);
        setField(term9558, term9558.getClass(), "next", term9559);
        setIntField(term9564, term9564.getClass(), "type", 0);
        setField(term9564, term9564.getClass(), "next", null);
        setField(term9564, term9564.getClass(), "first", null);
        setField(term9564, term9564.getClass(), "last", null);
        setField(term9564, term9564.getClass(), "propListHead", null);
        setIntField(term9564, term9564.getClass(), "sourcePosition", 0);
        setField(term9564, term9564.getClass(), "jsType", null);
        setField(term9564, term9564.getClass(), "parent", null);
        setField(term9558, term9558.getClass(), "first", term9564);
        setIntField(term9565, term9565.getClass(), "type", 0);
        setField(term9565, term9565.getClass(), "next", null);
        setField(term9565, term9565.getClass(), "first", null);
        setField(term9565, term9565.getClass(), "last", null);
        setField(term9565, term9565.getClass(), "propListHead", null);
        setIntField(term9565, term9565.getClass(), "sourcePosition", 0);
        setField(term9565, term9565.getClass(), "jsType", null);
        setField(term9565, term9565.getClass(), "parent", null);
        setField(term9558, term9558.getClass(), "last", term9565);
        setField(term9566, term9566.getClass(), "next", null);
        setIntField(term9566, term9566.getClass(), "type", 0);
        setIntField(term9566, term9566.getClass(), "intValue", 0);
        setField(term9566, term9566.getClass(), "objectValue", null);
        setField(term9558, term9558.getClass(), "propListHead", term9566);
        setIntField(term9558, term9558.getClass(), "sourcePosition", 1053773809);
        setField(term9558, term9558.getClass(), "jsType", null);
        setField(term9558, term9558.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1570;
        Object retValue = callMethod(klass, "isHoistedFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1570, term9558));
        assertTrue(recursiveEquals(retValue, false));
    }

};


