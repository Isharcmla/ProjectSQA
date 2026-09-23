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

public class NodeUtil_mayEffectMutableState_1245479864133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;
     Object term5722;

    public NodeUtil_mayEffectMutableState_1245479864133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term365 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term375 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term352, term352.getClass(), "type", 158873461);
        setIntField(term354, term354.getClass(), "type", -1388471422);
        setIntField(term356, term356.getClass(), "type", 0);
        setField(term356, term356.getClass(), "next", null);
        setField(term356, term356.getClass(), "first", null);
        setField(term356, term356.getClass(), "last", null);
        setField(term356, term356.getClass(), "propListHead", null);
        setIntField(term356, term356.getClass(), "sourcePosition", 0);
        setField(term356, term356.getClass(), "jsType", null);
        setField(term356, term356.getClass(), "parent", null);
        setField(term354, term354.getClass(), "next", term356);
        setIntField(term359, term359.getClass(), "type", 0);
        setField(term359, term359.getClass(), "next", null);
        setField(term359, term359.getClass(), "first", null);
        setField(term359, term359.getClass(), "last", null);
        setField(term359, term359.getClass(), "propListHead", null);
        setIntField(term359, term359.getClass(), "sourcePosition", 0);
        setField(term359, term359.getClass(), "jsType", null);
        setField(term359, term359.getClass(), "parent", null);
        setField(term354, term354.getClass(), "first", term359);
        setIntField(term362, term362.getClass(), "type", 0);
        setField(term362, term362.getClass(), "next", null);
        setField(term362, term362.getClass(), "first", null);
        setField(term362, term362.getClass(), "last", null);
        setField(term362, term362.getClass(), "propListHead", null);
        setIntField(term362, term362.getClass(), "sourcePosition", 0);
        setField(term362, term362.getClass(), "jsType", null);
        setField(term362, term362.getClass(), "parent", null);
        setField(term354, term354.getClass(), "last", term362);
        setField(term365, term365.getClass(), "next", null);
        setIntField(term365, term365.getClass(), "type", 0);
        setIntField(term365, term365.getClass(), "intValue", 0);
        setField(term365, term365.getClass(), "objectValue", null);
        setField(term354, term354.getClass(), "propListHead", term365);
        setIntField(term354, term354.getClass(), "sourcePosition", 1598895173);
        setField(term354, term354.getClass(), "jsType", null);
        setField(term354, term354.getClass(), "parent", null);
        setField(term352, term352.getClass(), "next", term354);
        setIntField(term369, term369.getClass(), "type", 0);
        setField(term369, term369.getClass(), "next", null);
        setField(term369, term369.getClass(), "first", null);
        setField(term369, term369.getClass(), "last", null);
        setField(term369, term369.getClass(), "propListHead", null);
        setIntField(term369, term369.getClass(), "sourcePosition", 0);
        setField(term369, term369.getClass(), "jsType", null);
        setField(term369, term369.getClass(), "parent", null);
        setField(term352, term352.getClass(), "first", term369);
        setIntField(term372, term372.getClass(), "type", 0);
        setField(term372, term372.getClass(), "next", null);
        setField(term372, term372.getClass(), "first", null);
        setField(term372, term372.getClass(), "last", null);
        setField(term372, term372.getClass(), "propListHead", null);
        setIntField(term372, term372.getClass(), "sourcePosition", 0);
        setField(term372, term372.getClass(), "jsType", null);
        setField(term372, term372.getClass(), "parent", null);
        setField(term352, term352.getClass(), "last", term372);
        setField(term375, term375.getClass(), "next", null);
        setIntField(term375, term375.getClass(), "type", 0);
        setIntField(term375, term375.getClass(), "intValue", 0);
        setField(term375, term375.getClass(), "objectValue", null);
        setField(term352, term352.getClass(), "propListHead", term375);
        setIntField(term352, term352.getClass(), "sourcePosition", 1830648570);
        setField(term352, term352.getClass(), "jsType", null);
        setField(term352, term352.getClass(), "parent", null);
        term5722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5727 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5730 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5722, term5722.getClass(), "type", 158873461);
        setIntField(term5723, term5723.getClass(), "type", -1388471422);
        setIntField(term5724, term5724.getClass(), "type", 0);
        setField(term5724, term5724.getClass(), "next", null);
        setField(term5724, term5724.getClass(), "first", null);
        setField(term5724, term5724.getClass(), "last", null);
        setField(term5724, term5724.getClass(), "propListHead", null);
        setIntField(term5724, term5724.getClass(), "sourcePosition", 0);
        setField(term5724, term5724.getClass(), "jsType", null);
        setField(term5724, term5724.getClass(), "parent", null);
        setField(term5723, term5723.getClass(), "next", term5724);
        setIntField(term5725, term5725.getClass(), "type", 0);
        setField(term5725, term5725.getClass(), "next", null);
        setField(term5725, term5725.getClass(), "first", null);
        setField(term5725, term5725.getClass(), "last", null);
        setField(term5725, term5725.getClass(), "propListHead", null);
        setIntField(term5725, term5725.getClass(), "sourcePosition", 0);
        setField(term5725, term5725.getClass(), "jsType", null);
        setField(term5725, term5725.getClass(), "parent", null);
        setField(term5723, term5723.getClass(), "first", term5725);
        setIntField(term5726, term5726.getClass(), "type", 0);
        setField(term5726, term5726.getClass(), "next", null);
        setField(term5726, term5726.getClass(), "first", null);
        setField(term5726, term5726.getClass(), "last", null);
        setField(term5726, term5726.getClass(), "propListHead", null);
        setIntField(term5726, term5726.getClass(), "sourcePosition", 0);
        setField(term5726, term5726.getClass(), "jsType", null);
        setField(term5726, term5726.getClass(), "parent", null);
        setField(term5723, term5723.getClass(), "last", term5726);
        setField(term5727, term5727.getClass(), "next", null);
        setIntField(term5727, term5727.getClass(), "type", 0);
        setIntField(term5727, term5727.getClass(), "intValue", 0);
        setField(term5727, term5727.getClass(), "objectValue", null);
        setField(term5723, term5723.getClass(), "propListHead", term5727);
        setIntField(term5723, term5723.getClass(), "sourcePosition", 1598895173);
        setField(term5723, term5723.getClass(), "jsType", null);
        setField(term5723, term5723.getClass(), "parent", null);
        setField(term5722, term5722.getClass(), "next", term5723);
        setIntField(term5728, term5728.getClass(), "type", 0);
        setField(term5728, term5728.getClass(), "next", null);
        setField(term5728, term5728.getClass(), "first", null);
        setField(term5728, term5728.getClass(), "last", null);
        setField(term5728, term5728.getClass(), "propListHead", null);
        setIntField(term5728, term5728.getClass(), "sourcePosition", 0);
        setField(term5728, term5728.getClass(), "jsType", null);
        setField(term5728, term5728.getClass(), "parent", null);
        setField(term5722, term5722.getClass(), "first", term5728);
        setIntField(term5729, term5729.getClass(), "type", 0);
        setField(term5729, term5729.getClass(), "next", null);
        setField(term5729, term5729.getClass(), "first", null);
        setField(term5729, term5729.getClass(), "last", null);
        setField(term5729, term5729.getClass(), "propListHead", null);
        setIntField(term5729, term5729.getClass(), "sourcePosition", 0);
        setField(term5729, term5729.getClass(), "jsType", null);
        setField(term5729, term5729.getClass(), "parent", null);
        setField(term5722, term5722.getClass(), "last", term5729);
        setField(term5730, term5730.getClass(), "next", null);
        setIntField(term5730, term5730.getClass(), "type", 0);
        setIntField(term5730, term5730.getClass(), "intValue", 0);
        setField(term5730, term5730.getClass(), "objectValue", null);
        setField(term5722, term5722.getClass(), "propListHead", term5730);
        setIntField(term5722, term5722.getClass(), "sourcePosition", 1830648570);
        setField(term5722, term5722.getClass(), "jsType", null);
        setField(term5722, term5722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term352;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term352, term5722));
    }

};


