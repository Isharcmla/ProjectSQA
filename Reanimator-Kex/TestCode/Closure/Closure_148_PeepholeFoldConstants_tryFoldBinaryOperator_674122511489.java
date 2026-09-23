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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101663;
     Object term101755;
     Object term102195;
     Object term102196;
     Object term102146;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101663 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term101755 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term101825 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term101755, term101755.getClass(), "first", term101755);
        setField(term101755, term101755.getClass(), "next", term101825);
        setIntField(term101755, term101755.getClass(), "type", 101);
        term102195 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term102195, term102195.getClass(), "currentTraversal", null);
        term102196 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term102196, term102196.getClass(), "number", 0.0);
        setIntField(term102196, term102196.getClass(), "type", 101);
        setIntField(term102197, term102197.getClass(), "type", 0);
        setField(term102197, term102197.getClass(), "next", null);
        setField(term102197, term102197.getClass(), "first", null);
        setField(term102197, term102197.getClass(), "last", null);
        setField(term102197, term102197.getClass(), "propListHead", null);
        setIntField(term102197, term102197.getClass(), "sourcePosition", 0);
        setField(term102197, term102197.getClass(), "jsType", null);
        setField(term102197, term102197.getClass(), "parent", null);
        setField(term102196, term102196.getClass(), "next", term102197);
        setField(term102196, term102196.getClass(), "first", term102196);
        setField(term102196, term102196.getClass(), "last", null);
        setField(term102196, term102196.getClass(), "propListHead", null);
        setIntField(term102196, term102196.getClass(), "sourcePosition", 0);
        setField(term102196, term102196.getClass(), "jsType", null);
        setField(term102196, term102196.getClass(), "parent", null);
        term102146 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term102149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term102146, term102146.getClass(), "number", 0.0);
        setIntField(term102146, term102146.getClass(), "type", 101);
        setIntField(term102149, term102149.getClass(), "type", 0);
        setField(term102149, term102149.getClass(), "next", null);
        setField(term102149, term102149.getClass(), "first", null);
        setField(term102149, term102149.getClass(), "last", null);
        setField(term102149, term102149.getClass(), "propListHead", null);
        setIntField(term102149, term102149.getClass(), "sourcePosition", 0);
        setField(term102149, term102149.getClass(), "jsType", null);
        setField(term102149, term102149.getClass(), "parent", null);
        setField(term102146, term102146.getClass(), "next", term102149);
        setField(term102146, term102146.getClass(), "first", term102146);
        setField(term102146, term102146.getClass(), "last", null);
        setField(term102146, term102146.getClass(), "propListHead", null);
        setIntField(term102146, term102146.getClass(), "sourcePosition", 0);
        setField(term102146, term102146.getClass(), "jsType", null);
        setField(term102146, term102146.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term101755;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term101663, args);
        assertTrue(recursiveEquals(term101663, term102195));
        assertTrue(recursiveEquals(term101755, term102196));
        assertTrue(recursiveEquals(retValue, term102146));
    }

};


