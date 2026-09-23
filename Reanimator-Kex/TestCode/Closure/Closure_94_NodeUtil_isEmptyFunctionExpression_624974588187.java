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

public class NodeUtil_isEmptyFunctionExpression_624974588187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1869;
     Object term11882;

    public NodeUtil_isEmptyFunctionExpression_624974588187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1882 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1892 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1869, term1869.getClass(), "type", 934338954);
        setIntField(term1871, term1871.getClass(), "type", 1415142780);
        setIntField(term1873, term1873.getClass(), "type", 0);
        setField(term1873, term1873.getClass(), "next", null);
        setField(term1873, term1873.getClass(), "first", null);
        setField(term1873, term1873.getClass(), "last", null);
        setField(term1873, term1873.getClass(), "propListHead", null);
        setIntField(term1873, term1873.getClass(), "sourcePosition", 0);
        setField(term1873, term1873.getClass(), "jsType", null);
        setField(term1873, term1873.getClass(), "parent", null);
        setField(term1871, term1871.getClass(), "next", term1873);
        setIntField(term1876, term1876.getClass(), "type", 0);
        setField(term1876, term1876.getClass(), "next", null);
        setField(term1876, term1876.getClass(), "first", null);
        setField(term1876, term1876.getClass(), "last", null);
        setField(term1876, term1876.getClass(), "propListHead", null);
        setIntField(term1876, term1876.getClass(), "sourcePosition", 0);
        setField(term1876, term1876.getClass(), "jsType", null);
        setField(term1876, term1876.getClass(), "parent", null);
        setField(term1871, term1871.getClass(), "first", term1876);
        setIntField(term1879, term1879.getClass(), "type", 0);
        setField(term1879, term1879.getClass(), "next", null);
        setField(term1879, term1879.getClass(), "first", null);
        setField(term1879, term1879.getClass(), "last", null);
        setField(term1879, term1879.getClass(), "propListHead", null);
        setIntField(term1879, term1879.getClass(), "sourcePosition", 0);
        setField(term1879, term1879.getClass(), "jsType", null);
        setField(term1879, term1879.getClass(), "parent", null);
        setField(term1871, term1871.getClass(), "last", term1879);
        setField(term1882, term1882.getClass(), "next", null);
        setIntField(term1882, term1882.getClass(), "type", 0);
        setIntField(term1882, term1882.getClass(), "intValue", 0);
        setField(term1882, term1882.getClass(), "objectValue", null);
        setField(term1871, term1871.getClass(), "propListHead", term1882);
        setIntField(term1871, term1871.getClass(), "sourcePosition", 376834234);
        setField(term1871, term1871.getClass(), "jsType", null);
        setField(term1871, term1871.getClass(), "parent", null);
        setField(term1869, term1869.getClass(), "next", term1871);
        setIntField(term1886, term1886.getClass(), "type", 0);
        setField(term1886, term1886.getClass(), "next", null);
        setField(term1886, term1886.getClass(), "first", null);
        setField(term1886, term1886.getClass(), "last", null);
        setField(term1886, term1886.getClass(), "propListHead", null);
        setIntField(term1886, term1886.getClass(), "sourcePosition", 0);
        setField(term1886, term1886.getClass(), "jsType", null);
        setField(term1886, term1886.getClass(), "parent", null);
        setField(term1869, term1869.getClass(), "first", term1886);
        setIntField(term1889, term1889.getClass(), "type", 0);
        setField(term1889, term1889.getClass(), "next", null);
        setField(term1889, term1889.getClass(), "first", null);
        setField(term1889, term1889.getClass(), "last", null);
        setField(term1889, term1889.getClass(), "propListHead", null);
        setIntField(term1889, term1889.getClass(), "sourcePosition", 0);
        setField(term1889, term1889.getClass(), "jsType", null);
        setField(term1889, term1889.getClass(), "parent", null);
        setField(term1869, term1869.getClass(), "last", term1889);
        setField(term1892, term1892.getClass(), "next", null);
        setIntField(term1892, term1892.getClass(), "type", 0);
        setIntField(term1892, term1892.getClass(), "intValue", 0);
        setField(term1892, term1892.getClass(), "objectValue", null);
        setField(term1869, term1869.getClass(), "propListHead", term1892);
        setIntField(term1869, term1869.getClass(), "sourcePosition", -1911972560);
        setField(term1869, term1869.getClass(), "jsType", null);
        setField(term1869, term1869.getClass(), "parent", null);
        term11882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11886 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11893 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11899 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11882, term11882.getClass(), "type", 934338954);
        setIntField(term11884, term11884.getClass(), "type", 1415142780);
        setIntField(term11886, term11886.getClass(), "type", 0);
        setField(term11886, term11886.getClass(), "next", null);
        setField(term11886, term11886.getClass(), "first", null);
        setField(term11886, term11886.getClass(), "last", null);
        setField(term11886, term11886.getClass(), "propListHead", null);
        setIntField(term11886, term11886.getClass(), "sourcePosition", 0);
        setField(term11886, term11886.getClass(), "jsType", null);
        setField(term11886, term11886.getClass(), "parent", null);
        setField(term11884, term11884.getClass(), "next", term11886);
        setIntField(term11888, term11888.getClass(), "type", 0);
        setField(term11888, term11888.getClass(), "next", null);
        setField(term11888, term11888.getClass(), "first", null);
        setField(term11888, term11888.getClass(), "last", null);
        setField(term11888, term11888.getClass(), "propListHead", null);
        setIntField(term11888, term11888.getClass(), "sourcePosition", 0);
        setField(term11888, term11888.getClass(), "jsType", null);
        setField(term11888, term11888.getClass(), "parent", null);
        setField(term11884, term11884.getClass(), "first", term11888);
        setIntField(term11891, term11891.getClass(), "type", 0);
        setField(term11891, term11891.getClass(), "next", null);
        setField(term11891, term11891.getClass(), "first", null);
        setField(term11891, term11891.getClass(), "last", null);
        setField(term11891, term11891.getClass(), "propListHead", null);
        setIntField(term11891, term11891.getClass(), "sourcePosition", 0);
        setField(term11891, term11891.getClass(), "jsType", null);
        setField(term11891, term11891.getClass(), "parent", null);
        setField(term11884, term11884.getClass(), "last", term11891);
        setField(term11893, term11893.getClass(), "next", null);
        setIntField(term11893, term11893.getClass(), "type", 0);
        setIntField(term11893, term11893.getClass(), "intValue", 0);
        setField(term11893, term11893.getClass(), "objectValue", null);
        setField(term11884, term11884.getClass(), "propListHead", term11893);
        setIntField(term11884, term11884.getClass(), "sourcePosition", 376834234);
        setField(term11884, term11884.getClass(), "jsType", null);
        setField(term11884, term11884.getClass(), "parent", null);
        setField(term11882, term11882.getClass(), "next", term11884);
        setIntField(term11895, term11895.getClass(), "type", 0);
        setField(term11895, term11895.getClass(), "next", null);
        setField(term11895, term11895.getClass(), "first", null);
        setField(term11895, term11895.getClass(), "last", null);
        setField(term11895, term11895.getClass(), "propListHead", null);
        setIntField(term11895, term11895.getClass(), "sourcePosition", 0);
        setField(term11895, term11895.getClass(), "jsType", null);
        setField(term11895, term11895.getClass(), "parent", null);
        setField(term11882, term11882.getClass(), "first", term11895);
        setIntField(term11897, term11897.getClass(), "type", 0);
        setField(term11897, term11897.getClass(), "next", null);
        setField(term11897, term11897.getClass(), "first", null);
        setField(term11897, term11897.getClass(), "last", null);
        setField(term11897, term11897.getClass(), "propListHead", null);
        setIntField(term11897, term11897.getClass(), "sourcePosition", 0);
        setField(term11897, term11897.getClass(), "jsType", null);
        setField(term11897, term11897.getClass(), "parent", null);
        setField(term11882, term11882.getClass(), "last", term11897);
        setField(term11899, term11899.getClass(), "next", null);
        setIntField(term11899, term11899.getClass(), "type", 0);
        setIntField(term11899, term11899.getClass(), "intValue", 0);
        setField(term11899, term11899.getClass(), "objectValue", null);
        setField(term11882, term11882.getClass(), "propListHead", term11899);
        setIntField(term11882, term11882.getClass(), "sourcePosition", -1911972560);
        setField(term11882, term11882.getClass(), "jsType", null);
        setField(term11882, term11882.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1869;
        Object retValue = callMethod(klass, "isEmptyFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term1869, term11882));
        assertTrue(recursiveEquals(retValue, false));
    }

};


