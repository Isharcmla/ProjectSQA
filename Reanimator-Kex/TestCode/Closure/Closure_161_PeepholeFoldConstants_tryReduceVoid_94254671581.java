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

public class PeepholeFoldConstants_tryReduceVoid_94254671581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12783;
     Object term12943;
     Object term13044;
     Object term13046;
     Object term13017;

    public PeepholeFoldConstants_tryReduceVoid_94254671581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12783 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term12873 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term12873, term12873.getClass(), "compiler", null);
        setField(term12783, term12783.getClass(), "currentTraversal", term12873);
        term12943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13013, term13013.getClass(), "type", 70);
        setField(term12943, term12943.getClass(), "first", term13013);
        setIntField(term12943, term12943.getClass(), "type", 70);
        term13044 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term13045 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term13045, term13045.getClass(), "compiler", null);
        setField(term13045, term13045.getClass(), "callback", null);
        setField(term13045, term13045.getClass(), "curNode", null);
        setField(term13045, term13045.getClass(), "scopes", null);
        setField(term13045, term13045.getClass(), "scopeRoots", null);
        setField(term13045, term13045.getClass(), "cfgs", null);
        setField(term13045, term13045.getClass(), "sourceName", null);
        setField(term13045, term13045.getClass(), "scopeCreator", null);
        setField(term13045, term13045.getClass(), "scopeCallback", null);
        setField(term13044, term13044.getClass(), "currentTraversal", term13045);
        term13046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13046, term13046.getClass(), "type", 70);
        setField(term13046, term13046.getClass(), "next", null);
        setIntField(term13047, term13047.getClass(), "type", 70);
        setField(term13047, term13047.getClass(), "next", null);
        setField(term13047, term13047.getClass(), "first", null);
        setField(term13047, term13047.getClass(), "last", null);
        setField(term13047, term13047.getClass(), "propListHead", null);
        setIntField(term13047, term13047.getClass(), "sourcePosition", 0);
        setField(term13047, term13047.getClass(), "jsType", null);
        setField(term13047, term13047.getClass(), "parent", null);
        setField(term13046, term13046.getClass(), "first", term13047);
        setField(term13046, term13046.getClass(), "last", null);
        setField(term13046, term13046.getClass(), "propListHead", null);
        setIntField(term13046, term13046.getClass(), "sourcePosition", 0);
        setField(term13046, term13046.getClass(), "jsType", null);
        setField(term13046, term13046.getClass(), "parent", null);
        term13017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13017, term13017.getClass(), "type", 70);
        setField(term13017, term13017.getClass(), "next", null);
        setIntField(term13019, term13019.getClass(), "type", 70);
        setField(term13019, term13019.getClass(), "next", null);
        setField(term13019, term13019.getClass(), "first", null);
        setField(term13019, term13019.getClass(), "last", null);
        setField(term13019, term13019.getClass(), "propListHead", null);
        setIntField(term13019, term13019.getClass(), "sourcePosition", 0);
        setField(term13019, term13019.getClass(), "jsType", null);
        setField(term13019, term13019.getClass(), "parent", null);
        setField(term13017, term13017.getClass(), "first", term13019);
        setField(term13017, term13017.getClass(), "last", null);
        setField(term13017, term13017.getClass(), "propListHead", null);
        setIntField(term13017, term13017.getClass(), "sourcePosition", 0);
        setField(term13017, term13017.getClass(), "jsType", null);
        setField(term13017, term13017.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12943;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term12783, args);
        assertTrue(recursiveEquals(term12783, term13044));
        assertTrue(recursiveEquals(term12943, term13046));
        assertTrue(recursiveEquals(retValue, term13017));
    }

};


