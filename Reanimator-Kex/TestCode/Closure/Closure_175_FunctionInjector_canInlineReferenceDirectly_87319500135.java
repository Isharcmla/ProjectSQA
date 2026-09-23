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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_canInlineReferenceDirectly_87319500135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1734;
     Object term1755;
     Object term1782;

    public FunctionInjector_canInlineReferenceDirectly_87319500135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1737 = new HashMap();
        Set<Object> term6714 =  ((Map) term1737).keySet();
        HashSet term1736 = new HashSet((Collection<? extends Object>) term6714);
        term1734 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1734, term1734.getClass(), "compiler", null);
        setBooleanField(term1734, term1734.getClass(), "allowDecomposition", false);
        setField(term1734, term1734.getClass(), "knownConstants", term1736);
        setBooleanField(term1734, term1734.getClass(), "assumeStrictThis", true);
        setBooleanField(term1734, term1734.getClass(), "assumeMinimumCapture", true);
        setField(term1734, term1734.getClass(), "safeNameIdSupplier", null);
        term1755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1755, term1755.getClass(), "type", 584893196);
        setIntField(term1757, term1757.getClass(), "type", 497269071);
        setIntField(term1759, term1759.getClass(), "type", -1899301124);
        setIntField(term1761, term1761.getClass(), "type", -1882480155);
        setIntField(term1763, term1763.getClass(), "type", -1410220680);
        setField(term1763, term1763.getClass(), "next", null);
        setField(term1763, term1763.getClass(), "first", null);
        setField(term1763, term1763.getClass(), "last", null);
        setField(term1763, term1763.getClass(), "propListHead", null);
        setIntField(term1763, term1763.getClass(), "sourcePosition", 0);
        setField(term1763, term1763.getClass(), "jsType", null);
        setField(term1763, term1763.getClass(), "parent", null);
        setField(term1761, term1761.getClass(), "next", term1763);
        setIntField(term1766, term1766.getClass(), "type", 389427431);
        setField(term1766, term1766.getClass(), "next", null);
        setField(term1766, term1766.getClass(), "first", null);
        setField(term1766, term1766.getClass(), "last", term1763);
        setField(term1766, term1766.getClass(), "propListHead", null);
        setIntField(term1766, term1766.getClass(), "sourcePosition", 0);
        setField(term1766, term1766.getClass(), "jsType", null);
        setField(term1766, term1766.getClass(), "parent", null);
        setField(term1761, term1761.getClass(), "first", term1766);
        setField(term1761, term1761.getClass(), "last", term1759);
        setField(term1761, term1761.getClass(), "propListHead", null);
        setIntField(term1761, term1761.getClass(), "sourcePosition", 0);
        setField(term1761, term1761.getClass(), "jsType", null);
        setField(term1761, term1761.getClass(), "parent", null);
        setField(term1759, term1759.getClass(), "next", term1761);
        setField(term1759, term1759.getClass(), "first", term1763);
        setIntField(term1770, term1770.getClass(), "type", 1152356969);
        setIntField(term1772, term1772.getClass(), "type", -1667990367);
        setField(term1772, term1772.getClass(), "next", null);
        setField(term1772, term1772.getClass(), "first", term1766);
        setField(term1772, term1772.getClass(), "last", term1761);
        setField(term1772, term1772.getClass(), "propListHead", null);
        setIntField(term1772, term1772.getClass(), "sourcePosition", 0);
        setField(term1772, term1772.getClass(), "jsType", null);
        setField(term1772, term1772.getClass(), "parent", null);
        setField(term1770, term1770.getClass(), "next", term1772);
        setField(term1770, term1770.getClass(), "first", term1757);
        setField(term1770, term1770.getClass(), "last", term1757);
        setField(term1770, term1770.getClass(), "propListHead", null);
        setIntField(term1770, term1770.getClass(), "sourcePosition", 0);
        setField(term1770, term1770.getClass(), "jsType", null);
        setField(term1770, term1770.getClass(), "parent", null);
        setField(term1759, term1759.getClass(), "last", term1770);
        setField(term1759, term1759.getClass(), "propListHead", null);
        setIntField(term1759, term1759.getClass(), "sourcePosition", 0);
        setField(term1759, term1759.getClass(), "jsType", null);
        setField(term1759, term1759.getClass(), "parent", null);
        setField(term1757, term1757.getClass(), "next", term1759);
        setIntField(term1777, term1777.getClass(), "type", -1214628358);
        setField(term1777, term1777.getClass(), "next", term1770);
        setField(term1777, term1777.getClass(), "first", term1772);
        setField(term1777, term1777.getClass(), "last", term1755);
        setField(term1777, term1777.getClass(), "propListHead", null);
        setIntField(term1777, term1777.getClass(), "sourcePosition", 0);
        setField(term1777, term1777.getClass(), "jsType", null);
        setField(term1777, term1777.getClass(), "parent", null);
        setField(term1757, term1757.getClass(), "first", term1777);
        setField(term1757, term1757.getClass(), "last", term1777);
        setField(term1757, term1757.getClass(), "propListHead", null);
        setIntField(term1757, term1757.getClass(), "sourcePosition", 0);
        setField(term1757, term1757.getClass(), "jsType", null);
        setField(term1757, term1757.getClass(), "parent", null);
        setField(term1755, term1755.getClass(), "next", term1757);
        setField(term1755, term1755.getClass(), "first", term1761);
        setField(term1755, term1755.getClass(), "last", term1763);
        setField(term1755, term1755.getClass(), "propListHead", null);
        setIntField(term1755, term1755.getClass(), "sourcePosition", 0);
        setField(term1755, term1755.getClass(), "jsType", null);
        setField(term1755, term1755.getClass(), "parent", null);
        term1782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1782, term1782.getClass(), "type", 1102721075);
        setIntField(term1784, term1784.getClass(), "type", -426764678);
        setIntField(term1786, term1786.getClass(), "type", -1222614956);
        setIntField(term1788, term1788.getClass(), "type", -1870495012);
        setIntField(term1790, term1790.getClass(), "type", -1310015129);
        setField(term1790, term1790.getClass(), "next", null);
        setField(term1790, term1790.getClass(), "first", null);
        setField(term1790, term1790.getClass(), "last", null);
        setField(term1790, term1790.getClass(), "propListHead", null);
        setIntField(term1790, term1790.getClass(), "sourcePosition", 0);
        setField(term1790, term1790.getClass(), "jsType", null);
        setField(term1790, term1790.getClass(), "parent", null);
        setField(term1788, term1788.getClass(), "next", term1790);
        setIntField(term1793, term1793.getClass(), "type", -2104981311);
        setField(term1793, term1793.getClass(), "next", null);
        setField(term1793, term1793.getClass(), "first", null);
        setField(term1793, term1793.getClass(), "last", term1790);
        setField(term1793, term1793.getClass(), "propListHead", null);
        setIntField(term1793, term1793.getClass(), "sourcePosition", 0);
        setField(term1793, term1793.getClass(), "jsType", null);
        setField(term1793, term1793.getClass(), "parent", null);
        setField(term1788, term1788.getClass(), "first", term1793);
        setField(term1788, term1788.getClass(), "last", term1786);
        setField(term1788, term1788.getClass(), "propListHead", null);
        setIntField(term1788, term1788.getClass(), "sourcePosition", 0);
        setField(term1788, term1788.getClass(), "jsType", null);
        setField(term1788, term1788.getClass(), "parent", null);
        setField(term1786, term1786.getClass(), "next", term1788);
        setField(term1786, term1786.getClass(), "first", term1790);
        setIntField(term1797, term1797.getClass(), "type", 318591690);
        setIntField(term1799, term1799.getClass(), "type", -165587447);
        setField(term1799, term1799.getClass(), "next", null);
        setField(term1799, term1799.getClass(), "first", term1793);
        setField(term1799, term1799.getClass(), "last", term1788);
        setField(term1799, term1799.getClass(), "propListHead", null);
        setIntField(term1799, term1799.getClass(), "sourcePosition", 0);
        setField(term1799, term1799.getClass(), "jsType", null);
        setField(term1799, term1799.getClass(), "parent", null);
        setField(term1797, term1797.getClass(), "next", term1799);
        setField(term1797, term1797.getClass(), "first", term1784);
        setField(term1797, term1797.getClass(), "last", term1784);
        setField(term1797, term1797.getClass(), "propListHead", null);
        setIntField(term1797, term1797.getClass(), "sourcePosition", 0);
        setField(term1797, term1797.getClass(), "jsType", null);
        setField(term1797, term1797.getClass(), "parent", null);
        setField(term1786, term1786.getClass(), "last", term1797);
        setField(term1786, term1786.getClass(), "propListHead", null);
        setIntField(term1786, term1786.getClass(), "sourcePosition", 0);
        setField(term1786, term1786.getClass(), "jsType", null);
        setField(term1786, term1786.getClass(), "parent", null);
        setField(term1784, term1784.getClass(), "next", term1786);
        setIntField(term1804, term1804.getClass(), "type", -1347358701);
        setField(term1804, term1804.getClass(), "next", term1797);
        setField(term1804, term1804.getClass(), "first", term1799);
        setField(term1804, term1804.getClass(), "last", term1782);
        setField(term1804, term1804.getClass(), "propListHead", null);
        setIntField(term1804, term1804.getClass(), "sourcePosition", 0);
        setField(term1804, term1804.getClass(), "jsType", null);
        setField(term1804, term1804.getClass(), "parent", null);
        setField(term1784, term1784.getClass(), "first", term1804);
        setField(term1784, term1784.getClass(), "last", term1804);
        setField(term1784, term1784.getClass(), "propListHead", null);
        setIntField(term1784, term1784.getClass(), "sourcePosition", 0);
        setField(term1784, term1784.getClass(), "jsType", null);
        setField(term1784, term1784.getClass(), "parent", null);
        setField(term1782, term1782.getClass(), "next", term1784);
        setField(term1782, term1782.getClass(), "first", term1788);
        setField(term1782, term1782.getClass(), "last", term1790);
        setField(term1782, term1782.getClass(), "propListHead", null);
        setIntField(term1782, term1782.getClass(), "sourcePosition", 0);
        setField(term1782, term1782.getClass(), "jsType", null);
        setField(term1782, term1782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1755;
        args[1] = term1782;
        try {
            callMethod(klass, "canInlineReferenceDirectly", argTypes, term1734, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


