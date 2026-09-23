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

public class NodeUtil_redeclareVarsInsideBranch_1330830302199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2223;
     Object term13371;

    public NodeUtil_redeclareVarsInsideBranch_1330830302199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2236 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2246 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2223, term2223.getClass(), "type", -532304223);
        setIntField(term2225, term2225.getClass(), "type", 1523261232);
        setIntField(term2227, term2227.getClass(), "type", 0);
        setField(term2227, term2227.getClass(), "next", null);
        setField(term2227, term2227.getClass(), "first", null);
        setField(term2227, term2227.getClass(), "last", null);
        setField(term2227, term2227.getClass(), "propListHead", null);
        setIntField(term2227, term2227.getClass(), "sourcePosition", 0);
        setField(term2227, term2227.getClass(), "jsType", null);
        setField(term2227, term2227.getClass(), "parent", null);
        setField(term2225, term2225.getClass(), "next", term2227);
        setIntField(term2230, term2230.getClass(), "type", 0);
        setField(term2230, term2230.getClass(), "next", null);
        setField(term2230, term2230.getClass(), "first", null);
        setField(term2230, term2230.getClass(), "last", null);
        setField(term2230, term2230.getClass(), "propListHead", null);
        setIntField(term2230, term2230.getClass(), "sourcePosition", 0);
        setField(term2230, term2230.getClass(), "jsType", null);
        setField(term2230, term2230.getClass(), "parent", null);
        setField(term2225, term2225.getClass(), "first", term2230);
        setIntField(term2233, term2233.getClass(), "type", 0);
        setField(term2233, term2233.getClass(), "next", null);
        setField(term2233, term2233.getClass(), "first", null);
        setField(term2233, term2233.getClass(), "last", null);
        setField(term2233, term2233.getClass(), "propListHead", null);
        setIntField(term2233, term2233.getClass(), "sourcePosition", 0);
        setField(term2233, term2233.getClass(), "jsType", null);
        setField(term2233, term2233.getClass(), "parent", null);
        setField(term2225, term2225.getClass(), "last", term2233);
        setField(term2236, term2236.getClass(), "next", null);
        setIntField(term2236, term2236.getClass(), "type", 0);
        setIntField(term2236, term2236.getClass(), "intValue", 0);
        setField(term2236, term2236.getClass(), "objectValue", null);
        setField(term2225, term2225.getClass(), "propListHead", term2236);
        setIntField(term2225, term2225.getClass(), "sourcePosition", 1902784843);
        setField(term2225, term2225.getClass(), "jsType", null);
        setField(term2225, term2225.getClass(), "parent", null);
        setField(term2223, term2223.getClass(), "next", term2225);
        setIntField(term2240, term2240.getClass(), "type", 0);
        setField(term2240, term2240.getClass(), "next", null);
        setField(term2240, term2240.getClass(), "first", null);
        setField(term2240, term2240.getClass(), "last", null);
        setField(term2240, term2240.getClass(), "propListHead", null);
        setIntField(term2240, term2240.getClass(), "sourcePosition", 0);
        setField(term2240, term2240.getClass(), "jsType", null);
        setField(term2240, term2240.getClass(), "parent", null);
        setField(term2223, term2223.getClass(), "first", term2240);
        setIntField(term2243, term2243.getClass(), "type", 0);
        setField(term2243, term2243.getClass(), "next", null);
        setField(term2243, term2243.getClass(), "first", null);
        setField(term2243, term2243.getClass(), "last", null);
        setField(term2243, term2243.getClass(), "propListHead", null);
        setIntField(term2243, term2243.getClass(), "sourcePosition", 0);
        setField(term2243, term2243.getClass(), "jsType", null);
        setField(term2243, term2243.getClass(), "parent", null);
        setField(term2223, term2223.getClass(), "last", term2243);
        setField(term2246, term2246.getClass(), "next", null);
        setIntField(term2246, term2246.getClass(), "type", 0);
        setIntField(term2246, term2246.getClass(), "intValue", 0);
        setField(term2246, term2246.getClass(), "objectValue", null);
        setField(term2223, term2223.getClass(), "propListHead", term2246);
        setIntField(term2223, term2223.getClass(), "sourcePosition", 2021136615);
        setField(term2223, term2223.getClass(), "jsType", null);
        setField(term2223, term2223.getClass(), "parent", null);
        term13371 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13376 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13378 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13379 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13371, term13371.getClass(), "type", -532304223);
        setIntField(term13372, term13372.getClass(), "type", 1523261232);
        setIntField(term13373, term13373.getClass(), "type", 0);
        setField(term13373, term13373.getClass(), "next", null);
        setField(term13373, term13373.getClass(), "first", null);
        setField(term13373, term13373.getClass(), "last", null);
        setField(term13373, term13373.getClass(), "propListHead", null);
        setIntField(term13373, term13373.getClass(), "sourcePosition", 0);
        setField(term13373, term13373.getClass(), "jsType", null);
        setField(term13373, term13373.getClass(), "parent", null);
        setField(term13372, term13372.getClass(), "next", term13373);
        setIntField(term13374, term13374.getClass(), "type", 0);
        setField(term13374, term13374.getClass(), "next", null);
        setField(term13374, term13374.getClass(), "first", null);
        setField(term13374, term13374.getClass(), "last", null);
        setField(term13374, term13374.getClass(), "propListHead", null);
        setIntField(term13374, term13374.getClass(), "sourcePosition", 0);
        setField(term13374, term13374.getClass(), "jsType", null);
        setField(term13374, term13374.getClass(), "parent", null);
        setField(term13372, term13372.getClass(), "first", term13374);
        setIntField(term13375, term13375.getClass(), "type", 0);
        setField(term13375, term13375.getClass(), "next", null);
        setField(term13375, term13375.getClass(), "first", null);
        setField(term13375, term13375.getClass(), "last", null);
        setField(term13375, term13375.getClass(), "propListHead", null);
        setIntField(term13375, term13375.getClass(), "sourcePosition", 0);
        setField(term13375, term13375.getClass(), "jsType", null);
        setField(term13375, term13375.getClass(), "parent", null);
        setField(term13372, term13372.getClass(), "last", term13375);
        setField(term13376, term13376.getClass(), "next", null);
        setIntField(term13376, term13376.getClass(), "type", 0);
        setIntField(term13376, term13376.getClass(), "intValue", 0);
        setField(term13376, term13376.getClass(), "objectValue", null);
        setField(term13372, term13372.getClass(), "propListHead", term13376);
        setIntField(term13372, term13372.getClass(), "sourcePosition", 1902784843);
        setField(term13372, term13372.getClass(), "jsType", null);
        setField(term13372, term13372.getClass(), "parent", null);
        setField(term13371, term13371.getClass(), "next", term13372);
        setIntField(term13377, term13377.getClass(), "type", 0);
        setField(term13377, term13377.getClass(), "next", null);
        setField(term13377, term13377.getClass(), "first", null);
        setField(term13377, term13377.getClass(), "last", null);
        setField(term13377, term13377.getClass(), "propListHead", null);
        setIntField(term13377, term13377.getClass(), "sourcePosition", 0);
        setField(term13377, term13377.getClass(), "jsType", null);
        setField(term13377, term13377.getClass(), "parent", null);
        setField(term13371, term13371.getClass(), "first", term13377);
        setIntField(term13378, term13378.getClass(), "type", 0);
        setField(term13378, term13378.getClass(), "next", null);
        setField(term13378, term13378.getClass(), "first", null);
        setField(term13378, term13378.getClass(), "last", null);
        setField(term13378, term13378.getClass(), "propListHead", null);
        setIntField(term13378, term13378.getClass(), "sourcePosition", 0);
        setField(term13378, term13378.getClass(), "jsType", null);
        setField(term13378, term13378.getClass(), "parent", null);
        setField(term13371, term13371.getClass(), "last", term13378);
        setField(term13379, term13379.getClass(), "next", null);
        setIntField(term13379, term13379.getClass(), "type", 0);
        setIntField(term13379, term13379.getClass(), "intValue", 0);
        setField(term13379, term13379.getClass(), "objectValue", null);
        setField(term13371, term13371.getClass(), "propListHead", term13379);
        setIntField(term13371, term13371.getClass(), "sourcePosition", 2021136615);
        setField(term13371, term13371.getClass(), "jsType", null);
        setField(term13371, term13371.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2223;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2223, term13371));
    }

};


