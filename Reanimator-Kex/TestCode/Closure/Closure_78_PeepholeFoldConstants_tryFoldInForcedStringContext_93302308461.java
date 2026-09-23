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

public class PeepholeFoldConstants_tryFoldInForcedStringContext_93302308461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2987;
     Object term3031;

    public PeepholeFoldConstants_tryFoldInForcedStringContext_93302308461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3006 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term3006, term3006.getClass(), "vars", null);
        setField(term3006, term3006.getClass(), "parent", null);
        setIntField(term3006, term3006.getClass(), "depth", 0);
        setField(term3006, term3006.getClass(), "rootNode", null);
        setField(term3006, term3006.getClass(), "thisType", null);
        setBooleanField(term3006, term3006.getClass(), "isBottom", false);
        ArrayDeque term3004 = new ArrayDeque();
        ((ArrayDeque) term3004).add(term3006);
        ArrayDeque term3011 = new ArrayDeque();
        ArrayDeque term3015 = new ArrayDeque();
        term2987 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term2988 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term2989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3000 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term2988, term2988.getClass(), "compiler", null);
        setField(term2988, term2988.getClass(), "callback", null);
        setIntField(term2989, term2989.getClass(), "type", -1608123016);
        setIntField(term2991, term2991.getClass(), "type", 0);
        setField(term2991, term2991.getClass(), "next", null);
        setField(term2991, term2991.getClass(), "first", null);
        setField(term2991, term2991.getClass(), "last", null);
        setField(term2991, term2991.getClass(), "propListHead", null);
        setIntField(term2991, term2991.getClass(), "sourcePosition", 0);
        setField(term2991, term2991.getClass(), "jsType", null);
        setField(term2991, term2991.getClass(), "parent", null);
        setField(term2989, term2989.getClass(), "next", term2991);
        setIntField(term2994, term2994.getClass(), "type", 0);
        setField(term2994, term2994.getClass(), "next", null);
        setField(term2994, term2994.getClass(), "first", null);
        setField(term2994, term2994.getClass(), "last", null);
        setField(term2994, term2994.getClass(), "propListHead", null);
        setIntField(term2994, term2994.getClass(), "sourcePosition", 0);
        setField(term2994, term2994.getClass(), "jsType", null);
        setField(term2994, term2994.getClass(), "parent", null);
        setField(term2989, term2989.getClass(), "first", term2994);
        setIntField(term2997, term2997.getClass(), "type", 0);
        setField(term2997, term2997.getClass(), "next", null);
        setField(term2997, term2997.getClass(), "first", null);
        setField(term2997, term2997.getClass(), "last", null);
        setField(term2997, term2997.getClass(), "propListHead", null);
        setIntField(term2997, term2997.getClass(), "sourcePosition", 0);
        setField(term2997, term2997.getClass(), "jsType", null);
        setField(term2997, term2997.getClass(), "parent", null);
        setField(term2989, term2989.getClass(), "last", term2997);
        setField(term3000, term3000.getClass(), "next", null);
        setIntField(term3000, term3000.getClass(), "type", 0);
        setIntField(term3000, term3000.getClass(), "intValue", 0);
        setField(term3000, term3000.getClass(), "objectValue", null);
        setField(term2989, term2989.getClass(), "propListHead", term3000);
        setIntField(term2989, term2989.getClass(), "sourcePosition", -1212399479);
        setField(term2989, term2989.getClass(), "jsType", null);
        setField(term2989, term2989.getClass(), "parent", null);
        setField(term2988, term2988.getClass(), "curNode", term2989);
        setField(term2988, term2988.getClass(), "scopes", term3004);
        setField(term2988, term2988.getClass(), "scopeRoots", term3011);
        setField(term2988, term2988.getClass(), "cfgs", term3015);
        setField(term2988, term2988.getClass(), "sourceName", "eZFUvlxvGV");
        setField(term2988, term2988.getClass(), "scopeCreator", null);
        setField(term2988, term2988.getClass(), "scopeCallback", null);
        setField(term2987, term2987.getClass(), "currentTraversal", term2988);
        term3031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3044 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3054 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3031, term3031.getClass(), "type", 1059930704);
        setIntField(term3033, term3033.getClass(), "type", 405295896);
        setIntField(term3035, term3035.getClass(), "type", 0);
        setField(term3035, term3035.getClass(), "next", null);
        setField(term3035, term3035.getClass(), "first", null);
        setField(term3035, term3035.getClass(), "last", null);
        setField(term3035, term3035.getClass(), "propListHead", null);
        setIntField(term3035, term3035.getClass(), "sourcePosition", 0);
        setField(term3035, term3035.getClass(), "jsType", null);
        setField(term3035, term3035.getClass(), "parent", null);
        setField(term3033, term3033.getClass(), "next", term3035);
        setIntField(term3038, term3038.getClass(), "type", 0);
        setField(term3038, term3038.getClass(), "next", null);
        setField(term3038, term3038.getClass(), "first", null);
        setField(term3038, term3038.getClass(), "last", null);
        setField(term3038, term3038.getClass(), "propListHead", null);
        setIntField(term3038, term3038.getClass(), "sourcePosition", 0);
        setField(term3038, term3038.getClass(), "jsType", null);
        setField(term3038, term3038.getClass(), "parent", null);
        setField(term3033, term3033.getClass(), "first", term3038);
        setIntField(term3041, term3041.getClass(), "type", 0);
        setField(term3041, term3041.getClass(), "next", null);
        setField(term3041, term3041.getClass(), "first", null);
        setField(term3041, term3041.getClass(), "last", null);
        setField(term3041, term3041.getClass(), "propListHead", null);
        setIntField(term3041, term3041.getClass(), "sourcePosition", 0);
        setField(term3041, term3041.getClass(), "jsType", null);
        setField(term3041, term3041.getClass(), "parent", null);
        setField(term3033, term3033.getClass(), "last", term3041);
        setField(term3044, term3044.getClass(), "next", null);
        setIntField(term3044, term3044.getClass(), "type", 0);
        setIntField(term3044, term3044.getClass(), "intValue", 0);
        setField(term3044, term3044.getClass(), "objectValue", null);
        setField(term3033, term3033.getClass(), "propListHead", term3044);
        setIntField(term3033, term3033.getClass(), "sourcePosition", 1611734632);
        setField(term3033, term3033.getClass(), "jsType", null);
        setField(term3033, term3033.getClass(), "parent", null);
        setField(term3031, term3031.getClass(), "next", term3033);
        setIntField(term3048, term3048.getClass(), "type", 0);
        setField(term3048, term3048.getClass(), "next", null);
        setField(term3048, term3048.getClass(), "first", null);
        setField(term3048, term3048.getClass(), "last", null);
        setField(term3048, term3048.getClass(), "propListHead", null);
        setIntField(term3048, term3048.getClass(), "sourcePosition", 0);
        setField(term3048, term3048.getClass(), "jsType", null);
        setField(term3048, term3048.getClass(), "parent", null);
        setField(term3031, term3031.getClass(), "first", term3048);
        setIntField(term3051, term3051.getClass(), "type", 0);
        setField(term3051, term3051.getClass(), "next", null);
        setField(term3051, term3051.getClass(), "first", null);
        setField(term3051, term3051.getClass(), "last", null);
        setField(term3051, term3051.getClass(), "propListHead", null);
        setIntField(term3051, term3051.getClass(), "sourcePosition", 0);
        setField(term3051, term3051.getClass(), "jsType", null);
        setField(term3051, term3051.getClass(), "parent", null);
        setField(term3031, term3031.getClass(), "last", term3051);
        setField(term3054, term3054.getClass(), "next", null);
        setIntField(term3054, term3054.getClass(), "type", 0);
        setIntField(term3054, term3054.getClass(), "intValue", 0);
        setField(term3054, term3054.getClass(), "objectValue", null);
        setField(term3031, term3031.getClass(), "propListHead", term3054);
        setIntField(term3031, term3031.getClass(), "sourcePosition", 868908117);
        setField(term3031, term3031.getClass(), "jsType", null);
        setField(term3031, term3031.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3031;
        try {
            callMethod(klass, "tryFoldInForcedStringContext", argTypes, term2987, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


