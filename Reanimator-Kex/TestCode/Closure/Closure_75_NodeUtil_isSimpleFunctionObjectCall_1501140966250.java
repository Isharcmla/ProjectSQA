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
     Object term16455;

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
        term16455 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16456 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16458 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16460 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16463 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16455, term16455.getClass(), "type", 1307244466);
        setIntField(term16456, term16456.getClass(), "type", 2132934139);
        setIntField(term16457, term16457.getClass(), "type", 0);
        setField(term16457, term16457.getClass(), "next", null);
        setField(term16457, term16457.getClass(), "first", null);
        setField(term16457, term16457.getClass(), "last", null);
        setField(term16457, term16457.getClass(), "propListHead", null);
        setIntField(term16457, term16457.getClass(), "sourcePosition", 0);
        setField(term16457, term16457.getClass(), "jsType", null);
        setField(term16457, term16457.getClass(), "parent", null);
        setField(term16456, term16456.getClass(), "next", term16457);
        setIntField(term16458, term16458.getClass(), "type", 0);
        setField(term16458, term16458.getClass(), "next", null);
        setField(term16458, term16458.getClass(), "first", null);
        setField(term16458, term16458.getClass(), "last", null);
        setField(term16458, term16458.getClass(), "propListHead", null);
        setIntField(term16458, term16458.getClass(), "sourcePosition", 0);
        setField(term16458, term16458.getClass(), "jsType", null);
        setField(term16458, term16458.getClass(), "parent", null);
        setField(term16456, term16456.getClass(), "first", term16458);
        setIntField(term16459, term16459.getClass(), "type", 0);
        setField(term16459, term16459.getClass(), "next", null);
        setField(term16459, term16459.getClass(), "first", null);
        setField(term16459, term16459.getClass(), "last", null);
        setField(term16459, term16459.getClass(), "propListHead", null);
        setIntField(term16459, term16459.getClass(), "sourcePosition", 0);
        setField(term16459, term16459.getClass(), "jsType", null);
        setField(term16459, term16459.getClass(), "parent", null);
        setField(term16456, term16456.getClass(), "last", term16459);
        setField(term16460, term16460.getClass(), "next", null);
        setIntField(term16460, term16460.getClass(), "type", 0);
        setIntField(term16460, term16460.getClass(), "intValue", 0);
        setField(term16460, term16460.getClass(), "objectValue", null);
        setField(term16456, term16456.getClass(), "propListHead", term16460);
        setIntField(term16456, term16456.getClass(), "sourcePosition", -2060535464);
        setField(term16456, term16456.getClass(), "jsType", null);
        setField(term16456, term16456.getClass(), "parent", null);
        setField(term16455, term16455.getClass(), "next", term16456);
        setIntField(term16461, term16461.getClass(), "type", 0);
        setField(term16461, term16461.getClass(), "next", null);
        setField(term16461, term16461.getClass(), "first", null);
        setField(term16461, term16461.getClass(), "last", null);
        setField(term16461, term16461.getClass(), "propListHead", null);
        setIntField(term16461, term16461.getClass(), "sourcePosition", 0);
        setField(term16461, term16461.getClass(), "jsType", null);
        setField(term16461, term16461.getClass(), "parent", null);
        setField(term16455, term16455.getClass(), "first", term16461);
        setIntField(term16462, term16462.getClass(), "type", 0);
        setField(term16462, term16462.getClass(), "next", null);
        setField(term16462, term16462.getClass(), "first", null);
        setField(term16462, term16462.getClass(), "last", null);
        setField(term16462, term16462.getClass(), "propListHead", null);
        setIntField(term16462, term16462.getClass(), "sourcePosition", 0);
        setField(term16462, term16462.getClass(), "jsType", null);
        setField(term16462, term16462.getClass(), "parent", null);
        setField(term16455, term16455.getClass(), "last", term16462);
        setField(term16463, term16463.getClass(), "next", null);
        setIntField(term16463, term16463.getClass(), "type", 0);
        setIntField(term16463, term16463.getClass(), "intValue", 0);
        setField(term16463, term16463.getClass(), "objectValue", null);
        setField(term16455, term16455.getClass(), "propListHead", term16463);
        setIntField(term16455, term16455.getClass(), "sourcePosition", -1242946317);
        setField(term16455, term16455.getClass(), "jsType", null);
        setField(term16455, term16455.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2643;
        Object retValue = callMethod(klass, "isSimpleFunctionObjectCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2643, term16455));
        assertTrue(recursiveEquals(retValue, false));
    }

};


