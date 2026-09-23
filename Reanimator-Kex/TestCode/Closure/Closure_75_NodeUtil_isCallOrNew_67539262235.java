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

public class NodeUtil_isCallOrNew_67539262235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2216;
     Object term15173;

    public NodeUtil_isCallOrNew_67539262235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2229 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2239 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2216, term2216.getClass(), "type", -1374527319);
        setIntField(term2218, term2218.getClass(), "type", 454242689);
        setIntField(term2220, term2220.getClass(), "type", 0);
        setField(term2220, term2220.getClass(), "next", null);
        setField(term2220, term2220.getClass(), "first", null);
        setField(term2220, term2220.getClass(), "last", null);
        setField(term2220, term2220.getClass(), "propListHead", null);
        setIntField(term2220, term2220.getClass(), "sourcePosition", 0);
        setField(term2220, term2220.getClass(), "jsType", null);
        setField(term2220, term2220.getClass(), "parent", null);
        setField(term2218, term2218.getClass(), "next", term2220);
        setIntField(term2223, term2223.getClass(), "type", 0);
        setField(term2223, term2223.getClass(), "next", null);
        setField(term2223, term2223.getClass(), "first", null);
        setField(term2223, term2223.getClass(), "last", null);
        setField(term2223, term2223.getClass(), "propListHead", null);
        setIntField(term2223, term2223.getClass(), "sourcePosition", 0);
        setField(term2223, term2223.getClass(), "jsType", null);
        setField(term2223, term2223.getClass(), "parent", null);
        setField(term2218, term2218.getClass(), "first", term2223);
        setIntField(term2226, term2226.getClass(), "type", 0);
        setField(term2226, term2226.getClass(), "next", null);
        setField(term2226, term2226.getClass(), "first", null);
        setField(term2226, term2226.getClass(), "last", null);
        setField(term2226, term2226.getClass(), "propListHead", null);
        setIntField(term2226, term2226.getClass(), "sourcePosition", 0);
        setField(term2226, term2226.getClass(), "jsType", null);
        setField(term2226, term2226.getClass(), "parent", null);
        setField(term2218, term2218.getClass(), "last", term2226);
        setField(term2229, term2229.getClass(), "next", null);
        setIntField(term2229, term2229.getClass(), "type", 0);
        setIntField(term2229, term2229.getClass(), "intValue", 0);
        setField(term2229, term2229.getClass(), "objectValue", null);
        setField(term2218, term2218.getClass(), "propListHead", term2229);
        setIntField(term2218, term2218.getClass(), "sourcePosition", -890538258);
        setField(term2218, term2218.getClass(), "jsType", null);
        setField(term2218, term2218.getClass(), "parent", null);
        setField(term2216, term2216.getClass(), "next", term2218);
        setIntField(term2233, term2233.getClass(), "type", 0);
        setField(term2233, term2233.getClass(), "next", null);
        setField(term2233, term2233.getClass(), "first", null);
        setField(term2233, term2233.getClass(), "last", null);
        setField(term2233, term2233.getClass(), "propListHead", null);
        setIntField(term2233, term2233.getClass(), "sourcePosition", 0);
        setField(term2233, term2233.getClass(), "jsType", null);
        setField(term2233, term2233.getClass(), "parent", null);
        setField(term2216, term2216.getClass(), "first", term2233);
        setIntField(term2236, term2236.getClass(), "type", 0);
        setField(term2236, term2236.getClass(), "next", null);
        setField(term2236, term2236.getClass(), "first", null);
        setField(term2236, term2236.getClass(), "last", null);
        setField(term2236, term2236.getClass(), "propListHead", null);
        setIntField(term2236, term2236.getClass(), "sourcePosition", 0);
        setField(term2236, term2236.getClass(), "jsType", null);
        setField(term2236, term2236.getClass(), "parent", null);
        setField(term2216, term2216.getClass(), "last", term2236);
        setField(term2239, term2239.getClass(), "next", null);
        setIntField(term2239, term2239.getClass(), "type", 0);
        setIntField(term2239, term2239.getClass(), "intValue", 0);
        setField(term2239, term2239.getClass(), "objectValue", null);
        setField(term2216, term2216.getClass(), "propListHead", term2239);
        setIntField(term2216, term2216.getClass(), "sourcePosition", -1085899912);
        setField(term2216, term2216.getClass(), "jsType", null);
        setField(term2216, term2216.getClass(), "parent", null);
        term15173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15178 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15181 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15173, term15173.getClass(), "type", -1374527319);
        setIntField(term15174, term15174.getClass(), "type", 454242689);
        setIntField(term15175, term15175.getClass(), "type", 0);
        setField(term15175, term15175.getClass(), "next", null);
        setField(term15175, term15175.getClass(), "first", null);
        setField(term15175, term15175.getClass(), "last", null);
        setField(term15175, term15175.getClass(), "propListHead", null);
        setIntField(term15175, term15175.getClass(), "sourcePosition", 0);
        setField(term15175, term15175.getClass(), "jsType", null);
        setField(term15175, term15175.getClass(), "parent", null);
        setField(term15174, term15174.getClass(), "next", term15175);
        setIntField(term15176, term15176.getClass(), "type", 0);
        setField(term15176, term15176.getClass(), "next", null);
        setField(term15176, term15176.getClass(), "first", null);
        setField(term15176, term15176.getClass(), "last", null);
        setField(term15176, term15176.getClass(), "propListHead", null);
        setIntField(term15176, term15176.getClass(), "sourcePosition", 0);
        setField(term15176, term15176.getClass(), "jsType", null);
        setField(term15176, term15176.getClass(), "parent", null);
        setField(term15174, term15174.getClass(), "first", term15176);
        setIntField(term15177, term15177.getClass(), "type", 0);
        setField(term15177, term15177.getClass(), "next", null);
        setField(term15177, term15177.getClass(), "first", null);
        setField(term15177, term15177.getClass(), "last", null);
        setField(term15177, term15177.getClass(), "propListHead", null);
        setIntField(term15177, term15177.getClass(), "sourcePosition", 0);
        setField(term15177, term15177.getClass(), "jsType", null);
        setField(term15177, term15177.getClass(), "parent", null);
        setField(term15174, term15174.getClass(), "last", term15177);
        setField(term15178, term15178.getClass(), "next", null);
        setIntField(term15178, term15178.getClass(), "type", 0);
        setIntField(term15178, term15178.getClass(), "intValue", 0);
        setField(term15178, term15178.getClass(), "objectValue", null);
        setField(term15174, term15174.getClass(), "propListHead", term15178);
        setIntField(term15174, term15174.getClass(), "sourcePosition", -890538258);
        setField(term15174, term15174.getClass(), "jsType", null);
        setField(term15174, term15174.getClass(), "parent", null);
        setField(term15173, term15173.getClass(), "next", term15174);
        setIntField(term15179, term15179.getClass(), "type", 0);
        setField(term15179, term15179.getClass(), "next", null);
        setField(term15179, term15179.getClass(), "first", null);
        setField(term15179, term15179.getClass(), "last", null);
        setField(term15179, term15179.getClass(), "propListHead", null);
        setIntField(term15179, term15179.getClass(), "sourcePosition", 0);
        setField(term15179, term15179.getClass(), "jsType", null);
        setField(term15179, term15179.getClass(), "parent", null);
        setField(term15173, term15173.getClass(), "first", term15179);
        setIntField(term15180, term15180.getClass(), "type", 0);
        setField(term15180, term15180.getClass(), "next", null);
        setField(term15180, term15180.getClass(), "first", null);
        setField(term15180, term15180.getClass(), "last", null);
        setField(term15180, term15180.getClass(), "propListHead", null);
        setIntField(term15180, term15180.getClass(), "sourcePosition", 0);
        setField(term15180, term15180.getClass(), "jsType", null);
        setField(term15180, term15180.getClass(), "parent", null);
        setField(term15173, term15173.getClass(), "last", term15180);
        setField(term15181, term15181.getClass(), "next", null);
        setIntField(term15181, term15181.getClass(), "type", 0);
        setIntField(term15181, term15181.getClass(), "intValue", 0);
        setField(term15181, term15181.getClass(), "objectValue", null);
        setField(term15173, term15173.getClass(), "propListHead", term15181);
        setIntField(term15173, term15173.getClass(), "sourcePosition", -1085899912);
        setField(term15173, term15173.getClass(), "jsType", null);
        setField(term15173, term15173.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2216;
        Object retValue = callMethod(klass, "isCallOrNew", argTypes, null, args);
        assertTrue(recursiveEquals(term2216, term15173));
        assertTrue(recursiveEquals(retValue, false));
    }

};


