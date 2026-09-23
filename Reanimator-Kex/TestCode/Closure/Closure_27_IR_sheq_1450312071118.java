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

public class IR_sheq_1450312071118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1858;
     Object term1885;

    public IR_sheq_1450312071118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1866 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1858, term1858.getClass(), "type", 1545119095);
        setIntField(term1860, term1860.getClass(), "type", 1671229683);
        setIntField(term1862, term1862.getClass(), "type", 34167717);
        setIntField(term1864, term1864.getClass(), "type", -514195141);
        setIntField(term1866, term1866.getClass(), "type", -297946422);
        setField(term1866, term1866.getClass(), "next", null);
        setField(term1866, term1866.getClass(), "first", null);
        setField(term1866, term1866.getClass(), "last", null);
        setField(term1866, term1866.getClass(), "propListHead", null);
        setIntField(term1866, term1866.getClass(), "sourcePosition", 0);
        setField(term1866, term1866.getClass(), "jsType", null);
        setField(term1866, term1866.getClass(), "parent", null);
        setField(term1864, term1864.getClass(), "next", term1866);
        setIntField(term1869, term1869.getClass(), "type", 385463636);
        setField(term1869, term1869.getClass(), "next", null);
        setField(term1869, term1869.getClass(), "first", null);
        setField(term1869, term1869.getClass(), "last", term1866);
        setField(term1869, term1869.getClass(), "propListHead", null);
        setIntField(term1869, term1869.getClass(), "sourcePosition", 0);
        setField(term1869, term1869.getClass(), "jsType", null);
        setField(term1869, term1869.getClass(), "parent", null);
        setField(term1864, term1864.getClass(), "first", term1869);
        setField(term1864, term1864.getClass(), "last", term1862);
        setField(term1864, term1864.getClass(), "propListHead", null);
        setIntField(term1864, term1864.getClass(), "sourcePosition", 0);
        setField(term1864, term1864.getClass(), "jsType", null);
        setField(term1864, term1864.getClass(), "parent", null);
        setField(term1862, term1862.getClass(), "next", term1864);
        setField(term1862, term1862.getClass(), "first", term1866);
        setIntField(term1873, term1873.getClass(), "type", -1790275458);
        setIntField(term1875, term1875.getClass(), "type", -497534255);
        setField(term1875, term1875.getClass(), "next", null);
        setField(term1875, term1875.getClass(), "first", term1869);
        setField(term1875, term1875.getClass(), "last", term1864);
        setField(term1875, term1875.getClass(), "propListHead", null);
        setIntField(term1875, term1875.getClass(), "sourcePosition", 0);
        setField(term1875, term1875.getClass(), "jsType", null);
        setField(term1875, term1875.getClass(), "parent", null);
        setField(term1873, term1873.getClass(), "next", term1875);
        setField(term1873, term1873.getClass(), "first", term1860);
        setField(term1873, term1873.getClass(), "last", term1860);
        setField(term1873, term1873.getClass(), "propListHead", null);
        setIntField(term1873, term1873.getClass(), "sourcePosition", 0);
        setField(term1873, term1873.getClass(), "jsType", null);
        setField(term1873, term1873.getClass(), "parent", null);
        setField(term1862, term1862.getClass(), "last", term1873);
        setField(term1862, term1862.getClass(), "propListHead", null);
        setIntField(term1862, term1862.getClass(), "sourcePosition", 0);
        setField(term1862, term1862.getClass(), "jsType", null);
        setField(term1862, term1862.getClass(), "parent", null);
        setField(term1860, term1860.getClass(), "next", term1862);
        setIntField(term1880, term1880.getClass(), "type", 1588942911);
        setField(term1880, term1880.getClass(), "next", term1873);
        setField(term1880, term1880.getClass(), "first", term1875);
        setField(term1880, term1880.getClass(), "last", term1858);
        setField(term1880, term1880.getClass(), "propListHead", null);
        setIntField(term1880, term1880.getClass(), "sourcePosition", 0);
        setField(term1880, term1880.getClass(), "jsType", null);
        setField(term1880, term1880.getClass(), "parent", null);
        setField(term1860, term1860.getClass(), "first", term1880);
        setField(term1860, term1860.getClass(), "last", term1880);
        setField(term1860, term1860.getClass(), "propListHead", null);
        setIntField(term1860, term1860.getClass(), "sourcePosition", 0);
        setField(term1860, term1860.getClass(), "jsType", null);
        setField(term1860, term1860.getClass(), "parent", null);
        setField(term1858, term1858.getClass(), "next", term1860);
        setField(term1858, term1858.getClass(), "first", term1864);
        setField(term1858, term1858.getClass(), "last", term1866);
        setField(term1858, term1858.getClass(), "propListHead", null);
        setIntField(term1858, term1858.getClass(), "sourcePosition", 0);
        setField(term1858, term1858.getClass(), "jsType", null);
        setField(term1858, term1858.getClass(), "parent", null);
        term1885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1885, term1885.getClass(), "type", -2129828854);
        setIntField(term1887, term1887.getClass(), "type", -47438786);
        setIntField(term1889, term1889.getClass(), "type", -1955400589);
        setIntField(term1891, term1891.getClass(), "type", 626179200);
        setIntField(term1893, term1893.getClass(), "type", -511077684);
        setField(term1893, term1893.getClass(), "next", null);
        setField(term1893, term1893.getClass(), "first", null);
        setField(term1893, term1893.getClass(), "last", null);
        setField(term1893, term1893.getClass(), "propListHead", null);
        setIntField(term1893, term1893.getClass(), "sourcePosition", 0);
        setField(term1893, term1893.getClass(), "jsType", null);
        setField(term1893, term1893.getClass(), "parent", null);
        setField(term1891, term1891.getClass(), "next", term1893);
        setIntField(term1896, term1896.getClass(), "type", -711507760);
        setField(term1896, term1896.getClass(), "next", null);
        setField(term1896, term1896.getClass(), "first", null);
        setField(term1896, term1896.getClass(), "last", term1893);
        setField(term1896, term1896.getClass(), "propListHead", null);
        setIntField(term1896, term1896.getClass(), "sourcePosition", 0);
        setField(term1896, term1896.getClass(), "jsType", null);
        setField(term1896, term1896.getClass(), "parent", null);
        setField(term1891, term1891.getClass(), "first", term1896);
        setField(term1891, term1891.getClass(), "last", term1889);
        setField(term1891, term1891.getClass(), "propListHead", null);
        setIntField(term1891, term1891.getClass(), "sourcePosition", 0);
        setField(term1891, term1891.getClass(), "jsType", null);
        setField(term1891, term1891.getClass(), "parent", null);
        setField(term1889, term1889.getClass(), "next", term1891);
        setField(term1889, term1889.getClass(), "first", term1893);
        setIntField(term1900, term1900.getClass(), "type", 924127883);
        setIntField(term1902, term1902.getClass(), "type", -751079123);
        setField(term1902, term1902.getClass(), "next", null);
        setField(term1902, term1902.getClass(), "first", term1896);
        setField(term1902, term1902.getClass(), "last", term1891);
        setField(term1902, term1902.getClass(), "propListHead", null);
        setIntField(term1902, term1902.getClass(), "sourcePosition", 0);
        setField(term1902, term1902.getClass(), "jsType", null);
        setField(term1902, term1902.getClass(), "parent", null);
        setField(term1900, term1900.getClass(), "next", term1902);
        setField(term1900, term1900.getClass(), "first", term1887);
        setField(term1900, term1900.getClass(), "last", term1887);
        setField(term1900, term1900.getClass(), "propListHead", null);
        setIntField(term1900, term1900.getClass(), "sourcePosition", 0);
        setField(term1900, term1900.getClass(), "jsType", null);
        setField(term1900, term1900.getClass(), "parent", null);
        setField(term1889, term1889.getClass(), "last", term1900);
        setField(term1889, term1889.getClass(), "propListHead", null);
        setIntField(term1889, term1889.getClass(), "sourcePosition", 0);
        setField(term1889, term1889.getClass(), "jsType", null);
        setField(term1889, term1889.getClass(), "parent", null);
        setField(term1887, term1887.getClass(), "next", term1889);
        setIntField(term1907, term1907.getClass(), "type", -110837188);
        setField(term1907, term1907.getClass(), "next", term1900);
        setField(term1907, term1907.getClass(), "first", term1902);
        setField(term1907, term1907.getClass(), "last", term1885);
        setField(term1907, term1907.getClass(), "propListHead", null);
        setIntField(term1907, term1907.getClass(), "sourcePosition", 0);
        setField(term1907, term1907.getClass(), "jsType", null);
        setField(term1907, term1907.getClass(), "parent", null);
        setField(term1887, term1887.getClass(), "first", term1907);
        setField(term1887, term1887.getClass(), "last", term1907);
        setField(term1887, term1887.getClass(), "propListHead", null);
        setIntField(term1887, term1887.getClass(), "sourcePosition", 0);
        setField(term1887, term1887.getClass(), "jsType", null);
        setField(term1887, term1887.getClass(), "parent", null);
        setField(term1885, term1885.getClass(), "next", term1887);
        setField(term1885, term1885.getClass(), "first", term1891);
        setField(term1885, term1885.getClass(), "last", term1893);
        setField(term1885, term1885.getClass(), "propListHead", null);
        setIntField(term1885, term1885.getClass(), "sourcePosition", 0);
        setField(term1885, term1885.getClass(), "jsType", null);
        setField(term1885, term1885.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1858;
        args[1] = term1885;
        try {
            callMethod(klass, "sheq", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


