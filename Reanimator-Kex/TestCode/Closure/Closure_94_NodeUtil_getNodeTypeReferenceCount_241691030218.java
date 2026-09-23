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
import java.lang.Integer;

public class NodeUtil_getNodeTypeReferenceCount_241691030218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2990;
     Object term3017;

    public NodeUtil_getNodeTypeReferenceCount_241691030218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3003 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3013 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2990, term2990.getClass(), "type", 2025566580);
        setIntField(term2992, term2992.getClass(), "type", -859828739);
        setIntField(term2994, term2994.getClass(), "type", 0);
        setField(term2994, term2994.getClass(), "next", null);
        setField(term2994, term2994.getClass(), "first", null);
        setField(term2994, term2994.getClass(), "last", null);
        setField(term2994, term2994.getClass(), "propListHead", null);
        setIntField(term2994, term2994.getClass(), "sourcePosition", 0);
        setField(term2994, term2994.getClass(), "jsType", null);
        setField(term2994, term2994.getClass(), "parent", null);
        setField(term2992, term2992.getClass(), "next", term2994);
        setIntField(term2997, term2997.getClass(), "type", 0);
        setField(term2997, term2997.getClass(), "next", null);
        setField(term2997, term2997.getClass(), "first", null);
        setField(term2997, term2997.getClass(), "last", null);
        setField(term2997, term2997.getClass(), "propListHead", null);
        setIntField(term2997, term2997.getClass(), "sourcePosition", 0);
        setField(term2997, term2997.getClass(), "jsType", null);
        setField(term2997, term2997.getClass(), "parent", null);
        setField(term2992, term2992.getClass(), "first", term2997);
        setIntField(term3000, term3000.getClass(), "type", 0);
        setField(term3000, term3000.getClass(), "next", null);
        setField(term3000, term3000.getClass(), "first", null);
        setField(term3000, term3000.getClass(), "last", null);
        setField(term3000, term3000.getClass(), "propListHead", null);
        setIntField(term3000, term3000.getClass(), "sourcePosition", 0);
        setField(term3000, term3000.getClass(), "jsType", null);
        setField(term3000, term3000.getClass(), "parent", null);
        setField(term2992, term2992.getClass(), "last", term3000);
        setField(term3003, term3003.getClass(), "next", null);
        setIntField(term3003, term3003.getClass(), "type", 0);
        setIntField(term3003, term3003.getClass(), "intValue", 0);
        setField(term3003, term3003.getClass(), "objectValue", null);
        setField(term2992, term2992.getClass(), "propListHead", term3003);
        setIntField(term2992, term2992.getClass(), "sourcePosition", -1702209203);
        setField(term2992, term2992.getClass(), "jsType", null);
        setField(term2992, term2992.getClass(), "parent", null);
        setField(term2990, term2990.getClass(), "next", term2992);
        setIntField(term3007, term3007.getClass(), "type", 0);
        setField(term3007, term3007.getClass(), "next", null);
        setField(term3007, term3007.getClass(), "first", null);
        setField(term3007, term3007.getClass(), "last", null);
        setField(term3007, term3007.getClass(), "propListHead", null);
        setIntField(term3007, term3007.getClass(), "sourcePosition", 0);
        setField(term3007, term3007.getClass(), "jsType", null);
        setField(term3007, term3007.getClass(), "parent", null);
        setField(term2990, term2990.getClass(), "first", term3007);
        setIntField(term3010, term3010.getClass(), "type", 0);
        setField(term3010, term3010.getClass(), "next", null);
        setField(term3010, term3010.getClass(), "first", null);
        setField(term3010, term3010.getClass(), "last", null);
        setField(term3010, term3010.getClass(), "propListHead", null);
        setIntField(term3010, term3010.getClass(), "sourcePosition", 0);
        setField(term3010, term3010.getClass(), "jsType", null);
        setField(term3010, term3010.getClass(), "parent", null);
        setField(term2990, term2990.getClass(), "last", term3010);
        setField(term3013, term3013.getClass(), "next", null);
        setIntField(term3013, term3013.getClass(), "type", 0);
        setIntField(term3013, term3013.getClass(), "intValue", 0);
        setField(term3013, term3013.getClass(), "objectValue", null);
        setField(term2990, term2990.getClass(), "propListHead", term3013);
        setIntField(term2990, term2990.getClass(), "sourcePosition", -1592307668);
        setField(term2990, term2990.getClass(), "jsType", null);
        setField(term2990, term2990.getClass(), "parent", null);
        term3017 = new Integer(-203832871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2990;
        args[1] = term3017;
        args[2] = null;
        try {
            callMethod(klass, "getNodeTypeReferenceCount", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


