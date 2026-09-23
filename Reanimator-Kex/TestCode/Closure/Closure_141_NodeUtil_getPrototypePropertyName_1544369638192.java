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

public class NodeUtil_getPrototypePropertyName_1544369638192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2644;

    public NodeUtil_getPrototypePropertyName_1544369638192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2657 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2667 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2644, term2644.getClass(), "type", -1784072578);
        setIntField(term2646, term2646.getClass(), "type", -1007935918);
        setIntField(term2648, term2648.getClass(), "type", 0);
        setField(term2648, term2648.getClass(), "next", null);
        setField(term2648, term2648.getClass(), "first", null);
        setField(term2648, term2648.getClass(), "last", null);
        setField(term2648, term2648.getClass(), "propListHead", null);
        setIntField(term2648, term2648.getClass(), "sourcePosition", 0);
        setField(term2648, term2648.getClass(), "jsType", null);
        setField(term2648, term2648.getClass(), "parent", null);
        setField(term2646, term2646.getClass(), "next", term2648);
        setIntField(term2651, term2651.getClass(), "type", 0);
        setField(term2651, term2651.getClass(), "next", null);
        setField(term2651, term2651.getClass(), "first", null);
        setField(term2651, term2651.getClass(), "last", null);
        setField(term2651, term2651.getClass(), "propListHead", null);
        setIntField(term2651, term2651.getClass(), "sourcePosition", 0);
        setField(term2651, term2651.getClass(), "jsType", null);
        setField(term2651, term2651.getClass(), "parent", null);
        setField(term2646, term2646.getClass(), "first", term2651);
        setIntField(term2654, term2654.getClass(), "type", 0);
        setField(term2654, term2654.getClass(), "next", null);
        setField(term2654, term2654.getClass(), "first", null);
        setField(term2654, term2654.getClass(), "last", null);
        setField(term2654, term2654.getClass(), "propListHead", null);
        setIntField(term2654, term2654.getClass(), "sourcePosition", 0);
        setField(term2654, term2654.getClass(), "jsType", null);
        setField(term2654, term2654.getClass(), "parent", null);
        setField(term2646, term2646.getClass(), "last", term2654);
        setField(term2657, term2657.getClass(), "next", null);
        setIntField(term2657, term2657.getClass(), "type", 0);
        setIntField(term2657, term2657.getClass(), "intValue", 0);
        setField(term2657, term2657.getClass(), "objectValue", null);
        setField(term2646, term2646.getClass(), "propListHead", term2657);
        setIntField(term2646, term2646.getClass(), "sourcePosition", 1782600602);
        setField(term2646, term2646.getClass(), "jsType", null);
        setField(term2646, term2646.getClass(), "parent", null);
        setField(term2644, term2644.getClass(), "next", term2646);
        setIntField(term2661, term2661.getClass(), "type", 0);
        setField(term2661, term2661.getClass(), "next", null);
        setField(term2661, term2661.getClass(), "first", null);
        setField(term2661, term2661.getClass(), "last", null);
        setField(term2661, term2661.getClass(), "propListHead", null);
        setIntField(term2661, term2661.getClass(), "sourcePosition", 0);
        setField(term2661, term2661.getClass(), "jsType", null);
        setField(term2661, term2661.getClass(), "parent", null);
        setField(term2644, term2644.getClass(), "first", term2661);
        setIntField(term2664, term2664.getClass(), "type", 0);
        setField(term2664, term2664.getClass(), "next", null);
        setField(term2664, term2664.getClass(), "first", null);
        setField(term2664, term2664.getClass(), "last", null);
        setField(term2664, term2664.getClass(), "propListHead", null);
        setIntField(term2664, term2664.getClass(), "sourcePosition", 0);
        setField(term2664, term2664.getClass(), "jsType", null);
        setField(term2664, term2664.getClass(), "parent", null);
        setField(term2644, term2644.getClass(), "last", term2664);
        setField(term2667, term2667.getClass(), "next", null);
        setIntField(term2667, term2667.getClass(), "type", 0);
        setIntField(term2667, term2667.getClass(), "intValue", 0);
        setField(term2667, term2667.getClass(), "objectValue", null);
        setField(term2644, term2644.getClass(), "propListHead", term2667);
        setIntField(term2644, term2644.getClass(), "sourcePosition", -185892708);
        setField(term2644, term2644.getClass(), "jsType", null);
        setField(term2644, term2644.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2644;
        try {
            callMethod(klass, "getPrototypePropertyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


