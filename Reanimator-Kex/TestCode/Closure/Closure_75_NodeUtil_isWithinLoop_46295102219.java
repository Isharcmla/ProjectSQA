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

public class NodeUtil_isWithinLoop_46295102219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1703;
     Object term12692;

    public NodeUtil_isWithinLoop_46295102219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1716 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1726 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1703, term1703.getClass(), "type", -1397251956);
        setIntField(term1705, term1705.getClass(), "type", 808614267);
        setIntField(term1707, term1707.getClass(), "type", 0);
        setField(term1707, term1707.getClass(), "next", null);
        setField(term1707, term1707.getClass(), "first", null);
        setField(term1707, term1707.getClass(), "last", null);
        setField(term1707, term1707.getClass(), "propListHead", null);
        setIntField(term1707, term1707.getClass(), "sourcePosition", 0);
        setField(term1707, term1707.getClass(), "jsType", null);
        setField(term1707, term1707.getClass(), "parent", null);
        setField(term1705, term1705.getClass(), "next", term1707);
        setIntField(term1710, term1710.getClass(), "type", 0);
        setField(term1710, term1710.getClass(), "next", null);
        setField(term1710, term1710.getClass(), "first", null);
        setField(term1710, term1710.getClass(), "last", null);
        setField(term1710, term1710.getClass(), "propListHead", null);
        setIntField(term1710, term1710.getClass(), "sourcePosition", 0);
        setField(term1710, term1710.getClass(), "jsType", null);
        setField(term1710, term1710.getClass(), "parent", null);
        setField(term1705, term1705.getClass(), "first", term1710);
        setIntField(term1713, term1713.getClass(), "type", 0);
        setField(term1713, term1713.getClass(), "next", null);
        setField(term1713, term1713.getClass(), "first", null);
        setField(term1713, term1713.getClass(), "last", null);
        setField(term1713, term1713.getClass(), "propListHead", null);
        setIntField(term1713, term1713.getClass(), "sourcePosition", 0);
        setField(term1713, term1713.getClass(), "jsType", null);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1705, term1705.getClass(), "last", term1713);
        setField(term1716, term1716.getClass(), "next", null);
        setIntField(term1716, term1716.getClass(), "type", 0);
        setIntField(term1716, term1716.getClass(), "intValue", 0);
        setField(term1716, term1716.getClass(), "objectValue", null);
        setField(term1705, term1705.getClass(), "propListHead", term1716);
        setIntField(term1705, term1705.getClass(), "sourcePosition", 1789351397);
        setField(term1705, term1705.getClass(), "jsType", null);
        setField(term1705, term1705.getClass(), "parent", null);
        setField(term1703, term1703.getClass(), "next", term1705);
        setIntField(term1720, term1720.getClass(), "type", 0);
        setField(term1720, term1720.getClass(), "next", null);
        setField(term1720, term1720.getClass(), "first", null);
        setField(term1720, term1720.getClass(), "last", null);
        setField(term1720, term1720.getClass(), "propListHead", null);
        setIntField(term1720, term1720.getClass(), "sourcePosition", 0);
        setField(term1720, term1720.getClass(), "jsType", null);
        setField(term1720, term1720.getClass(), "parent", null);
        setField(term1703, term1703.getClass(), "first", term1720);
        setIntField(term1723, term1723.getClass(), "type", 0);
        setField(term1723, term1723.getClass(), "next", null);
        setField(term1723, term1723.getClass(), "first", null);
        setField(term1723, term1723.getClass(), "last", null);
        setField(term1723, term1723.getClass(), "propListHead", null);
        setIntField(term1723, term1723.getClass(), "sourcePosition", 0);
        setField(term1723, term1723.getClass(), "jsType", null);
        setField(term1723, term1723.getClass(), "parent", null);
        setField(term1703, term1703.getClass(), "last", term1723);
        setField(term1726, term1726.getClass(), "next", null);
        setIntField(term1726, term1726.getClass(), "type", 0);
        setIntField(term1726, term1726.getClass(), "intValue", 0);
        setField(term1726, term1726.getClass(), "objectValue", null);
        setField(term1703, term1703.getClass(), "propListHead", term1726);
        setIntField(term1703, term1703.getClass(), "sourcePosition", 2145528170);
        setField(term1703, term1703.getClass(), "jsType", null);
        setField(term1703, term1703.getClass(), "parent", null);
        term12692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12697 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12700 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12692, term12692.getClass(), "type", -1397251956);
        setIntField(term12693, term12693.getClass(), "type", 808614267);
        setIntField(term12694, term12694.getClass(), "type", 0);
        setField(term12694, term12694.getClass(), "next", null);
        setField(term12694, term12694.getClass(), "first", null);
        setField(term12694, term12694.getClass(), "last", null);
        setField(term12694, term12694.getClass(), "propListHead", null);
        setIntField(term12694, term12694.getClass(), "sourcePosition", 0);
        setField(term12694, term12694.getClass(), "jsType", null);
        setField(term12694, term12694.getClass(), "parent", null);
        setField(term12693, term12693.getClass(), "next", term12694);
        setIntField(term12695, term12695.getClass(), "type", 0);
        setField(term12695, term12695.getClass(), "next", null);
        setField(term12695, term12695.getClass(), "first", null);
        setField(term12695, term12695.getClass(), "last", null);
        setField(term12695, term12695.getClass(), "propListHead", null);
        setIntField(term12695, term12695.getClass(), "sourcePosition", 0);
        setField(term12695, term12695.getClass(), "jsType", null);
        setField(term12695, term12695.getClass(), "parent", null);
        setField(term12693, term12693.getClass(), "first", term12695);
        setIntField(term12696, term12696.getClass(), "type", 0);
        setField(term12696, term12696.getClass(), "next", null);
        setField(term12696, term12696.getClass(), "first", null);
        setField(term12696, term12696.getClass(), "last", null);
        setField(term12696, term12696.getClass(), "propListHead", null);
        setIntField(term12696, term12696.getClass(), "sourcePosition", 0);
        setField(term12696, term12696.getClass(), "jsType", null);
        setField(term12696, term12696.getClass(), "parent", null);
        setField(term12693, term12693.getClass(), "last", term12696);
        setField(term12697, term12697.getClass(), "next", null);
        setIntField(term12697, term12697.getClass(), "type", 0);
        setIntField(term12697, term12697.getClass(), "intValue", 0);
        setField(term12697, term12697.getClass(), "objectValue", null);
        setField(term12693, term12693.getClass(), "propListHead", term12697);
        setIntField(term12693, term12693.getClass(), "sourcePosition", 1789351397);
        setField(term12693, term12693.getClass(), "jsType", null);
        setField(term12693, term12693.getClass(), "parent", null);
        setField(term12692, term12692.getClass(), "next", term12693);
        setIntField(term12698, term12698.getClass(), "type", 0);
        setField(term12698, term12698.getClass(), "next", null);
        setField(term12698, term12698.getClass(), "first", null);
        setField(term12698, term12698.getClass(), "last", null);
        setField(term12698, term12698.getClass(), "propListHead", null);
        setIntField(term12698, term12698.getClass(), "sourcePosition", 0);
        setField(term12698, term12698.getClass(), "jsType", null);
        setField(term12698, term12698.getClass(), "parent", null);
        setField(term12692, term12692.getClass(), "first", term12698);
        setIntField(term12699, term12699.getClass(), "type", 0);
        setField(term12699, term12699.getClass(), "next", null);
        setField(term12699, term12699.getClass(), "first", null);
        setField(term12699, term12699.getClass(), "last", null);
        setField(term12699, term12699.getClass(), "propListHead", null);
        setIntField(term12699, term12699.getClass(), "sourcePosition", 0);
        setField(term12699, term12699.getClass(), "jsType", null);
        setField(term12699, term12699.getClass(), "parent", null);
        setField(term12692, term12692.getClass(), "last", term12699);
        setField(term12700, term12700.getClass(), "next", null);
        setIntField(term12700, term12700.getClass(), "type", 0);
        setIntField(term12700, term12700.getClass(), "intValue", 0);
        setField(term12700, term12700.getClass(), "objectValue", null);
        setField(term12692, term12692.getClass(), "propListHead", term12700);
        setIntField(term12692, term12692.getClass(), "sourcePosition", 2145528170);
        setField(term12692, term12692.getClass(), "jsType", null);
        setField(term12692, term12692.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1703;
        Object retValue = callMethod(klass, "isWithinLoop", argTypes, null, args);
        assertTrue(recursiveEquals(term1703, term12692));
        assertTrue(recursiveEquals(retValue, false));
    }

};


