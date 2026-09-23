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

public class NodeUtil_isFunctionObjectCallOrApply_178419669249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2616;
     Object term16398;

    public NodeUtil_isFunctionObjectCallOrApply_178419669249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2629 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2639 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2616, term2616.getClass(), "type", 1077223540);
        setIntField(term2618, term2618.getClass(), "type", -1270258033);
        setIntField(term2620, term2620.getClass(), "type", 0);
        setField(term2620, term2620.getClass(), "next", null);
        setField(term2620, term2620.getClass(), "first", null);
        setField(term2620, term2620.getClass(), "last", null);
        setField(term2620, term2620.getClass(), "propListHead", null);
        setIntField(term2620, term2620.getClass(), "sourcePosition", 0);
        setField(term2620, term2620.getClass(), "jsType", null);
        setField(term2620, term2620.getClass(), "parent", null);
        setField(term2618, term2618.getClass(), "next", term2620);
        setIntField(term2623, term2623.getClass(), "type", 0);
        setField(term2623, term2623.getClass(), "next", null);
        setField(term2623, term2623.getClass(), "first", null);
        setField(term2623, term2623.getClass(), "last", null);
        setField(term2623, term2623.getClass(), "propListHead", null);
        setIntField(term2623, term2623.getClass(), "sourcePosition", 0);
        setField(term2623, term2623.getClass(), "jsType", null);
        setField(term2623, term2623.getClass(), "parent", null);
        setField(term2618, term2618.getClass(), "first", term2623);
        setIntField(term2626, term2626.getClass(), "type", 0);
        setField(term2626, term2626.getClass(), "next", null);
        setField(term2626, term2626.getClass(), "first", null);
        setField(term2626, term2626.getClass(), "last", null);
        setField(term2626, term2626.getClass(), "propListHead", null);
        setIntField(term2626, term2626.getClass(), "sourcePosition", 0);
        setField(term2626, term2626.getClass(), "jsType", null);
        setField(term2626, term2626.getClass(), "parent", null);
        setField(term2618, term2618.getClass(), "last", term2626);
        setField(term2629, term2629.getClass(), "next", null);
        setIntField(term2629, term2629.getClass(), "type", 0);
        setIntField(term2629, term2629.getClass(), "intValue", 0);
        setField(term2629, term2629.getClass(), "objectValue", null);
        setField(term2618, term2618.getClass(), "propListHead", term2629);
        setIntField(term2618, term2618.getClass(), "sourcePosition", 924095007);
        setField(term2618, term2618.getClass(), "jsType", null);
        setField(term2618, term2618.getClass(), "parent", null);
        setField(term2616, term2616.getClass(), "next", term2618);
        setIntField(term2633, term2633.getClass(), "type", 0);
        setField(term2633, term2633.getClass(), "next", null);
        setField(term2633, term2633.getClass(), "first", null);
        setField(term2633, term2633.getClass(), "last", null);
        setField(term2633, term2633.getClass(), "propListHead", null);
        setIntField(term2633, term2633.getClass(), "sourcePosition", 0);
        setField(term2633, term2633.getClass(), "jsType", null);
        setField(term2633, term2633.getClass(), "parent", null);
        setField(term2616, term2616.getClass(), "first", term2633);
        setIntField(term2636, term2636.getClass(), "type", 0);
        setField(term2636, term2636.getClass(), "next", null);
        setField(term2636, term2636.getClass(), "first", null);
        setField(term2636, term2636.getClass(), "last", null);
        setField(term2636, term2636.getClass(), "propListHead", null);
        setIntField(term2636, term2636.getClass(), "sourcePosition", 0);
        setField(term2636, term2636.getClass(), "jsType", null);
        setField(term2636, term2636.getClass(), "parent", null);
        setField(term2616, term2616.getClass(), "last", term2636);
        setField(term2639, term2639.getClass(), "next", null);
        setIntField(term2639, term2639.getClass(), "type", 0);
        setIntField(term2639, term2639.getClass(), "intValue", 0);
        setField(term2639, term2639.getClass(), "objectValue", null);
        setField(term2616, term2616.getClass(), "propListHead", term2639);
        setIntField(term2616, term2616.getClass(), "sourcePosition", 1302110708);
        setField(term2616, term2616.getClass(), "jsType", null);
        setField(term2616, term2616.getClass(), "parent", null);
        term16398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16403 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16398, term16398.getClass(), "type", 1077223540);
        setIntField(term16399, term16399.getClass(), "type", -1270258033);
        setIntField(term16400, term16400.getClass(), "type", 0);
        setField(term16400, term16400.getClass(), "next", null);
        setField(term16400, term16400.getClass(), "first", null);
        setField(term16400, term16400.getClass(), "last", null);
        setField(term16400, term16400.getClass(), "propListHead", null);
        setIntField(term16400, term16400.getClass(), "sourcePosition", 0);
        setField(term16400, term16400.getClass(), "jsType", null);
        setField(term16400, term16400.getClass(), "parent", null);
        setField(term16399, term16399.getClass(), "next", term16400);
        setIntField(term16401, term16401.getClass(), "type", 0);
        setField(term16401, term16401.getClass(), "next", null);
        setField(term16401, term16401.getClass(), "first", null);
        setField(term16401, term16401.getClass(), "last", null);
        setField(term16401, term16401.getClass(), "propListHead", null);
        setIntField(term16401, term16401.getClass(), "sourcePosition", 0);
        setField(term16401, term16401.getClass(), "jsType", null);
        setField(term16401, term16401.getClass(), "parent", null);
        setField(term16399, term16399.getClass(), "first", term16401);
        setIntField(term16402, term16402.getClass(), "type", 0);
        setField(term16402, term16402.getClass(), "next", null);
        setField(term16402, term16402.getClass(), "first", null);
        setField(term16402, term16402.getClass(), "last", null);
        setField(term16402, term16402.getClass(), "propListHead", null);
        setIntField(term16402, term16402.getClass(), "sourcePosition", 0);
        setField(term16402, term16402.getClass(), "jsType", null);
        setField(term16402, term16402.getClass(), "parent", null);
        setField(term16399, term16399.getClass(), "last", term16402);
        setField(term16403, term16403.getClass(), "next", null);
        setIntField(term16403, term16403.getClass(), "type", 0);
        setIntField(term16403, term16403.getClass(), "intValue", 0);
        setField(term16403, term16403.getClass(), "objectValue", null);
        setField(term16399, term16399.getClass(), "propListHead", term16403);
        setIntField(term16399, term16399.getClass(), "sourcePosition", 924095007);
        setField(term16399, term16399.getClass(), "jsType", null);
        setField(term16399, term16399.getClass(), "parent", null);
        setField(term16398, term16398.getClass(), "next", term16399);
        setIntField(term16404, term16404.getClass(), "type", 0);
        setField(term16404, term16404.getClass(), "next", null);
        setField(term16404, term16404.getClass(), "first", null);
        setField(term16404, term16404.getClass(), "last", null);
        setField(term16404, term16404.getClass(), "propListHead", null);
        setIntField(term16404, term16404.getClass(), "sourcePosition", 0);
        setField(term16404, term16404.getClass(), "jsType", null);
        setField(term16404, term16404.getClass(), "parent", null);
        setField(term16398, term16398.getClass(), "first", term16404);
        setIntField(term16405, term16405.getClass(), "type", 0);
        setField(term16405, term16405.getClass(), "next", null);
        setField(term16405, term16405.getClass(), "first", null);
        setField(term16405, term16405.getClass(), "last", null);
        setField(term16405, term16405.getClass(), "propListHead", null);
        setIntField(term16405, term16405.getClass(), "sourcePosition", 0);
        setField(term16405, term16405.getClass(), "jsType", null);
        setField(term16405, term16405.getClass(), "parent", null);
        setField(term16398, term16398.getClass(), "last", term16405);
        setField(term16406, term16406.getClass(), "next", null);
        setIntField(term16406, term16406.getClass(), "type", 0);
        setIntField(term16406, term16406.getClass(), "intValue", 0);
        setField(term16406, term16406.getClass(), "objectValue", null);
        setField(term16398, term16398.getClass(), "propListHead", term16406);
        setIntField(term16398, term16398.getClass(), "sourcePosition", 1302110708);
        setField(term16398, term16398.getClass(), "jsType", null);
        setField(term16398, term16398.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2616;
        Object retValue = callMethod(klass, "isFunctionObjectCallOrApply", argTypes, null, args);
        assertTrue(recursiveEquals(term2616, term16398));
        assertTrue(recursiveEquals(retValue, false));
    }

};


