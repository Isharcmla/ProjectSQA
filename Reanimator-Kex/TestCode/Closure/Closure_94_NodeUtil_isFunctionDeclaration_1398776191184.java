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

public class NodeUtil_isFunctionDeclaration_1398776191184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1788;
     Object term11768;

    public NodeUtil_isFunctionDeclaration_1398776191184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1801 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1811 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1788, term1788.getClass(), "type", 2109912812);
        setIntField(term1790, term1790.getClass(), "type", -2093862988);
        setIntField(term1792, term1792.getClass(), "type", 0);
        setField(term1792, term1792.getClass(), "next", null);
        setField(term1792, term1792.getClass(), "first", null);
        setField(term1792, term1792.getClass(), "last", null);
        setField(term1792, term1792.getClass(), "propListHead", null);
        setIntField(term1792, term1792.getClass(), "sourcePosition", 0);
        setField(term1792, term1792.getClass(), "jsType", null);
        setField(term1792, term1792.getClass(), "parent", null);
        setField(term1790, term1790.getClass(), "next", term1792);
        setIntField(term1795, term1795.getClass(), "type", 0);
        setField(term1795, term1795.getClass(), "next", null);
        setField(term1795, term1795.getClass(), "first", null);
        setField(term1795, term1795.getClass(), "last", null);
        setField(term1795, term1795.getClass(), "propListHead", null);
        setIntField(term1795, term1795.getClass(), "sourcePosition", 0);
        setField(term1795, term1795.getClass(), "jsType", null);
        setField(term1795, term1795.getClass(), "parent", null);
        setField(term1790, term1790.getClass(), "first", term1795);
        setIntField(term1798, term1798.getClass(), "type", 0);
        setField(term1798, term1798.getClass(), "next", null);
        setField(term1798, term1798.getClass(), "first", null);
        setField(term1798, term1798.getClass(), "last", null);
        setField(term1798, term1798.getClass(), "propListHead", null);
        setIntField(term1798, term1798.getClass(), "sourcePosition", 0);
        setField(term1798, term1798.getClass(), "jsType", null);
        setField(term1798, term1798.getClass(), "parent", null);
        setField(term1790, term1790.getClass(), "last", term1798);
        setField(term1801, term1801.getClass(), "next", null);
        setIntField(term1801, term1801.getClass(), "type", 0);
        setIntField(term1801, term1801.getClass(), "intValue", 0);
        setField(term1801, term1801.getClass(), "objectValue", null);
        setField(term1790, term1790.getClass(), "propListHead", term1801);
        setIntField(term1790, term1790.getClass(), "sourcePosition", -13725716);
        setField(term1790, term1790.getClass(), "jsType", null);
        setField(term1790, term1790.getClass(), "parent", null);
        setField(term1788, term1788.getClass(), "next", term1790);
        setIntField(term1805, term1805.getClass(), "type", 0);
        setField(term1805, term1805.getClass(), "next", null);
        setField(term1805, term1805.getClass(), "first", null);
        setField(term1805, term1805.getClass(), "last", null);
        setField(term1805, term1805.getClass(), "propListHead", null);
        setIntField(term1805, term1805.getClass(), "sourcePosition", 0);
        setField(term1805, term1805.getClass(), "jsType", null);
        setField(term1805, term1805.getClass(), "parent", null);
        setField(term1788, term1788.getClass(), "first", term1805);
        setIntField(term1808, term1808.getClass(), "type", 0);
        setField(term1808, term1808.getClass(), "next", null);
        setField(term1808, term1808.getClass(), "first", null);
        setField(term1808, term1808.getClass(), "last", null);
        setField(term1808, term1808.getClass(), "propListHead", null);
        setIntField(term1808, term1808.getClass(), "sourcePosition", 0);
        setField(term1808, term1808.getClass(), "jsType", null);
        setField(term1808, term1808.getClass(), "parent", null);
        setField(term1788, term1788.getClass(), "last", term1808);
        setField(term1811, term1811.getClass(), "next", null);
        setIntField(term1811, term1811.getClass(), "type", 0);
        setIntField(term1811, term1811.getClass(), "intValue", 0);
        setField(term1811, term1811.getClass(), "objectValue", null);
        setField(term1788, term1788.getClass(), "propListHead", term1811);
        setIntField(term1788, term1788.getClass(), "sourcePosition", -1695750603);
        setField(term1788, term1788.getClass(), "jsType", null);
        setField(term1788, term1788.getClass(), "parent", null);
        term11768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11773 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11776 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11768, term11768.getClass(), "type", 2109912812);
        setIntField(term11769, term11769.getClass(), "type", -2093862988);
        setIntField(term11770, term11770.getClass(), "type", 0);
        setField(term11770, term11770.getClass(), "next", null);
        setField(term11770, term11770.getClass(), "first", null);
        setField(term11770, term11770.getClass(), "last", null);
        setField(term11770, term11770.getClass(), "propListHead", null);
        setIntField(term11770, term11770.getClass(), "sourcePosition", 0);
        setField(term11770, term11770.getClass(), "jsType", null);
        setField(term11770, term11770.getClass(), "parent", null);
        setField(term11769, term11769.getClass(), "next", term11770);
        setIntField(term11771, term11771.getClass(), "type", 0);
        setField(term11771, term11771.getClass(), "next", null);
        setField(term11771, term11771.getClass(), "first", null);
        setField(term11771, term11771.getClass(), "last", null);
        setField(term11771, term11771.getClass(), "propListHead", null);
        setIntField(term11771, term11771.getClass(), "sourcePosition", 0);
        setField(term11771, term11771.getClass(), "jsType", null);
        setField(term11771, term11771.getClass(), "parent", null);
        setField(term11769, term11769.getClass(), "first", term11771);
        setIntField(term11772, term11772.getClass(), "type", 0);
        setField(term11772, term11772.getClass(), "next", null);
        setField(term11772, term11772.getClass(), "first", null);
        setField(term11772, term11772.getClass(), "last", null);
        setField(term11772, term11772.getClass(), "propListHead", null);
        setIntField(term11772, term11772.getClass(), "sourcePosition", 0);
        setField(term11772, term11772.getClass(), "jsType", null);
        setField(term11772, term11772.getClass(), "parent", null);
        setField(term11769, term11769.getClass(), "last", term11772);
        setField(term11773, term11773.getClass(), "next", null);
        setIntField(term11773, term11773.getClass(), "type", 0);
        setIntField(term11773, term11773.getClass(), "intValue", 0);
        setField(term11773, term11773.getClass(), "objectValue", null);
        setField(term11769, term11769.getClass(), "propListHead", term11773);
        setIntField(term11769, term11769.getClass(), "sourcePosition", -13725716);
        setField(term11769, term11769.getClass(), "jsType", null);
        setField(term11769, term11769.getClass(), "parent", null);
        setField(term11768, term11768.getClass(), "next", term11769);
        setIntField(term11774, term11774.getClass(), "type", 0);
        setField(term11774, term11774.getClass(), "next", null);
        setField(term11774, term11774.getClass(), "first", null);
        setField(term11774, term11774.getClass(), "last", null);
        setField(term11774, term11774.getClass(), "propListHead", null);
        setIntField(term11774, term11774.getClass(), "sourcePosition", 0);
        setField(term11774, term11774.getClass(), "jsType", null);
        setField(term11774, term11774.getClass(), "parent", null);
        setField(term11768, term11768.getClass(), "first", term11774);
        setIntField(term11775, term11775.getClass(), "type", 0);
        setField(term11775, term11775.getClass(), "next", null);
        setField(term11775, term11775.getClass(), "first", null);
        setField(term11775, term11775.getClass(), "last", null);
        setField(term11775, term11775.getClass(), "propListHead", null);
        setIntField(term11775, term11775.getClass(), "sourcePosition", 0);
        setField(term11775, term11775.getClass(), "jsType", null);
        setField(term11775, term11775.getClass(), "parent", null);
        setField(term11768, term11768.getClass(), "last", term11775);
        setField(term11776, term11776.getClass(), "next", null);
        setIntField(term11776, term11776.getClass(), "type", 0);
        setIntField(term11776, term11776.getClass(), "intValue", 0);
        setField(term11776, term11776.getClass(), "objectValue", null);
        setField(term11768, term11768.getClass(), "propListHead", term11776);
        setIntField(term11768, term11768.getClass(), "sourcePosition", -1695750603);
        setField(term11768, term11768.getClass(), "jsType", null);
        setField(term11768, term11768.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1788;
        Object retValue = callMethod(klass, "isFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1788, term11768));
        assertTrue(recursiveEquals(retValue, false));
    }

};


