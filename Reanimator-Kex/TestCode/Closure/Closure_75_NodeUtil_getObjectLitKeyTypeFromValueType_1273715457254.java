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

public class NodeUtil_getObjectLitKeyTypeFromValueType_1273715457254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2805;
     Object term16952;

    public NodeUtil_getObjectLitKeyTypeFromValueType_1273715457254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2807 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2812 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2818 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2828 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2805, term2805.getClass(), "type", 1280322790);
        setIntField(term2807, term2807.getClass(), "type", 1151963130);
        setIntField(term2809, term2809.getClass(), "type", 0);
        setField(term2809, term2809.getClass(), "next", null);
        setField(term2809, term2809.getClass(), "first", null);
        setField(term2809, term2809.getClass(), "last", null);
        setField(term2809, term2809.getClass(), "propListHead", null);
        setIntField(term2809, term2809.getClass(), "sourcePosition", 0);
        setField(term2809, term2809.getClass(), "jsType", null);
        setField(term2809, term2809.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "next", term2809);
        setIntField(term2812, term2812.getClass(), "type", 0);
        setField(term2812, term2812.getClass(), "next", null);
        setField(term2812, term2812.getClass(), "first", null);
        setField(term2812, term2812.getClass(), "last", null);
        setField(term2812, term2812.getClass(), "propListHead", null);
        setIntField(term2812, term2812.getClass(), "sourcePosition", 0);
        setField(term2812, term2812.getClass(), "jsType", null);
        setField(term2812, term2812.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "first", term2812);
        setIntField(term2815, term2815.getClass(), "type", 0);
        setField(term2815, term2815.getClass(), "next", null);
        setField(term2815, term2815.getClass(), "first", null);
        setField(term2815, term2815.getClass(), "last", null);
        setField(term2815, term2815.getClass(), "propListHead", null);
        setIntField(term2815, term2815.getClass(), "sourcePosition", 0);
        setField(term2815, term2815.getClass(), "jsType", null);
        setField(term2815, term2815.getClass(), "parent", null);
        setField(term2807, term2807.getClass(), "last", term2815);
        setField(term2818, term2818.getClass(), "next", null);
        setIntField(term2818, term2818.getClass(), "type", 0);
        setIntField(term2818, term2818.getClass(), "intValue", 0);
        setField(term2818, term2818.getClass(), "objectValue", null);
        setField(term2807, term2807.getClass(), "propListHead", term2818);
        setIntField(term2807, term2807.getClass(), "sourcePosition", 537273345);
        setField(term2807, term2807.getClass(), "jsType", null);
        setField(term2807, term2807.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "next", term2807);
        setIntField(term2822, term2822.getClass(), "type", 0);
        setField(term2822, term2822.getClass(), "next", null);
        setField(term2822, term2822.getClass(), "first", null);
        setField(term2822, term2822.getClass(), "last", null);
        setField(term2822, term2822.getClass(), "propListHead", null);
        setIntField(term2822, term2822.getClass(), "sourcePosition", 0);
        setField(term2822, term2822.getClass(), "jsType", null);
        setField(term2822, term2822.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "first", term2822);
        setIntField(term2825, term2825.getClass(), "type", 0);
        setField(term2825, term2825.getClass(), "next", null);
        setField(term2825, term2825.getClass(), "first", null);
        setField(term2825, term2825.getClass(), "last", null);
        setField(term2825, term2825.getClass(), "propListHead", null);
        setIntField(term2825, term2825.getClass(), "sourcePosition", 0);
        setField(term2825, term2825.getClass(), "jsType", null);
        setField(term2825, term2825.getClass(), "parent", null);
        setField(term2805, term2805.getClass(), "last", term2825);
        setField(term2828, term2828.getClass(), "next", null);
        setIntField(term2828, term2828.getClass(), "type", 0);
        setIntField(term2828, term2828.getClass(), "intValue", 0);
        setField(term2828, term2828.getClass(), "objectValue", null);
        setField(term2805, term2805.getClass(), "propListHead", term2828);
        setIntField(term2805, term2805.getClass(), "sourcePosition", -346107257);
        setField(term2805, term2805.getClass(), "jsType", null);
        setField(term2805, term2805.getClass(), "parent", null);
        term16952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16957 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term16958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16960 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term16952, term16952.getClass(), "type", 1280322790);
        setIntField(term16953, term16953.getClass(), "type", 1151963130);
        setIntField(term16954, term16954.getClass(), "type", 0);
        setField(term16954, term16954.getClass(), "next", null);
        setField(term16954, term16954.getClass(), "first", null);
        setField(term16954, term16954.getClass(), "last", null);
        setField(term16954, term16954.getClass(), "propListHead", null);
        setIntField(term16954, term16954.getClass(), "sourcePosition", 0);
        setField(term16954, term16954.getClass(), "jsType", null);
        setField(term16954, term16954.getClass(), "parent", null);
        setField(term16953, term16953.getClass(), "next", term16954);
        setIntField(term16955, term16955.getClass(), "type", 0);
        setField(term16955, term16955.getClass(), "next", null);
        setField(term16955, term16955.getClass(), "first", null);
        setField(term16955, term16955.getClass(), "last", null);
        setField(term16955, term16955.getClass(), "propListHead", null);
        setIntField(term16955, term16955.getClass(), "sourcePosition", 0);
        setField(term16955, term16955.getClass(), "jsType", null);
        setField(term16955, term16955.getClass(), "parent", null);
        setField(term16953, term16953.getClass(), "first", term16955);
        setIntField(term16956, term16956.getClass(), "type", 0);
        setField(term16956, term16956.getClass(), "next", null);
        setField(term16956, term16956.getClass(), "first", null);
        setField(term16956, term16956.getClass(), "last", null);
        setField(term16956, term16956.getClass(), "propListHead", null);
        setIntField(term16956, term16956.getClass(), "sourcePosition", 0);
        setField(term16956, term16956.getClass(), "jsType", null);
        setField(term16956, term16956.getClass(), "parent", null);
        setField(term16953, term16953.getClass(), "last", term16956);
        setField(term16957, term16957.getClass(), "next", null);
        setIntField(term16957, term16957.getClass(), "type", 0);
        setIntField(term16957, term16957.getClass(), "intValue", 0);
        setField(term16957, term16957.getClass(), "objectValue", null);
        setField(term16953, term16953.getClass(), "propListHead", term16957);
        setIntField(term16953, term16953.getClass(), "sourcePosition", 537273345);
        setField(term16953, term16953.getClass(), "jsType", null);
        setField(term16953, term16953.getClass(), "parent", null);
        setField(term16952, term16952.getClass(), "next", term16953);
        setIntField(term16958, term16958.getClass(), "type", 0);
        setField(term16958, term16958.getClass(), "next", null);
        setField(term16958, term16958.getClass(), "first", null);
        setField(term16958, term16958.getClass(), "last", null);
        setField(term16958, term16958.getClass(), "propListHead", null);
        setIntField(term16958, term16958.getClass(), "sourcePosition", 0);
        setField(term16958, term16958.getClass(), "jsType", null);
        setField(term16958, term16958.getClass(), "parent", null);
        setField(term16952, term16952.getClass(), "first", term16958);
        setIntField(term16959, term16959.getClass(), "type", 0);
        setField(term16959, term16959.getClass(), "next", null);
        setField(term16959, term16959.getClass(), "first", null);
        setField(term16959, term16959.getClass(), "last", null);
        setField(term16959, term16959.getClass(), "propListHead", null);
        setIntField(term16959, term16959.getClass(), "sourcePosition", 0);
        setField(term16959, term16959.getClass(), "jsType", null);
        setField(term16959, term16959.getClass(), "parent", null);
        setField(term16952, term16952.getClass(), "last", term16959);
        setField(term16960, term16960.getClass(), "next", null);
        setIntField(term16960, term16960.getClass(), "type", 0);
        setIntField(term16960, term16960.getClass(), "intValue", 0);
        setField(term16960, term16960.getClass(), "objectValue", null);
        setField(term16952, term16952.getClass(), "propListHead", term16960);
        setIntField(term16952, term16952.getClass(), "sourcePosition", -346107257);
        setField(term16952, term16952.getClass(), "jsType", null);
        setField(term16952, term16952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term2805;
        args[1] = null;
        Object retValue = callMethod(klass, "getObjectLitKeyTypeFromValueType", argTypes, null, args);
        assertTrue(recursiveEquals(term2805, term16952));
        assertTrue(recursiveEquals(retValue, null));
    }

};


