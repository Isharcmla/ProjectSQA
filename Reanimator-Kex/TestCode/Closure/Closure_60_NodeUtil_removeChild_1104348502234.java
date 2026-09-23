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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_removeChild_1104348502234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1645;
     Object term1666;

    public NodeUtil_removeChild_1104348502234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1645, term1645.getClass(), "type", 1851127634);
        setIntField(term1647, term1647.getClass(), "type", -365784998);
        setIntField(term1649, term1649.getClass(), "type", 0);
        setField(term1649, term1649.getClass(), "next", null);
        setField(term1649, term1649.getClass(), "first", null);
        setField(term1649, term1649.getClass(), "last", null);
        setField(term1649, term1649.getClass(), "propListHead", null);
        setIntField(term1649, term1649.getClass(), "sourcePosition", 0);
        setField(term1649, term1649.getClass(), "jsType", null);
        setField(term1649, term1649.getClass(), "parent", null);
        setField(term1647, term1647.getClass(), "next", term1649);
        setIntField(term1652, term1652.getClass(), "type", 0);
        setField(term1652, term1652.getClass(), "next", null);
        setField(term1652, term1652.getClass(), "first", null);
        setField(term1652, term1652.getClass(), "last", null);
        setField(term1652, term1652.getClass(), "propListHead", null);
        setIntField(term1652, term1652.getClass(), "sourcePosition", 0);
        setField(term1652, term1652.getClass(), "jsType", null);
        setField(term1652, term1652.getClass(), "parent", null);
        setField(term1647, term1647.getClass(), "first", term1652);
        setIntField(term1655, term1655.getClass(), "type", 0);
        setField(term1655, term1655.getClass(), "next", null);
        setField(term1655, term1655.getClass(), "first", null);
        setField(term1655, term1655.getClass(), "last", null);
        setField(term1655, term1655.getClass(), "propListHead", null);
        setIntField(term1655, term1655.getClass(), "sourcePosition", 0);
        setField(term1655, term1655.getClass(), "jsType", null);
        setField(term1655, term1655.getClass(), "parent", null);
        setField(term1647, term1647.getClass(), "last", term1655);
        setField(term1647, term1647.getClass(), "propListHead", null);
        setIntField(term1647, term1647.getClass(), "sourcePosition", 0);
        setField(term1647, term1647.getClass(), "jsType", null);
        setField(term1647, term1647.getClass(), "parent", null);
        setField(term1645, term1645.getClass(), "next", term1647);
        setIntField(term1659, term1659.getClass(), "type", 0);
        setField(term1659, term1659.getClass(), "next", null);
        setField(term1659, term1659.getClass(), "first", null);
        setField(term1659, term1659.getClass(), "last", null);
        setField(term1659, term1659.getClass(), "propListHead", null);
        setIntField(term1659, term1659.getClass(), "sourcePosition", 0);
        setField(term1659, term1659.getClass(), "jsType", null);
        setField(term1659, term1659.getClass(), "parent", null);
        setField(term1645, term1645.getClass(), "first", term1659);
        setIntField(term1662, term1662.getClass(), "type", 0);
        setField(term1662, term1662.getClass(), "next", null);
        setField(term1662, term1662.getClass(), "first", null);
        setField(term1662, term1662.getClass(), "last", null);
        setField(term1662, term1662.getClass(), "propListHead", null);
        setIntField(term1662, term1662.getClass(), "sourcePosition", 0);
        setField(term1662, term1662.getClass(), "jsType", null);
        setField(term1662, term1662.getClass(), "parent", null);
        setField(term1645, term1645.getClass(), "last", term1662);
        setField(term1645, term1645.getClass(), "propListHead", null);
        setIntField(term1645, term1645.getClass(), "sourcePosition", 0);
        setField(term1645, term1645.getClass(), "jsType", null);
        setField(term1645, term1645.getClass(), "parent", null);
        term1666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1666, term1666.getClass(), "type", 315179039);
        setIntField(term1668, term1668.getClass(), "type", -1934033808);
        setIntField(term1670, term1670.getClass(), "type", 0);
        setField(term1670, term1670.getClass(), "next", null);
        setField(term1670, term1670.getClass(), "first", null);
        setField(term1670, term1670.getClass(), "last", null);
        setField(term1670, term1670.getClass(), "propListHead", null);
        setIntField(term1670, term1670.getClass(), "sourcePosition", 0);
        setField(term1670, term1670.getClass(), "jsType", null);
        setField(term1670, term1670.getClass(), "parent", null);
        setField(term1668, term1668.getClass(), "next", term1670);
        setIntField(term1673, term1673.getClass(), "type", 0);
        setField(term1673, term1673.getClass(), "next", null);
        setField(term1673, term1673.getClass(), "first", null);
        setField(term1673, term1673.getClass(), "last", null);
        setField(term1673, term1673.getClass(), "propListHead", null);
        setIntField(term1673, term1673.getClass(), "sourcePosition", 0);
        setField(term1673, term1673.getClass(), "jsType", null);
        setField(term1673, term1673.getClass(), "parent", null);
        setField(term1668, term1668.getClass(), "first", term1673);
        setIntField(term1676, term1676.getClass(), "type", 0);
        setField(term1676, term1676.getClass(), "next", null);
        setField(term1676, term1676.getClass(), "first", null);
        setField(term1676, term1676.getClass(), "last", null);
        setField(term1676, term1676.getClass(), "propListHead", null);
        setIntField(term1676, term1676.getClass(), "sourcePosition", 0);
        setField(term1676, term1676.getClass(), "jsType", null);
        setField(term1676, term1676.getClass(), "parent", null);
        setField(term1668, term1668.getClass(), "last", term1676);
        setField(term1668, term1668.getClass(), "propListHead", null);
        setIntField(term1668, term1668.getClass(), "sourcePosition", 0);
        setField(term1668, term1668.getClass(), "jsType", null);
        setField(term1668, term1668.getClass(), "parent", null);
        setField(term1666, term1666.getClass(), "next", term1668);
        setIntField(term1680, term1680.getClass(), "type", 0);
        setField(term1680, term1680.getClass(), "next", null);
        setField(term1680, term1680.getClass(), "first", null);
        setField(term1680, term1680.getClass(), "last", null);
        setField(term1680, term1680.getClass(), "propListHead", null);
        setIntField(term1680, term1680.getClass(), "sourcePosition", 0);
        setField(term1680, term1680.getClass(), "jsType", null);
        setField(term1680, term1680.getClass(), "parent", null);
        setField(term1666, term1666.getClass(), "first", term1680);
        setIntField(term1683, term1683.getClass(), "type", 0);
        setField(term1683, term1683.getClass(), "next", null);
        setField(term1683, term1683.getClass(), "first", null);
        setField(term1683, term1683.getClass(), "last", null);
        setField(term1683, term1683.getClass(), "propListHead", null);
        setIntField(term1683, term1683.getClass(), "sourcePosition", 0);
        setField(term1683, term1683.getClass(), "jsType", null);
        setField(term1683, term1683.getClass(), "parent", null);
        setField(term1666, term1666.getClass(), "last", term1683);
        setField(term1666, term1666.getClass(), "propListHead", null);
        setIntField(term1666, term1666.getClass(), "sourcePosition", 0);
        setField(term1666, term1666.getClass(), "jsType", null);
        setField(term1666, term1666.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1645;
        args[1] = term1666;
        try {
            callMethod(klass, "removeChild", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


