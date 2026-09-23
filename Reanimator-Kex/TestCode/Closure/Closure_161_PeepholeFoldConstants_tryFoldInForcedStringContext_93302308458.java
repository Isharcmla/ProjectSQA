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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class PeepholeFoldConstants_tryFoldInForcedStringContext_93302308458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2718;
     Object term2774;

    public PeepholeFoldConstants_tryFoldInForcedStringContext_93302308458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2734 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2734, term2734.getClass(), "vars", null);
        setField(term2734, term2734.getClass(), "parent", null);
        setIntField(term2734, term2734.getClass(), "depth", 0);
        setField(term2734, term2734.getClass(), "rootNode", null);
        setField(term2734, term2734.getClass(), "thisType", null);
        setBooleanField(term2734, term2734.getClass(), "isBottom", false);
        setField(term2734, term2734.getClass(), "arguments", null);
        Object term2737 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2737, term2737.getClass(), "vars", null);
        setField(term2737, term2737.getClass(), "parent", null);
        setIntField(term2737, term2737.getClass(), "depth", 0);
        setField(term2737, term2737.getClass(), "rootNode", null);
        setField(term2737, term2737.getClass(), "thisType", null);
        setBooleanField(term2737, term2737.getClass(), "isBottom", false);
        setField(term2737, term2737.getClass(), "arguments", null);
        Object term2740 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2740, term2740.getClass(), "vars", null);
        setField(term2740, term2740.getClass(), "parent", null);
        setIntField(term2740, term2740.getClass(), "depth", 0);
        setField(term2740, term2740.getClass(), "rootNode", null);
        setField(term2740, term2740.getClass(), "thisType", null);
        setBooleanField(term2740, term2740.getClass(), "isBottom", false);
        setField(term2740, term2740.getClass(), "arguments", null);
        Object term2743 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2743, term2743.getClass(), "vars", null);
        setField(term2743, term2743.getClass(), "parent", null);
        setIntField(term2743, term2743.getClass(), "depth", 0);
        setField(term2743, term2743.getClass(), "rootNode", null);
        setField(term2743, term2743.getClass(), "thisType", null);
        setBooleanField(term2743, term2743.getClass(), "isBottom", false);
        setField(term2743, term2743.getClass(), "arguments", null);
        Object term2746 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term2746, term2746.getClass(), "vars", null);
        setField(term2746, term2746.getClass(), "parent", null);
        setIntField(term2746, term2746.getClass(), "depth", 0);
        setField(term2746, term2746.getClass(), "rootNode", null);
        setField(term2746, term2746.getClass(), "thisType", null);
        setBooleanField(term2746, term2746.getClass(), "isBottom", false);
        setField(term2746, term2746.getClass(), "arguments", null);
        ArrayDeque term2732 = new ArrayDeque();
        ((ArrayDeque) term2732).add(term2734);
        ((ArrayDeque) term2732).add(term2737);
        ((ArrayDeque) term2732).add(term2740);
        ((ArrayDeque) term2732).add(term2743);
        ((ArrayDeque) term2732).add(term2746);
        Object term2753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2753, term2753.getClass(), "type", 0);
        setField(term2753, term2753.getClass(), "next", null);
        setField(term2753, term2753.getClass(), "first", null);
        setField(term2753, term2753.getClass(), "last", null);
        setField(term2753, term2753.getClass(), "propListHead", null);
        setIntField(term2753, term2753.getClass(), "sourcePosition", 0);
        setField(term2753, term2753.getClass(), "jsType", null);
        setField(term2753, term2753.getClass(), "parent", null);
        ArrayDeque term2751 = new ArrayDeque();
        ((ArrayDeque) term2751).add(term2753);
        ArrayDeque term2758 = new ArrayDeque();
        term2718 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term2719 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term2720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2719, term2719.getClass(), "compiler", null);
        setField(term2719, term2719.getClass(), "callback", null);
        setIntField(term2720, term2720.getClass(), "type", -728760750);
        setIntField(term2722, term2722.getClass(), "type", 0);
        setField(term2722, term2722.getClass(), "next", null);
        setField(term2722, term2722.getClass(), "first", null);
        setField(term2722, term2722.getClass(), "last", null);
        setField(term2722, term2722.getClass(), "propListHead", null);
        setIntField(term2722, term2722.getClass(), "sourcePosition", 0);
        setField(term2722, term2722.getClass(), "jsType", null);
        setField(term2722, term2722.getClass(), "parent", null);
        setField(term2720, term2720.getClass(), "next", term2722);
        setIntField(term2725, term2725.getClass(), "type", 0);
        setField(term2725, term2725.getClass(), "next", null);
        setField(term2725, term2725.getClass(), "first", null);
        setField(term2725, term2725.getClass(), "last", null);
        setField(term2725, term2725.getClass(), "propListHead", null);
        setIntField(term2725, term2725.getClass(), "sourcePosition", 0);
        setField(term2725, term2725.getClass(), "jsType", null);
        setField(term2725, term2725.getClass(), "parent", null);
        setField(term2720, term2720.getClass(), "first", term2725);
        setIntField(term2728, term2728.getClass(), "type", 0);
        setField(term2728, term2728.getClass(), "next", null);
        setField(term2728, term2728.getClass(), "first", null);
        setField(term2728, term2728.getClass(), "last", null);
        setField(term2728, term2728.getClass(), "propListHead", null);
        setIntField(term2728, term2728.getClass(), "sourcePosition", 0);
        setField(term2728, term2728.getClass(), "jsType", null);
        setField(term2728, term2728.getClass(), "parent", null);
        setField(term2720, term2720.getClass(), "last", term2728);
        setField(term2720, term2720.getClass(), "propListHead", null);
        setIntField(term2720, term2720.getClass(), "sourcePosition", 0);
        setField(term2720, term2720.getClass(), "jsType", null);
        setField(term2720, term2720.getClass(), "parent", null);
        setField(term2719, term2719.getClass(), "curNode", term2720);
        setField(term2719, term2719.getClass(), "scopes", term2732);
        setField(term2719, term2719.getClass(), "scopeRoots", term2751);
        setField(term2719, term2719.getClass(), "cfgs", term2758);
        setField(term2719, term2719.getClass(), "sourceName", "BYqFIqCKAV");
        setField(term2719, term2719.getClass(), "scopeCreator", null);
        setField(term2719, term2719.getClass(), "scopeCallback", null);
        setField(term2718, term2718.getClass(), "currentTraversal", term2719);
        term2774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2774, term2774.getClass(), "type", -1381970335);
        setIntField(term2776, term2776.getClass(), "type", -1538936030);
        setIntField(term2778, term2778.getClass(), "type", 0);
        setField(term2778, term2778.getClass(), "next", null);
        setField(term2778, term2778.getClass(), "first", null);
        setField(term2778, term2778.getClass(), "last", null);
        setField(term2778, term2778.getClass(), "propListHead", null);
        setIntField(term2778, term2778.getClass(), "sourcePosition", 0);
        setField(term2778, term2778.getClass(), "jsType", null);
        setField(term2778, term2778.getClass(), "parent", null);
        setField(term2776, term2776.getClass(), "next", term2778);
        setIntField(term2781, term2781.getClass(), "type", 0);
        setField(term2781, term2781.getClass(), "next", null);
        setField(term2781, term2781.getClass(), "first", null);
        setField(term2781, term2781.getClass(), "last", null);
        setField(term2781, term2781.getClass(), "propListHead", null);
        setIntField(term2781, term2781.getClass(), "sourcePosition", 0);
        setField(term2781, term2781.getClass(), "jsType", null);
        setField(term2781, term2781.getClass(), "parent", null);
        setField(term2776, term2776.getClass(), "first", term2781);
        setIntField(term2784, term2784.getClass(), "type", 0);
        setField(term2784, term2784.getClass(), "next", null);
        setField(term2784, term2784.getClass(), "first", null);
        setField(term2784, term2784.getClass(), "last", null);
        setField(term2784, term2784.getClass(), "propListHead", null);
        setIntField(term2784, term2784.getClass(), "sourcePosition", 0);
        setField(term2784, term2784.getClass(), "jsType", null);
        setField(term2784, term2784.getClass(), "parent", null);
        setField(term2776, term2776.getClass(), "last", term2784);
        setField(term2776, term2776.getClass(), "propListHead", null);
        setIntField(term2776, term2776.getClass(), "sourcePosition", 0);
        setField(term2776, term2776.getClass(), "jsType", null);
        setField(term2776, term2776.getClass(), "parent", null);
        setField(term2774, term2774.getClass(), "next", term2776);
        setIntField(term2788, term2788.getClass(), "type", 0);
        setField(term2788, term2788.getClass(), "next", null);
        setField(term2788, term2788.getClass(), "first", null);
        setField(term2788, term2788.getClass(), "last", null);
        setField(term2788, term2788.getClass(), "propListHead", null);
        setIntField(term2788, term2788.getClass(), "sourcePosition", 0);
        setField(term2788, term2788.getClass(), "jsType", null);
        setField(term2788, term2788.getClass(), "parent", null);
        setField(term2774, term2774.getClass(), "first", term2788);
        setIntField(term2791, term2791.getClass(), "type", 0);
        setField(term2791, term2791.getClass(), "next", null);
        setField(term2791, term2791.getClass(), "first", null);
        setField(term2791, term2791.getClass(), "last", null);
        setField(term2791, term2791.getClass(), "propListHead", null);
        setIntField(term2791, term2791.getClass(), "sourcePosition", 0);
        setField(term2791, term2791.getClass(), "jsType", null);
        setField(term2791, term2791.getClass(), "parent", null);
        setField(term2774, term2774.getClass(), "last", term2791);
        setField(term2774, term2774.getClass(), "propListHead", null);
        setIntField(term2774, term2774.getClass(), "sourcePosition", 0);
        setField(term2774, term2774.getClass(), "jsType", null);
        setField(term2774, term2774.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2774;
        try {
            callMethod(klass, "tryFoldInForcedStringContext", argTypes, term2718, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


