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

public class NodeUtil_isCall_1870270415233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2162;
     Object term14790;

    public NodeUtil_isCall_1870270415233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2175 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2185 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2162, term2162.getClass(), "type", -2134711835);
        setIntField(term2164, term2164.getClass(), "type", 225873732);
        setIntField(term2166, term2166.getClass(), "type", 0);
        setField(term2166, term2166.getClass(), "next", null);
        setField(term2166, term2166.getClass(), "first", null);
        setField(term2166, term2166.getClass(), "last", null);
        setField(term2166, term2166.getClass(), "propListHead", null);
        setIntField(term2166, term2166.getClass(), "sourcePosition", 0);
        setField(term2166, term2166.getClass(), "jsType", null);
        setField(term2166, term2166.getClass(), "parent", null);
        setField(term2164, term2164.getClass(), "next", term2166);
        setIntField(term2169, term2169.getClass(), "type", 0);
        setField(term2169, term2169.getClass(), "next", null);
        setField(term2169, term2169.getClass(), "first", null);
        setField(term2169, term2169.getClass(), "last", null);
        setField(term2169, term2169.getClass(), "propListHead", null);
        setIntField(term2169, term2169.getClass(), "sourcePosition", 0);
        setField(term2169, term2169.getClass(), "jsType", null);
        setField(term2169, term2169.getClass(), "parent", null);
        setField(term2164, term2164.getClass(), "first", term2169);
        setIntField(term2172, term2172.getClass(), "type", 0);
        setField(term2172, term2172.getClass(), "next", null);
        setField(term2172, term2172.getClass(), "first", null);
        setField(term2172, term2172.getClass(), "last", null);
        setField(term2172, term2172.getClass(), "propListHead", null);
        setIntField(term2172, term2172.getClass(), "sourcePosition", 0);
        setField(term2172, term2172.getClass(), "jsType", null);
        setField(term2172, term2172.getClass(), "parent", null);
        setField(term2164, term2164.getClass(), "last", term2172);
        setField(term2175, term2175.getClass(), "next", null);
        setIntField(term2175, term2175.getClass(), "type", 0);
        setIntField(term2175, term2175.getClass(), "intValue", 0);
        setField(term2175, term2175.getClass(), "objectValue", null);
        setField(term2164, term2164.getClass(), "propListHead", term2175);
        setIntField(term2164, term2164.getClass(), "sourcePosition", 1544768934);
        setField(term2164, term2164.getClass(), "jsType", null);
        setField(term2164, term2164.getClass(), "parent", null);
        setField(term2162, term2162.getClass(), "next", term2164);
        setIntField(term2179, term2179.getClass(), "type", 0);
        setField(term2179, term2179.getClass(), "next", null);
        setField(term2179, term2179.getClass(), "first", null);
        setField(term2179, term2179.getClass(), "last", null);
        setField(term2179, term2179.getClass(), "propListHead", null);
        setIntField(term2179, term2179.getClass(), "sourcePosition", 0);
        setField(term2179, term2179.getClass(), "jsType", null);
        setField(term2179, term2179.getClass(), "parent", null);
        setField(term2162, term2162.getClass(), "first", term2179);
        setIntField(term2182, term2182.getClass(), "type", 0);
        setField(term2182, term2182.getClass(), "next", null);
        setField(term2182, term2182.getClass(), "first", null);
        setField(term2182, term2182.getClass(), "last", null);
        setField(term2182, term2182.getClass(), "propListHead", null);
        setIntField(term2182, term2182.getClass(), "sourcePosition", 0);
        setField(term2182, term2182.getClass(), "jsType", null);
        setField(term2182, term2182.getClass(), "parent", null);
        setField(term2162, term2162.getClass(), "last", term2182);
        setField(term2185, term2185.getClass(), "next", null);
        setIntField(term2185, term2185.getClass(), "type", 0);
        setIntField(term2185, term2185.getClass(), "intValue", 0);
        setField(term2185, term2185.getClass(), "objectValue", null);
        setField(term2162, term2162.getClass(), "propListHead", term2185);
        setIntField(term2162, term2162.getClass(), "sourcePosition", -383508597);
        setField(term2162, term2162.getClass(), "jsType", null);
        setField(term2162, term2162.getClass(), "parent", null);
        term14790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14795 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14798 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14790, term14790.getClass(), "type", -2134711835);
        setIntField(term14791, term14791.getClass(), "type", 225873732);
        setIntField(term14792, term14792.getClass(), "type", 0);
        setField(term14792, term14792.getClass(), "next", null);
        setField(term14792, term14792.getClass(), "first", null);
        setField(term14792, term14792.getClass(), "last", null);
        setField(term14792, term14792.getClass(), "propListHead", null);
        setIntField(term14792, term14792.getClass(), "sourcePosition", 0);
        setField(term14792, term14792.getClass(), "jsType", null);
        setField(term14792, term14792.getClass(), "parent", null);
        setField(term14791, term14791.getClass(), "next", term14792);
        setIntField(term14793, term14793.getClass(), "type", 0);
        setField(term14793, term14793.getClass(), "next", null);
        setField(term14793, term14793.getClass(), "first", null);
        setField(term14793, term14793.getClass(), "last", null);
        setField(term14793, term14793.getClass(), "propListHead", null);
        setIntField(term14793, term14793.getClass(), "sourcePosition", 0);
        setField(term14793, term14793.getClass(), "jsType", null);
        setField(term14793, term14793.getClass(), "parent", null);
        setField(term14791, term14791.getClass(), "first", term14793);
        setIntField(term14794, term14794.getClass(), "type", 0);
        setField(term14794, term14794.getClass(), "next", null);
        setField(term14794, term14794.getClass(), "first", null);
        setField(term14794, term14794.getClass(), "last", null);
        setField(term14794, term14794.getClass(), "propListHead", null);
        setIntField(term14794, term14794.getClass(), "sourcePosition", 0);
        setField(term14794, term14794.getClass(), "jsType", null);
        setField(term14794, term14794.getClass(), "parent", null);
        setField(term14791, term14791.getClass(), "last", term14794);
        setField(term14795, term14795.getClass(), "next", null);
        setIntField(term14795, term14795.getClass(), "type", 0);
        setIntField(term14795, term14795.getClass(), "intValue", 0);
        setField(term14795, term14795.getClass(), "objectValue", null);
        setField(term14791, term14791.getClass(), "propListHead", term14795);
        setIntField(term14791, term14791.getClass(), "sourcePosition", 1544768934);
        setField(term14791, term14791.getClass(), "jsType", null);
        setField(term14791, term14791.getClass(), "parent", null);
        setField(term14790, term14790.getClass(), "next", term14791);
        setIntField(term14796, term14796.getClass(), "type", 0);
        setField(term14796, term14796.getClass(), "next", null);
        setField(term14796, term14796.getClass(), "first", null);
        setField(term14796, term14796.getClass(), "last", null);
        setField(term14796, term14796.getClass(), "propListHead", null);
        setIntField(term14796, term14796.getClass(), "sourcePosition", 0);
        setField(term14796, term14796.getClass(), "jsType", null);
        setField(term14796, term14796.getClass(), "parent", null);
        setField(term14790, term14790.getClass(), "first", term14796);
        setIntField(term14797, term14797.getClass(), "type", 0);
        setField(term14797, term14797.getClass(), "next", null);
        setField(term14797, term14797.getClass(), "first", null);
        setField(term14797, term14797.getClass(), "last", null);
        setField(term14797, term14797.getClass(), "propListHead", null);
        setIntField(term14797, term14797.getClass(), "sourcePosition", 0);
        setField(term14797, term14797.getClass(), "jsType", null);
        setField(term14797, term14797.getClass(), "parent", null);
        setField(term14790, term14790.getClass(), "last", term14797);
        setField(term14798, term14798.getClass(), "next", null);
        setIntField(term14798, term14798.getClass(), "type", 0);
        setIntField(term14798, term14798.getClass(), "intValue", 0);
        setField(term14798, term14798.getClass(), "objectValue", null);
        setField(term14790, term14790.getClass(), "propListHead", term14798);
        setIntField(term14790, term14790.getClass(), "sourcePosition", -383508597);
        setField(term14790, term14790.getClass(), "jsType", null);
        setField(term14790, term14790.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2162;
        Object retValue = callMethod(klass, "isCall", argTypes, null, args);
        assertTrue(recursiveEquals(term2162, term14790));
        assertTrue(recursiveEquals(retValue, false));
    }

};


