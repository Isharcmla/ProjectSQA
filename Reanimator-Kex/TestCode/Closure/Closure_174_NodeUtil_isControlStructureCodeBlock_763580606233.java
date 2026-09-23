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

public class NodeUtil_isControlStructureCodeBlock_763580606233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1682;
     Object term1709;

    public NodeUtil_isControlStructureCodeBlock_763580606233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1682, term1682.getClass(), "type", 752615112);
        setIntField(term1684, term1684.getClass(), "type", -1674430871);
        setIntField(term1686, term1686.getClass(), "type", 794352120);
        setIntField(term1688, term1688.getClass(), "type", 340719678);
        setIntField(term1690, term1690.getClass(), "type", 299791142);
        setField(term1690, term1690.getClass(), "next", null);
        setField(term1690, term1690.getClass(), "first", null);
        setField(term1690, term1690.getClass(), "last", null);
        setField(term1690, term1690.getClass(), "propListHead", null);
        setIntField(term1690, term1690.getClass(), "sourcePosition", 0);
        setField(term1690, term1690.getClass(), "jsType", null);
        setField(term1690, term1690.getClass(), "parent", null);
        setField(term1688, term1688.getClass(), "next", term1690);
        setIntField(term1693, term1693.getClass(), "type", 1862191391);
        setField(term1693, term1693.getClass(), "next", null);
        setField(term1693, term1693.getClass(), "first", null);
        setField(term1693, term1693.getClass(), "last", term1690);
        setField(term1693, term1693.getClass(), "propListHead", null);
        setIntField(term1693, term1693.getClass(), "sourcePosition", 0);
        setField(term1693, term1693.getClass(), "jsType", null);
        setField(term1693, term1693.getClass(), "parent", null);
        setField(term1688, term1688.getClass(), "first", term1693);
        setField(term1688, term1688.getClass(), "last", term1686);
        setField(term1688, term1688.getClass(), "propListHead", null);
        setIntField(term1688, term1688.getClass(), "sourcePosition", 0);
        setField(term1688, term1688.getClass(), "jsType", null);
        setField(term1688, term1688.getClass(), "parent", null);
        setField(term1686, term1686.getClass(), "next", term1688);
        setField(term1686, term1686.getClass(), "first", term1690);
        setIntField(term1697, term1697.getClass(), "type", -344907703);
        setIntField(term1699, term1699.getClass(), "type", 824341437);
        setField(term1699, term1699.getClass(), "next", null);
        setField(term1699, term1699.getClass(), "first", term1693);
        setField(term1699, term1699.getClass(), "last", term1688);
        setField(term1699, term1699.getClass(), "propListHead", null);
        setIntField(term1699, term1699.getClass(), "sourcePosition", 0);
        setField(term1699, term1699.getClass(), "jsType", null);
        setField(term1699, term1699.getClass(), "parent", null);
        setField(term1697, term1697.getClass(), "next", term1699);
        setField(term1697, term1697.getClass(), "first", term1684);
        setField(term1697, term1697.getClass(), "last", term1684);
        setField(term1697, term1697.getClass(), "propListHead", null);
        setIntField(term1697, term1697.getClass(), "sourcePosition", 0);
        setField(term1697, term1697.getClass(), "jsType", null);
        setField(term1697, term1697.getClass(), "parent", null);
        setField(term1686, term1686.getClass(), "last", term1697);
        setField(term1686, term1686.getClass(), "propListHead", null);
        setIntField(term1686, term1686.getClass(), "sourcePosition", 0);
        setField(term1686, term1686.getClass(), "jsType", null);
        setField(term1686, term1686.getClass(), "parent", null);
        setField(term1684, term1684.getClass(), "next", term1686);
        setIntField(term1704, term1704.getClass(), "type", -1794965320);
        setField(term1704, term1704.getClass(), "next", term1697);
        setField(term1704, term1704.getClass(), "first", term1699);
        setField(term1704, term1704.getClass(), "last", term1682);
        setField(term1704, term1704.getClass(), "propListHead", null);
        setIntField(term1704, term1704.getClass(), "sourcePosition", 0);
        setField(term1704, term1704.getClass(), "jsType", null);
        setField(term1704, term1704.getClass(), "parent", null);
        setField(term1684, term1684.getClass(), "first", term1704);
        setField(term1684, term1684.getClass(), "last", term1704);
        setField(term1684, term1684.getClass(), "propListHead", null);
        setIntField(term1684, term1684.getClass(), "sourcePosition", 0);
        setField(term1684, term1684.getClass(), "jsType", null);
        setField(term1684, term1684.getClass(), "parent", null);
        setField(term1682, term1682.getClass(), "next", term1684);
        setField(term1682, term1682.getClass(), "first", term1688);
        setField(term1682, term1682.getClass(), "last", term1690);
        setField(term1682, term1682.getClass(), "propListHead", null);
        setIntField(term1682, term1682.getClass(), "sourcePosition", 0);
        setField(term1682, term1682.getClass(), "jsType", null);
        setField(term1682, term1682.getClass(), "parent", null);
        term1709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1709, term1709.getClass(), "type", 520504102);
        setIntField(term1711, term1711.getClass(), "type", -457396133);
        setIntField(term1713, term1713.getClass(), "type", -1793950607);
        setIntField(term1715, term1715.getClass(), "type", 1091954101);
        setIntField(term1717, term1717.getClass(), "type", 1895143076);
        setField(term1717, term1717.getClass(), "next", null);
        setField(term1717, term1717.getClass(), "first", null);
        setField(term1717, term1717.getClass(), "last", null);
        setField(term1717, term1717.getClass(), "propListHead", null);
        setIntField(term1717, term1717.getClass(), "sourcePosition", 0);
        setField(term1717, term1717.getClass(), "jsType", null);
        setField(term1717, term1717.getClass(), "parent", null);
        setField(term1715, term1715.getClass(), "next", term1717);
        setIntField(term1720, term1720.getClass(), "type", 1981860404);
        setField(term1720, term1720.getClass(), "next", null);
        setField(term1720, term1720.getClass(), "first", null);
        setField(term1720, term1720.getClass(), "last", term1717);
        setField(term1720, term1720.getClass(), "propListHead", null);
        setIntField(term1720, term1720.getClass(), "sourcePosition", 0);
        setField(term1720, term1720.getClass(), "jsType", null);
        setField(term1720, term1720.getClass(), "parent", null);
        setField(term1715, term1715.getClass(), "first", term1720);
        setField(term1715, term1715.getClass(), "last", term1713);
        setField(term1715, term1715.getClass(), "propListHead", null);
        setIntField(term1715, term1715.getClass(), "sourcePosition", 0);
        setField(term1715, term1715.getClass(), "jsType", null);
        setField(term1715, term1715.getClass(), "parent", null);
        setField(term1713, term1713.getClass(), "next", term1715);
        setField(term1713, term1713.getClass(), "first", term1717);
        setIntField(term1724, term1724.getClass(), "type", 470895808);
        setIntField(term1726, term1726.getClass(), "type", 1787325291);
        setField(term1726, term1726.getClass(), "next", null);
        setField(term1726, term1726.getClass(), "first", term1720);
        setField(term1726, term1726.getClass(), "last", term1715);
        setField(term1726, term1726.getClass(), "propListHead", null);
        setIntField(term1726, term1726.getClass(), "sourcePosition", 0);
        setField(term1726, term1726.getClass(), "jsType", null);
        setField(term1726, term1726.getClass(), "parent", null);
        setField(term1724, term1724.getClass(), "next", term1726);
        setField(term1724, term1724.getClass(), "first", term1711);
        setField(term1724, term1724.getClass(), "last", term1711);
        setField(term1724, term1724.getClass(), "propListHead", null);
        setIntField(term1724, term1724.getClass(), "sourcePosition", 0);
        setField(term1724, term1724.getClass(), "jsType", null);
        setField(term1724, term1724.getClass(), "parent", null);
        setField(term1713, term1713.getClass(), "last", term1724);
        setField(term1713, term1713.getClass(), "propListHead", null);
        setIntField(term1713, term1713.getClass(), "sourcePosition", 0);
        setField(term1713, term1713.getClass(), "jsType", null);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1711, term1711.getClass(), "next", term1713);
        setIntField(term1731, term1731.getClass(), "type", 1470349147);
        setField(term1731, term1731.getClass(), "next", term1724);
        setField(term1731, term1731.getClass(), "first", term1726);
        setField(term1731, term1731.getClass(), "last", term1709);
        setField(term1731, term1731.getClass(), "propListHead", null);
        setIntField(term1731, term1731.getClass(), "sourcePosition", 0);
        setField(term1731, term1731.getClass(), "jsType", null);
        setField(term1731, term1731.getClass(), "parent", null);
        setField(term1711, term1711.getClass(), "first", term1731);
        setField(term1711, term1711.getClass(), "last", term1731);
        setField(term1711, term1711.getClass(), "propListHead", null);
        setIntField(term1711, term1711.getClass(), "sourcePosition", 0);
        setField(term1711, term1711.getClass(), "jsType", null);
        setField(term1711, term1711.getClass(), "parent", null);
        setField(term1709, term1709.getClass(), "next", term1711);
        setField(term1709, term1709.getClass(), "first", term1715);
        setField(term1709, term1709.getClass(), "last", term1717);
        setField(term1709, term1709.getClass(), "propListHead", null);
        setIntField(term1709, term1709.getClass(), "sourcePosition", 0);
        setField(term1709, term1709.getClass(), "jsType", null);
        setField(term1709, term1709.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1682;
        args[1] = term1709;
        try {
            callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


