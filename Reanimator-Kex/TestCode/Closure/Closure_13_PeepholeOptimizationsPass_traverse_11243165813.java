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
import java.util.ArrayList;

public class PeepholeOptimizationsPass_traverse_11243165813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term89;

    public PeepholeOptimizationsPass_traverse_11243165813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term83 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$ScopeState"));
        setBooleanField(term83, term83.getClass(), "changed", false);
        setBooleanField(term83, term83.getClass(), "traverseChildScopes", true);
        ArrayList term81 = new ArrayList();
        ((ArrayList) term81).add(term83);
        term78 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass"));
        Object[] term79 = (Object[]) newArray("com.google.javascript.jscomp.AbstractPeepholeOptimization", 4);
        Object term80 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass$StateStack"));
        setField(term78, term78.getClass(), "compiler", null);
        setField(term78, term78.getClass(), "peepholeOptimizations", term79);
        setField(term80, term80.getClass(), "states", term81);
        setIntField(term80, term80.getClass(), "currentDepth", -2068769794);
        setField(term78, term78.getClass(), "traversalState", term80);
        term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term93 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term95 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term97 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term89, term89.getClass(), "type", -117576464);
        setIntField(term91, term91.getClass(), "type", -1007160944);
        setIntField(term93, term93.getClass(), "type", 1135664017);
        setIntField(term95, term95.getClass(), "type", 590364439);
        setIntField(term97, term97.getClass(), "type", 865208305);
        setField(term97, term97.getClass(), "next", null);
        setField(term97, term97.getClass(), "first", null);
        setField(term97, term97.getClass(), "last", null);
        setField(term97, term97.getClass(), "propListHead", null);
        setIntField(term97, term97.getClass(), "sourcePosition", 0);
        setField(term97, term97.getClass(), "jsType", null);
        setField(term97, term97.getClass(), "parent", null);
        setField(term95, term95.getClass(), "next", term97);
        setIntField(term100, term100.getClass(), "type", -1275173084);
        setField(term100, term100.getClass(), "next", null);
        setField(term100, term100.getClass(), "first", null);
        setField(term100, term100.getClass(), "last", term97);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term95, term95.getClass(), "first", term100);
        setField(term95, term95.getClass(), "last", term93);
        setField(term95, term95.getClass(), "propListHead", null);
        setIntField(term95, term95.getClass(), "sourcePosition", 0);
        setField(term95, term95.getClass(), "jsType", null);
        setField(term95, term95.getClass(), "parent", null);
        setField(term93, term93.getClass(), "next", term95);
        setField(term93, term93.getClass(), "first", term97);
        setIntField(term104, term104.getClass(), "type", -203030934);
        setIntField(term106, term106.getClass(), "type", -1179120542);
        setField(term106, term106.getClass(), "next", null);
        setField(term106, term106.getClass(), "first", term100);
        setField(term106, term106.getClass(), "last", term95);
        setField(term106, term106.getClass(), "propListHead", null);
        setIntField(term106, term106.getClass(), "sourcePosition", 0);
        setField(term106, term106.getClass(), "jsType", null);
        setField(term106, term106.getClass(), "parent", null);
        setField(term104, term104.getClass(), "next", term106);
        setField(term104, term104.getClass(), "first", term91);
        setField(term104, term104.getClass(), "last", term91);
        setField(term104, term104.getClass(), "propListHead", null);
        setIntField(term104, term104.getClass(), "sourcePosition", 0);
        setField(term104, term104.getClass(), "jsType", null);
        setField(term104, term104.getClass(), "parent", null);
        setField(term93, term93.getClass(), "last", term104);
        setField(term93, term93.getClass(), "propListHead", null);
        setIntField(term93, term93.getClass(), "sourcePosition", 0);
        setField(term93, term93.getClass(), "jsType", null);
        setField(term93, term93.getClass(), "parent", null);
        setField(term91, term91.getClass(), "next", term93);
        setIntField(term111, term111.getClass(), "type", -73683645);
        setField(term111, term111.getClass(), "next", term104);
        setField(term111, term111.getClass(), "first", term106);
        setField(term111, term111.getClass(), "last", term89);
        setField(term111, term111.getClass(), "propListHead", null);
        setIntField(term111, term111.getClass(), "sourcePosition", 0);
        setField(term111, term111.getClass(), "jsType", null);
        setField(term111, term111.getClass(), "parent", null);
        setField(term91, term91.getClass(), "first", term111);
        setField(term91, term91.getClass(), "last", term111);
        setField(term91, term91.getClass(), "propListHead", null);
        setIntField(term91, term91.getClass(), "sourcePosition", 0);
        setField(term91, term91.getClass(), "jsType", null);
        setField(term91, term91.getClass(), "parent", null);
        setField(term89, term89.getClass(), "next", term91);
        setField(term89, term89.getClass(), "first", term95);
        setField(term89, term89.getClass(), "last", term97);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeOptimizationsPass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term89;
        try {
            callMethod(klass, "traverse", argTypes, term78, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


