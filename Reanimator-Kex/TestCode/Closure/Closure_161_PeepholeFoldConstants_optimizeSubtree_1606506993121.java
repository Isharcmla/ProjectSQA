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

public class PeepholeFoldConstants_optimizeSubtree_1606506993121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19884;
     Object term19954;
     Object term20479;
     Object term20480;
     Object term20470;

    public PeepholeFoldConstants_optimizeSubtree_1606506993121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19884 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term19954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19954, term19954.getClass(), "type", 40);
        term20479 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20479, term20479.getClass(), "currentTraversal", null);
        term20480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20480, term20480.getClass(), "type", 40);
        setField(term20480, term20480.getClass(), "next", null);
        setField(term20480, term20480.getClass(), "first", null);
        setField(term20480, term20480.getClass(), "last", null);
        setField(term20480, term20480.getClass(), "propListHead", null);
        setIntField(term20480, term20480.getClass(), "sourcePosition", 0);
        setField(term20480, term20480.getClass(), "jsType", null);
        setField(term20480, term20480.getClass(), "parent", null);
        term20470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20470, term20470.getClass(), "type", 40);
        setField(term20470, term20470.getClass(), "next", null);
        setField(term20470, term20470.getClass(), "first", null);
        setField(term20470, term20470.getClass(), "last", null);
        setField(term20470, term20470.getClass(), "propListHead", null);
        setIntField(term20470, term20470.getClass(), "sourcePosition", 0);
        setField(term20470, term20470.getClass(), "jsType", null);
        setField(term20470, term20470.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term19954;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term19884, args);
        assertTrue(recursiveEquals(term19884, term20479));
        assertTrue(recursiveEquals(term19954, term20480));
        assertTrue(recursiveEquals(retValue, term20470));
    }

};


