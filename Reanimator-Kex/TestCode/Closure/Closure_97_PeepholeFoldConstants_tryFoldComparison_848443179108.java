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

public class PeepholeFoldConstants_tryFoldComparison_848443179108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20039;
     Object term20131;
     Object term20223;
     Object term20253;
     Object term20254;
     Object term20255;
     Object term20245;

    public PeepholeFoldConstants_tryFoldComparison_848443179108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20039 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20131 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term20223 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term20223, term20223.getClass(), "type", 0);
        term20253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20253, term20253.getClass(), "currentTraversal", null);
        term20254 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term20254, term20254.getClass(), "number", 0.0);
        setIntField(term20254, term20254.getClass(), "type", 0);
        setField(term20254, term20254.getClass(), "next", null);
        setField(term20254, term20254.getClass(), "first", null);
        setField(term20254, term20254.getClass(), "last", null);
        setField(term20254, term20254.getClass(), "propListHead", null);
        setIntField(term20254, term20254.getClass(), "sourcePosition", 0);
        setField(term20254, term20254.getClass(), "jsType", null);
        setField(term20254, term20254.getClass(), "parent", null);
        term20255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term20255, term20255.getClass(), "number", 0.0);
        setIntField(term20255, term20255.getClass(), "type", 0);
        setField(term20255, term20255.getClass(), "next", null);
        setField(term20255, term20255.getClass(), "first", null);
        setField(term20255, term20255.getClass(), "last", null);
        setField(term20255, term20255.getClass(), "propListHead", null);
        setIntField(term20255, term20255.getClass(), "sourcePosition", 0);
        setField(term20255, term20255.getClass(), "jsType", null);
        setField(term20255, term20255.getClass(), "parent", null);
        term20245 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term20245, term20245.getClass(), "number", 0.0);
        setIntField(term20245, term20245.getClass(), "type", 0);
        setField(term20245, term20245.getClass(), "next", null);
        setField(term20245, term20245.getClass(), "first", null);
        setField(term20245, term20245.getClass(), "last", null);
        setField(term20245, term20245.getClass(), "propListHead", null);
        setIntField(term20245, term20245.getClass(), "sourcePosition", 0);
        setField(term20245, term20245.getClass(), "jsType", null);
        setField(term20245, term20245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term20131;
        args[1] = term20223;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term20039, args);
        assertTrue(recursiveEquals(term20039, term20253));
        assertTrue(recursiveEquals(term20131, term20254));
        assertTrue(recursiveEquals(term20223, term20255));
        assertTrue(recursiveEquals(retValue, term20245));
    }

};


