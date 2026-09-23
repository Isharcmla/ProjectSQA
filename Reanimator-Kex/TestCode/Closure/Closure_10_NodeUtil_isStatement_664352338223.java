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
import java.lang.Object;

public class NodeUtil_isStatement_664352338223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1734;

    public NodeUtil_isStatement_664352338223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1734, term1734.getClass(), "type", 1470349147);
        setIntField(term1736, term1736.getClass(), "type", -255317272);
        setIntField(term1738, term1738.getClass(), "type", -706253892);
        setIntField(term1740, term1740.getClass(), "type", -1341439819);
        setIntField(term1742, term1742.getClass(), "type", -728760750);
        setField(term1742, term1742.getClass(), "next", null);
        setField(term1742, term1742.getClass(), "first", null);
        setField(term1742, term1742.getClass(), "last", null);
        setField(term1742, term1742.getClass(), "propListHead", null);
        setIntField(term1742, term1742.getClass(), "sourcePosition", 0);
        setField(term1742, term1742.getClass(), "jsType", null);
        setField(term1742, term1742.getClass(), "parent", null);
        setField(term1740, term1740.getClass(), "next", term1742);
        setIntField(term1745, term1745.getClass(), "type", -1617383807);
        setField(term1745, term1745.getClass(), "next", null);
        setField(term1745, term1745.getClass(), "first", null);
        setField(term1745, term1745.getClass(), "last", term1742);
        setField(term1745, term1745.getClass(), "propListHead", null);
        setIntField(term1745, term1745.getClass(), "sourcePosition", 0);
        setField(term1745, term1745.getClass(), "jsType", null);
        setField(term1745, term1745.getClass(), "parent", null);
        setField(term1740, term1740.getClass(), "first", term1745);
        setField(term1740, term1740.getClass(), "last", term1738);
        setField(term1740, term1740.getClass(), "propListHead", null);
        setIntField(term1740, term1740.getClass(), "sourcePosition", 0);
        setField(term1740, term1740.getClass(), "jsType", null);
        setField(term1740, term1740.getClass(), "parent", null);
        setField(term1738, term1738.getClass(), "next", term1740);
        setField(term1738, term1738.getClass(), "first", term1742);
        setIntField(term1749, term1749.getClass(), "type", -885788574);
        setIntField(term1751, term1751.getClass(), "type", -865722613);
        setField(term1751, term1751.getClass(), "next", null);
        setField(term1751, term1751.getClass(), "first", term1745);
        setField(term1751, term1751.getClass(), "last", term1740);
        setField(term1751, term1751.getClass(), "propListHead", null);
        setIntField(term1751, term1751.getClass(), "sourcePosition", 0);
        setField(term1751, term1751.getClass(), "jsType", null);
        setField(term1751, term1751.getClass(), "parent", null);
        setField(term1749, term1749.getClass(), "next", term1751);
        setField(term1749, term1749.getClass(), "first", term1736);
        setField(term1749, term1749.getClass(), "last", term1736);
        setField(term1749, term1749.getClass(), "propListHead", null);
        setIntField(term1749, term1749.getClass(), "sourcePosition", 0);
        setField(term1749, term1749.getClass(), "jsType", null);
        setField(term1749, term1749.getClass(), "parent", null);
        setField(term1738, term1738.getClass(), "last", term1749);
        setField(term1738, term1738.getClass(), "propListHead", null);
        setIntField(term1738, term1738.getClass(), "sourcePosition", 0);
        setField(term1738, term1738.getClass(), "jsType", null);
        setField(term1738, term1738.getClass(), "parent", null);
        setField(term1736, term1736.getClass(), "next", term1738);
        setIntField(term1756, term1756.getClass(), "type", -1551355284);
        setField(term1756, term1756.getClass(), "next", term1749);
        setField(term1756, term1756.getClass(), "first", term1751);
        setField(term1756, term1756.getClass(), "last", term1734);
        setField(term1756, term1756.getClass(), "propListHead", null);
        setIntField(term1756, term1756.getClass(), "sourcePosition", 0);
        setField(term1756, term1756.getClass(), "jsType", null);
        setField(term1756, term1756.getClass(), "parent", null);
        setField(term1736, term1736.getClass(), "first", term1756);
        setField(term1736, term1736.getClass(), "last", term1756);
        setField(term1736, term1736.getClass(), "propListHead", null);
        setIntField(term1736, term1736.getClass(), "sourcePosition", 0);
        setField(term1736, term1736.getClass(), "jsType", null);
        setField(term1736, term1736.getClass(), "parent", null);
        setField(term1734, term1734.getClass(), "next", term1736);
        setField(term1734, term1734.getClass(), "first", term1740);
        setField(term1734, term1734.getClass(), "last", term1742);
        setField(term1734, term1734.getClass(), "propListHead", null);
        setIntField(term1734, term1734.getClass(), "sourcePosition", 0);
        setField(term1734, term1734.getClass(), "jsType", null);
        setField(term1734, term1734.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1734;
        try {
            callMethod(klass, "isStatement", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


