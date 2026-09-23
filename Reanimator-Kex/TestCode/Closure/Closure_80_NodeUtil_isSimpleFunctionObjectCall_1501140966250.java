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

public class NodeUtil_isSimpleFunctionObjectCall_1501140966250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643;
     Object term16408;

    public NodeUtil_isSimpleFunctionObjectCall_1501140966250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2656 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2666 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2643, term2643.getClass(), "type", 1307244466);
        setIntField(term2645, term2645.getClass(), "type", 2132934139);
        setIntField(term2647, term2647.getClass(), "type", 0);
        setField(term2647, term2647.getClass(), "next", null);
        setField(term2647, term2647.getClass(), "first", null);
        setField(term2647, term2647.getClass(), "last", null);
        setField(term2647, term2647.getClass(), "propListHead", null);
        setIntField(term2647, term2647.getClass(), "sourcePosition", 0);
        setField(term2647, term2647.getClass(), "jsType", null);
        setField(term2647, term2647.getClass(), "parent", null);
        setField(term2645, term2645.getClass(), "next", term2647);
        setIntField(term2650, term2650.getClass(), "type", 0);
        setField(term2650, term2650.getClass(), "next", null);
        setField(term2650, term2650.getClass(), "first", null);
        setField(term2650, term2650.getClass(), "last", null);
        setField(term2650, term2650.getClass(), "propListHead", null);
        setIntField(term2650, term2650.getClass(), "sourcePosition", 0);
        setField(term2650, term2650.getClass(), "jsType", null);
        setField(term2650, term2650.getClass(), "parent", null);
        setField(term2645, term2645.getClass(), "first", term2650);
        setIntField(term2653, term2653.getClass(), "type", 0);
        setField(term2653, term2653.getClass(), "next", null);
        setField(term2653, term2653.getClass(), "first", null);
        setField(term2653, term2653.getClass(), "last", null);
        setField(term2653, term2653.getClass(), "propListHead", null);
        setIntField(term2653, term2653.getClass(), "sourcePosition", 0);
        setField(term2653, term2653.getClass(), "jsType", null);
        setField(term2653, term2653.getClass(), "parent", null);
        setField(term2645, term2645.getClass(), "last", term2653);
        setField(term2656, term2656.getClass(), "next", null);
        setIntField(term2656, term2656.getClass(), "type", 0);
        setIntField(term2656, term2656.getClass(), "intValue", 0);
        setField(term2656, term2656.getClass(), "objectValue", null);
        setField(term2645, term2645.getClass(), "propListHead", term2656);
        setIntField(term2645, term2645.getClass(), "sourcePosition", -2060535464);
        setField(term2645, term2645.getClass(), "jsType", null);
        setField(term2645, term2645.getClass(), "parent", null);
        setField(term2643, term2643.getClass(), "next", term2645);
        setIntField(term2660, term2660.getClass(), "type", 0);
        setField(term2660, term2660.getClass(), "next", null);
        setField(term2660, term2660.getClass(), "first", null);
        setField(term2660, term2660.getClass(), "last", null);
        setField(term2660, term2660.getClass(), "propListHead", null);
        setIntField(term2660, term2660.getClass(), "sourcePosition", 0);
        setField(term2660, term2660.getClass(), "jsType", null);
        setField(term2660, term2660.getClass(), "parent", null);
        setField(term2643, term2643.getClass(), "first", term2660);
        setIntField(term2663, term2663.getClass(), "type", 0);
        setField(term2663, term2663.getClass(), "next", null);
        setField(term2663, term2663.getClass(), "first", null);
        setField(term2663, term2663.getClass(), "last", null);
        setField(term2663, term2663.getClass(), "propListHead", null);
        setIntField(term2663, term2663.getClass(), "sourcePosition", 0);
        setField(term2663, term2663.getClass(), "jsType", null);
        setField(term2663, term2663.getClass(), "parent", null);
        setField(term2643, term2643.getClass(), "last", term2663);
        setField(term2666, term2666.getClass(), "next", null);
        setIntField(term2666, term2666.getClass(), "type", 0);
        setIntField(term2666, term2666.getClass(), "intValue", 0);
        setField(term2666, term2666.getClass(), "objectValue", null);
        setField(term2643, term2643.getClass(), "propListHead", term2666);
        setIntField(term2643, term2643.getClass(), "sourcePosition", -1242946317);
        setField(term2643, term2643.getClass(), "jsType", null);
        setField(term2643, term2643.getClass(), "parent", null);
        term16408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16413 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16416 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16408, term16408.getClass(), "type", 1307244466);
        setIntField(term16409, term16409.getClass(), "type", 2132934139);
        setIntField(term16410, term16410.getClass(), "type", 0);
        setField(term16410, term16410.getClass(), "next", null);
        setField(term16410, term16410.getClass(), "first", null);
        setField(term16410, term16410.getClass(), "last", null);
        setField(term16410, term16410.getClass(), "propListHead", null);
        setIntField(term16410, term16410.getClass(), "sourcePosition", 0);
        setField(term16410, term16410.getClass(), "jsType", null);
        setField(term16410, term16410.getClass(), "parent", null);
        setField(term16409, term16409.getClass(), "next", term16410);
        setIntField(term16411, term16411.getClass(), "type", 0);
        setField(term16411, term16411.getClass(), "next", null);
        setField(term16411, term16411.getClass(), "first", null);
        setField(term16411, term16411.getClass(), "last", null);
        setField(term16411, term16411.getClass(), "propListHead", null);
        setIntField(term16411, term16411.getClass(), "sourcePosition", 0);
        setField(term16411, term16411.getClass(), "jsType", null);
        setField(term16411, term16411.getClass(), "parent", null);
        setField(term16409, term16409.getClass(), "first", term16411);
        setIntField(term16412, term16412.getClass(), "type", 0);
        setField(term16412, term16412.getClass(), "next", null);
        setField(term16412, term16412.getClass(), "first", null);
        setField(term16412, term16412.getClass(), "last", null);
        setField(term16412, term16412.getClass(), "propListHead", null);
        setIntField(term16412, term16412.getClass(), "sourcePosition", 0);
        setField(term16412, term16412.getClass(), "jsType", null);
        setField(term16412, term16412.getClass(), "parent", null);
        setField(term16409, term16409.getClass(), "last", term16412);
        setField(term16413, term16413.getClass(), "next", null);
        setIntField(term16413, term16413.getClass(), "type", 0);
        setIntField(term16413, term16413.getClass(), "intValue", 0);
        setField(term16413, term16413.getClass(), "objectValue", null);
        setField(term16409, term16409.getClass(), "propListHead", term16413);
        setIntField(term16409, term16409.getClass(), "sourcePosition", -2060535464);
        setField(term16409, term16409.getClass(), "jsType", null);
        setField(term16409, term16409.getClass(), "parent", null);
        setField(term16408, term16408.getClass(), "next", term16409);
        setIntField(term16414, term16414.getClass(), "type", 0);
        setField(term16414, term16414.getClass(), "next", null);
        setField(term16414, term16414.getClass(), "first", null);
        setField(term16414, term16414.getClass(), "last", null);
        setField(term16414, term16414.getClass(), "propListHead", null);
        setIntField(term16414, term16414.getClass(), "sourcePosition", 0);
        setField(term16414, term16414.getClass(), "jsType", null);
        setField(term16414, term16414.getClass(), "parent", null);
        setField(term16408, term16408.getClass(), "first", term16414);
        setIntField(term16415, term16415.getClass(), "type", 0);
        setField(term16415, term16415.getClass(), "next", null);
        setField(term16415, term16415.getClass(), "first", null);
        setField(term16415, term16415.getClass(), "last", null);
        setField(term16415, term16415.getClass(), "propListHead", null);
        setIntField(term16415, term16415.getClass(), "sourcePosition", 0);
        setField(term16415, term16415.getClass(), "jsType", null);
        setField(term16415, term16415.getClass(), "parent", null);
        setField(term16408, term16408.getClass(), "last", term16415);
        setField(term16416, term16416.getClass(), "next", null);
        setIntField(term16416, term16416.getClass(), "type", 0);
        setIntField(term16416, term16416.getClass(), "intValue", 0);
        setField(term16416, term16416.getClass(), "objectValue", null);
        setField(term16408, term16408.getClass(), "propListHead", term16416);
        setIntField(term16408, term16408.getClass(), "sourcePosition", -1242946317);
        setField(term16408, term16408.getClass(), "jsType", null);
        setField(term16408, term16408.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2643;
        Object retValue = callMethod(klass, "isSimpleFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2643, term16408));
        assertTrue(recursiveEquals(retValue, false));
    }

};


