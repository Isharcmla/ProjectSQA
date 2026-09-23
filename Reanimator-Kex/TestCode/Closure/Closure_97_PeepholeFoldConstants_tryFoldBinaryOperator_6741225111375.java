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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term469090;
     Object term469182;
     Object term517555;
     Object term517556;
     Object term517504;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term469090 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term469182 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term469274 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term469366 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term469436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term469366, term469366.getClass(), "type", 39);
        setDoubleField(term469366, term469366.getClass(), "number", -5.9897748600860846E18);
        setField(term469274, term469274.getClass(), "next", term469366);
        setIntField(term469274, term469274.getClass(), "type", 39);
        setDoubleField(term469274, term469274.getClass(), "number", 3.2604744508139054E18);
        setField(term469182, term469182.getClass(), "first", term469274);
        setIntField(term469182, term469182.getClass(), "type", 22);
        setField(term469182, term469182.getClass(), "parent", term469436);
        term517555 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term517555, term517555.getClass(), "currentTraversal", null);
        term517556 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517557 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517558 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term517556, term517556.getClass(), "number", 0.0);
        setIntField(term517556, term517556.getClass(), "type", 22);
        setField(term517556, term517556.getClass(), "next", null);
        setDoubleField(term517557, term517557.getClass(), "number", 3.2604744508139054E18);
        setIntField(term517557, term517557.getClass(), "type", 39);
        setDoubleField(term517558, term517558.getClass(), "number", -5.9897748600860846E18);
        setIntField(term517558, term517558.getClass(), "type", 39);
        setField(term517558, term517558.getClass(), "next", null);
        setField(term517558, term517558.getClass(), "first", null);
        setField(term517558, term517558.getClass(), "last", null);
        setField(term517558, term517558.getClass(), "propListHead", null);
        setIntField(term517558, term517558.getClass(), "sourcePosition", 0);
        setField(term517558, term517558.getClass(), "jsType", null);
        setField(term517558, term517558.getClass(), "parent", null);
        setField(term517557, term517557.getClass(), "next", term517558);
        setField(term517557, term517557.getClass(), "first", null);
        setField(term517557, term517557.getClass(), "last", null);
        setField(term517557, term517557.getClass(), "propListHead", null);
        setIntField(term517557, term517557.getClass(), "sourcePosition", 0);
        setField(term517557, term517557.getClass(), "jsType", null);
        setField(term517557, term517557.getClass(), "parent", null);
        setField(term517556, term517556.getClass(), "first", term517557);
        setField(term517556, term517556.getClass(), "last", null);
        setField(term517556, term517556.getClass(), "propListHead", null);
        setIntField(term517556, term517556.getClass(), "sourcePosition", 0);
        setField(term517556, term517556.getClass(), "jsType", null);
        setIntField(term517559, term517559.getClass(), "type", 0);
        setField(term517559, term517559.getClass(), "next", null);
        setField(term517559, term517559.getClass(), "first", null);
        setField(term517559, term517559.getClass(), "last", null);
        setField(term517559, term517559.getClass(), "propListHead", null);
        setIntField(term517559, term517559.getClass(), "sourcePosition", 0);
        setField(term517559, term517559.getClass(), "jsType", null);
        setField(term517559, term517559.getClass(), "parent", null);
        setField(term517556, term517556.getClass(), "parent", term517559);
        term517504 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517507 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term517516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term517504, term517504.getClass(), "number", 0.0);
        setIntField(term517504, term517504.getClass(), "type", 22);
        setField(term517504, term517504.getClass(), "next", null);
        setDoubleField(term517507, term517507.getClass(), "number", 3.2604744508139054E18);
        setIntField(term517507, term517507.getClass(), "type", 39);
        setDoubleField(term517510, term517510.getClass(), "number", -5.9897748600860846E18);
        setIntField(term517510, term517510.getClass(), "type", 39);
        setField(term517510, term517510.getClass(), "next", null);
        setField(term517510, term517510.getClass(), "first", null);
        setField(term517510, term517510.getClass(), "last", null);
        setField(term517510, term517510.getClass(), "propListHead", null);
        setIntField(term517510, term517510.getClass(), "sourcePosition", 0);
        setField(term517510, term517510.getClass(), "jsType", null);
        setField(term517510, term517510.getClass(), "parent", null);
        setField(term517507, term517507.getClass(), "next", term517510);
        setField(term517507, term517507.getClass(), "first", null);
        setField(term517507, term517507.getClass(), "last", null);
        setField(term517507, term517507.getClass(), "propListHead", null);
        setIntField(term517507, term517507.getClass(), "sourcePosition", 0);
        setField(term517507, term517507.getClass(), "jsType", null);
        setField(term517507, term517507.getClass(), "parent", null);
        setField(term517504, term517504.getClass(), "first", term517507);
        setField(term517504, term517504.getClass(), "last", null);
        setField(term517504, term517504.getClass(), "propListHead", null);
        setIntField(term517504, term517504.getClass(), "sourcePosition", 0);
        setField(term517504, term517504.getClass(), "jsType", null);
        setIntField(term517516, term517516.getClass(), "type", 0);
        setField(term517516, term517516.getClass(), "next", null);
        setField(term517516, term517516.getClass(), "first", null);
        setField(term517516, term517516.getClass(), "last", null);
        setField(term517516, term517516.getClass(), "propListHead", null);
        setIntField(term517516, term517516.getClass(), "sourcePosition", 0);
        setField(term517516, term517516.getClass(), "jsType", null);
        setField(term517516, term517516.getClass(), "parent", null);
        setField(term517504, term517504.getClass(), "parent", term517516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term469182;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term469090, args);
        assertTrue(recursiveEquals(term469090, term517555));
        assertTrue(recursiveEquals(term469182, term517556));
        assertTrue(recursiveEquals(retValue, term517504));
    }

};


