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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.Boolean;

public class FunctionInjector_doesLowerCost_108603976637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1818;
     Object term1837;
     Object term1864;
     Object term1866;
     Object term1868;
     Object term1870;
     Object term1872;
     Object term1874;

    public FunctionInjector_doesLowerCost_108603976637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1821 = new HashMap();
        Set<Object> term7466 =  ((Map) term1821).keySet();
        HashSet term1820 = new HashSet((Collection<? extends Object>) term7466);
        term1818 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1818, term1818.getClass(), "compiler", null);
        setBooleanField(term1818, term1818.getClass(), "allowDecomposition", false);
        setField(term1818, term1818.getClass(), "knownConstants", term1820);
        setBooleanField(term1818, term1818.getClass(), "assumeStrictThis", true);
        setBooleanField(term1818, term1818.getClass(), "assumeMinimumCapture", false);
        setField(term1818, term1818.getClass(), "safeNameIdSupplier", null);
        term1837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1837, term1837.getClass(), "type", 388157121);
        setIntField(term1839, term1839.getClass(), "type", 1684998508);
        setIntField(term1841, term1841.getClass(), "type", -1476644457);
        setIntField(term1843, term1843.getClass(), "type", 1270666529);
        setIntField(term1845, term1845.getClass(), "type", -1146679443);
        setField(term1845, term1845.getClass(), "next", null);
        setField(term1845, term1845.getClass(), "first", null);
        setField(term1845, term1845.getClass(), "last", null);
        setField(term1845, term1845.getClass(), "propListHead", null);
        setIntField(term1845, term1845.getClass(), "sourcePosition", 0);
        setField(term1845, term1845.getClass(), "jsType", null);
        setField(term1845, term1845.getClass(), "parent", null);
        setField(term1843, term1843.getClass(), "next", term1845);
        setIntField(term1848, term1848.getClass(), "type", -860131894);
        setField(term1848, term1848.getClass(), "next", null);
        setField(term1848, term1848.getClass(), "first", null);
        setField(term1848, term1848.getClass(), "last", term1845);
        setField(term1848, term1848.getClass(), "propListHead", null);
        setIntField(term1848, term1848.getClass(), "sourcePosition", 0);
        setField(term1848, term1848.getClass(), "jsType", null);
        setField(term1848, term1848.getClass(), "parent", null);
        setField(term1843, term1843.getClass(), "first", term1848);
        setField(term1843, term1843.getClass(), "last", term1841);
        setField(term1843, term1843.getClass(), "propListHead", null);
        setIntField(term1843, term1843.getClass(), "sourcePosition", 0);
        setField(term1843, term1843.getClass(), "jsType", null);
        setField(term1843, term1843.getClass(), "parent", null);
        setField(term1841, term1841.getClass(), "next", term1843);
        setField(term1841, term1841.getClass(), "first", term1845);
        setIntField(term1852, term1852.getClass(), "type", 1045547089);
        setIntField(term1854, term1854.getClass(), "type", -1122880881);
        setField(term1854, term1854.getClass(), "next", null);
        setField(term1854, term1854.getClass(), "first", term1848);
        setField(term1854, term1854.getClass(), "last", term1843);
        setField(term1854, term1854.getClass(), "propListHead", null);
        setIntField(term1854, term1854.getClass(), "sourcePosition", 0);
        setField(term1854, term1854.getClass(), "jsType", null);
        setField(term1854, term1854.getClass(), "parent", null);
        setField(term1852, term1852.getClass(), "next", term1854);
        setField(term1852, term1852.getClass(), "first", term1839);
        setField(term1852, term1852.getClass(), "last", term1839);
        setField(term1852, term1852.getClass(), "propListHead", null);
        setIntField(term1852, term1852.getClass(), "sourcePosition", 0);
        setField(term1852, term1852.getClass(), "jsType", null);
        setField(term1852, term1852.getClass(), "parent", null);
        setField(term1841, term1841.getClass(), "last", term1852);
        setField(term1841, term1841.getClass(), "propListHead", null);
        setIntField(term1841, term1841.getClass(), "sourcePosition", 0);
        setField(term1841, term1841.getClass(), "jsType", null);
        setField(term1841, term1841.getClass(), "parent", null);
        setField(term1839, term1839.getClass(), "next", term1841);
        setIntField(term1859, term1859.getClass(), "type", -542712742);
        setField(term1859, term1859.getClass(), "next", term1852);
        setField(term1859, term1859.getClass(), "first", term1854);
        setField(term1859, term1859.getClass(), "last", term1837);
        setField(term1859, term1859.getClass(), "propListHead", null);
        setIntField(term1859, term1859.getClass(), "sourcePosition", 0);
        setField(term1859, term1859.getClass(), "jsType", null);
        setField(term1859, term1859.getClass(), "parent", null);
        setField(term1839, term1839.getClass(), "first", term1859);
        setField(term1839, term1839.getClass(), "last", term1859);
        setField(term1839, term1839.getClass(), "propListHead", null);
        setIntField(term1839, term1839.getClass(), "sourcePosition", 0);
        setField(term1839, term1839.getClass(), "jsType", null);
        setField(term1839, term1839.getClass(), "parent", null);
        setField(term1837, term1837.getClass(), "next", term1839);
        setField(term1837, term1837.getClass(), "first", term1843);
        setField(term1837, term1837.getClass(), "last", term1845);
        setField(term1837, term1837.getClass(), "propListHead", null);
        setIntField(term1837, term1837.getClass(), "sourcePosition", 0);
        setField(term1837, term1837.getClass(), "jsType", null);
        setField(term1837, term1837.getClass(), "parent", null);
        term1864 = new Integer(-1254072822);
        term1866 = new Integer(-1111249833);
        term1868 = new Integer(-1692331299);
        term1870 = new Integer(479531250);
        term1872 = new Integer(1320570890);
        term1874 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term1837;
        args[1] = term1864;
        args[2] = term1866;
        args[3] = term1868;
        args[4] = term1870;
        args[5] = term1872;
        args[6] = term1874;
        try {
            callMethod(klass, "doesLowerCost", argTypes, term1818, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


