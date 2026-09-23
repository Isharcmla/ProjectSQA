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

public class NodeUtil_isFunctionObjectCall_1433817400167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1727;
     Object term10296;

    public NodeUtil_isFunctionObjectCall_1433817400167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1740 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1750 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1727, term1727.getClass(), "type", 1851127634);
        setIntField(term1729, term1729.getClass(), "type", -365784998);
        setIntField(term1731, term1731.getClass(), "type", 0);
        setField(term1731, term1731.getClass(), "next", null);
        setField(term1731, term1731.getClass(), "first", null);
        setField(term1731, term1731.getClass(), "last", null);
        setField(term1731, term1731.getClass(), "propListHead", null);
        setIntField(term1731, term1731.getClass(), "sourcePosition", 0);
        setField(term1731, term1731.getClass(), "jsType", null);
        setField(term1731, term1731.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "next", term1731);
        setIntField(term1734, term1734.getClass(), "type", 0);
        setField(term1734, term1734.getClass(), "next", null);
        setField(term1734, term1734.getClass(), "first", null);
        setField(term1734, term1734.getClass(), "last", null);
        setField(term1734, term1734.getClass(), "propListHead", null);
        setIntField(term1734, term1734.getClass(), "sourcePosition", 0);
        setField(term1734, term1734.getClass(), "jsType", null);
        setField(term1734, term1734.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "first", term1734);
        setIntField(term1737, term1737.getClass(), "type", 0);
        setField(term1737, term1737.getClass(), "next", null);
        setField(term1737, term1737.getClass(), "first", null);
        setField(term1737, term1737.getClass(), "last", null);
        setField(term1737, term1737.getClass(), "propListHead", null);
        setIntField(term1737, term1737.getClass(), "sourcePosition", 0);
        setField(term1737, term1737.getClass(), "jsType", null);
        setField(term1737, term1737.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "last", term1737);
        setField(term1740, term1740.getClass(), "next", null);
        setIntField(term1740, term1740.getClass(), "type", 0);
        setIntField(term1740, term1740.getClass(), "intValue", 0);
        setField(term1740, term1740.getClass(), "objectValue", null);
        setField(term1729, term1729.getClass(), "propListHead", term1740);
        setIntField(term1729, term1729.getClass(), "sourcePosition", -280113263);
        setField(term1729, term1729.getClass(), "jsType", null);
        setField(term1729, term1729.getClass(), "parent", null);
        setField(term1727, term1727.getClass(), "next", term1729);
        setIntField(term1744, term1744.getClass(), "type", 0);
        setField(term1744, term1744.getClass(), "next", null);
        setField(term1744, term1744.getClass(), "first", null);
        setField(term1744, term1744.getClass(), "last", null);
        setField(term1744, term1744.getClass(), "propListHead", null);
        setIntField(term1744, term1744.getClass(), "sourcePosition", 0);
        setField(term1744, term1744.getClass(), "jsType", null);
        setField(term1744, term1744.getClass(), "parent", null);
        setField(term1727, term1727.getClass(), "first", term1744);
        setIntField(term1747, term1747.getClass(), "type", 0);
        setField(term1747, term1747.getClass(), "next", null);
        setField(term1747, term1747.getClass(), "first", null);
        setField(term1747, term1747.getClass(), "last", null);
        setField(term1747, term1747.getClass(), "propListHead", null);
        setIntField(term1747, term1747.getClass(), "sourcePosition", 0);
        setField(term1747, term1747.getClass(), "jsType", null);
        setField(term1747, term1747.getClass(), "parent", null);
        setField(term1727, term1727.getClass(), "last", term1747);
        setField(term1750, term1750.getClass(), "next", null);
        setIntField(term1750, term1750.getClass(), "type", 0);
        setIntField(term1750, term1750.getClass(), "intValue", 0);
        setField(term1750, term1750.getClass(), "objectValue", null);
        setField(term1727, term1727.getClass(), "propListHead", term1750);
        setIntField(term1727, term1727.getClass(), "sourcePosition", 529625347);
        setField(term1727, term1727.getClass(), "jsType", null);
        setField(term1727, term1727.getClass(), "parent", null);
        term10296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10301 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10304 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10296, term10296.getClass(), "type", 1851127634);
        setIntField(term10297, term10297.getClass(), "type", -365784998);
        setIntField(term10298, term10298.getClass(), "type", 0);
        setField(term10298, term10298.getClass(), "next", null);
        setField(term10298, term10298.getClass(), "first", null);
        setField(term10298, term10298.getClass(), "last", null);
        setField(term10298, term10298.getClass(), "propListHead", null);
        setIntField(term10298, term10298.getClass(), "sourcePosition", 0);
        setField(term10298, term10298.getClass(), "jsType", null);
        setField(term10298, term10298.getClass(), "parent", null);
        setField(term10297, term10297.getClass(), "next", term10298);
        setIntField(term10299, term10299.getClass(), "type", 0);
        setField(term10299, term10299.getClass(), "next", null);
        setField(term10299, term10299.getClass(), "first", null);
        setField(term10299, term10299.getClass(), "last", null);
        setField(term10299, term10299.getClass(), "propListHead", null);
        setIntField(term10299, term10299.getClass(), "sourcePosition", 0);
        setField(term10299, term10299.getClass(), "jsType", null);
        setField(term10299, term10299.getClass(), "parent", null);
        setField(term10297, term10297.getClass(), "first", term10299);
        setIntField(term10300, term10300.getClass(), "type", 0);
        setField(term10300, term10300.getClass(), "next", null);
        setField(term10300, term10300.getClass(), "first", null);
        setField(term10300, term10300.getClass(), "last", null);
        setField(term10300, term10300.getClass(), "propListHead", null);
        setIntField(term10300, term10300.getClass(), "sourcePosition", 0);
        setField(term10300, term10300.getClass(), "jsType", null);
        setField(term10300, term10300.getClass(), "parent", null);
        setField(term10297, term10297.getClass(), "last", term10300);
        setField(term10301, term10301.getClass(), "next", null);
        setIntField(term10301, term10301.getClass(), "type", 0);
        setIntField(term10301, term10301.getClass(), "intValue", 0);
        setField(term10301, term10301.getClass(), "objectValue", null);
        setField(term10297, term10297.getClass(), "propListHead", term10301);
        setIntField(term10297, term10297.getClass(), "sourcePosition", -280113263);
        setField(term10297, term10297.getClass(), "jsType", null);
        setField(term10297, term10297.getClass(), "parent", null);
        setField(term10296, term10296.getClass(), "next", term10297);
        setIntField(term10302, term10302.getClass(), "type", 0);
        setField(term10302, term10302.getClass(), "next", null);
        setField(term10302, term10302.getClass(), "first", null);
        setField(term10302, term10302.getClass(), "last", null);
        setField(term10302, term10302.getClass(), "propListHead", null);
        setIntField(term10302, term10302.getClass(), "sourcePosition", 0);
        setField(term10302, term10302.getClass(), "jsType", null);
        setField(term10302, term10302.getClass(), "parent", null);
        setField(term10296, term10296.getClass(), "first", term10302);
        setIntField(term10303, term10303.getClass(), "type", 0);
        setField(term10303, term10303.getClass(), "next", null);
        setField(term10303, term10303.getClass(), "first", null);
        setField(term10303, term10303.getClass(), "last", null);
        setField(term10303, term10303.getClass(), "propListHead", null);
        setIntField(term10303, term10303.getClass(), "sourcePosition", 0);
        setField(term10303, term10303.getClass(), "jsType", null);
        setField(term10303, term10303.getClass(), "parent", null);
        setField(term10296, term10296.getClass(), "last", term10303);
        setField(term10304, term10304.getClass(), "next", null);
        setIntField(term10304, term10304.getClass(), "type", 0);
        setIntField(term10304, term10304.getClass(), "intValue", 0);
        setField(term10304, term10304.getClass(), "objectValue", null);
        setField(term10296, term10296.getClass(), "propListHead", term10304);
        setIntField(term10296, term10296.getClass(), "sourcePosition", 529625347);
        setField(term10296, term10296.getClass(), "jsType", null);
        setField(term10296, term10296.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1727;
        callMethod(klass, "isFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1727, term10296));
    }

};


