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

public class NodeUtil_isFunctionObjectApply_1904386250166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1727;
     Object term10278;

    public NodeUtil_isFunctionObjectApply_1904386250166() {
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
        term10278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10280 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10283 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10286 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10278, term10278.getClass(), "type", 1851127634);
        setIntField(term10279, term10279.getClass(), "type", -365784998);
        setIntField(term10280, term10280.getClass(), "type", 0);
        setField(term10280, term10280.getClass(), "next", null);
        setField(term10280, term10280.getClass(), "first", null);
        setField(term10280, term10280.getClass(), "last", null);
        setField(term10280, term10280.getClass(), "propListHead", null);
        setIntField(term10280, term10280.getClass(), "sourcePosition", 0);
        setField(term10280, term10280.getClass(), "jsType", null);
        setField(term10280, term10280.getClass(), "parent", null);
        setField(term10279, term10279.getClass(), "next", term10280);
        setIntField(term10281, term10281.getClass(), "type", 0);
        setField(term10281, term10281.getClass(), "next", null);
        setField(term10281, term10281.getClass(), "first", null);
        setField(term10281, term10281.getClass(), "last", null);
        setField(term10281, term10281.getClass(), "propListHead", null);
        setIntField(term10281, term10281.getClass(), "sourcePosition", 0);
        setField(term10281, term10281.getClass(), "jsType", null);
        setField(term10281, term10281.getClass(), "parent", null);
        setField(term10279, term10279.getClass(), "first", term10281);
        setIntField(term10282, term10282.getClass(), "type", 0);
        setField(term10282, term10282.getClass(), "next", null);
        setField(term10282, term10282.getClass(), "first", null);
        setField(term10282, term10282.getClass(), "last", null);
        setField(term10282, term10282.getClass(), "propListHead", null);
        setIntField(term10282, term10282.getClass(), "sourcePosition", 0);
        setField(term10282, term10282.getClass(), "jsType", null);
        setField(term10282, term10282.getClass(), "parent", null);
        setField(term10279, term10279.getClass(), "last", term10282);
        setField(term10283, term10283.getClass(), "next", null);
        setIntField(term10283, term10283.getClass(), "type", 0);
        setIntField(term10283, term10283.getClass(), "intValue", 0);
        setField(term10283, term10283.getClass(), "objectValue", null);
        setField(term10279, term10279.getClass(), "propListHead", term10283);
        setIntField(term10279, term10279.getClass(), "sourcePosition", -280113263);
        setField(term10279, term10279.getClass(), "jsType", null);
        setField(term10279, term10279.getClass(), "parent", null);
        setField(term10278, term10278.getClass(), "next", term10279);
        setIntField(term10284, term10284.getClass(), "type", 0);
        setField(term10284, term10284.getClass(), "next", null);
        setField(term10284, term10284.getClass(), "first", null);
        setField(term10284, term10284.getClass(), "last", null);
        setField(term10284, term10284.getClass(), "propListHead", null);
        setIntField(term10284, term10284.getClass(), "sourcePosition", 0);
        setField(term10284, term10284.getClass(), "jsType", null);
        setField(term10284, term10284.getClass(), "parent", null);
        setField(term10278, term10278.getClass(), "first", term10284);
        setIntField(term10285, term10285.getClass(), "type", 0);
        setField(term10285, term10285.getClass(), "next", null);
        setField(term10285, term10285.getClass(), "first", null);
        setField(term10285, term10285.getClass(), "last", null);
        setField(term10285, term10285.getClass(), "propListHead", null);
        setIntField(term10285, term10285.getClass(), "sourcePosition", 0);
        setField(term10285, term10285.getClass(), "jsType", null);
        setField(term10285, term10285.getClass(), "parent", null);
        setField(term10278, term10278.getClass(), "last", term10285);
        setField(term10286, term10286.getClass(), "next", null);
        setIntField(term10286, term10286.getClass(), "type", 0);
        setIntField(term10286, term10286.getClass(), "intValue", 0);
        setField(term10286, term10286.getClass(), "objectValue", null);
        setField(term10278, term10278.getClass(), "propListHead", term10286);
        setIntField(term10278, term10278.getClass(), "sourcePosition", 529625347);
        setField(term10278, term10278.getClass(), "jsType", null);
        setField(term10278, term10278.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1727;
        callMethod(klass, "isFunctionObjectApply", argTypes, null, args);
        assertTrue(recursiveEquals(term1727, term10278));
    }

};


