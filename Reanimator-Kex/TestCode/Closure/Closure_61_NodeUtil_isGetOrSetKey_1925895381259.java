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

public class NodeUtil_isGetOrSetKey_1925895381259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2255;
     Object term15614;

    public NodeUtil_isGetOrSetKey_1925895381259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2255 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2272 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2255, term2255.getClass(), "type", -709868952);
        setIntField(term2257, term2257.getClass(), "type", -975856245);
        setIntField(term2259, term2259.getClass(), "type", 0);
        setField(term2259, term2259.getClass(), "next", null);
        setField(term2259, term2259.getClass(), "first", null);
        setField(term2259, term2259.getClass(), "last", null);
        setField(term2259, term2259.getClass(), "propListHead", null);
        setIntField(term2259, term2259.getClass(), "sourcePosition", 0);
        setField(term2259, term2259.getClass(), "jsType", null);
        setField(term2259, term2259.getClass(), "parent", null);
        setField(term2257, term2257.getClass(), "next", term2259);
        setIntField(term2262, term2262.getClass(), "type", 0);
        setField(term2262, term2262.getClass(), "next", null);
        setField(term2262, term2262.getClass(), "first", null);
        setField(term2262, term2262.getClass(), "last", null);
        setField(term2262, term2262.getClass(), "propListHead", null);
        setIntField(term2262, term2262.getClass(), "sourcePosition", 0);
        setField(term2262, term2262.getClass(), "jsType", null);
        setField(term2262, term2262.getClass(), "parent", null);
        setField(term2257, term2257.getClass(), "first", term2262);
        setIntField(term2265, term2265.getClass(), "type", 0);
        setField(term2265, term2265.getClass(), "next", null);
        setField(term2265, term2265.getClass(), "first", null);
        setField(term2265, term2265.getClass(), "last", null);
        setField(term2265, term2265.getClass(), "propListHead", null);
        setIntField(term2265, term2265.getClass(), "sourcePosition", 0);
        setField(term2265, term2265.getClass(), "jsType", null);
        setField(term2265, term2265.getClass(), "parent", null);
        setField(term2257, term2257.getClass(), "last", term2265);
        setField(term2257, term2257.getClass(), "propListHead", null);
        setIntField(term2257, term2257.getClass(), "sourcePosition", 0);
        setField(term2257, term2257.getClass(), "jsType", null);
        setField(term2257, term2257.getClass(), "parent", null);
        setField(term2255, term2255.getClass(), "next", term2257);
        setIntField(term2269, term2269.getClass(), "type", 0);
        setField(term2269, term2269.getClass(), "next", null);
        setField(term2269, term2269.getClass(), "first", null);
        setField(term2269, term2269.getClass(), "last", null);
        setField(term2269, term2269.getClass(), "propListHead", null);
        setIntField(term2269, term2269.getClass(), "sourcePosition", 0);
        setField(term2269, term2269.getClass(), "jsType", null);
        setField(term2269, term2269.getClass(), "parent", null);
        setField(term2255, term2255.getClass(), "first", term2269);
        setIntField(term2272, term2272.getClass(), "type", 0);
        setField(term2272, term2272.getClass(), "next", null);
        setField(term2272, term2272.getClass(), "first", null);
        setField(term2272, term2272.getClass(), "last", null);
        setField(term2272, term2272.getClass(), "propListHead", null);
        setIntField(term2272, term2272.getClass(), "sourcePosition", 0);
        setField(term2272, term2272.getClass(), "jsType", null);
        setField(term2272, term2272.getClass(), "parent", null);
        setField(term2255, term2255.getClass(), "last", term2272);
        setField(term2255, term2255.getClass(), "propListHead", null);
        setIntField(term2255, term2255.getClass(), "sourcePosition", 0);
        setField(term2255, term2255.getClass(), "jsType", null);
        setField(term2255, term2255.getClass(), "parent", null);
        term15614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15614, term15614.getClass(), "type", -709868952);
        setIntField(term15615, term15615.getClass(), "type", -975856245);
        setIntField(term15616, term15616.getClass(), "type", 0);
        setField(term15616, term15616.getClass(), "next", null);
        setField(term15616, term15616.getClass(), "first", null);
        setField(term15616, term15616.getClass(), "last", null);
        setField(term15616, term15616.getClass(), "propListHead", null);
        setIntField(term15616, term15616.getClass(), "sourcePosition", 0);
        setField(term15616, term15616.getClass(), "jsType", null);
        setField(term15616, term15616.getClass(), "parent", null);
        setField(term15615, term15615.getClass(), "next", term15616);
        setIntField(term15617, term15617.getClass(), "type", 0);
        setField(term15617, term15617.getClass(), "next", null);
        setField(term15617, term15617.getClass(), "first", null);
        setField(term15617, term15617.getClass(), "last", null);
        setField(term15617, term15617.getClass(), "propListHead", null);
        setIntField(term15617, term15617.getClass(), "sourcePosition", 0);
        setField(term15617, term15617.getClass(), "jsType", null);
        setField(term15617, term15617.getClass(), "parent", null);
        setField(term15615, term15615.getClass(), "first", term15617);
        setIntField(term15618, term15618.getClass(), "type", 0);
        setField(term15618, term15618.getClass(), "next", null);
        setField(term15618, term15618.getClass(), "first", null);
        setField(term15618, term15618.getClass(), "last", null);
        setField(term15618, term15618.getClass(), "propListHead", null);
        setIntField(term15618, term15618.getClass(), "sourcePosition", 0);
        setField(term15618, term15618.getClass(), "jsType", null);
        setField(term15618, term15618.getClass(), "parent", null);
        setField(term15615, term15615.getClass(), "last", term15618);
        setField(term15615, term15615.getClass(), "propListHead", null);
        setIntField(term15615, term15615.getClass(), "sourcePosition", 0);
        setField(term15615, term15615.getClass(), "jsType", null);
        setField(term15615, term15615.getClass(), "parent", null);
        setField(term15614, term15614.getClass(), "next", term15615);
        setIntField(term15619, term15619.getClass(), "type", 0);
        setField(term15619, term15619.getClass(), "next", null);
        setField(term15619, term15619.getClass(), "first", null);
        setField(term15619, term15619.getClass(), "last", null);
        setField(term15619, term15619.getClass(), "propListHead", null);
        setIntField(term15619, term15619.getClass(), "sourcePosition", 0);
        setField(term15619, term15619.getClass(), "jsType", null);
        setField(term15619, term15619.getClass(), "parent", null);
        setField(term15614, term15614.getClass(), "first", term15619);
        setIntField(term15620, term15620.getClass(), "type", 0);
        setField(term15620, term15620.getClass(), "next", null);
        setField(term15620, term15620.getClass(), "first", null);
        setField(term15620, term15620.getClass(), "last", null);
        setField(term15620, term15620.getClass(), "propListHead", null);
        setIntField(term15620, term15620.getClass(), "sourcePosition", 0);
        setField(term15620, term15620.getClass(), "jsType", null);
        setField(term15620, term15620.getClass(), "parent", null);
        setField(term15614, term15614.getClass(), "last", term15620);
        setField(term15614, term15614.getClass(), "propListHead", null);
        setIntField(term15614, term15614.getClass(), "sourcePosition", 0);
        setField(term15614, term15614.getClass(), "jsType", null);
        setField(term15614, term15614.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2255;
        Object retValue = callMethod(klass, "isGetOrSetKey", argTypes, null, args);
        assertTrue(recursiveEquals(term2255, term15614));
        assertTrue(recursiveEquals(retValue, false));
    }

};


