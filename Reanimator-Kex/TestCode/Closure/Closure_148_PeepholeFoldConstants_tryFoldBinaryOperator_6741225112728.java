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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784345;
     Object term784437;
     Object term784766;
     Object term784767;
     Object term784698;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784345 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term784437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term784621, term784621.getClass(), "type", 44);
        setField(term784529, term784529.getClass(), "next", term784621);
        setIntField(term784529, term784529.getClass(), "type", 0);
        setField(term784437, term784437.getClass(), "first", term784529);
        setIntField(term784437, term784437.getClass(), "type", 101);
        setField(term784437, term784437.getClass(), "parent", term784691);
        term784766 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term784766, term784766.getClass(), "currentTraversal", null);
        term784767 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784768 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784769 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term784767, term784767.getClass(), "str", null);
        setIntField(term784767, term784767.getClass(), "type", 101);
        setField(term784767, term784767.getClass(), "next", null);
        setField(term784768, term784768.getClass(), "str", null);
        setIntField(term784768, term784768.getClass(), "type", 0);
        setField(term784769, term784769.getClass(), "str", null);
        setIntField(term784769, term784769.getClass(), "type", 44);
        setField(term784769, term784769.getClass(), "next", null);
        setField(term784769, term784769.getClass(), "first", null);
        setField(term784769, term784769.getClass(), "last", null);
        setField(term784769, term784769.getClass(), "propListHead", null);
        setIntField(term784769, term784769.getClass(), "sourcePosition", 0);
        setField(term784769, term784769.getClass(), "jsType", null);
        setField(term784769, term784769.getClass(), "parent", null);
        setField(term784768, term784768.getClass(), "next", term784769);
        setField(term784768, term784768.getClass(), "first", null);
        setField(term784768, term784768.getClass(), "last", null);
        setField(term784768, term784768.getClass(), "propListHead", null);
        setIntField(term784768, term784768.getClass(), "sourcePosition", 0);
        setField(term784768, term784768.getClass(), "jsType", null);
        setField(term784768, term784768.getClass(), "parent", null);
        setField(term784767, term784767.getClass(), "first", term784768);
        setField(term784767, term784767.getClass(), "last", null);
        setField(term784767, term784767.getClass(), "propListHead", null);
        setIntField(term784767, term784767.getClass(), "sourcePosition", 0);
        setField(term784767, term784767.getClass(), "jsType", null);
        setIntField(term784770, term784770.getClass(), "type", 0);
        setField(term784770, term784770.getClass(), "next", null);
        setField(term784770, term784770.getClass(), "first", null);
        setField(term784770, term784770.getClass(), "last", null);
        setField(term784770, term784770.getClass(), "propListHead", null);
        setIntField(term784770, term784770.getClass(), "sourcePosition", 0);
        setField(term784770, term784770.getClass(), "jsType", null);
        setField(term784770, term784770.getClass(), "parent", null);
        setField(term784767, term784767.getClass(), "parent", term784770);
        term784698 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784700 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784702 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term784707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term784698, term784698.getClass(), "str", null);
        setIntField(term784698, term784698.getClass(), "type", 101);
        setField(term784698, term784698.getClass(), "next", null);
        setField(term784700, term784700.getClass(), "str", null);
        setIntField(term784700, term784700.getClass(), "type", 0);
        setField(term784702, term784702.getClass(), "str", null);
        setIntField(term784702, term784702.getClass(), "type", 44);
        setField(term784702, term784702.getClass(), "next", null);
        setField(term784702, term784702.getClass(), "first", null);
        setField(term784702, term784702.getClass(), "last", null);
        setField(term784702, term784702.getClass(), "propListHead", null);
        setIntField(term784702, term784702.getClass(), "sourcePosition", 0);
        setField(term784702, term784702.getClass(), "jsType", null);
        setField(term784702, term784702.getClass(), "parent", null);
        setField(term784700, term784700.getClass(), "next", term784702);
        setField(term784700, term784700.getClass(), "first", null);
        setField(term784700, term784700.getClass(), "last", null);
        setField(term784700, term784700.getClass(), "propListHead", null);
        setIntField(term784700, term784700.getClass(), "sourcePosition", 0);
        setField(term784700, term784700.getClass(), "jsType", null);
        setField(term784700, term784700.getClass(), "parent", null);
        setField(term784698, term784698.getClass(), "first", term784700);
        setField(term784698, term784698.getClass(), "last", null);
        setField(term784698, term784698.getClass(), "propListHead", null);
        setIntField(term784698, term784698.getClass(), "sourcePosition", 0);
        setField(term784698, term784698.getClass(), "jsType", null);
        setIntField(term784707, term784707.getClass(), "type", 0);
        setField(term784707, term784707.getClass(), "next", null);
        setField(term784707, term784707.getClass(), "first", null);
        setField(term784707, term784707.getClass(), "last", null);
        setField(term784707, term784707.getClass(), "propListHead", null);
        setIntField(term784707, term784707.getClass(), "sourcePosition", 0);
        setField(term784707, term784707.getClass(), "jsType", null);
        setField(term784707, term784707.getClass(), "parent", null);
        setField(term784698, term784698.getClass(), "parent", term784707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term784437;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term784345, args);
        assertTrue(recursiveEquals(term784345, term784766));
        assertTrue(recursiveEquals(term784437, term784767));
        assertTrue(recursiveEquals(retValue, term784698));
    }

};


