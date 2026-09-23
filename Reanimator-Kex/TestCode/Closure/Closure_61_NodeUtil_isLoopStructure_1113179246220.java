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

public class NodeUtil_isLoopStructure_1113179246220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1309;
     Object term11293;

    public NodeUtil_isLoopStructure_1113179246220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1309, term1309.getClass(), "type", -1626451656);
        setIntField(term1311, term1311.getClass(), "type", 2634669);
        setIntField(term1313, term1313.getClass(), "type", 0);
        setField(term1313, term1313.getClass(), "next", null);
        setField(term1313, term1313.getClass(), "first", null);
        setField(term1313, term1313.getClass(), "last", null);
        setField(term1313, term1313.getClass(), "propListHead", null);
        setIntField(term1313, term1313.getClass(), "sourcePosition", 0);
        setField(term1313, term1313.getClass(), "jsType", null);
        setField(term1313, term1313.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "next", term1313);
        setIntField(term1316, term1316.getClass(), "type", 0);
        setField(term1316, term1316.getClass(), "next", null);
        setField(term1316, term1316.getClass(), "first", null);
        setField(term1316, term1316.getClass(), "last", null);
        setField(term1316, term1316.getClass(), "propListHead", null);
        setIntField(term1316, term1316.getClass(), "sourcePosition", 0);
        setField(term1316, term1316.getClass(), "jsType", null);
        setField(term1316, term1316.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "first", term1316);
        setIntField(term1319, term1319.getClass(), "type", 0);
        setField(term1319, term1319.getClass(), "next", null);
        setField(term1319, term1319.getClass(), "first", null);
        setField(term1319, term1319.getClass(), "last", null);
        setField(term1319, term1319.getClass(), "propListHead", null);
        setIntField(term1319, term1319.getClass(), "sourcePosition", 0);
        setField(term1319, term1319.getClass(), "jsType", null);
        setField(term1319, term1319.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "last", term1319);
        setField(term1311, term1311.getClass(), "propListHead", null);
        setIntField(term1311, term1311.getClass(), "sourcePosition", 0);
        setField(term1311, term1311.getClass(), "jsType", null);
        setField(term1311, term1311.getClass(), "parent", null);
        setField(term1309, term1309.getClass(), "next", term1311);
        setIntField(term1323, term1323.getClass(), "type", 0);
        setField(term1323, term1323.getClass(), "next", null);
        setField(term1323, term1323.getClass(), "first", null);
        setField(term1323, term1323.getClass(), "last", null);
        setField(term1323, term1323.getClass(), "propListHead", null);
        setIntField(term1323, term1323.getClass(), "sourcePosition", 0);
        setField(term1323, term1323.getClass(), "jsType", null);
        setField(term1323, term1323.getClass(), "parent", null);
        setField(term1309, term1309.getClass(), "first", term1323);
        setIntField(term1326, term1326.getClass(), "type", 0);
        setField(term1326, term1326.getClass(), "next", null);
        setField(term1326, term1326.getClass(), "first", null);
        setField(term1326, term1326.getClass(), "last", null);
        setField(term1326, term1326.getClass(), "propListHead", null);
        setIntField(term1326, term1326.getClass(), "sourcePosition", 0);
        setField(term1326, term1326.getClass(), "jsType", null);
        setField(term1326, term1326.getClass(), "parent", null);
        setField(term1309, term1309.getClass(), "last", term1326);
        setField(term1309, term1309.getClass(), "propListHead", null);
        setIntField(term1309, term1309.getClass(), "sourcePosition", 0);
        setField(term1309, term1309.getClass(), "jsType", null);
        setField(term1309, term1309.getClass(), "parent", null);
        term11293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term11293, term11293.getClass(), "type", -1626451656);
        setIntField(term11294, term11294.getClass(), "type", 2634669);
        setIntField(term11295, term11295.getClass(), "type", 0);
        setField(term11295, term11295.getClass(), "next", null);
        setField(term11295, term11295.getClass(), "first", null);
        setField(term11295, term11295.getClass(), "last", null);
        setField(term11295, term11295.getClass(), "propListHead", null);
        setIntField(term11295, term11295.getClass(), "sourcePosition", 0);
        setField(term11295, term11295.getClass(), "jsType", null);
        setField(term11295, term11295.getClass(), "parent", null);
        setField(term11294, term11294.getClass(), "next", term11295);
        setIntField(term11296, term11296.getClass(), "type", 0);
        setField(term11296, term11296.getClass(), "next", null);
        setField(term11296, term11296.getClass(), "first", null);
        setField(term11296, term11296.getClass(), "last", null);
        setField(term11296, term11296.getClass(), "propListHead", null);
        setIntField(term11296, term11296.getClass(), "sourcePosition", 0);
        setField(term11296, term11296.getClass(), "jsType", null);
        setField(term11296, term11296.getClass(), "parent", null);
        setField(term11294, term11294.getClass(), "first", term11296);
        setIntField(term11297, term11297.getClass(), "type", 0);
        setField(term11297, term11297.getClass(), "next", null);
        setField(term11297, term11297.getClass(), "first", null);
        setField(term11297, term11297.getClass(), "last", null);
        setField(term11297, term11297.getClass(), "propListHead", null);
        setIntField(term11297, term11297.getClass(), "sourcePosition", 0);
        setField(term11297, term11297.getClass(), "jsType", null);
        setField(term11297, term11297.getClass(), "parent", null);
        setField(term11294, term11294.getClass(), "last", term11297);
        setField(term11294, term11294.getClass(), "propListHead", null);
        setIntField(term11294, term11294.getClass(), "sourcePosition", 0);
        setField(term11294, term11294.getClass(), "jsType", null);
        setField(term11294, term11294.getClass(), "parent", null);
        setField(term11293, term11293.getClass(), "next", term11294);
        setIntField(term11298, term11298.getClass(), "type", 0);
        setField(term11298, term11298.getClass(), "next", null);
        setField(term11298, term11298.getClass(), "first", null);
        setField(term11298, term11298.getClass(), "last", null);
        setField(term11298, term11298.getClass(), "propListHead", null);
        setIntField(term11298, term11298.getClass(), "sourcePosition", 0);
        setField(term11298, term11298.getClass(), "jsType", null);
        setField(term11298, term11298.getClass(), "parent", null);
        setField(term11293, term11293.getClass(), "first", term11298);
        setIntField(term11299, term11299.getClass(), "type", 0);
        setField(term11299, term11299.getClass(), "next", null);
        setField(term11299, term11299.getClass(), "first", null);
        setField(term11299, term11299.getClass(), "last", null);
        setField(term11299, term11299.getClass(), "propListHead", null);
        setIntField(term11299, term11299.getClass(), "sourcePosition", 0);
        setField(term11299, term11299.getClass(), "jsType", null);
        setField(term11299, term11299.getClass(), "parent", null);
        setField(term11293, term11293.getClass(), "last", term11299);
        setField(term11293, term11293.getClass(), "propListHead", null);
        setIntField(term11293, term11293.getClass(), "sourcePosition", 0);
        setField(term11293, term11293.getClass(), "jsType", null);
        setField(term11293, term11293.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1309;
        Object retValue = callMethod(klass, "isLoopStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1309, term11293));
        assertTrue(recursiveEquals(retValue, false));
    }

};


