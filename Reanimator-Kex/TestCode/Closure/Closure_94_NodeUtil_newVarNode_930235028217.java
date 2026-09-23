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

public class NodeUtil_newVarNode_930235028217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2953;

    public NodeUtil_newVarNode_930235028217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2966 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2976 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2953, term2953.getClass(), "type", -2025555268);
        setIntField(term2955, term2955.getClass(), "type", 1624820010);
        setIntField(term2957, term2957.getClass(), "type", 0);
        setField(term2957, term2957.getClass(), "next", null);
        setField(term2957, term2957.getClass(), "first", null);
        setField(term2957, term2957.getClass(), "last", null);
        setField(term2957, term2957.getClass(), "propListHead", null);
        setIntField(term2957, term2957.getClass(), "sourcePosition", 0);
        setField(term2957, term2957.getClass(), "jsType", null);
        setField(term2957, term2957.getClass(), "parent", null);
        setField(term2955, term2955.getClass(), "next", term2957);
        setIntField(term2960, term2960.getClass(), "type", 0);
        setField(term2960, term2960.getClass(), "next", null);
        setField(term2960, term2960.getClass(), "first", null);
        setField(term2960, term2960.getClass(), "last", null);
        setField(term2960, term2960.getClass(), "propListHead", null);
        setIntField(term2960, term2960.getClass(), "sourcePosition", 0);
        setField(term2960, term2960.getClass(), "jsType", null);
        setField(term2960, term2960.getClass(), "parent", null);
        setField(term2955, term2955.getClass(), "first", term2960);
        setIntField(term2963, term2963.getClass(), "type", 0);
        setField(term2963, term2963.getClass(), "next", null);
        setField(term2963, term2963.getClass(), "first", null);
        setField(term2963, term2963.getClass(), "last", null);
        setField(term2963, term2963.getClass(), "propListHead", null);
        setIntField(term2963, term2963.getClass(), "sourcePosition", 0);
        setField(term2963, term2963.getClass(), "jsType", null);
        setField(term2963, term2963.getClass(), "parent", null);
        setField(term2955, term2955.getClass(), "last", term2963);
        setField(term2966, term2966.getClass(), "next", null);
        setIntField(term2966, term2966.getClass(), "type", 0);
        setIntField(term2966, term2966.getClass(), "intValue", 0);
        setField(term2966, term2966.getClass(), "objectValue", null);
        setField(term2955, term2955.getClass(), "propListHead", term2966);
        setIntField(term2955, term2955.getClass(), "sourcePosition", 1773193728);
        setField(term2955, term2955.getClass(), "jsType", null);
        setField(term2955, term2955.getClass(), "parent", null);
        setField(term2953, term2953.getClass(), "next", term2955);
        setIntField(term2970, term2970.getClass(), "type", 0);
        setField(term2970, term2970.getClass(), "next", null);
        setField(term2970, term2970.getClass(), "first", null);
        setField(term2970, term2970.getClass(), "last", null);
        setField(term2970, term2970.getClass(), "propListHead", null);
        setIntField(term2970, term2970.getClass(), "sourcePosition", 0);
        setField(term2970, term2970.getClass(), "jsType", null);
        setField(term2970, term2970.getClass(), "parent", null);
        setField(term2953, term2953.getClass(), "first", term2970);
        setIntField(term2973, term2973.getClass(), "type", 0);
        setField(term2973, term2973.getClass(), "next", null);
        setField(term2973, term2973.getClass(), "first", null);
        setField(term2973, term2973.getClass(), "last", null);
        setField(term2973, term2973.getClass(), "propListHead", null);
        setIntField(term2973, term2973.getClass(), "sourcePosition", 0);
        setField(term2973, term2973.getClass(), "jsType", null);
        setField(term2973, term2973.getClass(), "parent", null);
        setField(term2953, term2953.getClass(), "last", term2973);
        setField(term2976, term2976.getClass(), "next", null);
        setIntField(term2976, term2976.getClass(), "type", 0);
        setIntField(term2976, term2976.getClass(), "intValue", 0);
        setField(term2976, term2976.getClass(), "objectValue", null);
        setField(term2953, term2953.getClass(), "propListHead", term2976);
        setIntField(term2953, term2953.getClass(), "sourcePosition", -1341357647);
        setField(term2953, term2953.getClass(), "jsType", null);
        setField(term2953, term2953.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "xOEqzGAmDU";
        args[1] = term2953;
        try {
            callMethod(klass, "newVarNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


