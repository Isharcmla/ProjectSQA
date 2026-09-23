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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90060;
     Object term90152;
     Object term90639;
     Object term90640;
     Object term90616;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90060 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term90152 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term90152, term90152.getClass(), "first", term90152);
        setField(term90152, term90152.getClass(), "next", term90222);
        setIntField(term90152, term90152.getClass(), "type", 22);
        term90639 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term90639, term90639.getClass(), "currentTraversal", null);
        term90640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term90640, term90640.getClass(), "number", 0.0);
        setIntField(term90640, term90640.getClass(), "type", 22);
        setIntField(term90641, term90641.getClass(), "type", 0);
        setField(term90641, term90641.getClass(), "next", null);
        setField(term90641, term90641.getClass(), "first", null);
        setField(term90641, term90641.getClass(), "last", null);
        setField(term90641, term90641.getClass(), "propListHead", null);
        setIntField(term90641, term90641.getClass(), "sourcePosition", 0);
        setField(term90641, term90641.getClass(), "jsType", null);
        setField(term90641, term90641.getClass(), "parent", null);
        setField(term90640, term90640.getClass(), "next", term90641);
        setField(term90640, term90640.getClass(), "first", term90640);
        setField(term90640, term90640.getClass(), "last", null);
        setField(term90640, term90640.getClass(), "propListHead", null);
        setIntField(term90640, term90640.getClass(), "sourcePosition", 0);
        setField(term90640, term90640.getClass(), "jsType", null);
        setField(term90640, term90640.getClass(), "parent", null);
        term90616 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term90619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term90616, term90616.getClass(), "number", 0.0);
        setIntField(term90616, term90616.getClass(), "type", 22);
        setIntField(term90619, term90619.getClass(), "type", 0);
        setField(term90619, term90619.getClass(), "next", null);
        setField(term90619, term90619.getClass(), "first", null);
        setField(term90619, term90619.getClass(), "last", null);
        setField(term90619, term90619.getClass(), "propListHead", null);
        setIntField(term90619, term90619.getClass(), "sourcePosition", 0);
        setField(term90619, term90619.getClass(), "jsType", null);
        setField(term90619, term90619.getClass(), "parent", null);
        setField(term90616, term90616.getClass(), "next", term90619);
        setField(term90616, term90616.getClass(), "first", term90616);
        setField(term90616, term90616.getClass(), "last", null);
        setField(term90616, term90616.getClass(), "propListHead", null);
        setIntField(term90616, term90616.getClass(), "sourcePosition", 0);
        setField(term90616, term90616.getClass(), "jsType", null);
        setField(term90616, term90616.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term90152;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term90060, args);
        assertTrue(recursiveEquals(term90060, term90639));
        assertTrue(recursiveEquals(term90152, term90640));
        assertTrue(recursiveEquals(retValue, term90616));
    }

};


