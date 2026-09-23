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

public class NodeUtil_getAddingRoot_820874009268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2738;

    public NodeUtil_getAddingRoot_820874009268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2738, term2738.getClass(), "type", 1512541853);
        setIntField(term2740, term2740.getClass(), "type", -965421502);
        setIntField(term2742, term2742.getClass(), "type", 1319026002);
        setIntField(term2744, term2744.getClass(), "type", -1368173231);
        setIntField(term2746, term2746.getClass(), "type", 1956006038);
        setField(term2746, term2746.getClass(), "next", null);
        setField(term2746, term2746.getClass(), "first", null);
        setField(term2746, term2746.getClass(), "last", null);
        setField(term2746, term2746.getClass(), "propListHead", null);
        setIntField(term2746, term2746.getClass(), "sourcePosition", 0);
        setField(term2746, term2746.getClass(), "jsType", null);
        setField(term2746, term2746.getClass(), "parent", null);
        setField(term2744, term2744.getClass(), "next", term2746);
        setIntField(term2749, term2749.getClass(), "type", -1062304878);
        setField(term2749, term2749.getClass(), "next", null);
        setField(term2749, term2749.getClass(), "first", null);
        setField(term2749, term2749.getClass(), "last", term2746);
        setField(term2749, term2749.getClass(), "propListHead", null);
        setIntField(term2749, term2749.getClass(), "sourcePosition", 0);
        setField(term2749, term2749.getClass(), "jsType", null);
        setField(term2749, term2749.getClass(), "parent", null);
        setField(term2744, term2744.getClass(), "first", term2749);
        setField(term2744, term2744.getClass(), "last", term2742);
        setField(term2744, term2744.getClass(), "propListHead", null);
        setIntField(term2744, term2744.getClass(), "sourcePosition", 0);
        setField(term2744, term2744.getClass(), "jsType", null);
        setField(term2744, term2744.getClass(), "parent", null);
        setField(term2742, term2742.getClass(), "next", term2744);
        setField(term2742, term2742.getClass(), "first", term2746);
        setIntField(term2753, term2753.getClass(), "type", -1456184732);
        setIntField(term2755, term2755.getClass(), "type", 1689228897);
        setField(term2755, term2755.getClass(), "next", null);
        setField(term2755, term2755.getClass(), "first", term2749);
        setField(term2755, term2755.getClass(), "last", term2744);
        setField(term2755, term2755.getClass(), "propListHead", null);
        setIntField(term2755, term2755.getClass(), "sourcePosition", 0);
        setField(term2755, term2755.getClass(), "jsType", null);
        setField(term2755, term2755.getClass(), "parent", null);
        setField(term2753, term2753.getClass(), "next", term2755);
        setField(term2753, term2753.getClass(), "first", term2740);
        setField(term2753, term2753.getClass(), "last", term2740);
        setField(term2753, term2753.getClass(), "propListHead", null);
        setIntField(term2753, term2753.getClass(), "sourcePosition", 0);
        setField(term2753, term2753.getClass(), "jsType", null);
        setField(term2753, term2753.getClass(), "parent", null);
        setField(term2742, term2742.getClass(), "last", term2753);
        setField(term2742, term2742.getClass(), "propListHead", null);
        setIntField(term2742, term2742.getClass(), "sourcePosition", 0);
        setField(term2742, term2742.getClass(), "jsType", null);
        setField(term2742, term2742.getClass(), "parent", null);
        setField(term2740, term2740.getClass(), "next", term2742);
        setIntField(term2760, term2760.getClass(), "type", 892205855);
        setField(term2760, term2760.getClass(), "next", term2753);
        setField(term2760, term2760.getClass(), "first", term2755);
        setField(term2760, term2760.getClass(), "last", term2738);
        setField(term2760, term2760.getClass(), "propListHead", null);
        setIntField(term2760, term2760.getClass(), "sourcePosition", 0);
        setField(term2760, term2760.getClass(), "jsType", null);
        setField(term2760, term2760.getClass(), "parent", null);
        setField(term2740, term2740.getClass(), "first", term2760);
        setField(term2740, term2740.getClass(), "last", term2760);
        setField(term2740, term2740.getClass(), "propListHead", null);
        setIntField(term2740, term2740.getClass(), "sourcePosition", 0);
        setField(term2740, term2740.getClass(), "jsType", null);
        setField(term2740, term2740.getClass(), "parent", null);
        setField(term2738, term2738.getClass(), "next", term2740);
        setField(term2738, term2738.getClass(), "first", term2744);
        setField(term2738, term2738.getClass(), "last", term2746);
        setField(term2738, term2738.getClass(), "propListHead", null);
        setIntField(term2738, term2738.getClass(), "sourcePosition", 0);
        setField(term2738, term2738.getClass(), "jsType", null);
        setField(term2738, term2738.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2738;
        try {
            callMethod(klass, "getAddingRoot", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


