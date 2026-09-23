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

public class NodeUtil_valueCheck_1259992823187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public NodeUtil_valueCheck_1259992823187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term900 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term910 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term887, term887.getClass(), "type", 1272542218);
        setIntField(term889, term889.getClass(), "type", -18216811);
        setIntField(term891, term891.getClass(), "type", 0);
        setField(term891, term891.getClass(), "next", null);
        setField(term891, term891.getClass(), "first", null);
        setField(term891, term891.getClass(), "last", null);
        setField(term891, term891.getClass(), "propListHead", null);
        setIntField(term891, term891.getClass(), "sourcePosition", 0);
        setField(term891, term891.getClass(), "jsType", null);
        setField(term891, term891.getClass(), "parent", null);
        setField(term889, term889.getClass(), "next", term891);
        setIntField(term894, term894.getClass(), "type", 0);
        setField(term894, term894.getClass(), "next", null);
        setField(term894, term894.getClass(), "first", null);
        setField(term894, term894.getClass(), "last", null);
        setField(term894, term894.getClass(), "propListHead", null);
        setIntField(term894, term894.getClass(), "sourcePosition", 0);
        setField(term894, term894.getClass(), "jsType", null);
        setField(term894, term894.getClass(), "parent", null);
        setField(term889, term889.getClass(), "first", term894);
        setIntField(term897, term897.getClass(), "type", 0);
        setField(term897, term897.getClass(), "next", null);
        setField(term897, term897.getClass(), "first", null);
        setField(term897, term897.getClass(), "last", null);
        setField(term897, term897.getClass(), "propListHead", null);
        setIntField(term897, term897.getClass(), "sourcePosition", 0);
        setField(term897, term897.getClass(), "jsType", null);
        setField(term897, term897.getClass(), "parent", null);
        setField(term889, term889.getClass(), "last", term897);
        setField(term900, term900.getClass(), "next", null);
        setIntField(term900, term900.getClass(), "type", 0);
        setIntField(term900, term900.getClass(), "intValue", 0);
        setField(term900, term900.getClass(), "objectValue", null);
        setField(term889, term889.getClass(), "propListHead", term900);
        setIntField(term889, term889.getClass(), "sourcePosition", -1516995753);
        setField(term889, term889.getClass(), "jsType", null);
        setField(term889, term889.getClass(), "parent", null);
        setField(term887, term887.getClass(), "next", term889);
        setIntField(term904, term904.getClass(), "type", 0);
        setField(term904, term904.getClass(), "next", null);
        setField(term904, term904.getClass(), "first", null);
        setField(term904, term904.getClass(), "last", null);
        setField(term904, term904.getClass(), "propListHead", null);
        setIntField(term904, term904.getClass(), "sourcePosition", 0);
        setField(term904, term904.getClass(), "jsType", null);
        setField(term904, term904.getClass(), "parent", null);
        setField(term887, term887.getClass(), "first", term904);
        setIntField(term907, term907.getClass(), "type", 0);
        setField(term907, term907.getClass(), "next", null);
        setField(term907, term907.getClass(), "first", null);
        setField(term907, term907.getClass(), "last", null);
        setField(term907, term907.getClass(), "propListHead", null);
        setIntField(term907, term907.getClass(), "sourcePosition", 0);
        setField(term907, term907.getClass(), "jsType", null);
        setField(term907, term907.getClass(), "parent", null);
        setField(term887, term887.getClass(), "last", term907);
        setField(term910, term910.getClass(), "next", null);
        setIntField(term910, term910.getClass(), "type", 0);
        setIntField(term910, term910.getClass(), "intValue", 0);
        setField(term910, term910.getClass(), "objectValue", null);
        setField(term887, term887.getClass(), "propListHead", term910);
        setIntField(term887, term887.getClass(), "sourcePosition", -390501023);
        setField(term887, term887.getClass(), "jsType", null);
        setField(term887, term887.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term887;
        args[1] = null;
        try {
            callMethod(klass, "valueCheck", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


