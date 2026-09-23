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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class NameAnalyzer_isExternallyReferenceable_79181543043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1731;
     Object term1804;

    public NameAnalyzer_isExternallyReferenceable_79181543043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1732 = new HashMap();
        HashMap term1748 = new HashMap();
        Set<Object> term9336 =  ((Map) term1748).keySet();
        HashSet term1747 = new HashSet((Collection<? extends Object>) term9336);
        ArrayList term1767 = new ArrayList();
        HashMap term1772 = new HashMap();
        Set<Object> term9337 =  ((Map) term1772).keySet();
        HashSet term1771 = new HashSet((Collection<? extends Object>) term9337);
        ArrayList term1790 = new ArrayList();
        ((ArrayList) term1790).add((Object)null);
        ((ArrayList) term1790).add((Object)null);
        ((ArrayList) term1790).add((Object)null);
        ((ArrayList) term1790).add((Object)null);
        ((ArrayList) term1790).add((Object)null);
        ((ArrayList) term1790).add((Object)null);
        ((ArrayList) term1790).add((Object)null);
        HashMap term1794 = new HashMap();
        term1731 = newInstance(Class.forName("com.google.javascript.jscomp.NameAnalyzer"));
        Object term1766 = newInstance(Class.forName("com.google.javascript.jscomp.AstChangeProxy"));
        setField(term1731, term1731.getClass(), "compiler", null);
        setField(term1731, term1731.getClass(), "allNames", term1732);
        setField(term1731, term1731.getClass(), "referenceGraph", null);
        setField(term1731, term1731.getClass(), "scopes", null);
        setBooleanField(term1731, term1731.getClass(), "removeUnreferenced", false);
        setField(term1731, term1731.getClass(), "globalNames", term1747);
        setField(term1766, term1766.getClass(), "listeners", term1767);
        setField(term1731, term1731.getClass(), "changeProxy", term1766);
        setField(term1731, term1731.getClass(), "externalNames", term1771);
        setField(term1731, term1731.getClass(), "refNodes", term1790);
        setField(term1731, term1731.getClass(), "aliases", term1794);
        HashMap term1805 = new HashMap();
        term1804 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1819 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term1823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1827 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1832 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        setField(term1804, term1804.getClass(), "vars", term1805);
        setField(term1819, term1819.getClass(), "vars", null);
        setField(term1819, term1819.getClass(), "parent", null);
        setIntField(term1819, term1819.getClass(), "depth", 0);
        setField(term1819, term1819.getClass(), "rootNode", null);
        setBooleanField(term1819, term1819.getClass(), "isBottom", false);
        setField(term1819, term1819.getClass(), "arguments", null);
        setField(term1819, term1819.getClass(), "typeResolver", null);
        setField(term1804, term1804.getClass(), "parent", term1819);
        setIntField(term1804, term1804.getClass(), "depth", 1324040357);
        setIntField(term1823, term1823.getClass(), "type", 97029295);
        setIntField(term1825, term1825.getClass(), "type", -1371869594);
        setIntField(term1827, term1827.getClass(), "type", -2095575670);
        setIntField(term1829, term1829.getClass(), "type", 1225272962);
        setField(term1829, term1829.getClass(), "next", null);
        setField(term1829, term1829.getClass(), "first", null);
        setField(term1829, term1829.getClass(), "last", term1829);
        setField(term1829, term1829.getClass(), "propListHead", null);
        setIntField(term1829, term1829.getClass(), "sourcePosition", 0);
        setField(term1829, term1829.getClass(), "jsType", null);
        setField(term1829, term1829.getClass(), "parent", null);
        setField(term1827, term1827.getClass(), "next", term1829);
        setIntField(term1832, term1832.getClass(), "type", 0);
        setField(term1832, term1832.getClass(), "next", null);
        setField(term1832, term1832.getClass(), "first", null);
        setField(term1832, term1832.getClass(), "last", null);
        setField(term1832, term1832.getClass(), "propListHead", null);
        setIntField(term1832, term1832.getClass(), "sourcePosition", 0);
        setField(term1832, term1832.getClass(), "jsType", null);
        setField(term1832, term1832.getClass(), "parent", null);
        setField(term1827, term1827.getClass(), "first", term1832);
        setIntField(term1835, term1835.getClass(), "type", -184153539);
        setField(term1835, term1835.getClass(), "next", null);
        setField(term1835, term1835.getClass(), "first", term1825);
        setField(term1835, term1835.getClass(), "last", null);
        setField(term1835, term1835.getClass(), "propListHead", null);
        setIntField(term1835, term1835.getClass(), "sourcePosition", 0);
        setField(term1835, term1835.getClass(), "jsType", null);
        setField(term1835, term1835.getClass(), "parent", null);
        setField(term1827, term1827.getClass(), "last", term1835);
        setField(term1827, term1827.getClass(), "propListHead", null);
        setIntField(term1827, term1827.getClass(), "sourcePosition", 0);
        setField(term1827, term1827.getClass(), "jsType", null);
        setField(term1827, term1827.getClass(), "parent", null);
        setField(term1825, term1825.getClass(), "next", term1827);
        setField(term1825, term1825.getClass(), "first", term1825);
        setIntField(term1839, term1839.getClass(), "type", 1596070772);
        setField(term1839, term1839.getClass(), "next", term1823);
        setIntField(term1841, term1841.getClass(), "type", 0);
        setField(term1841, term1841.getClass(), "next", null);
        setField(term1841, term1841.getClass(), "first", null);
        setField(term1841, term1841.getClass(), "last", null);
        setField(term1841, term1841.getClass(), "propListHead", null);
        setIntField(term1841, term1841.getClass(), "sourcePosition", 0);
        setField(term1841, term1841.getClass(), "jsType", null);
        setField(term1841, term1841.getClass(), "parent", null);
        setField(term1839, term1839.getClass(), "first", term1841);
        setField(term1839, term1839.getClass(), "last", term1829);
        setField(term1839, term1839.getClass(), "propListHead", null);
        setIntField(term1839, term1839.getClass(), "sourcePosition", 0);
        setField(term1839, term1839.getClass(), "jsType", null);
        setField(term1839, term1839.getClass(), "parent", null);
        setField(term1825, term1825.getClass(), "last", term1839);
        setField(term1825, term1825.getClass(), "propListHead", null);
        setIntField(term1825, term1825.getClass(), "sourcePosition", 0);
        setField(term1825, term1825.getClass(), "jsType", null);
        setField(term1825, term1825.getClass(), "parent", null);
        setField(term1823, term1823.getClass(), "next", term1825);
        setIntField(term1846, term1846.getClass(), "type", 493620644);
        setIntField(term1848, term1848.getClass(), "type", 1328271830);
        setField(term1848, term1848.getClass(), "next", term1839);
        setField(term1848, term1848.getClass(), "first", term1829);
        setField(term1848, term1848.getClass(), "last", term1823);
        setField(term1848, term1848.getClass(), "propListHead", null);
        setIntField(term1848, term1848.getClass(), "sourcePosition", 0);
        setField(term1848, term1848.getClass(), "jsType", null);
        setField(term1848, term1848.getClass(), "parent", null);
        setField(term1846, term1846.getClass(), "next", term1848);
        setField(term1846, term1846.getClass(), "first", term1841);
        setField(term1846, term1846.getClass(), "last", term1829);
        setField(term1846, term1846.getClass(), "propListHead", null);
        setIntField(term1846, term1846.getClass(), "sourcePosition", 0);
        setField(term1846, term1846.getClass(), "jsType", null);
        setField(term1846, term1846.getClass(), "parent", null);
        setField(term1823, term1823.getClass(), "first", term1846);
        setField(term1823, term1823.getClass(), "last", term1846);
        setField(term1823, term1823.getClass(), "propListHead", null);
        setIntField(term1823, term1823.getClass(), "sourcePosition", 0);
        setField(term1823, term1823.getClass(), "jsType", null);
        setField(term1823, term1823.getClass(), "parent", null);
        setField(term1804, term1804.getClass(), "rootNode", term1823);
        setBooleanField(term1804, term1804.getClass(), "isBottom", false);
        setField(term1854, term1854.getClass(), "name", null);
        setField(term1854, term1854.getClass(), "nameNode", null);
        setField(term1854, term1854.getClass(), "type", null);
        setBooleanField(term1854, term1854.getClass(), "typeInferred", false);
        setField(term1854, term1854.getClass(), "input", null);
        setIntField(term1854, term1854.getClass(), "index", 0);
        setField(term1854, term1854.getClass(), "scope", null);
        setBooleanField(term1854, term1854.getClass(), "markedEscaped", false);
        setBooleanField(term1854, term1854.getClass(), "markedAssignedExactlyOnce", false);
        setField(term1804, term1804.getClass(), "arguments", term1854);
        setField(term1804, term1804.getClass(), "typeResolver", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NameAnalyzer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1804;
        args[1] = "SPtPatHeOm";
        try {
            callMethod(klass, "isExternallyReferenceable", argTypes, term1731, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


