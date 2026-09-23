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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3743610;
     Object term3743702;
     Object term3745260;
     Object term3745261;
     Object term3744871;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3743610 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3743702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3743794 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3743886 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3743978 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744146 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744238 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3743794, term3743794.getClass(), "type", 35);
        setIntField(term3743978, term3743978.getClass(), "type", 40);
        setField(term3743978, term3743978.getClass(), "str", "lastIndexOf");
        setField(term3743886, term3743886.getClass(), "next", term3743978);
        setIntField(term3743886, term3743886.getClass(), "type", 40);
        setField(term3743886, term3743886.getClass(), "str", "");
        setField(term3743794, term3743794.getClass(), "first", term3743886);
        setIntField(term3744146, term3744146.getClass(), "type", 44);
        setField(term3744146, term3744146.getClass(), "next", term3744238);
        setField(term3743794, term3743794.getClass(), "next", term3744146);
        setField(term3743702, term3743702.getClass(), "first", term3743794);
        setIntField(term3743702, term3743702.getClass(), "type", 37);
        term3745260 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3745260, term3745260.getClass(), "currentTraversal", null);
        term3745261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3745262 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3745263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3745264 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3745265 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3745268 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3745261, term3745261.getClass(), "str", null);
        setIntField(term3745261, term3745261.getClass(), "type", 37);
        setField(term3745261, term3745261.getClass(), "next", null);
        setField(term3745262, term3745262.getClass(), "str", null);
        setIntField(term3745262, term3745262.getClass(), "type", 35);
        setField(term3745263, term3745263.getClass(), "str", null);
        setIntField(term3745263, term3745263.getClass(), "type", 44);
        setField(term3745264, term3745264.getClass(), "str", null);
        setIntField(term3745264, term3745264.getClass(), "type", 0);
        setField(term3745264, term3745264.getClass(), "next", null);
        setField(term3745264, term3745264.getClass(), "first", null);
        setField(term3745264, term3745264.getClass(), "last", null);
        setField(term3745264, term3745264.getClass(), "propListHead", null);
        setIntField(term3745264, term3745264.getClass(), "sourcePosition", 0);
        setField(term3745264, term3745264.getClass(), "jsType", null);
        setField(term3745264, term3745264.getClass(), "parent", null);
        setField(term3745263, term3745263.getClass(), "next", term3745264);
        setField(term3745263, term3745263.getClass(), "first", null);
        setField(term3745263, term3745263.getClass(), "last", null);
        setField(term3745263, term3745263.getClass(), "propListHead", null);
        setIntField(term3745263, term3745263.getClass(), "sourcePosition", 0);
        setField(term3745263, term3745263.getClass(), "jsType", null);
        setField(term3745263, term3745263.getClass(), "parent", null);
        setField(term3745262, term3745262.getClass(), "next", term3745263);
        setField(term3745265, term3745265.getClass(), "str", "");
        setIntField(term3745265, term3745265.getClass(), "type", 40);
        setField(term3745268, term3745268.getClass(), "str", "");
        setIntField(term3745268, term3745268.getClass(), "type", 40);
        setField(term3745268, term3745268.getClass(), "next", null);
        setField(term3745268, term3745268.getClass(), "first", null);
        setField(term3745268, term3745268.getClass(), "last", null);
        setField(term3745268, term3745268.getClass(), "propListHead", null);
        setIntField(term3745268, term3745268.getClass(), "sourcePosition", 0);
        setField(term3745268, term3745268.getClass(), "jsType", null);
        setField(term3745268, term3745268.getClass(), "parent", null);
        setField(term3745265, term3745265.getClass(), "next", term3745268);
        setField(term3745265, term3745265.getClass(), "first", null);
        setField(term3745265, term3745265.getClass(), "last", null);
        setField(term3745265, term3745265.getClass(), "propListHead", null);
        setIntField(term3745265, term3745265.getClass(), "sourcePosition", 0);
        setField(term3745265, term3745265.getClass(), "jsType", null);
        setField(term3745265, term3745265.getClass(), "parent", null);
        setField(term3745262, term3745262.getClass(), "first", term3745265);
        setField(term3745262, term3745262.getClass(), "last", null);
        setField(term3745262, term3745262.getClass(), "propListHead", null);
        setIntField(term3745262, term3745262.getClass(), "sourcePosition", 0);
        setField(term3745262, term3745262.getClass(), "jsType", null);
        setField(term3745262, term3745262.getClass(), "parent", null);
        setField(term3745261, term3745261.getClass(), "first", term3745262);
        setField(term3745261, term3745261.getClass(), "last", null);
        setField(term3745261, term3745261.getClass(), "propListHead", null);
        setIntField(term3745261, term3745261.getClass(), "sourcePosition", 0);
        setField(term3745261, term3745261.getClass(), "jsType", null);
        setField(term3745261, term3745261.getClass(), "parent", null);
        term3744871 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744873 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744875 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744881 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3744885 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3744871, term3744871.getClass(), "str", null);
        setIntField(term3744871, term3744871.getClass(), "type", 37);
        setField(term3744871, term3744871.getClass(), "next", null);
        setField(term3744873, term3744873.getClass(), "str", null);
        setIntField(term3744873, term3744873.getClass(), "type", 35);
        setField(term3744875, term3744875.getClass(), "str", null);
        setIntField(term3744875, term3744875.getClass(), "type", 44);
        setField(term3744877, term3744877.getClass(), "str", null);
        setIntField(term3744877, term3744877.getClass(), "type", 0);
        setField(term3744877, term3744877.getClass(), "next", null);
        setField(term3744877, term3744877.getClass(), "first", null);
        setField(term3744877, term3744877.getClass(), "last", null);
        setField(term3744877, term3744877.getClass(), "propListHead", null);
        setIntField(term3744877, term3744877.getClass(), "sourcePosition", 0);
        setField(term3744877, term3744877.getClass(), "jsType", null);
        setField(term3744877, term3744877.getClass(), "parent", null);
        setField(term3744875, term3744875.getClass(), "next", term3744877);
        setField(term3744875, term3744875.getClass(), "first", null);
        setField(term3744875, term3744875.getClass(), "last", null);
        setField(term3744875, term3744875.getClass(), "propListHead", null);
        setIntField(term3744875, term3744875.getClass(), "sourcePosition", 0);
        setField(term3744875, term3744875.getClass(), "jsType", null);
        setField(term3744875, term3744875.getClass(), "parent", null);
        setField(term3744873, term3744873.getClass(), "next", term3744875);
        setField(term3744881, term3744881.getClass(), "str", "");
        setIntField(term3744881, term3744881.getClass(), "type", 40);
        setField(term3744885, term3744885.getClass(), "str", "");
        setIntField(term3744885, term3744885.getClass(), "type", 40);
        setField(term3744885, term3744885.getClass(), "next", null);
        setField(term3744885, term3744885.getClass(), "first", null);
        setField(term3744885, term3744885.getClass(), "last", null);
        setField(term3744885, term3744885.getClass(), "propListHead", null);
        setIntField(term3744885, term3744885.getClass(), "sourcePosition", 0);
        setField(term3744885, term3744885.getClass(), "jsType", null);
        setField(term3744885, term3744885.getClass(), "parent", null);
        setField(term3744881, term3744881.getClass(), "next", term3744885);
        setField(term3744881, term3744881.getClass(), "first", null);
        setField(term3744881, term3744881.getClass(), "last", null);
        setField(term3744881, term3744881.getClass(), "propListHead", null);
        setIntField(term3744881, term3744881.getClass(), "sourcePosition", 0);
        setField(term3744881, term3744881.getClass(), "jsType", null);
        setField(term3744881, term3744881.getClass(), "parent", null);
        setField(term3744873, term3744873.getClass(), "first", term3744881);
        setField(term3744873, term3744873.getClass(), "last", null);
        setField(term3744873, term3744873.getClass(), "propListHead", null);
        setIntField(term3744873, term3744873.getClass(), "sourcePosition", 0);
        setField(term3744873, term3744873.getClass(), "jsType", null);
        setField(term3744873, term3744873.getClass(), "parent", null);
        setField(term3744871, term3744871.getClass(), "first", term3744873);
        setField(term3744871, term3744871.getClass(), "last", null);
        setField(term3744871, term3744871.getClass(), "propListHead", null);
        setIntField(term3744871, term3744871.getClass(), "sourcePosition", 0);
        setField(term3744871, term3744871.getClass(), "jsType", null);
        setField(term3744871, term3744871.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3743702;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3743610, args);
        assertTrue(recursiveEquals(term3743610, term3745260));
        assertTrue(recursiveEquals(term3743702, term3745261));
        assertTrue(recursiveEquals(retValue, term3744871));
    }

};


