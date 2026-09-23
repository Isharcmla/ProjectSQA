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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class PeepholeFoldConstants_inForcedStringContext_185367530361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2891;
     Object term2950;

    public PeepholeFoldConstants_inForcedStringContext_185367530361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term2908 = new ArrayDeque();
        Object term2914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2914, term2914.getClass(), "type", 0);
        setField(term2914, term2914.getClass(), "next", null);
        setField(term2914, term2914.getClass(), "first", null);
        setField(term2914, term2914.getClass(), "last", null);
        setField(term2914, term2914.getClass(), "propListHead", null);
        setIntField(term2914, term2914.getClass(), "sourcePosition", 0);
        setField(term2914, term2914.getClass(), "jsType", null);
        setField(term2914, term2914.getClass(), "parent", null);
        Object term2917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2917, term2917.getClass(), "type", 0);
        setField(term2917, term2917.getClass(), "next", null);
        setField(term2917, term2917.getClass(), "first", null);
        setField(term2917, term2917.getClass(), "last", null);
        setField(term2917, term2917.getClass(), "propListHead", null);
        setIntField(term2917, term2917.getClass(), "sourcePosition", 0);
        setField(term2917, term2917.getClass(), "jsType", null);
        setField(term2917, term2917.getClass(), "parent", null);
        Object term2920 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2920, term2920.getClass(), "type", 0);
        setField(term2920, term2920.getClass(), "next", null);
        setField(term2920, term2920.getClass(), "first", null);
        setField(term2920, term2920.getClass(), "last", null);
        setField(term2920, term2920.getClass(), "propListHead", null);
        setIntField(term2920, term2920.getClass(), "sourcePosition", 0);
        setField(term2920, term2920.getClass(), "jsType", null);
        setField(term2920, term2920.getClass(), "parent", null);
        Object term2923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2923, term2923.getClass(), "type", 0);
        setField(term2923, term2923.getClass(), "next", null);
        setField(term2923, term2923.getClass(), "first", null);
        setField(term2923, term2923.getClass(), "last", null);
        setField(term2923, term2923.getClass(), "propListHead", null);
        setIntField(term2923, term2923.getClass(), "sourcePosition", 0);
        setField(term2923, term2923.getClass(), "jsType", null);
        setField(term2923, term2923.getClass(), "parent", null);
        Object term2926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2926, term2926.getClass(), "type", 0);
        setField(term2926, term2926.getClass(), "next", null);
        setField(term2926, term2926.getClass(), "first", null);
        setField(term2926, term2926.getClass(), "last", null);
        setField(term2926, term2926.getClass(), "propListHead", null);
        setIntField(term2926, term2926.getClass(), "sourcePosition", 0);
        setField(term2926, term2926.getClass(), "jsType", null);
        setField(term2926, term2926.getClass(), "parent", null);
        Object term2929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2929, term2929.getClass(), "type", 0);
        setField(term2929, term2929.getClass(), "next", null);
        setField(term2929, term2929.getClass(), "first", null);
        setField(term2929, term2929.getClass(), "last", null);
        setField(term2929, term2929.getClass(), "propListHead", null);
        setIntField(term2929, term2929.getClass(), "sourcePosition", 0);
        setField(term2929, term2929.getClass(), "jsType", null);
        setField(term2929, term2929.getClass(), "parent", null);
        ArrayDeque term2912 = new ArrayDeque();
        ((ArrayDeque) term2912).add(term2914);
        ((ArrayDeque) term2912).add(term2917);
        ((ArrayDeque) term2912).add(term2920);
        ((ArrayDeque) term2912).add(term2923);
        ((ArrayDeque) term2912).add(term2926);
        ((ArrayDeque) term2912).add(term2929);
        ArrayDeque term2934 = new ArrayDeque();
        term2891 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term2892 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term2893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2901 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2904 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term2892, term2892.getClass(), "compiler", null);
        setField(term2892, term2892.getClass(), "callback", null);
        setIntField(term2893, term2893.getClass(), "type", -751079123);
        setIntField(term2895, term2895.getClass(), "type", 0);
        setField(term2895, term2895.getClass(), "next", null);
        setField(term2895, term2895.getClass(), "first", null);
        setField(term2895, term2895.getClass(), "last", null);
        setField(term2895, term2895.getClass(), "propListHead", null);
        setIntField(term2895, term2895.getClass(), "sourcePosition", 0);
        setField(term2895, term2895.getClass(), "jsType", null);
        setField(term2895, term2895.getClass(), "parent", null);
        setField(term2893, term2893.getClass(), "next", term2895);
        setIntField(term2898, term2898.getClass(), "type", 0);
        setField(term2898, term2898.getClass(), "next", null);
        setField(term2898, term2898.getClass(), "first", null);
        setField(term2898, term2898.getClass(), "last", null);
        setField(term2898, term2898.getClass(), "propListHead", null);
        setIntField(term2898, term2898.getClass(), "sourcePosition", 0);
        setField(term2898, term2898.getClass(), "jsType", null);
        setField(term2898, term2898.getClass(), "parent", null);
        setField(term2893, term2893.getClass(), "first", term2898);
        setIntField(term2901, term2901.getClass(), "type", 0);
        setField(term2901, term2901.getClass(), "next", null);
        setField(term2901, term2901.getClass(), "first", null);
        setField(term2901, term2901.getClass(), "last", null);
        setField(term2901, term2901.getClass(), "propListHead", null);
        setIntField(term2901, term2901.getClass(), "sourcePosition", 0);
        setField(term2901, term2901.getClass(), "jsType", null);
        setField(term2901, term2901.getClass(), "parent", null);
        setField(term2893, term2893.getClass(), "last", term2901);
        setField(term2904, term2904.getClass(), "next", null);
        setIntField(term2904, term2904.getClass(), "type", 0);
        setIntField(term2904, term2904.getClass(), "intValue", 0);
        setField(term2904, term2904.getClass(), "objectValue", null);
        setField(term2893, term2893.getClass(), "propListHead", term2904);
        setIntField(term2893, term2893.getClass(), "sourcePosition", 455632030);
        setField(term2893, term2893.getClass(), "jsType", null);
        setField(term2893, term2893.getClass(), "parent", null);
        setField(term2892, term2892.getClass(), "curNode", term2893);
        setField(term2892, term2892.getClass(), "scopes", term2908);
        setField(term2892, term2892.getClass(), "scopeRoots", term2912);
        setField(term2892, term2892.getClass(), "cfgs", term2934);
        setField(term2892, term2892.getClass(), "sourceName", "xOEqzGAmDU");
        setField(term2892, term2892.getClass(), "scopeCreator", null);
        setField(term2892, term2892.getClass(), "scopeCallback", null);
        setField(term2891, term2891.getClass(), "currentTraversal", term2892);
        term2950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2963 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2973 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2950, term2950.getClass(), "type", 1568948514);
        setIntField(term2952, term2952.getClass(), "type", 1499735894);
        setIntField(term2954, term2954.getClass(), "type", 0);
        setField(term2954, term2954.getClass(), "next", null);
        setField(term2954, term2954.getClass(), "first", null);
        setField(term2954, term2954.getClass(), "last", null);
        setField(term2954, term2954.getClass(), "propListHead", null);
        setIntField(term2954, term2954.getClass(), "sourcePosition", 0);
        setField(term2954, term2954.getClass(), "jsType", null);
        setField(term2954, term2954.getClass(), "parent", null);
        setField(term2952, term2952.getClass(), "next", term2954);
        setIntField(term2957, term2957.getClass(), "type", 0);
        setField(term2957, term2957.getClass(), "next", null);
        setField(term2957, term2957.getClass(), "first", null);
        setField(term2957, term2957.getClass(), "last", null);
        setField(term2957, term2957.getClass(), "propListHead", null);
        setIntField(term2957, term2957.getClass(), "sourcePosition", 0);
        setField(term2957, term2957.getClass(), "jsType", null);
        setField(term2957, term2957.getClass(), "parent", null);
        setField(term2952, term2952.getClass(), "first", term2957);
        setIntField(term2960, term2960.getClass(), "type", 0);
        setField(term2960, term2960.getClass(), "next", null);
        setField(term2960, term2960.getClass(), "first", null);
        setField(term2960, term2960.getClass(), "last", null);
        setField(term2960, term2960.getClass(), "propListHead", null);
        setIntField(term2960, term2960.getClass(), "sourcePosition", 0);
        setField(term2960, term2960.getClass(), "jsType", null);
        setField(term2960, term2960.getClass(), "parent", null);
        setField(term2952, term2952.getClass(), "last", term2960);
        setField(term2963, term2963.getClass(), "next", null);
        setIntField(term2963, term2963.getClass(), "type", 0);
        setIntField(term2963, term2963.getClass(), "intValue", 0);
        setField(term2963, term2963.getClass(), "objectValue", null);
        setField(term2952, term2952.getClass(), "propListHead", term2963);
        setIntField(term2952, term2952.getClass(), "sourcePosition", 1038029515);
        setField(term2952, term2952.getClass(), "jsType", null);
        setField(term2952, term2952.getClass(), "parent", null);
        setField(term2950, term2950.getClass(), "next", term2952);
        setIntField(term2967, term2967.getClass(), "type", 0);
        setField(term2967, term2967.getClass(), "next", null);
        setField(term2967, term2967.getClass(), "first", null);
        setField(term2967, term2967.getClass(), "last", null);
        setField(term2967, term2967.getClass(), "propListHead", null);
        setIntField(term2967, term2967.getClass(), "sourcePosition", 0);
        setField(term2967, term2967.getClass(), "jsType", null);
        setField(term2967, term2967.getClass(), "parent", null);
        setField(term2950, term2950.getClass(), "first", term2967);
        setIntField(term2970, term2970.getClass(), "type", 0);
        setField(term2970, term2970.getClass(), "next", null);
        setField(term2970, term2970.getClass(), "first", null);
        setField(term2970, term2970.getClass(), "last", null);
        setField(term2970, term2970.getClass(), "propListHead", null);
        setIntField(term2970, term2970.getClass(), "sourcePosition", 0);
        setField(term2970, term2970.getClass(), "jsType", null);
        setField(term2970, term2970.getClass(), "parent", null);
        setField(term2950, term2950.getClass(), "last", term2970);
        setField(term2973, term2973.getClass(), "next", null);
        setIntField(term2973, term2973.getClass(), "type", 0);
        setIntField(term2973, term2973.getClass(), "intValue", 0);
        setField(term2973, term2973.getClass(), "objectValue", null);
        setField(term2950, term2950.getClass(), "propListHead", term2973);
        setIntField(term2950, term2950.getClass(), "sourcePosition", 1137154606);
        setField(term2950, term2950.getClass(), "jsType", null);
        setField(term2950, term2950.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2950;
        try {
            callMethod(klass, "inForcedStringContext", argTypes, term2891, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


