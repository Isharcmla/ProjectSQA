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

public class PeepholeFoldConstants_tryFoldKnownStringMethods_1286061863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3164;
     Object term3211;

    public PeepholeFoldConstants_tryFoldKnownStringMethods_1286061863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3183 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term3183, term3183.getClass(), "vars", null);
        setField(term3183, term3183.getClass(), "parent", null);
        setIntField(term3183, term3183.getClass(), "depth", 0);
        setField(term3183, term3183.getClass(), "rootNode", null);
        setField(term3183, term3183.getClass(), "thisType", null);
        setBooleanField(term3183, term3183.getClass(), "isBottom", false);
        ArrayDeque term3181 = new ArrayDeque();
        ((ArrayDeque) term3181).add(term3183);
        Object term3190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3190, term3190.getClass(), "type", 0);
        setField(term3190, term3190.getClass(), "next", null);
        setField(term3190, term3190.getClass(), "first", null);
        setField(term3190, term3190.getClass(), "last", null);
        setField(term3190, term3190.getClass(), "propListHead", null);
        setIntField(term3190, term3190.getClass(), "sourcePosition", 0);
        setField(term3190, term3190.getClass(), "jsType", null);
        setField(term3190, term3190.getClass(), "parent", null);
        ArrayDeque term3188 = new ArrayDeque();
        ((ArrayDeque) term3188).add(term3190);
        ArrayDeque term3195 = new ArrayDeque();
        term3164 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term3165 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term3166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3177 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term3165, term3165.getClass(), "compiler", null);
        setField(term3165, term3165.getClass(), "callback", null);
        setIntField(term3166, term3166.getClass(), "type", -280113263);
        setIntField(term3168, term3168.getClass(), "type", 0);
        setField(term3168, term3168.getClass(), "next", null);
        setField(term3168, term3168.getClass(), "first", null);
        setField(term3168, term3168.getClass(), "last", null);
        setField(term3168, term3168.getClass(), "propListHead", null);
        setIntField(term3168, term3168.getClass(), "sourcePosition", 0);
        setField(term3168, term3168.getClass(), "jsType", null);
        setField(term3168, term3168.getClass(), "parent", null);
        setField(term3166, term3166.getClass(), "next", term3168);
        setIntField(term3171, term3171.getClass(), "type", 0);
        setField(term3171, term3171.getClass(), "next", null);
        setField(term3171, term3171.getClass(), "first", null);
        setField(term3171, term3171.getClass(), "last", null);
        setField(term3171, term3171.getClass(), "propListHead", null);
        setIntField(term3171, term3171.getClass(), "sourcePosition", 0);
        setField(term3171, term3171.getClass(), "jsType", null);
        setField(term3171, term3171.getClass(), "parent", null);
        setField(term3166, term3166.getClass(), "first", term3171);
        setIntField(term3174, term3174.getClass(), "type", 0);
        setField(term3174, term3174.getClass(), "next", null);
        setField(term3174, term3174.getClass(), "first", null);
        setField(term3174, term3174.getClass(), "last", null);
        setField(term3174, term3174.getClass(), "propListHead", null);
        setIntField(term3174, term3174.getClass(), "sourcePosition", 0);
        setField(term3174, term3174.getClass(), "jsType", null);
        setField(term3174, term3174.getClass(), "parent", null);
        setField(term3166, term3166.getClass(), "last", term3174);
        setField(term3177, term3177.getClass(), "next", null);
        setIntField(term3177, term3177.getClass(), "type", 0);
        setIntField(term3177, term3177.getClass(), "intValue", 0);
        setField(term3177, term3177.getClass(), "objectValue", null);
        setField(term3166, term3166.getClass(), "propListHead", term3177);
        setIntField(term3166, term3166.getClass(), "sourcePosition", 315179039);
        setField(term3166, term3166.getClass(), "jsType", null);
        setField(term3166, term3166.getClass(), "parent", null);
        setField(term3165, term3165.getClass(), "curNode", term3166);
        setField(term3165, term3165.getClass(), "scopes", term3181);
        setField(term3165, term3165.getClass(), "scopeRoots", term3188);
        setField(term3165, term3165.getClass(), "cfgs", term3195);
        setField(term3165, term3165.getClass(), "sourceName", "vrQLuWIDJX");
        setField(term3165, term3165.getClass(), "scopeCreator", null);
        setField(term3165, term3165.getClass(), "scopeCallback", null);
        setField(term3164, term3164.getClass(), "currentTraversal", term3165);
        term3211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3224 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3231 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3234 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3211, term3211.getClass(), "type", -1934033808);
        setIntField(term3213, term3213.getClass(), "type", -485108462);
        setIntField(term3215, term3215.getClass(), "type", 0);
        setField(term3215, term3215.getClass(), "next", null);
        setField(term3215, term3215.getClass(), "first", null);
        setField(term3215, term3215.getClass(), "last", null);
        setField(term3215, term3215.getClass(), "propListHead", null);
        setIntField(term3215, term3215.getClass(), "sourcePosition", 0);
        setField(term3215, term3215.getClass(), "jsType", null);
        setField(term3215, term3215.getClass(), "parent", null);
        setField(term3213, term3213.getClass(), "next", term3215);
        setIntField(term3218, term3218.getClass(), "type", 0);
        setField(term3218, term3218.getClass(), "next", null);
        setField(term3218, term3218.getClass(), "first", null);
        setField(term3218, term3218.getClass(), "last", null);
        setField(term3218, term3218.getClass(), "propListHead", null);
        setIntField(term3218, term3218.getClass(), "sourcePosition", 0);
        setField(term3218, term3218.getClass(), "jsType", null);
        setField(term3218, term3218.getClass(), "parent", null);
        setField(term3213, term3213.getClass(), "first", term3218);
        setIntField(term3221, term3221.getClass(), "type", 0);
        setField(term3221, term3221.getClass(), "next", null);
        setField(term3221, term3221.getClass(), "first", null);
        setField(term3221, term3221.getClass(), "last", null);
        setField(term3221, term3221.getClass(), "propListHead", null);
        setIntField(term3221, term3221.getClass(), "sourcePosition", 0);
        setField(term3221, term3221.getClass(), "jsType", null);
        setField(term3221, term3221.getClass(), "parent", null);
        setField(term3213, term3213.getClass(), "last", term3221);
        setField(term3224, term3224.getClass(), "next", null);
        setIntField(term3224, term3224.getClass(), "type", 0);
        setIntField(term3224, term3224.getClass(), "intValue", 0);
        setField(term3224, term3224.getClass(), "objectValue", null);
        setField(term3213, term3213.getClass(), "propListHead", term3224);
        setIntField(term3213, term3213.getClass(), "sourcePosition", -1150062870);
        setField(term3213, term3213.getClass(), "jsType", null);
        setField(term3213, term3213.getClass(), "parent", null);
        setField(term3211, term3211.getClass(), "next", term3213);
        setIntField(term3228, term3228.getClass(), "type", 0);
        setField(term3228, term3228.getClass(), "next", null);
        setField(term3228, term3228.getClass(), "first", null);
        setField(term3228, term3228.getClass(), "last", null);
        setField(term3228, term3228.getClass(), "propListHead", null);
        setIntField(term3228, term3228.getClass(), "sourcePosition", 0);
        setField(term3228, term3228.getClass(), "jsType", null);
        setField(term3228, term3228.getClass(), "parent", null);
        setField(term3211, term3211.getClass(), "first", term3228);
        setIntField(term3231, term3231.getClass(), "type", 0);
        setField(term3231, term3231.getClass(), "next", null);
        setField(term3231, term3231.getClass(), "first", null);
        setField(term3231, term3231.getClass(), "last", null);
        setField(term3231, term3231.getClass(), "propListHead", null);
        setIntField(term3231, term3231.getClass(), "sourcePosition", 0);
        setField(term3231, term3231.getClass(), "jsType", null);
        setField(term3231, term3231.getClass(), "parent", null);
        setField(term3211, term3211.getClass(), "last", term3231);
        setField(term3234, term3234.getClass(), "next", null);
        setIntField(term3234, term3234.getClass(), "type", 0);
        setIntField(term3234, term3234.getClass(), "intValue", 0);
        setField(term3234, term3234.getClass(), "objectValue", null);
        setField(term3211, term3211.getClass(), "propListHead", term3234);
        setIntField(term3211, term3211.getClass(), "sourcePosition", -886200503);
        setField(term3211, term3211.getClass(), "jsType", null);
        setField(term3211, term3211.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3211;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3164, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


