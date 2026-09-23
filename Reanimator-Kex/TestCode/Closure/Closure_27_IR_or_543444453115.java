package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_or_543444453115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1723;
     Object term1750;

    public IR_or_543444453115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1723, term1723.getClass(), "type", -1538936030);
        setIntField(term1725, term1725.getClass(), "type", -752870423);
        setIntField(term1727, term1727.getClass(), "type", -1698809299);
        setIntField(term1729, term1729.getClass(), "type", 401512128);
        setIntField(term1731, term1731.getClass(), "type", -2069930777);
        setField(term1731, term1731.getClass(), "next", null);
        setField(term1731, term1731.getClass(), "first", null);
        setField(term1731, term1731.getClass(), "last", null);
        setField(term1731, term1731.getClass(), "propListHead", null);
        setIntField(term1731, term1731.getClass(), "sourcePosition", 0);
        setField(term1731, term1731.getClass(), "jsType", null);
        setField(term1731, term1731.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "next", term1731);
        setIntField(term1734, term1734.getClass(), "type", 1543696412);
        setField(term1734, term1734.getClass(), "next", null);
        setField(term1734, term1734.getClass(), "first", null);
        setField(term1734, term1734.getClass(), "last", term1731);
        setField(term1734, term1734.getClass(), "propListHead", null);
        setIntField(term1734, term1734.getClass(), "sourcePosition", 0);
        setField(term1734, term1734.getClass(), "jsType", null);
        setField(term1734, term1734.getClass(), "parent", null);
        setField(term1729, term1729.getClass(), "first", term1734);
        setField(term1729, term1729.getClass(), "last", term1727);
        setField(term1729, term1729.getClass(), "propListHead", null);
        setIntField(term1729, term1729.getClass(), "sourcePosition", 0);
        setField(term1729, term1729.getClass(), "jsType", null);
        setField(term1729, term1729.getClass(), "parent", null);
        setField(term1727, term1727.getClass(), "next", term1729);
        setField(term1727, term1727.getClass(), "first", term1731);
        setIntField(term1738, term1738.getClass(), "type", -270592367);
        setIntField(term1740, term1740.getClass(), "type", 178847646);
        setField(term1740, term1740.getClass(), "next", null);
        setField(term1740, term1740.getClass(), "first", term1734);
        setField(term1740, term1740.getClass(), "last", term1729);
        setField(term1740, term1740.getClass(), "propListHead", null);
        setIntField(term1740, term1740.getClass(), "sourcePosition", 0);
        setField(term1740, term1740.getClass(), "jsType", null);
        setField(term1740, term1740.getClass(), "parent", null);
        setField(term1738, term1738.getClass(), "next", term1740);
        setField(term1738, term1738.getClass(), "first", term1725);
        setField(term1738, term1738.getClass(), "last", term1725);
        setField(term1738, term1738.getClass(), "propListHead", null);
        setIntField(term1738, term1738.getClass(), "sourcePosition", 0);
        setField(term1738, term1738.getClass(), "jsType", null);
        setField(term1738, term1738.getClass(), "parent", null);
        setField(term1727, term1727.getClass(), "last", term1738);
        setField(term1727, term1727.getClass(), "propListHead", null);
        setIntField(term1727, term1727.getClass(), "sourcePosition", 0);
        setField(term1727, term1727.getClass(), "jsType", null);
        setField(term1727, term1727.getClass(), "parent", null);
        setField(term1725, term1725.getClass(), "next", term1727);
        setIntField(term1745, term1745.getClass(), "type", 273590437);
        setField(term1745, term1745.getClass(), "next", term1738);
        setField(term1745, term1745.getClass(), "first", term1740);
        setField(term1745, term1745.getClass(), "last", term1723);
        setField(term1745, term1745.getClass(), "propListHead", null);
        setIntField(term1745, term1745.getClass(), "sourcePosition", 0);
        setField(term1745, term1745.getClass(), "jsType", null);
        setField(term1745, term1745.getClass(), "parent", null);
        setField(term1725, term1725.getClass(), "first", term1745);
        setField(term1725, term1725.getClass(), "last", term1745);
        setField(term1725, term1725.getClass(), "propListHead", null);
        setIntField(term1725, term1725.getClass(), "sourcePosition", 0);
        setField(term1725, term1725.getClass(), "jsType", null);
        setField(term1725, term1725.getClass(), "parent", null);
        setField(term1723, term1723.getClass(), "next", term1725);
        setField(term1723, term1723.getClass(), "first", term1729);
        setField(term1723, term1723.getClass(), "last", term1731);
        setField(term1723, term1723.getClass(), "propListHead", null);
        setIntField(term1723, term1723.getClass(), "sourcePosition", 0);
        setField(term1723, term1723.getClass(), "jsType", null);
        setField(term1723, term1723.getClass(), "parent", null);
        term1750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1750, term1750.getClass(), "type", -348612876);
        setIntField(term1752, term1752.getClass(), "type", 1302807565);
        setIntField(term1754, term1754.getClass(), "type", -838848221);
        setIntField(term1756, term1756.getClass(), "type", 1163761623);
        setIntField(term1758, term1758.getClass(), "type", 718742281);
        setField(term1758, term1758.getClass(), "next", null);
        setField(term1758, term1758.getClass(), "first", null);
        setField(term1758, term1758.getClass(), "last", null);
        setField(term1758, term1758.getClass(), "propListHead", null);
        setIntField(term1758, term1758.getClass(), "sourcePosition", 0);
        setField(term1758, term1758.getClass(), "jsType", null);
        setField(term1758, term1758.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "next", term1758);
        setIntField(term1761, term1761.getClass(), "type", 1532723756);
        setField(term1761, term1761.getClass(), "next", null);
        setField(term1761, term1761.getClass(), "first", null);
        setField(term1761, term1761.getClass(), "last", term1758);
        setField(term1761, term1761.getClass(), "propListHead", null);
        setIntField(term1761, term1761.getClass(), "sourcePosition", 0);
        setField(term1761, term1761.getClass(), "jsType", null);
        setField(term1761, term1761.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "first", term1761);
        setField(term1756, term1756.getClass(), "last", term1754);
        setField(term1756, term1756.getClass(), "propListHead", null);
        setIntField(term1756, term1756.getClass(), "sourcePosition", 0);
        setField(term1756, term1756.getClass(), "jsType", null);
        setField(term1756, term1756.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "next", term1756);
        setField(term1754, term1754.getClass(), "first", term1758);
        setIntField(term1765, term1765.getClass(), "type", 777492093);
        setIntField(term1767, term1767.getClass(), "type", 1414025609);
        setField(term1767, term1767.getClass(), "next", null);
        setField(term1767, term1767.getClass(), "first", term1761);
        setField(term1767, term1767.getClass(), "last", term1756);
        setField(term1767, term1767.getClass(), "propListHead", null);
        setIntField(term1767, term1767.getClass(), "sourcePosition", 0);
        setField(term1767, term1767.getClass(), "jsType", null);
        setField(term1767, term1767.getClass(), "parent", null);
        setField(term1765, term1765.getClass(), "next", term1767);
        setField(term1765, term1765.getClass(), "first", term1752);
        setField(term1765, term1765.getClass(), "last", term1752);
        setField(term1765, term1765.getClass(), "propListHead", null);
        setIntField(term1765, term1765.getClass(), "sourcePosition", 0);
        setField(term1765, term1765.getClass(), "jsType", null);
        setField(term1765, term1765.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "last", term1765);
        setField(term1754, term1754.getClass(), "propListHead", null);
        setIntField(term1754, term1754.getClass(), "sourcePosition", 0);
        setField(term1754, term1754.getClass(), "jsType", null);
        setField(term1754, term1754.getClass(), "parent", null);
        setField(term1752, term1752.getClass(), "next", term1754);
        setIntField(term1772, term1772.getClass(), "type", 255145822);
        setField(term1772, term1772.getClass(), "next", term1765);
        setField(term1772, term1772.getClass(), "first", term1767);
        setField(term1772, term1772.getClass(), "last", term1750);
        setField(term1772, term1772.getClass(), "propListHead", null);
        setIntField(term1772, term1772.getClass(), "sourcePosition", 0);
        setField(term1772, term1772.getClass(), "jsType", null);
        setField(term1772, term1772.getClass(), "parent", null);
        setField(term1752, term1752.getClass(), "first", term1772);
        setField(term1752, term1752.getClass(), "last", term1772);
        setField(term1752, term1752.getClass(), "propListHead", null);
        setIntField(term1752, term1752.getClass(), "sourcePosition", 0);
        setField(term1752, term1752.getClass(), "jsType", null);
        setField(term1752, term1752.getClass(), "parent", null);
        setField(term1750, term1750.getClass(), "next", term1752);
        setField(term1750, term1750.getClass(), "first", term1756);
        setField(term1750, term1750.getClass(), "last", term1758);
        setField(term1750, term1750.getClass(), "propListHead", null);
        setIntField(term1750, term1750.getClass(), "sourcePosition", 0);
        setField(term1750, term1750.getClass(), "jsType", null);
        setField(term1750, term1750.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1723;
        args[1] = term1750;
        try {
            callMethod(klass, "or", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


