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

public class NodeUtil_isEmptyFunctionExpression_624974588244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2459;
     Object term15842;

    public NodeUtil_isEmptyFunctionExpression_624974588244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2472 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2482 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2459, term2459.getClass(), "type", 1485731037);
        setIntField(term2461, term2461.getClass(), "type", -203163250);
        setIntField(term2463, term2463.getClass(), "type", 0);
        setField(term2463, term2463.getClass(), "next", null);
        setField(term2463, term2463.getClass(), "first", null);
        setField(term2463, term2463.getClass(), "last", null);
        setField(term2463, term2463.getClass(), "propListHead", null);
        setIntField(term2463, term2463.getClass(), "sourcePosition", 0);
        setField(term2463, term2463.getClass(), "jsType", null);
        setField(term2463, term2463.getClass(), "parent", null);
        setField(term2461, term2461.getClass(), "next", term2463);
        setIntField(term2466, term2466.getClass(), "type", 0);
        setField(term2466, term2466.getClass(), "next", null);
        setField(term2466, term2466.getClass(), "first", null);
        setField(term2466, term2466.getClass(), "last", null);
        setField(term2466, term2466.getClass(), "propListHead", null);
        setIntField(term2466, term2466.getClass(), "sourcePosition", 0);
        setField(term2466, term2466.getClass(), "jsType", null);
        setField(term2466, term2466.getClass(), "parent", null);
        setField(term2461, term2461.getClass(), "first", term2466);
        setIntField(term2469, term2469.getClass(), "type", 0);
        setField(term2469, term2469.getClass(), "next", null);
        setField(term2469, term2469.getClass(), "first", null);
        setField(term2469, term2469.getClass(), "last", null);
        setField(term2469, term2469.getClass(), "propListHead", null);
        setIntField(term2469, term2469.getClass(), "sourcePosition", 0);
        setField(term2469, term2469.getClass(), "jsType", null);
        setField(term2469, term2469.getClass(), "parent", null);
        setField(term2461, term2461.getClass(), "last", term2469);
        setField(term2472, term2472.getClass(), "next", null);
        setIntField(term2472, term2472.getClass(), "type", 0);
        setIntField(term2472, term2472.getClass(), "intValue", 0);
        setField(term2472, term2472.getClass(), "objectValue", null);
        setField(term2461, term2461.getClass(), "propListHead", term2472);
        setIntField(term2461, term2461.getClass(), "sourcePosition", 1670041824);
        setField(term2461, term2461.getClass(), "jsType", null);
        setField(term2461, term2461.getClass(), "parent", null);
        setField(term2459, term2459.getClass(), "next", term2461);
        setIntField(term2476, term2476.getClass(), "type", 0);
        setField(term2476, term2476.getClass(), "next", null);
        setField(term2476, term2476.getClass(), "first", null);
        setField(term2476, term2476.getClass(), "last", null);
        setField(term2476, term2476.getClass(), "propListHead", null);
        setIntField(term2476, term2476.getClass(), "sourcePosition", 0);
        setField(term2476, term2476.getClass(), "jsType", null);
        setField(term2476, term2476.getClass(), "parent", null);
        setField(term2459, term2459.getClass(), "first", term2476);
        setIntField(term2479, term2479.getClass(), "type", 0);
        setField(term2479, term2479.getClass(), "next", null);
        setField(term2479, term2479.getClass(), "first", null);
        setField(term2479, term2479.getClass(), "last", null);
        setField(term2479, term2479.getClass(), "propListHead", null);
        setIntField(term2479, term2479.getClass(), "sourcePosition", 0);
        setField(term2479, term2479.getClass(), "jsType", null);
        setField(term2479, term2479.getClass(), "parent", null);
        setField(term2459, term2459.getClass(), "last", term2479);
        setField(term2482, term2482.getClass(), "next", null);
        setIntField(term2482, term2482.getClass(), "type", 0);
        setIntField(term2482, term2482.getClass(), "intValue", 0);
        setField(term2482, term2482.getClass(), "objectValue", null);
        setField(term2459, term2459.getClass(), "propListHead", term2482);
        setIntField(term2459, term2459.getClass(), "sourcePosition", 2140388634);
        setField(term2459, term2459.getClass(), "jsType", null);
        setField(term2459, term2459.getClass(), "parent", null);
        term15842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15847 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15850 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15842, term15842.getClass(), "type", 1485731037);
        setIntField(term15843, term15843.getClass(), "type", -203163250);
        setIntField(term15844, term15844.getClass(), "type", 0);
        setField(term15844, term15844.getClass(), "next", null);
        setField(term15844, term15844.getClass(), "first", null);
        setField(term15844, term15844.getClass(), "last", null);
        setField(term15844, term15844.getClass(), "propListHead", null);
        setIntField(term15844, term15844.getClass(), "sourcePosition", 0);
        setField(term15844, term15844.getClass(), "jsType", null);
        setField(term15844, term15844.getClass(), "parent", null);
        setField(term15843, term15843.getClass(), "next", term15844);
        setIntField(term15845, term15845.getClass(), "type", 0);
        setField(term15845, term15845.getClass(), "next", null);
        setField(term15845, term15845.getClass(), "first", null);
        setField(term15845, term15845.getClass(), "last", null);
        setField(term15845, term15845.getClass(), "propListHead", null);
        setIntField(term15845, term15845.getClass(), "sourcePosition", 0);
        setField(term15845, term15845.getClass(), "jsType", null);
        setField(term15845, term15845.getClass(), "parent", null);
        setField(term15843, term15843.getClass(), "first", term15845);
        setIntField(term15846, term15846.getClass(), "type", 0);
        setField(term15846, term15846.getClass(), "next", null);
        setField(term15846, term15846.getClass(), "first", null);
        setField(term15846, term15846.getClass(), "last", null);
        setField(term15846, term15846.getClass(), "propListHead", null);
        setIntField(term15846, term15846.getClass(), "sourcePosition", 0);
        setField(term15846, term15846.getClass(), "jsType", null);
        setField(term15846, term15846.getClass(), "parent", null);
        setField(term15843, term15843.getClass(), "last", term15846);
        setField(term15847, term15847.getClass(), "next", null);
        setIntField(term15847, term15847.getClass(), "type", 0);
        setIntField(term15847, term15847.getClass(), "intValue", 0);
        setField(term15847, term15847.getClass(), "objectValue", null);
        setField(term15843, term15843.getClass(), "propListHead", term15847);
        setIntField(term15843, term15843.getClass(), "sourcePosition", 1670041824);
        setField(term15843, term15843.getClass(), "jsType", null);
        setField(term15843, term15843.getClass(), "parent", null);
        setField(term15842, term15842.getClass(), "next", term15843);
        setIntField(term15848, term15848.getClass(), "type", 0);
        setField(term15848, term15848.getClass(), "next", null);
        setField(term15848, term15848.getClass(), "first", null);
        setField(term15848, term15848.getClass(), "last", null);
        setField(term15848, term15848.getClass(), "propListHead", null);
        setIntField(term15848, term15848.getClass(), "sourcePosition", 0);
        setField(term15848, term15848.getClass(), "jsType", null);
        setField(term15848, term15848.getClass(), "parent", null);
        setField(term15842, term15842.getClass(), "first", term15848);
        setIntField(term15849, term15849.getClass(), "type", 0);
        setField(term15849, term15849.getClass(), "next", null);
        setField(term15849, term15849.getClass(), "first", null);
        setField(term15849, term15849.getClass(), "last", null);
        setField(term15849, term15849.getClass(), "propListHead", null);
        setIntField(term15849, term15849.getClass(), "sourcePosition", 0);
        setField(term15849, term15849.getClass(), "jsType", null);
        setField(term15849, term15849.getClass(), "parent", null);
        setField(term15842, term15842.getClass(), "last", term15849);
        setField(term15850, term15850.getClass(), "next", null);
        setIntField(term15850, term15850.getClass(), "type", 0);
        setIntField(term15850, term15850.getClass(), "intValue", 0);
        setField(term15850, term15850.getClass(), "objectValue", null);
        setField(term15842, term15842.getClass(), "propListHead", term15850);
        setIntField(term15842, term15842.getClass(), "sourcePosition", 2140388634);
        setField(term15842, term15842.getClass(), "jsType", null);
        setField(term15842, term15842.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2459;
        Object retValue = callMethod(klass, "isEmptyFunctionExpression", argTypes, null, args);
        assertTrue(recursiveEquals(term2459, term15842));
        assertTrue(recursiveEquals(retValue, false));
    }

};


