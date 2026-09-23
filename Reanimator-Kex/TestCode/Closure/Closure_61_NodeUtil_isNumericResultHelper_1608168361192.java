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

public class NodeUtil_isNumericResultHelper_1608168361192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757;
     Object term9479;

    public NodeUtil_isNumericResultHelper_1608168361192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term757, term757.getClass(), "type", -358526505);
        setIntField(term759, term759.getClass(), "type", 278355793);
        setIntField(term761, term761.getClass(), "type", 0);
        setField(term761, term761.getClass(), "next", null);
        setField(term761, term761.getClass(), "first", null);
        setField(term761, term761.getClass(), "last", null);
        setField(term761, term761.getClass(), "propListHead", null);
        setIntField(term761, term761.getClass(), "sourcePosition", 0);
        setField(term761, term761.getClass(), "jsType", null);
        setField(term761, term761.getClass(), "parent", null);
        setField(term759, term759.getClass(), "next", term761);
        setIntField(term764, term764.getClass(), "type", 0);
        setField(term764, term764.getClass(), "next", null);
        setField(term764, term764.getClass(), "first", null);
        setField(term764, term764.getClass(), "last", null);
        setField(term764, term764.getClass(), "propListHead", null);
        setIntField(term764, term764.getClass(), "sourcePosition", 0);
        setField(term764, term764.getClass(), "jsType", null);
        setField(term764, term764.getClass(), "parent", null);
        setField(term759, term759.getClass(), "first", term764);
        setIntField(term767, term767.getClass(), "type", 0);
        setField(term767, term767.getClass(), "next", null);
        setField(term767, term767.getClass(), "first", null);
        setField(term767, term767.getClass(), "last", null);
        setField(term767, term767.getClass(), "propListHead", null);
        setIntField(term767, term767.getClass(), "sourcePosition", 0);
        setField(term767, term767.getClass(), "jsType", null);
        setField(term767, term767.getClass(), "parent", null);
        setField(term759, term759.getClass(), "last", term767);
        setField(term759, term759.getClass(), "propListHead", null);
        setIntField(term759, term759.getClass(), "sourcePosition", 0);
        setField(term759, term759.getClass(), "jsType", null);
        setField(term759, term759.getClass(), "parent", null);
        setField(term757, term757.getClass(), "next", term759);
        setIntField(term771, term771.getClass(), "type", 0);
        setField(term771, term771.getClass(), "next", null);
        setField(term771, term771.getClass(), "first", null);
        setField(term771, term771.getClass(), "last", null);
        setField(term771, term771.getClass(), "propListHead", null);
        setIntField(term771, term771.getClass(), "sourcePosition", 0);
        setField(term771, term771.getClass(), "jsType", null);
        setField(term771, term771.getClass(), "parent", null);
        setField(term757, term757.getClass(), "first", term771);
        setIntField(term774, term774.getClass(), "type", 0);
        setField(term774, term774.getClass(), "next", null);
        setField(term774, term774.getClass(), "first", null);
        setField(term774, term774.getClass(), "last", null);
        setField(term774, term774.getClass(), "propListHead", null);
        setIntField(term774, term774.getClass(), "sourcePosition", 0);
        setField(term774, term774.getClass(), "jsType", null);
        setField(term774, term774.getClass(), "parent", null);
        setField(term757, term757.getClass(), "last", term774);
        setField(term757, term757.getClass(), "propListHead", null);
        setIntField(term757, term757.getClass(), "sourcePosition", 0);
        setField(term757, term757.getClass(), "jsType", null);
        setField(term757, term757.getClass(), "parent", null);
        term9479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9485 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9479, term9479.getClass(), "type", -358526505);
        setIntField(term9480, term9480.getClass(), "type", 278355793);
        setIntField(term9481, term9481.getClass(), "type", 0);
        setField(term9481, term9481.getClass(), "next", null);
        setField(term9481, term9481.getClass(), "first", null);
        setField(term9481, term9481.getClass(), "last", null);
        setField(term9481, term9481.getClass(), "propListHead", null);
        setIntField(term9481, term9481.getClass(), "sourcePosition", 0);
        setField(term9481, term9481.getClass(), "jsType", null);
        setField(term9481, term9481.getClass(), "parent", null);
        setField(term9480, term9480.getClass(), "next", term9481);
        setIntField(term9482, term9482.getClass(), "type", 0);
        setField(term9482, term9482.getClass(), "next", null);
        setField(term9482, term9482.getClass(), "first", null);
        setField(term9482, term9482.getClass(), "last", null);
        setField(term9482, term9482.getClass(), "propListHead", null);
        setIntField(term9482, term9482.getClass(), "sourcePosition", 0);
        setField(term9482, term9482.getClass(), "jsType", null);
        setField(term9482, term9482.getClass(), "parent", null);
        setField(term9480, term9480.getClass(), "first", term9482);
        setIntField(term9483, term9483.getClass(), "type", 0);
        setField(term9483, term9483.getClass(), "next", null);
        setField(term9483, term9483.getClass(), "first", null);
        setField(term9483, term9483.getClass(), "last", null);
        setField(term9483, term9483.getClass(), "propListHead", null);
        setIntField(term9483, term9483.getClass(), "sourcePosition", 0);
        setField(term9483, term9483.getClass(), "jsType", null);
        setField(term9483, term9483.getClass(), "parent", null);
        setField(term9480, term9480.getClass(), "last", term9483);
        setField(term9480, term9480.getClass(), "propListHead", null);
        setIntField(term9480, term9480.getClass(), "sourcePosition", 0);
        setField(term9480, term9480.getClass(), "jsType", null);
        setField(term9480, term9480.getClass(), "parent", null);
        setField(term9479, term9479.getClass(), "next", term9480);
        setIntField(term9484, term9484.getClass(), "type", 0);
        setField(term9484, term9484.getClass(), "next", null);
        setField(term9484, term9484.getClass(), "first", null);
        setField(term9484, term9484.getClass(), "last", null);
        setField(term9484, term9484.getClass(), "propListHead", null);
        setIntField(term9484, term9484.getClass(), "sourcePosition", 0);
        setField(term9484, term9484.getClass(), "jsType", null);
        setField(term9484, term9484.getClass(), "parent", null);
        setField(term9479, term9479.getClass(), "first", term9484);
        setIntField(term9485, term9485.getClass(), "type", 0);
        setField(term9485, term9485.getClass(), "next", null);
        setField(term9485, term9485.getClass(), "first", null);
        setField(term9485, term9485.getClass(), "last", null);
        setField(term9485, term9485.getClass(), "propListHead", null);
        setIntField(term9485, term9485.getClass(), "sourcePosition", 0);
        setField(term9485, term9485.getClass(), "jsType", null);
        setField(term9485, term9485.getClass(), "parent", null);
        setField(term9479, term9479.getClass(), "last", term9485);
        setField(term9479, term9479.getClass(), "propListHead", null);
        setIntField(term9479, term9479.getClass(), "sourcePosition", 0);
        setField(term9479, term9479.getClass(), "jsType", null);
        setField(term9479, term9479.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term757;
        Object retValue = callMethod(klass, "isNumericResultHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term757, term9479));
        assertTrue(recursiveEquals(retValue, false));
    }

};


