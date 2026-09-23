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

public class NodeUtil_getConditionExpression_1686829277234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1736;

    public NodeUtil_getConditionExpression_1686829277234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1736, term1736.getClass(), "type", -255317272);
        setIntField(term1738, term1738.getClass(), "type", -706253892);
        setIntField(term1740, term1740.getClass(), "type", -1341439819);
        setIntField(term1742, term1742.getClass(), "type", -728760750);
        setIntField(term1744, term1744.getClass(), "type", -1617383807);
        setField(term1744, term1744.getClass(), "next", null);
        setField(term1744, term1744.getClass(), "first", null);
        setField(term1744, term1744.getClass(), "last", null);
        setField(term1744, term1744.getClass(), "propListHead", null);
        setIntField(term1744, term1744.getClass(), "sourcePosition", 0);
        setField(term1744, term1744.getClass(), "jsType", null);
        setField(term1744, term1744.getClass(), "parent", null);
        setField(term1742, term1742.getClass(), "next", term1744);
        setIntField(term1747, term1747.getClass(), "type", -1244386281);
        setField(term1747, term1747.getClass(), "next", null);
        setField(term1747, term1747.getClass(), "first", null);
        setField(term1747, term1747.getClass(), "last", term1744);
        setField(term1747, term1747.getClass(), "propListHead", null);
        setIntField(term1747, term1747.getClass(), "sourcePosition", 0);
        setField(term1747, term1747.getClass(), "jsType", null);
        setField(term1747, term1747.getClass(), "parent", null);
        setField(term1742, term1742.getClass(), "first", term1747);
        setField(term1742, term1742.getClass(), "last", term1740);
        setField(term1742, term1742.getClass(), "propListHead", null);
        setIntField(term1742, term1742.getClass(), "sourcePosition", 0);
        setField(term1742, term1742.getClass(), "jsType", null);
        setField(term1742, term1742.getClass(), "parent", null);
        setField(term1740, term1740.getClass(), "next", term1742);
        setField(term1740, term1740.getClass(), "first", term1744);
        setIntField(term1751, term1751.getClass(), "type", -865722613);
        setIntField(term1753, term1753.getClass(), "type", -1551355284);
        setField(term1753, term1753.getClass(), "next", null);
        setField(term1753, term1753.getClass(), "first", term1747);
        setField(term1753, term1753.getClass(), "last", term1742);
        setField(term1753, term1753.getClass(), "propListHead", null);
        setIntField(term1753, term1753.getClass(), "sourcePosition", 0);
        setField(term1753, term1753.getClass(), "jsType", null);
        setField(term1753, term1753.getClass(), "parent", null);
        setField(term1751, term1751.getClass(), "next", term1753);
        setField(term1751, term1751.getClass(), "first", term1738);
        setField(term1751, term1751.getClass(), "last", term1738);
        setField(term1751, term1751.getClass(), "propListHead", null);
        setIntField(term1751, term1751.getClass(), "sourcePosition", 0);
        setField(term1751, term1751.getClass(), "jsType", null);
        setField(term1751, term1751.getClass(), "parent", null);
        setField(term1740, term1740.getClass(), "last", term1751);
        setField(term1740, term1740.getClass(), "propListHead", null);
        setIntField(term1740, term1740.getClass(), "sourcePosition", 0);
        setField(term1740, term1740.getClass(), "jsType", null);
        setField(term1740, term1740.getClass(), "parent", null);
        setField(term1738, term1738.getClass(), "next", term1740);
        setIntField(term1758, term1758.getClass(), "type", -1381970335);
        setField(term1758, term1758.getClass(), "next", term1751);
        setField(term1758, term1758.getClass(), "first", term1753);
        setField(term1758, term1758.getClass(), "last", term1736);
        setField(term1758, term1758.getClass(), "propListHead", null);
        setIntField(term1758, term1758.getClass(), "sourcePosition", 0);
        setField(term1758, term1758.getClass(), "jsType", null);
        setField(term1758, term1758.getClass(), "parent", null);
        setField(term1738, term1738.getClass(), "first", term1758);
        setField(term1738, term1738.getClass(), "last", term1758);
        setField(term1738, term1738.getClass(), "propListHead", null);
        setIntField(term1738, term1738.getClass(), "sourcePosition", 0);
        setField(term1738, term1738.getClass(), "jsType", null);
        setField(term1738, term1738.getClass(), "parent", null);
        setField(term1736, term1736.getClass(), "next", term1738);
        setField(term1736, term1736.getClass(), "first", term1742);
        setField(term1736, term1736.getClass(), "last", term1744);
        setField(term1736, term1736.getClass(), "propListHead", null);
        setIntField(term1736, term1736.getClass(), "sourcePosition", 0);
        setField(term1736, term1736.getClass(), "jsType", null);
        setField(term1736, term1736.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1736;
        try {
            callMethod(klass, "getConditionExpression", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


