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

public class NodeUtil_isFunction_931954219235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2216;
     Object term14876;

    public NodeUtil_isFunction_931954219235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2229 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2239 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2216, term2216.getClass(), "type", -1374527319);
        setIntField(term2218, term2218.getClass(), "type", 454242689);
        setIntField(term2220, term2220.getClass(), "type", 0);
        setField(term2220, term2220.getClass(), "next", null);
        setField(term2220, term2220.getClass(), "first", null);
        setField(term2220, term2220.getClass(), "last", null);
        setField(term2220, term2220.getClass(), "propListHead", null);
        setIntField(term2220, term2220.getClass(), "sourcePosition", 0);
        setField(term2220, term2220.getClass(), "jsType", null);
        setField(term2220, term2220.getClass(), "parent", null);
        setField(term2218, term2218.getClass(), "next", term2220);
        setIntField(term2223, term2223.getClass(), "type", 0);
        setField(term2223, term2223.getClass(), "next", null);
        setField(term2223, term2223.getClass(), "first", null);
        setField(term2223, term2223.getClass(), "last", null);
        setField(term2223, term2223.getClass(), "propListHead", null);
        setIntField(term2223, term2223.getClass(), "sourcePosition", 0);
        setField(term2223, term2223.getClass(), "jsType", null);
        setField(term2223, term2223.getClass(), "parent", null);
        setField(term2218, term2218.getClass(), "first", term2223);
        setIntField(term2226, term2226.getClass(), "type", 0);
        setField(term2226, term2226.getClass(), "next", null);
        setField(term2226, term2226.getClass(), "first", null);
        setField(term2226, term2226.getClass(), "last", null);
        setField(term2226, term2226.getClass(), "propListHead", null);
        setIntField(term2226, term2226.getClass(), "sourcePosition", 0);
        setField(term2226, term2226.getClass(), "jsType", null);
        setField(term2226, term2226.getClass(), "parent", null);
        setField(term2218, term2218.getClass(), "last", term2226);
        setField(term2229, term2229.getClass(), "next", null);
        setIntField(term2229, term2229.getClass(), "type", 0);
        setIntField(term2229, term2229.getClass(), "intValue", 0);
        setField(term2229, term2229.getClass(), "objectValue", null);
        setField(term2218, term2218.getClass(), "propListHead", term2229);
        setIntField(term2218, term2218.getClass(), "sourcePosition", -890538258);
        setField(term2218, term2218.getClass(), "jsType", null);
        setField(term2218, term2218.getClass(), "parent", null);
        setField(term2216, term2216.getClass(), "next", term2218);
        setIntField(term2233, term2233.getClass(), "type", 0);
        setField(term2233, term2233.getClass(), "next", null);
        setField(term2233, term2233.getClass(), "first", null);
        setField(term2233, term2233.getClass(), "last", null);
        setField(term2233, term2233.getClass(), "propListHead", null);
        setIntField(term2233, term2233.getClass(), "sourcePosition", 0);
        setField(term2233, term2233.getClass(), "jsType", null);
        setField(term2233, term2233.getClass(), "parent", null);
        setField(term2216, term2216.getClass(), "first", term2233);
        setIntField(term2236, term2236.getClass(), "type", 0);
        setField(term2236, term2236.getClass(), "next", null);
        setField(term2236, term2236.getClass(), "first", null);
        setField(term2236, term2236.getClass(), "last", null);
        setField(term2236, term2236.getClass(), "propListHead", null);
        setIntField(term2236, term2236.getClass(), "sourcePosition", 0);
        setField(term2236, term2236.getClass(), "jsType", null);
        setField(term2236, term2236.getClass(), "parent", null);
        setField(term2216, term2216.getClass(), "last", term2236);
        setField(term2239, term2239.getClass(), "next", null);
        setIntField(term2239, term2239.getClass(), "type", 0);
        setIntField(term2239, term2239.getClass(), "intValue", 0);
        setField(term2239, term2239.getClass(), "objectValue", null);
        setField(term2216, term2216.getClass(), "propListHead", term2239);
        setIntField(term2216, term2216.getClass(), "sourcePosition", -1085899912);
        setField(term2216, term2216.getClass(), "jsType", null);
        setField(term2216, term2216.getClass(), "parent", null);
        term14876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14877 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14881 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14883 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14884 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14876, term14876.getClass(), "type", -1374527319);
        setIntField(term14877, term14877.getClass(), "type", 454242689);
        setIntField(term14878, term14878.getClass(), "type", 0);
        setField(term14878, term14878.getClass(), "next", null);
        setField(term14878, term14878.getClass(), "first", null);
        setField(term14878, term14878.getClass(), "last", null);
        setField(term14878, term14878.getClass(), "propListHead", null);
        setIntField(term14878, term14878.getClass(), "sourcePosition", 0);
        setField(term14878, term14878.getClass(), "jsType", null);
        setField(term14878, term14878.getClass(), "parent", null);
        setField(term14877, term14877.getClass(), "next", term14878);
        setIntField(term14879, term14879.getClass(), "type", 0);
        setField(term14879, term14879.getClass(), "next", null);
        setField(term14879, term14879.getClass(), "first", null);
        setField(term14879, term14879.getClass(), "last", null);
        setField(term14879, term14879.getClass(), "propListHead", null);
        setIntField(term14879, term14879.getClass(), "sourcePosition", 0);
        setField(term14879, term14879.getClass(), "jsType", null);
        setField(term14879, term14879.getClass(), "parent", null);
        setField(term14877, term14877.getClass(), "first", term14879);
        setIntField(term14880, term14880.getClass(), "type", 0);
        setField(term14880, term14880.getClass(), "next", null);
        setField(term14880, term14880.getClass(), "first", null);
        setField(term14880, term14880.getClass(), "last", null);
        setField(term14880, term14880.getClass(), "propListHead", null);
        setIntField(term14880, term14880.getClass(), "sourcePosition", 0);
        setField(term14880, term14880.getClass(), "jsType", null);
        setField(term14880, term14880.getClass(), "parent", null);
        setField(term14877, term14877.getClass(), "last", term14880);
        setField(term14881, term14881.getClass(), "next", null);
        setIntField(term14881, term14881.getClass(), "type", 0);
        setIntField(term14881, term14881.getClass(), "intValue", 0);
        setField(term14881, term14881.getClass(), "objectValue", null);
        setField(term14877, term14877.getClass(), "propListHead", term14881);
        setIntField(term14877, term14877.getClass(), "sourcePosition", -890538258);
        setField(term14877, term14877.getClass(), "jsType", null);
        setField(term14877, term14877.getClass(), "parent", null);
        setField(term14876, term14876.getClass(), "next", term14877);
        setIntField(term14882, term14882.getClass(), "type", 0);
        setField(term14882, term14882.getClass(), "next", null);
        setField(term14882, term14882.getClass(), "first", null);
        setField(term14882, term14882.getClass(), "last", null);
        setField(term14882, term14882.getClass(), "propListHead", null);
        setIntField(term14882, term14882.getClass(), "sourcePosition", 0);
        setField(term14882, term14882.getClass(), "jsType", null);
        setField(term14882, term14882.getClass(), "parent", null);
        setField(term14876, term14876.getClass(), "first", term14882);
        setIntField(term14883, term14883.getClass(), "type", 0);
        setField(term14883, term14883.getClass(), "next", null);
        setField(term14883, term14883.getClass(), "first", null);
        setField(term14883, term14883.getClass(), "last", null);
        setField(term14883, term14883.getClass(), "propListHead", null);
        setIntField(term14883, term14883.getClass(), "sourcePosition", 0);
        setField(term14883, term14883.getClass(), "jsType", null);
        setField(term14883, term14883.getClass(), "parent", null);
        setField(term14876, term14876.getClass(), "last", term14883);
        setField(term14884, term14884.getClass(), "next", null);
        setIntField(term14884, term14884.getClass(), "type", 0);
        setIntField(term14884, term14884.getClass(), "intValue", 0);
        setField(term14884, term14884.getClass(), "objectValue", null);
        setField(term14876, term14876.getClass(), "propListHead", term14884);
        setIntField(term14876, term14876.getClass(), "sourcePosition", -1085899912);
        setField(term14876, term14876.getClass(), "jsType", null);
        setField(term14876, term14876.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2216;
        Object retValue = callMethod(klass, "isFunction", argTypes, null, args);
        assertTrue(recursiveEquals(term2216, term14876));
        assertTrue(recursiveEquals(retValue, false));
    }

};


