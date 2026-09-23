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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686791;
     Object term686883;
     Object term687315;
     Object term687316;
     Object term687240;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686791 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term686883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term686975 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687067 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term687067, term687067.getClass(), "type", 44);
        setField(term686975, term686975.getClass(), "next", term687067);
        setIntField(term686975, term686975.getClass(), "type", 0);
        setField(term686883, term686883.getClass(), "first", term686975);
        setIntField(term686883, term686883.getClass(), "type", 101);
        setField(term686883, term686883.getClass(), "parent", term687137);
        term687315 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term687315, term687315.getClass(), "currentTraversal", null);
        term687316 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687318 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term687316, term687316.getClass(), "number", 0.0);
        setIntField(term687316, term687316.getClass(), "type", 101);
        setField(term687316, term687316.getClass(), "next", null);
        setDoubleField(term687317, term687317.getClass(), "number", 0.0);
        setIntField(term687317, term687317.getClass(), "type", 0);
        setDoubleField(term687318, term687318.getClass(), "number", 0.0);
        setIntField(term687318, term687318.getClass(), "type", 44);
        setField(term687318, term687318.getClass(), "next", null);
        setField(term687318, term687318.getClass(), "first", null);
        setField(term687318, term687318.getClass(), "last", null);
        setField(term687318, term687318.getClass(), "propListHead", null);
        setIntField(term687318, term687318.getClass(), "sourcePosition", 0);
        setField(term687318, term687318.getClass(), "jsType", null);
        setField(term687318, term687318.getClass(), "parent", null);
        setField(term687317, term687317.getClass(), "next", term687318);
        setField(term687317, term687317.getClass(), "first", null);
        setField(term687317, term687317.getClass(), "last", null);
        setField(term687317, term687317.getClass(), "propListHead", null);
        setIntField(term687317, term687317.getClass(), "sourcePosition", 0);
        setField(term687317, term687317.getClass(), "jsType", null);
        setField(term687317, term687317.getClass(), "parent", null);
        setField(term687316, term687316.getClass(), "first", term687317);
        setField(term687316, term687316.getClass(), "last", null);
        setField(term687316, term687316.getClass(), "propListHead", null);
        setIntField(term687316, term687316.getClass(), "sourcePosition", 0);
        setField(term687316, term687316.getClass(), "jsType", null);
        setIntField(term687319, term687319.getClass(), "type", 0);
        setField(term687319, term687319.getClass(), "next", null);
        setField(term687319, term687319.getClass(), "first", null);
        setField(term687319, term687319.getClass(), "last", null);
        setField(term687319, term687319.getClass(), "propListHead", null);
        setIntField(term687319, term687319.getClass(), "sourcePosition", 0);
        setField(term687319, term687319.getClass(), "jsType", null);
        setField(term687319, term687319.getClass(), "parent", null);
        setField(term687316, term687316.getClass(), "parent", term687319);
        term687240 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term687252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term687240, term687240.getClass(), "number", 0.0);
        setIntField(term687240, term687240.getClass(), "type", 101);
        setField(term687240, term687240.getClass(), "next", null);
        setDoubleField(term687243, term687243.getClass(), "number", 0.0);
        setIntField(term687243, term687243.getClass(), "type", 0);
        setDoubleField(term687246, term687246.getClass(), "number", 0.0);
        setIntField(term687246, term687246.getClass(), "type", 44);
        setField(term687246, term687246.getClass(), "next", null);
        setField(term687246, term687246.getClass(), "first", null);
        setField(term687246, term687246.getClass(), "last", null);
        setField(term687246, term687246.getClass(), "propListHead", null);
        setIntField(term687246, term687246.getClass(), "sourcePosition", 0);
        setField(term687246, term687246.getClass(), "jsType", null);
        setField(term687246, term687246.getClass(), "parent", null);
        setField(term687243, term687243.getClass(), "next", term687246);
        setField(term687243, term687243.getClass(), "first", null);
        setField(term687243, term687243.getClass(), "last", null);
        setField(term687243, term687243.getClass(), "propListHead", null);
        setIntField(term687243, term687243.getClass(), "sourcePosition", 0);
        setField(term687243, term687243.getClass(), "jsType", null);
        setField(term687243, term687243.getClass(), "parent", null);
        setField(term687240, term687240.getClass(), "first", term687243);
        setField(term687240, term687240.getClass(), "last", null);
        setField(term687240, term687240.getClass(), "propListHead", null);
        setIntField(term687240, term687240.getClass(), "sourcePosition", 0);
        setField(term687240, term687240.getClass(), "jsType", null);
        setIntField(term687252, term687252.getClass(), "type", 0);
        setField(term687252, term687252.getClass(), "next", null);
        setField(term687252, term687252.getClass(), "first", null);
        setField(term687252, term687252.getClass(), "last", null);
        setField(term687252, term687252.getClass(), "propListHead", null);
        setIntField(term687252, term687252.getClass(), "sourcePosition", 0);
        setField(term687252, term687252.getClass(), "jsType", null);
        setField(term687252, term687252.getClass(), "parent", null);
        setField(term687240, term687240.getClass(), "parent", term687252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term686883;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term686791, args);
        assertTrue(recursiveEquals(term686791, term687315));
        assertTrue(recursiveEquals(term686883, term687316));
        assertTrue(recursiveEquals(retValue, term687240));
    }

};


