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

public class NodeUtil_redeclareVarsInsideBranch_1330830302264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2326;
     Object term16413;

    public NodeUtil_redeclareVarsInsideBranch_1330830302264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2326, term2326.getClass(), "type", 1485731037);
        setIntField(term2328, term2328.getClass(), "type", -203163250);
        setIntField(term2330, term2330.getClass(), "type", 0);
        setField(term2330, term2330.getClass(), "next", null);
        setField(term2330, term2330.getClass(), "first", null);
        setField(term2330, term2330.getClass(), "last", null);
        setField(term2330, term2330.getClass(), "propListHead", null);
        setIntField(term2330, term2330.getClass(), "sourcePosition", 0);
        setField(term2330, term2330.getClass(), "jsType", null);
        setField(term2330, term2330.getClass(), "parent", null);
        setField(term2328, term2328.getClass(), "next", term2330);
        setIntField(term2333, term2333.getClass(), "type", 0);
        setField(term2333, term2333.getClass(), "next", null);
        setField(term2333, term2333.getClass(), "first", null);
        setField(term2333, term2333.getClass(), "last", null);
        setField(term2333, term2333.getClass(), "propListHead", null);
        setIntField(term2333, term2333.getClass(), "sourcePosition", 0);
        setField(term2333, term2333.getClass(), "jsType", null);
        setField(term2333, term2333.getClass(), "parent", null);
        setField(term2328, term2328.getClass(), "first", term2333);
        setIntField(term2336, term2336.getClass(), "type", 0);
        setField(term2336, term2336.getClass(), "next", null);
        setField(term2336, term2336.getClass(), "first", null);
        setField(term2336, term2336.getClass(), "last", null);
        setField(term2336, term2336.getClass(), "propListHead", null);
        setIntField(term2336, term2336.getClass(), "sourcePosition", 0);
        setField(term2336, term2336.getClass(), "jsType", null);
        setField(term2336, term2336.getClass(), "parent", null);
        setField(term2328, term2328.getClass(), "last", term2336);
        setField(term2328, term2328.getClass(), "propListHead", null);
        setIntField(term2328, term2328.getClass(), "sourcePosition", 0);
        setField(term2328, term2328.getClass(), "jsType", null);
        setField(term2328, term2328.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "next", term2328);
        setIntField(term2340, term2340.getClass(), "type", 0);
        setField(term2340, term2340.getClass(), "next", null);
        setField(term2340, term2340.getClass(), "first", null);
        setField(term2340, term2340.getClass(), "last", null);
        setField(term2340, term2340.getClass(), "propListHead", null);
        setIntField(term2340, term2340.getClass(), "sourcePosition", 0);
        setField(term2340, term2340.getClass(), "jsType", null);
        setField(term2340, term2340.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "first", term2340);
        setIntField(term2343, term2343.getClass(), "type", 0);
        setField(term2343, term2343.getClass(), "next", null);
        setField(term2343, term2343.getClass(), "first", null);
        setField(term2343, term2343.getClass(), "last", null);
        setField(term2343, term2343.getClass(), "propListHead", null);
        setIntField(term2343, term2343.getClass(), "sourcePosition", 0);
        setField(term2343, term2343.getClass(), "jsType", null);
        setField(term2343, term2343.getClass(), "parent", null);
        setField(term2326, term2326.getClass(), "last", term2343);
        setField(term2326, term2326.getClass(), "propListHead", null);
        setIntField(term2326, term2326.getClass(), "sourcePosition", 0);
        setField(term2326, term2326.getClass(), "jsType", null);
        setField(term2326, term2326.getClass(), "parent", null);
        term16413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16413, term16413.getClass(), "type", 1485731037);
        setIntField(term16414, term16414.getClass(), "type", -203163250);
        setIntField(term16415, term16415.getClass(), "type", 0);
        setField(term16415, term16415.getClass(), "next", null);
        setField(term16415, term16415.getClass(), "first", null);
        setField(term16415, term16415.getClass(), "last", null);
        setField(term16415, term16415.getClass(), "propListHead", null);
        setIntField(term16415, term16415.getClass(), "sourcePosition", 0);
        setField(term16415, term16415.getClass(), "jsType", null);
        setField(term16415, term16415.getClass(), "parent", null);
        setField(term16414, term16414.getClass(), "next", term16415);
        setIntField(term16416, term16416.getClass(), "type", 0);
        setField(term16416, term16416.getClass(), "next", null);
        setField(term16416, term16416.getClass(), "first", null);
        setField(term16416, term16416.getClass(), "last", null);
        setField(term16416, term16416.getClass(), "propListHead", null);
        setIntField(term16416, term16416.getClass(), "sourcePosition", 0);
        setField(term16416, term16416.getClass(), "jsType", null);
        setField(term16416, term16416.getClass(), "parent", null);
        setField(term16414, term16414.getClass(), "first", term16416);
        setIntField(term16417, term16417.getClass(), "type", 0);
        setField(term16417, term16417.getClass(), "next", null);
        setField(term16417, term16417.getClass(), "first", null);
        setField(term16417, term16417.getClass(), "last", null);
        setField(term16417, term16417.getClass(), "propListHead", null);
        setIntField(term16417, term16417.getClass(), "sourcePosition", 0);
        setField(term16417, term16417.getClass(), "jsType", null);
        setField(term16417, term16417.getClass(), "parent", null);
        setField(term16414, term16414.getClass(), "last", term16417);
        setField(term16414, term16414.getClass(), "propListHead", null);
        setIntField(term16414, term16414.getClass(), "sourcePosition", 0);
        setField(term16414, term16414.getClass(), "jsType", null);
        setField(term16414, term16414.getClass(), "parent", null);
        setField(term16413, term16413.getClass(), "next", term16414);
        setIntField(term16418, term16418.getClass(), "type", 0);
        setField(term16418, term16418.getClass(), "next", null);
        setField(term16418, term16418.getClass(), "first", null);
        setField(term16418, term16418.getClass(), "last", null);
        setField(term16418, term16418.getClass(), "propListHead", null);
        setIntField(term16418, term16418.getClass(), "sourcePosition", 0);
        setField(term16418, term16418.getClass(), "jsType", null);
        setField(term16418, term16418.getClass(), "parent", null);
        setField(term16413, term16413.getClass(), "first", term16418);
        setIntField(term16419, term16419.getClass(), "type", 0);
        setField(term16419, term16419.getClass(), "next", null);
        setField(term16419, term16419.getClass(), "first", null);
        setField(term16419, term16419.getClass(), "last", null);
        setField(term16419, term16419.getClass(), "propListHead", null);
        setIntField(term16419, term16419.getClass(), "sourcePosition", 0);
        setField(term16419, term16419.getClass(), "jsType", null);
        setField(term16419, term16419.getClass(), "parent", null);
        setField(term16413, term16413.getClass(), "last", term16419);
        setField(term16413, term16413.getClass(), "propListHead", null);
        setIntField(term16413, term16413.getClass(), "sourcePosition", 0);
        setField(term16413, term16413.getClass(), "jsType", null);
        setField(term16413, term16413.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2326;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2326, term16413));
    }

};


