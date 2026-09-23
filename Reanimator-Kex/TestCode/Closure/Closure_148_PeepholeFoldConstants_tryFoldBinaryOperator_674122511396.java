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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80328;
     Object term80420;
     Object term80695;
     Object term80696;
     Object term80637;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80328 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term80420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80582 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term80490, term80490.getClass(), "next", term80582);
        setIntField(term80490, term80490.getClass(), "type", 0);
        setField(term80420, term80420.getClass(), "first", term80490);
        setIntField(term80420, term80420.getClass(), "type", 101);
        setField(term80420, term80420.getClass(), "parent", null);
        term80695 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term80695, term80695.getClass(), "currentTraversal", null);
        term80696 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80698 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80696, term80696.getClass(), "number", 0.0);
        setIntField(term80696, term80696.getClass(), "type", 101);
        setField(term80696, term80696.getClass(), "next", null);
        setIntField(term80697, term80697.getClass(), "type", 0);
        setDoubleField(term80698, term80698.getClass(), "number", 0.0);
        setIntField(term80698, term80698.getClass(), "type", 0);
        setField(term80698, term80698.getClass(), "next", null);
        setField(term80698, term80698.getClass(), "first", null);
        setField(term80698, term80698.getClass(), "last", null);
        setField(term80698, term80698.getClass(), "propListHead", null);
        setIntField(term80698, term80698.getClass(), "sourcePosition", 0);
        setField(term80698, term80698.getClass(), "jsType", null);
        setField(term80698, term80698.getClass(), "parent", null);
        setField(term80697, term80697.getClass(), "next", term80698);
        setField(term80697, term80697.getClass(), "first", null);
        setField(term80697, term80697.getClass(), "last", null);
        setField(term80697, term80697.getClass(), "propListHead", null);
        setIntField(term80697, term80697.getClass(), "sourcePosition", 0);
        setField(term80697, term80697.getClass(), "jsType", null);
        setField(term80697, term80697.getClass(), "parent", null);
        setField(term80696, term80696.getClass(), "first", term80697);
        setField(term80696, term80696.getClass(), "last", null);
        setField(term80696, term80696.getClass(), "propListHead", null);
        setIntField(term80696, term80696.getClass(), "sourcePosition", 0);
        setField(term80696, term80696.getClass(), "jsType", null);
        setField(term80696, term80696.getClass(), "parent", null);
        term80637 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term80640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term80637, term80637.getClass(), "number", 0.0);
        setIntField(term80637, term80637.getClass(), "type", 101);
        setField(term80637, term80637.getClass(), "next", null);
        setIntField(term80640, term80640.getClass(), "type", 0);
        setDoubleField(term80642, term80642.getClass(), "number", 0.0);
        setIntField(term80642, term80642.getClass(), "type", 0);
        setField(term80642, term80642.getClass(), "next", null);
        setField(term80642, term80642.getClass(), "first", null);
        setField(term80642, term80642.getClass(), "last", null);
        setField(term80642, term80642.getClass(), "propListHead", null);
        setIntField(term80642, term80642.getClass(), "sourcePosition", 0);
        setField(term80642, term80642.getClass(), "jsType", null);
        setField(term80642, term80642.getClass(), "parent", null);
        setField(term80640, term80640.getClass(), "next", term80642);
        setField(term80640, term80640.getClass(), "first", null);
        setField(term80640, term80640.getClass(), "last", null);
        setField(term80640, term80640.getClass(), "propListHead", null);
        setIntField(term80640, term80640.getClass(), "sourcePosition", 0);
        setField(term80640, term80640.getClass(), "jsType", null);
        setField(term80640, term80640.getClass(), "parent", null);
        setField(term80637, term80637.getClass(), "first", term80640);
        setField(term80637, term80637.getClass(), "last", null);
        setField(term80637, term80637.getClass(), "propListHead", null);
        setIntField(term80637, term80637.getClass(), "sourcePosition", 0);
        setField(term80637, term80637.getClass(), "jsType", null);
        setField(term80637, term80637.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term80420;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term80328, args);
        assertTrue(recursiveEquals(term80328, term80695));
        assertTrue(recursiveEquals(term80420, term80696));
        assertTrue(recursiveEquals(retValue, term80637));
    }

};


