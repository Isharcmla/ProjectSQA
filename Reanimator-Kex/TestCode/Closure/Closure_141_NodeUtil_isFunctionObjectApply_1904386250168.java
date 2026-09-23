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

public class NodeUtil_isFunctionObjectApply_1904386250168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1754;
     Object term10343;

    public NodeUtil_isFunctionObjectApply_1904386250168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1767 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1777 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1754, term1754.getClass(), "type", -341287775);
        setIntField(term1756, term1756.getClass(), "type", -2023791789);
        setIntField(term1758, term1758.getClass(), "type", 0);
        setField(term1758, term1758.getClass(), "next", null);
        setField(term1758, term1758.getClass(), "first", null);
        setField(term1758, term1758.getClass(), "last", null);
        setField(term1758, term1758.getClass(), "propListHead", null);
        setIntField(term1758, term1758.getClass(), "sourcePosition", 0);
        setField(term1758, term1758.getClass(), "jsType", null);
        setField(term1758, term1758.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "next", term1758);
        setIntField(term1761, term1761.getClass(), "type", 0);
        setField(term1761, term1761.getClass(), "next", null);
        setField(term1761, term1761.getClass(), "first", null);
        setField(term1761, term1761.getClass(), "last", null);
        setField(term1761, term1761.getClass(), "propListHead", null);
        setIntField(term1761, term1761.getClass(), "sourcePosition", 0);
        setField(term1761, term1761.getClass(), "jsType", null);
        setField(term1761, term1761.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "first", term1761);
        setIntField(term1764, term1764.getClass(), "type", 0);
        setField(term1764, term1764.getClass(), "next", null);
        setField(term1764, term1764.getClass(), "first", null);
        setField(term1764, term1764.getClass(), "last", null);
        setField(term1764, term1764.getClass(), "propListHead", null);
        setIntField(term1764, term1764.getClass(), "sourcePosition", 0);
        setField(term1764, term1764.getClass(), "jsType", null);
        setField(term1764, term1764.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "last", term1764);
        setField(term1767, term1767.getClass(), "next", null);
        setIntField(term1767, term1767.getClass(), "type", 0);
        setIntField(term1767, term1767.getClass(), "intValue", 0);
        setField(term1767, term1767.getClass(), "objectValue", null);
        setField(term1756, term1756.getClass(), "propListHead", term1767);
        setIntField(term1756, term1756.getClass(), "sourcePosition", 1418551216);
        setField(term1756, term1756.getClass(), "jsType", null);
        setField(term1756, term1756.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "next", term1756);
        setIntField(term1771, term1771.getClass(), "type", 0);
        setField(term1771, term1771.getClass(), "next", null);
        setField(term1771, term1771.getClass(), "first", null);
        setField(term1771, term1771.getClass(), "last", null);
        setField(term1771, term1771.getClass(), "propListHead", null);
        setIntField(term1771, term1771.getClass(), "sourcePosition", 0);
        setField(term1771, term1771.getClass(), "jsType", null);
        setField(term1771, term1771.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "first", term1771);
        setIntField(term1774, term1774.getClass(), "type", 0);
        setField(term1774, term1774.getClass(), "next", null);
        setField(term1774, term1774.getClass(), "first", null);
        setField(term1774, term1774.getClass(), "last", null);
        setField(term1774, term1774.getClass(), "propListHead", null);
        setIntField(term1774, term1774.getClass(), "sourcePosition", 0);
        setField(term1774, term1774.getClass(), "jsType", null);
        setField(term1774, term1774.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "last", term1774);
        setField(term1777, term1777.getClass(), "next", null);
        setIntField(term1777, term1777.getClass(), "type", 0);
        setIntField(term1777, term1777.getClass(), "intValue", 0);
        setField(term1777, term1777.getClass(), "objectValue", null);
        setField(term1754, term1754.getClass(), "propListHead", term1777);
        setIntField(term1754, term1754.getClass(), "sourcePosition", -626779272);
        setField(term1754, term1754.getClass(), "jsType", null);
        setField(term1754, term1754.getClass(), "parent", null);
        term10343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10348 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10351 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10343, term10343.getClass(), "type", -341287775);
        setIntField(term10344, term10344.getClass(), "type", -2023791789);
        setIntField(term10345, term10345.getClass(), "type", 0);
        setField(term10345, term10345.getClass(), "next", null);
        setField(term10345, term10345.getClass(), "first", null);
        setField(term10345, term10345.getClass(), "last", null);
        setField(term10345, term10345.getClass(), "propListHead", null);
        setIntField(term10345, term10345.getClass(), "sourcePosition", 0);
        setField(term10345, term10345.getClass(), "jsType", null);
        setField(term10345, term10345.getClass(), "parent", null);
        setField(term10344, term10344.getClass(), "next", term10345);
        setIntField(term10346, term10346.getClass(), "type", 0);
        setField(term10346, term10346.getClass(), "next", null);
        setField(term10346, term10346.getClass(), "first", null);
        setField(term10346, term10346.getClass(), "last", null);
        setField(term10346, term10346.getClass(), "propListHead", null);
        setIntField(term10346, term10346.getClass(), "sourcePosition", 0);
        setField(term10346, term10346.getClass(), "jsType", null);
        setField(term10346, term10346.getClass(), "parent", null);
        setField(term10344, term10344.getClass(), "first", term10346);
        setIntField(term10347, term10347.getClass(), "type", 0);
        setField(term10347, term10347.getClass(), "next", null);
        setField(term10347, term10347.getClass(), "first", null);
        setField(term10347, term10347.getClass(), "last", null);
        setField(term10347, term10347.getClass(), "propListHead", null);
        setIntField(term10347, term10347.getClass(), "sourcePosition", 0);
        setField(term10347, term10347.getClass(), "jsType", null);
        setField(term10347, term10347.getClass(), "parent", null);
        setField(term10344, term10344.getClass(), "last", term10347);
        setField(term10348, term10348.getClass(), "next", null);
        setIntField(term10348, term10348.getClass(), "type", 0);
        setIntField(term10348, term10348.getClass(), "intValue", 0);
        setField(term10348, term10348.getClass(), "objectValue", null);
        setField(term10344, term10344.getClass(), "propListHead", term10348);
        setIntField(term10344, term10344.getClass(), "sourcePosition", 1418551216);
        setField(term10344, term10344.getClass(), "jsType", null);
        setField(term10344, term10344.getClass(), "parent", null);
        setField(term10343, term10343.getClass(), "next", term10344);
        setIntField(term10349, term10349.getClass(), "type", 0);
        setField(term10349, term10349.getClass(), "next", null);
        setField(term10349, term10349.getClass(), "first", null);
        setField(term10349, term10349.getClass(), "last", null);
        setField(term10349, term10349.getClass(), "propListHead", null);
        setIntField(term10349, term10349.getClass(), "sourcePosition", 0);
        setField(term10349, term10349.getClass(), "jsType", null);
        setField(term10349, term10349.getClass(), "parent", null);
        setField(term10343, term10343.getClass(), "first", term10349);
        setIntField(term10350, term10350.getClass(), "type", 0);
        setField(term10350, term10350.getClass(), "next", null);
        setField(term10350, term10350.getClass(), "first", null);
        setField(term10350, term10350.getClass(), "last", null);
        setField(term10350, term10350.getClass(), "propListHead", null);
        setIntField(term10350, term10350.getClass(), "sourcePosition", 0);
        setField(term10350, term10350.getClass(), "jsType", null);
        setField(term10350, term10350.getClass(), "parent", null);
        setField(term10343, term10343.getClass(), "last", term10350);
        setField(term10351, term10351.getClass(), "next", null);
        setIntField(term10351, term10351.getClass(), "type", 0);
        setIntField(term10351, term10351.getClass(), "intValue", 0);
        setField(term10351, term10351.getClass(), "objectValue", null);
        setField(term10343, term10343.getClass(), "propListHead", term10351);
        setIntField(term10343, term10343.getClass(), "sourcePosition", -626779272);
        setField(term10343, term10343.getClass(), "jsType", null);
        setField(term10343, term10343.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1754;
        callMethod(klass, "isFunctionObjectApply", argTypes, null, args);
        assertTrue(recursiveEquals(term1754, term10343));
    }

};


