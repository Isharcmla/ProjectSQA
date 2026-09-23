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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3599698;
     Object term3599790;
     Object term3601335;
     Object term3601336;
     Object term3601079;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3599698 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3599790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3599882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3599974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600066 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3600196 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3599882, term3599882.getClass(), "type", 35);
        setIntField(term3600066, term3600066.getClass(), "type", 40);
        setField(term3600066, term3600066.getClass(), "str", "substr");
        setField(term3599974, term3599974.getClass(), "next", term3600066);
        setIntField(term3599974, term3599974.getClass(), "type", 40);
        setField(term3599882, term3599882.getClass(), "first", term3599974);
        setIntField(term3600196, term3600196.getClass(), "type", 43);
        setField(term3599882, term3599882.getClass(), "next", term3600196);
        setField(term3599790, term3599790.getClass(), "first", term3599882);
        setIntField(term3599790, term3599790.getClass(), "type", 37);
        term3601335 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3601335, term3601335.getClass(), "currentTraversal", null);
        term3601336 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601337 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601338 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601339 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601340 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3601336, term3601336.getClass(), "str", null);
        setIntField(term3601336, term3601336.getClass(), "type", 37);
        setField(term3601336, term3601336.getClass(), "next", null);
        setField(term3601337, term3601337.getClass(), "str", null);
        setIntField(term3601337, term3601337.getClass(), "type", 35);
        setField(term3601338, term3601338.getClass(), "str", null);
        setIntField(term3601338, term3601338.getClass(), "type", 43);
        setField(term3601338, term3601338.getClass(), "next", null);
        setField(term3601338, term3601338.getClass(), "first", null);
        setField(term3601338, term3601338.getClass(), "last", null);
        setField(term3601338, term3601338.getClass(), "propListHead", null);
        setIntField(term3601338, term3601338.getClass(), "sourcePosition", 0);
        setField(term3601338, term3601338.getClass(), "jsType", null);
        setField(term3601338, term3601338.getClass(), "parent", null);
        setField(term3601337, term3601337.getClass(), "next", term3601338);
        setField(term3601339, term3601339.getClass(), "str", null);
        setIntField(term3601339, term3601339.getClass(), "type", 40);
        setField(term3601340, term3601340.getClass(), "str", "");
        setIntField(term3601340, term3601340.getClass(), "type", 40);
        setField(term3601340, term3601340.getClass(), "next", null);
        setField(term3601340, term3601340.getClass(), "first", null);
        setField(term3601340, term3601340.getClass(), "last", null);
        setField(term3601340, term3601340.getClass(), "propListHead", null);
        setIntField(term3601340, term3601340.getClass(), "sourcePosition", 0);
        setField(term3601340, term3601340.getClass(), "jsType", null);
        setField(term3601340, term3601340.getClass(), "parent", null);
        setField(term3601339, term3601339.getClass(), "next", term3601340);
        setField(term3601339, term3601339.getClass(), "first", null);
        setField(term3601339, term3601339.getClass(), "last", null);
        setField(term3601339, term3601339.getClass(), "propListHead", null);
        setIntField(term3601339, term3601339.getClass(), "sourcePosition", 0);
        setField(term3601339, term3601339.getClass(), "jsType", null);
        setField(term3601339, term3601339.getClass(), "parent", null);
        setField(term3601337, term3601337.getClass(), "first", term3601339);
        setField(term3601337, term3601337.getClass(), "last", null);
        setField(term3601337, term3601337.getClass(), "propListHead", null);
        setIntField(term3601337, term3601337.getClass(), "sourcePosition", 0);
        setField(term3601337, term3601337.getClass(), "jsType", null);
        setField(term3601337, term3601337.getClass(), "parent", null);
        setField(term3601336, term3601336.getClass(), "first", term3601337);
        setField(term3601336, term3601336.getClass(), "last", null);
        setField(term3601336, term3601336.getClass(), "propListHead", null);
        setIntField(term3601336, term3601336.getClass(), "sourcePosition", 0);
        setField(term3601336, term3601336.getClass(), "jsType", null);
        setField(term3601336, term3601336.getClass(), "parent", null);
        term3601079 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601083 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3601088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3601079, term3601079.getClass(), "str", null);
        setIntField(term3601079, term3601079.getClass(), "type", 37);
        setField(term3601079, term3601079.getClass(), "next", null);
        setField(term3601081, term3601081.getClass(), "str", null);
        setIntField(term3601081, term3601081.getClass(), "type", 35);
        setField(term3601083, term3601083.getClass(), "str", null);
        setIntField(term3601083, term3601083.getClass(), "type", 43);
        setField(term3601083, term3601083.getClass(), "next", null);
        setField(term3601083, term3601083.getClass(), "first", null);
        setField(term3601083, term3601083.getClass(), "last", null);
        setField(term3601083, term3601083.getClass(), "propListHead", null);
        setIntField(term3601083, term3601083.getClass(), "sourcePosition", 0);
        setField(term3601083, term3601083.getClass(), "jsType", null);
        setField(term3601083, term3601083.getClass(), "parent", null);
        setField(term3601081, term3601081.getClass(), "next", term3601083);
        setField(term3601086, term3601086.getClass(), "str", null);
        setIntField(term3601086, term3601086.getClass(), "type", 40);
        setField(term3601088, term3601088.getClass(), "str", "");
        setIntField(term3601088, term3601088.getClass(), "type", 40);
        setField(term3601088, term3601088.getClass(), "next", null);
        setField(term3601088, term3601088.getClass(), "first", null);
        setField(term3601088, term3601088.getClass(), "last", null);
        setField(term3601088, term3601088.getClass(), "propListHead", null);
        setIntField(term3601088, term3601088.getClass(), "sourcePosition", 0);
        setField(term3601088, term3601088.getClass(), "jsType", null);
        setField(term3601088, term3601088.getClass(), "parent", null);
        setField(term3601086, term3601086.getClass(), "next", term3601088);
        setField(term3601086, term3601086.getClass(), "first", null);
        setField(term3601086, term3601086.getClass(), "last", null);
        setField(term3601086, term3601086.getClass(), "propListHead", null);
        setIntField(term3601086, term3601086.getClass(), "sourcePosition", 0);
        setField(term3601086, term3601086.getClass(), "jsType", null);
        setField(term3601086, term3601086.getClass(), "parent", null);
        setField(term3601081, term3601081.getClass(), "first", term3601086);
        setField(term3601081, term3601081.getClass(), "last", null);
        setField(term3601081, term3601081.getClass(), "propListHead", null);
        setIntField(term3601081, term3601081.getClass(), "sourcePosition", 0);
        setField(term3601081, term3601081.getClass(), "jsType", null);
        setField(term3601081, term3601081.getClass(), "parent", null);
        setField(term3601079, term3601079.getClass(), "first", term3601081);
        setField(term3601079, term3601079.getClass(), "last", null);
        setField(term3601079, term3601079.getClass(), "propListHead", null);
        setIntField(term3601079, term3601079.getClass(), "sourcePosition", 0);
        setField(term3601079, term3601079.getClass(), "jsType", null);
        setField(term3601079, term3601079.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3599790;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3599698, args);
        assertTrue(recursiveEquals(term3599698, term3601335));
        assertTrue(recursiveEquals(term3599790, term3601336));
        assertTrue(recursiveEquals(retValue, term3601079));
    }

};


