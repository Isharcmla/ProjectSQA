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

public class NodeUtil_containsCall_2124673690183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1761;
     Object term11729;

    public NodeUtil_containsCall_2124673690183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1774 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1784 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1761, term1761.getClass(), "type", -1288536479);
        setIntField(term1763, term1763.getClass(), "type", -1933419449);
        setIntField(term1765, term1765.getClass(), "type", 0);
        setField(term1765, term1765.getClass(), "next", null);
        setField(term1765, term1765.getClass(), "first", null);
        setField(term1765, term1765.getClass(), "last", null);
        setField(term1765, term1765.getClass(), "propListHead", null);
        setIntField(term1765, term1765.getClass(), "sourcePosition", 0);
        setField(term1765, term1765.getClass(), "jsType", null);
        setField(term1765, term1765.getClass(), "parent", null);
        setField(term1763, term1763.getClass(), "next", term1765);
        setIntField(term1768, term1768.getClass(), "type", 0);
        setField(term1768, term1768.getClass(), "next", null);
        setField(term1768, term1768.getClass(), "first", null);
        setField(term1768, term1768.getClass(), "last", null);
        setField(term1768, term1768.getClass(), "propListHead", null);
        setIntField(term1768, term1768.getClass(), "sourcePosition", 0);
        setField(term1768, term1768.getClass(), "jsType", null);
        setField(term1768, term1768.getClass(), "parent", null);
        setField(term1763, term1763.getClass(), "first", term1768);
        setIntField(term1771, term1771.getClass(), "type", 0);
        setField(term1771, term1771.getClass(), "next", null);
        setField(term1771, term1771.getClass(), "first", null);
        setField(term1771, term1771.getClass(), "last", null);
        setField(term1771, term1771.getClass(), "propListHead", null);
        setIntField(term1771, term1771.getClass(), "sourcePosition", 0);
        setField(term1771, term1771.getClass(), "jsType", null);
        setField(term1771, term1771.getClass(), "parent", null);
        setField(term1763, term1763.getClass(), "last", term1771);
        setField(term1774, term1774.getClass(), "next", null);
        setIntField(term1774, term1774.getClass(), "type", 0);
        setIntField(term1774, term1774.getClass(), "intValue", 0);
        setField(term1774, term1774.getClass(), "objectValue", null);
        setField(term1763, term1763.getClass(), "propListHead", term1774);
        setIntField(term1763, term1763.getClass(), "sourcePosition", -834193529);
        setField(term1763, term1763.getClass(), "jsType", null);
        setField(term1763, term1763.getClass(), "parent", null);
        setField(term1761, term1761.getClass(), "next", term1763);
        setIntField(term1778, term1778.getClass(), "type", 0);
        setField(term1778, term1778.getClass(), "next", null);
        setField(term1778, term1778.getClass(), "first", null);
        setField(term1778, term1778.getClass(), "last", null);
        setField(term1778, term1778.getClass(), "propListHead", null);
        setIntField(term1778, term1778.getClass(), "sourcePosition", 0);
        setField(term1778, term1778.getClass(), "jsType", null);
        setField(term1778, term1778.getClass(), "parent", null);
        setField(term1761, term1761.getClass(), "first", term1778);
        setIntField(term1781, term1781.getClass(), "type", 0);
        setField(term1781, term1781.getClass(), "next", null);
        setField(term1781, term1781.getClass(), "first", null);
        setField(term1781, term1781.getClass(), "last", null);
        setField(term1781, term1781.getClass(), "propListHead", null);
        setIntField(term1781, term1781.getClass(), "sourcePosition", 0);
        setField(term1781, term1781.getClass(), "jsType", null);
        setField(term1781, term1781.getClass(), "parent", null);
        setField(term1761, term1761.getClass(), "last", term1781);
        setField(term1784, term1784.getClass(), "next", null);
        setIntField(term1784, term1784.getClass(), "type", 0);
        setIntField(term1784, term1784.getClass(), "intValue", 0);
        setField(term1784, term1784.getClass(), "objectValue", null);
        setField(term1761, term1761.getClass(), "propListHead", term1784);
        setIntField(term1761, term1761.getClass(), "sourcePosition", 335780735);
        setField(term1761, term1761.getClass(), "jsType", null);
        setField(term1761, term1761.getClass(), "parent", null);
        term11729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11734 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11737 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11729, term11729.getClass(), "type", -1288536479);
        setIntField(term11730, term11730.getClass(), "type", -1933419449);
        setIntField(term11731, term11731.getClass(), "type", 0);
        setField(term11731, term11731.getClass(), "next", null);
        setField(term11731, term11731.getClass(), "first", null);
        setField(term11731, term11731.getClass(), "last", null);
        setField(term11731, term11731.getClass(), "propListHead", null);
        setIntField(term11731, term11731.getClass(), "sourcePosition", 0);
        setField(term11731, term11731.getClass(), "jsType", null);
        setField(term11731, term11731.getClass(), "parent", null);
        setField(term11730, term11730.getClass(), "next", term11731);
        setIntField(term11732, term11732.getClass(), "type", 0);
        setField(term11732, term11732.getClass(), "next", null);
        setField(term11732, term11732.getClass(), "first", null);
        setField(term11732, term11732.getClass(), "last", null);
        setField(term11732, term11732.getClass(), "propListHead", null);
        setIntField(term11732, term11732.getClass(), "sourcePosition", 0);
        setField(term11732, term11732.getClass(), "jsType", null);
        setField(term11732, term11732.getClass(), "parent", null);
        setField(term11730, term11730.getClass(), "first", term11732);
        setIntField(term11733, term11733.getClass(), "type", 0);
        setField(term11733, term11733.getClass(), "next", null);
        setField(term11733, term11733.getClass(), "first", null);
        setField(term11733, term11733.getClass(), "last", null);
        setField(term11733, term11733.getClass(), "propListHead", null);
        setIntField(term11733, term11733.getClass(), "sourcePosition", 0);
        setField(term11733, term11733.getClass(), "jsType", null);
        setField(term11733, term11733.getClass(), "parent", null);
        setField(term11730, term11730.getClass(), "last", term11733);
        setField(term11734, term11734.getClass(), "next", null);
        setIntField(term11734, term11734.getClass(), "type", 0);
        setIntField(term11734, term11734.getClass(), "intValue", 0);
        setField(term11734, term11734.getClass(), "objectValue", null);
        setField(term11730, term11730.getClass(), "propListHead", term11734);
        setIntField(term11730, term11730.getClass(), "sourcePosition", -834193529);
        setField(term11730, term11730.getClass(), "jsType", null);
        setField(term11730, term11730.getClass(), "parent", null);
        setField(term11729, term11729.getClass(), "next", term11730);
        setIntField(term11735, term11735.getClass(), "type", 0);
        setField(term11735, term11735.getClass(), "next", null);
        setField(term11735, term11735.getClass(), "first", null);
        setField(term11735, term11735.getClass(), "last", null);
        setField(term11735, term11735.getClass(), "propListHead", null);
        setIntField(term11735, term11735.getClass(), "sourcePosition", 0);
        setField(term11735, term11735.getClass(), "jsType", null);
        setField(term11735, term11735.getClass(), "parent", null);
        setField(term11729, term11729.getClass(), "first", term11735);
        setIntField(term11736, term11736.getClass(), "type", 0);
        setField(term11736, term11736.getClass(), "next", null);
        setField(term11736, term11736.getClass(), "first", null);
        setField(term11736, term11736.getClass(), "last", null);
        setField(term11736, term11736.getClass(), "propListHead", null);
        setIntField(term11736, term11736.getClass(), "sourcePosition", 0);
        setField(term11736, term11736.getClass(), "jsType", null);
        setField(term11736, term11736.getClass(), "parent", null);
        setField(term11729, term11729.getClass(), "last", term11736);
        setField(term11737, term11737.getClass(), "next", null);
        setIntField(term11737, term11737.getClass(), "type", 0);
        setIntField(term11737, term11737.getClass(), "intValue", 0);
        setField(term11737, term11737.getClass(), "objectValue", null);
        setField(term11729, term11729.getClass(), "propListHead", term11737);
        setIntField(term11729, term11729.getClass(), "sourcePosition", 335780735);
        setField(term11729, term11729.getClass(), "jsType", null);
        setField(term11729, term11729.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1761;
        callMethod(klass, "containsCall", argTypes, null, args);
        assertTrue(recursiveEquals(term1761, term11729));
    }

};


