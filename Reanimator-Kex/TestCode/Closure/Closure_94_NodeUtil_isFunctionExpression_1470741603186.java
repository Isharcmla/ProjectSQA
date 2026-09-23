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

public class NodeUtil_isFunctionExpression_1470741603186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1842;
     Object term11883;

    public NodeUtil_isFunctionExpression_1470741603186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1852 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1855 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1859 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1865 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1842, term1842.getClass(), "type", 1868344256);
        setIntField(term1844, term1844.getClass(), "type", -932147928);
        setIntField(term1846, term1846.getClass(), "type", 0);
        setField(term1846, term1846.getClass(), "next", null);
        setField(term1846, term1846.getClass(), "first", null);
        setField(term1846, term1846.getClass(), "last", null);
        setField(term1846, term1846.getClass(), "propListHead", null);
        setIntField(term1846, term1846.getClass(), "sourcePosition", 0);
        setField(term1846, term1846.getClass(), "jsType", null);
        setField(term1846, term1846.getClass(), "parent", null);
        setField(term1844, term1844.getClass(), "next", term1846);
        setIntField(term1849, term1849.getClass(), "type", 0);
        setField(term1849, term1849.getClass(), "next", null);
        setField(term1849, term1849.getClass(), "first", null);
        setField(term1849, term1849.getClass(), "last", null);
        setField(term1849, term1849.getClass(), "propListHead", null);
        setIntField(term1849, term1849.getClass(), "sourcePosition", 0);
        setField(term1849, term1849.getClass(), "jsType", null);
        setField(term1849, term1849.getClass(), "parent", null);
        setField(term1844, term1844.getClass(), "first", term1849);
        setIntField(term1852, term1852.getClass(), "type", 0);
        setField(term1852, term1852.getClass(), "next", null);
        setField(term1852, term1852.getClass(), "first", null);
        setField(term1852, term1852.getClass(), "last", null);
        setField(term1852, term1852.getClass(), "propListHead", null);
        setIntField(term1852, term1852.getClass(), "sourcePosition", 0);
        setField(term1852, term1852.getClass(), "jsType", null);
        setField(term1852, term1852.getClass(), "parent", null);
        setField(term1844, term1844.getClass(), "last", term1852);
        setField(term1855, term1855.getClass(), "next", null);
        setIntField(term1855, term1855.getClass(), "type", 0);
        setIntField(term1855, term1855.getClass(), "intValue", 0);
        setField(term1855, term1855.getClass(), "objectValue", null);
        setField(term1844, term1844.getClass(), "propListHead", term1855);
        setIntField(term1844, term1844.getClass(), "sourcePosition", -2018735535);
        setField(term1844, term1844.getClass(), "jsType", null);
        setField(term1844, term1844.getClass(), "parent", null);
        setField(term1842, term1842.getClass(), "next", term1844);
        setIntField(term1859, term1859.getClass(), "type", 0);
        setField(term1859, term1859.getClass(), "next", null);
        setField(term1859, term1859.getClass(), "first", null);
        setField(term1859, term1859.getClass(), "last", null);
        setField(term1859, term1859.getClass(), "propListHead", null);
        setIntField(term1859, term1859.getClass(), "sourcePosition", 0);
        setField(term1859, term1859.getClass(), "jsType", null);
        setField(term1859, term1859.getClass(), "parent", null);
        setField(term1842, term1842.getClass(), "first", term1859);
        setIntField(term1862, term1862.getClass(), "type", 0);
        setField(term1862, term1862.getClass(), "next", null);
        setField(term1862, term1862.getClass(), "first", null);
        setField(term1862, term1862.getClass(), "last", null);
        setField(term1862, term1862.getClass(), "propListHead", null);
        setIntField(term1862, term1862.getClass(), "sourcePosition", 0);
        setField(term1862, term1862.getClass(), "jsType", null);
        setField(term1862, term1862.getClass(), "parent", null);
        setField(term1842, term1842.getClass(), "last", term1862);
        setField(term1865, term1865.getClass(), "next", null);
        setIntField(term1865, term1865.getClass(), "type", 0);
        setIntField(term1865, term1865.getClass(), "intValue", 0);
        setField(term1865, term1865.getClass(), "objectValue", null);
        setField(term1842, term1842.getClass(), "propListHead", term1865);
        setIntField(term1842, term1842.getClass(), "sourcePosition", -658524954);
        setField(term1842, term1842.getClass(), "jsType", null);
        setField(term1842, term1842.getClass(), "parent", null);
        term11883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11892 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11898 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11883, term11883.getClass(), "type", 1868344256);
        setIntField(term11885, term11885.getClass(), "type", -932147928);
        setIntField(term11887, term11887.getClass(), "type", 0);
        setField(term11887, term11887.getClass(), "next", null);
        setField(term11887, term11887.getClass(), "first", null);
        setField(term11887, term11887.getClass(), "last", null);
        setField(term11887, term11887.getClass(), "propListHead", null);
        setIntField(term11887, term11887.getClass(), "sourcePosition", 0);
        setField(term11887, term11887.getClass(), "jsType", null);
        setField(term11887, term11887.getClass(), "parent", null);
        setField(term11885, term11885.getClass(), "next", term11887);
        setIntField(term11889, term11889.getClass(), "type", 0);
        setField(term11889, term11889.getClass(), "next", null);
        setField(term11889, term11889.getClass(), "first", null);
        setField(term11889, term11889.getClass(), "last", null);
        setField(term11889, term11889.getClass(), "propListHead", null);
        setIntField(term11889, term11889.getClass(), "sourcePosition", 0);
        setField(term11889, term11889.getClass(), "jsType", null);
        setField(term11889, term11889.getClass(), "parent", null);
        setField(term11885, term11885.getClass(), "first", term11889);
        setIntField(term11890, term11890.getClass(), "type", 0);
        setField(term11890, term11890.getClass(), "next", null);
        setField(term11890, term11890.getClass(), "first", null);
        setField(term11890, term11890.getClass(), "last", null);
        setField(term11890, term11890.getClass(), "propListHead", null);
        setIntField(term11890, term11890.getClass(), "sourcePosition", 0);
        setField(term11890, term11890.getClass(), "jsType", null);
        setField(term11890, term11890.getClass(), "parent", null);
        setField(term11885, term11885.getClass(), "last", term11890);
        setField(term11892, term11892.getClass(), "next", null);
        setIntField(term11892, term11892.getClass(), "type", 0);
        setIntField(term11892, term11892.getClass(), "intValue", 0);
        setField(term11892, term11892.getClass(), "objectValue", null);
        setField(term11885, term11885.getClass(), "propListHead", term11892);
        setIntField(term11885, term11885.getClass(), "sourcePosition", -2018735535);
        setField(term11885, term11885.getClass(), "jsType", null);
        setField(term11885, term11885.getClass(), "parent", null);
        setField(term11883, term11883.getClass(), "next", term11885);
        setIntField(term11894, term11894.getClass(), "type", 0);
        setField(term11894, term11894.getClass(), "next", null);
        setField(term11894, term11894.getClass(), "first", null);
        setField(term11894, term11894.getClass(), "last", null);
        setField(term11894, term11894.getClass(), "propListHead", null);
        setIntField(term11894, term11894.getClass(), "sourcePosition", 0);
        setField(term11894, term11894.getClass(), "jsType", null);
        setField(term11894, term11894.getClass(), "parent", null);
        setField(term11883, term11883.getClass(), "first", term11894);
        setIntField(term11896, term11896.getClass(), "type", 0);
        setField(term11896, term11896.getClass(), "next", null);
        setField(term11896, term11896.getClass(), "first", null);
        setField(term11896, term11896.getClass(), "last", null);
        setField(term11896, term11896.getClass(), "propListHead", null);
        setIntField(term11896, term11896.getClass(), "sourcePosition", 0);
        setField(term11896, term11896.getClass(), "jsType", null);
        setField(term11896, term11896.getClass(), "parent", null);
        setField(term11883, term11883.getClass(), "last", term11896);
        setField(term11898, term11898.getClass(), "next", null);
        setIntField(term11898, term11898.getClass(), "type", 0);
        setIntField(term11898, term11898.getClass(), "intValue", 0);
        setField(term11898, term11898.getClass(), "objectValue", null);
        setField(term11883, term11883.getClass(), "propListHead", term11898);
        setIntField(term11883, term11883.getClass(), "sourcePosition", -658524954);
        setField(term11883, term11883.getClass(), "jsType", null);
        setField(term11883, term11883.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1842;
        Object retValue = callMethod(klass, "isFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term1842, term11883));
        assertTrue(recursiveEquals(retValue, false));
    }

};


