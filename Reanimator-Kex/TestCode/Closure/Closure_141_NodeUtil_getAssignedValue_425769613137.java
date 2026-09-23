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
import java.lang.Object;

public class NodeUtil_getAssignedValue_425769613137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;

    public NodeUtil_getAssignedValue_425769613137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term827 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term831 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term837 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term814, term814.getClass(), "type", 1048271679);
        setIntField(term816, term816.getClass(), "type", -2005784375);
        setIntField(term818, term818.getClass(), "type", 0);
        setField(term818, term818.getClass(), "next", null);
        setField(term818, term818.getClass(), "first", null);
        setField(term818, term818.getClass(), "last", null);
        setField(term818, term818.getClass(), "propListHead", null);
        setIntField(term818, term818.getClass(), "sourcePosition", 0);
        setField(term818, term818.getClass(), "jsType", null);
        setField(term818, term818.getClass(), "parent", null);
        setField(term816, term816.getClass(), "next", term818);
        setIntField(term821, term821.getClass(), "type", 0);
        setField(term821, term821.getClass(), "next", null);
        setField(term821, term821.getClass(), "first", null);
        setField(term821, term821.getClass(), "last", null);
        setField(term821, term821.getClass(), "propListHead", null);
        setIntField(term821, term821.getClass(), "sourcePosition", 0);
        setField(term821, term821.getClass(), "jsType", null);
        setField(term821, term821.getClass(), "parent", null);
        setField(term816, term816.getClass(), "first", term821);
        setIntField(term824, term824.getClass(), "type", 0);
        setField(term824, term824.getClass(), "next", null);
        setField(term824, term824.getClass(), "first", null);
        setField(term824, term824.getClass(), "last", null);
        setField(term824, term824.getClass(), "propListHead", null);
        setIntField(term824, term824.getClass(), "sourcePosition", 0);
        setField(term824, term824.getClass(), "jsType", null);
        setField(term824, term824.getClass(), "parent", null);
        setField(term816, term816.getClass(), "last", term824);
        setField(term827, term827.getClass(), "next", null);
        setIntField(term827, term827.getClass(), "type", 0);
        setIntField(term827, term827.getClass(), "intValue", 0);
        setField(term827, term827.getClass(), "objectValue", null);
        setField(term816, term816.getClass(), "propListHead", term827);
        setIntField(term816, term816.getClass(), "sourcePosition", 877649659);
        setField(term816, term816.getClass(), "jsType", null);
        setField(term816, term816.getClass(), "parent", null);
        setField(term814, term814.getClass(), "next", term816);
        setIntField(term831, term831.getClass(), "type", 0);
        setField(term831, term831.getClass(), "next", null);
        setField(term831, term831.getClass(), "first", null);
        setField(term831, term831.getClass(), "last", null);
        setField(term831, term831.getClass(), "propListHead", null);
        setIntField(term831, term831.getClass(), "sourcePosition", 0);
        setField(term831, term831.getClass(), "jsType", null);
        setField(term831, term831.getClass(), "parent", null);
        setField(term814, term814.getClass(), "first", term831);
        setIntField(term834, term834.getClass(), "type", 0);
        setField(term834, term834.getClass(), "next", null);
        setField(term834, term834.getClass(), "first", null);
        setField(term834, term834.getClass(), "last", null);
        setField(term834, term834.getClass(), "propListHead", null);
        setIntField(term834, term834.getClass(), "sourcePosition", 0);
        setField(term834, term834.getClass(), "jsType", null);
        setField(term834, term834.getClass(), "parent", null);
        setField(term814, term814.getClass(), "last", term834);
        setField(term837, term837.getClass(), "next", null);
        setIntField(term837, term837.getClass(), "type", 0);
        setIntField(term837, term837.getClass(), "intValue", 0);
        setField(term837, term837.getClass(), "objectValue", null);
        setField(term814, term814.getClass(), "propListHead", term837);
        setIntField(term814, term814.getClass(), "sourcePosition", -1332748804);
        setField(term814, term814.getClass(), "jsType", null);
        setField(term814, term814.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term814;
        try {
            callMethod(klass, "getAssignedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


