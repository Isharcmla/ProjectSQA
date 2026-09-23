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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getFunctionBody_1855640240181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1707;

    public NodeUtil_getFunctionBody_1855640240181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1720 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1730 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1707, term1707.getClass(), "type", 1851127634);
        setIntField(term1709, term1709.getClass(), "type", -365784998);
        setIntField(term1711, term1711.getClass(), "type", 0);
        setField(term1711, term1711.getClass(), "next", null);
        setField(term1711, term1711.getClass(), "first", null);
        setField(term1711, term1711.getClass(), "last", null);
        setField(term1711, term1711.getClass(), "propListHead", null);
        setIntField(term1711, term1711.getClass(), "sourcePosition", 0);
        setField(term1711, term1711.getClass(), "jsType", null);
        setField(term1711, term1711.getClass(), "parent", null);
        setField(term1709, term1709.getClass(), "next", term1711);
        setIntField(term1714, term1714.getClass(), "type", 0);
        setField(term1714, term1714.getClass(), "next", null);
        setField(term1714, term1714.getClass(), "first", null);
        setField(term1714, term1714.getClass(), "last", null);
        setField(term1714, term1714.getClass(), "propListHead", null);
        setIntField(term1714, term1714.getClass(), "sourcePosition", 0);
        setField(term1714, term1714.getClass(), "jsType", null);
        setField(term1714, term1714.getClass(), "parent", null);
        setField(term1709, term1709.getClass(), "first", term1714);
        setIntField(term1717, term1717.getClass(), "type", 0);
        setField(term1717, term1717.getClass(), "next", null);
        setField(term1717, term1717.getClass(), "first", null);
        setField(term1717, term1717.getClass(), "last", null);
        setField(term1717, term1717.getClass(), "propListHead", null);
        setIntField(term1717, term1717.getClass(), "sourcePosition", 0);
        setField(term1717, term1717.getClass(), "jsType", null);
        setField(term1717, term1717.getClass(), "parent", null);
        setField(term1709, term1709.getClass(), "last", term1717);
        setField(term1720, term1720.getClass(), "next", null);
        setIntField(term1720, term1720.getClass(), "type", 0);
        setIntField(term1720, term1720.getClass(), "intValue", 0);
        setField(term1720, term1720.getClass(), "objectValue", null);
        setField(term1709, term1709.getClass(), "propListHead", term1720);
        setIntField(term1709, term1709.getClass(), "sourcePosition", -280113263);
        setField(term1709, term1709.getClass(), "jsType", null);
        setField(term1709, term1709.getClass(), "parent", null);
        setField(term1707, term1707.getClass(), "next", term1709);
        setIntField(term1724, term1724.getClass(), "type", 0);
        setField(term1724, term1724.getClass(), "next", null);
        setField(term1724, term1724.getClass(), "first", null);
        setField(term1724, term1724.getClass(), "last", null);
        setField(term1724, term1724.getClass(), "propListHead", null);
        setIntField(term1724, term1724.getClass(), "sourcePosition", 0);
        setField(term1724, term1724.getClass(), "jsType", null);
        setField(term1724, term1724.getClass(), "parent", null);
        setField(term1707, term1707.getClass(), "first", term1724);
        setIntField(term1727, term1727.getClass(), "type", 0);
        setField(term1727, term1727.getClass(), "next", null);
        setField(term1727, term1727.getClass(), "first", null);
        setField(term1727, term1727.getClass(), "last", null);
        setField(term1727, term1727.getClass(), "propListHead", null);
        setIntField(term1727, term1727.getClass(), "sourcePosition", 0);
        setField(term1727, term1727.getClass(), "jsType", null);
        setField(term1727, term1727.getClass(), "parent", null);
        setField(term1707, term1707.getClass(), "last", term1727);
        setField(term1730, term1730.getClass(), "next", null);
        setIntField(term1730, term1730.getClass(), "type", 0);
        setIntField(term1730, term1730.getClass(), "intValue", 0);
        setField(term1730, term1730.getClass(), "objectValue", null);
        setField(term1707, term1707.getClass(), "propListHead", term1730);
        setIntField(term1707, term1707.getClass(), "sourcePosition", 529625347);
        setField(term1707, term1707.getClass(), "jsType", null);
        setField(term1707, term1707.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1707;
        try {
            callMethod(klass, "getFunctionBody", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


