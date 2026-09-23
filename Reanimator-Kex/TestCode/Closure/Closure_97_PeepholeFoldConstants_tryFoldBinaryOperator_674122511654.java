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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170253;
     Object term170345;
     Object term170443;
     Object term170444;
     Object term170422;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term170345 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term170345, term170345.getClass(), "first", term170345);
        setField(term170345, term170345.getClass(), "next", term170415);
        setIntField(term170345, term170345.getClass(), "type", 19);
        term170443 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term170443, term170443.getClass(), "currentTraversal", null);
        term170444 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term170444, term170444.getClass(), "str", null);
        setIntField(term170444, term170444.getClass(), "type", 19);
        setIntField(term170445, term170445.getClass(), "type", 0);
        setField(term170445, term170445.getClass(), "next", null);
        setField(term170445, term170445.getClass(), "first", null);
        setField(term170445, term170445.getClass(), "last", null);
        setField(term170445, term170445.getClass(), "propListHead", null);
        setIntField(term170445, term170445.getClass(), "sourcePosition", 0);
        setField(term170445, term170445.getClass(), "jsType", null);
        setField(term170445, term170445.getClass(), "parent", null);
        setField(term170444, term170444.getClass(), "next", term170445);
        setField(term170444, term170444.getClass(), "first", term170444);
        setField(term170444, term170444.getClass(), "last", null);
        setField(term170444, term170444.getClass(), "propListHead", null);
        setIntField(term170444, term170444.getClass(), "sourcePosition", 0);
        setField(term170444, term170444.getClass(), "jsType", null);
        setField(term170444, term170444.getClass(), "parent", null);
        term170422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term170424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term170422, term170422.getClass(), "str", null);
        setIntField(term170422, term170422.getClass(), "type", 19);
        setIntField(term170424, term170424.getClass(), "type", 0);
        setField(term170424, term170424.getClass(), "next", null);
        setField(term170424, term170424.getClass(), "first", null);
        setField(term170424, term170424.getClass(), "last", null);
        setField(term170424, term170424.getClass(), "propListHead", null);
        setIntField(term170424, term170424.getClass(), "sourcePosition", 0);
        setField(term170424, term170424.getClass(), "jsType", null);
        setField(term170424, term170424.getClass(), "parent", null);
        setField(term170422, term170422.getClass(), "next", term170424);
        setField(term170422, term170422.getClass(), "first", term170422);
        setField(term170422, term170422.getClass(), "last", null);
        setField(term170422, term170422.getClass(), "propListHead", null);
        setIntField(term170422, term170422.getClass(), "sourcePosition", 0);
        setField(term170422, term170422.getClass(), "jsType", null);
        setField(term170422, term170422.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term170345;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term170253, args);
        assertTrue(recursiveEquals(term170253, term170443));
        assertTrue(recursiveEquals(term170345, term170444));
        assertTrue(recursiveEquals(retValue, term170422));
    }

};


