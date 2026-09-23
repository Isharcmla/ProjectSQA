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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173480;
     Object term173572;
     Object term173679;
     Object term173680;
     Object term173656;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173480 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term173572 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term173572, term173572.getClass(), "first", term173572);
        setField(term173572, term173572.getClass(), "next", term173642);
        setIntField(term173572, term173572.getClass(), "type", 24);
        term173679 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term173679, term173679.getClass(), "currentTraversal", null);
        term173680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term173680, term173680.getClass(), "number", 0.0);
        setIntField(term173680, term173680.getClass(), "type", 24);
        setIntField(term173681, term173681.getClass(), "type", 0);
        setField(term173681, term173681.getClass(), "next", null);
        setField(term173681, term173681.getClass(), "first", null);
        setField(term173681, term173681.getClass(), "last", null);
        setField(term173681, term173681.getClass(), "propListHead", null);
        setIntField(term173681, term173681.getClass(), "sourcePosition", 0);
        setField(term173681, term173681.getClass(), "jsType", null);
        setField(term173681, term173681.getClass(), "parent", null);
        setField(term173680, term173680.getClass(), "next", term173681);
        setField(term173680, term173680.getClass(), "first", term173680);
        setField(term173680, term173680.getClass(), "last", null);
        setField(term173680, term173680.getClass(), "propListHead", null);
        setIntField(term173680, term173680.getClass(), "sourcePosition", 0);
        setField(term173680, term173680.getClass(), "jsType", null);
        setField(term173680, term173680.getClass(), "parent", null);
        term173656 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term173656, term173656.getClass(), "number", 0.0);
        setIntField(term173656, term173656.getClass(), "type", 24);
        setIntField(term173659, term173659.getClass(), "type", 0);
        setField(term173659, term173659.getClass(), "next", null);
        setField(term173659, term173659.getClass(), "first", null);
        setField(term173659, term173659.getClass(), "last", null);
        setField(term173659, term173659.getClass(), "propListHead", null);
        setIntField(term173659, term173659.getClass(), "sourcePosition", 0);
        setField(term173659, term173659.getClass(), "jsType", null);
        setField(term173659, term173659.getClass(), "parent", null);
        setField(term173656, term173656.getClass(), "next", term173659);
        setField(term173656, term173656.getClass(), "first", term173656);
        setField(term173656, term173656.getClass(), "last", null);
        setField(term173656, term173656.getClass(), "propListHead", null);
        setIntField(term173656, term173656.getClass(), "sourcePosition", 0);
        setField(term173656, term173656.getClass(), "jsType", null);
        setField(term173656, term173656.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term173572;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term173480, args);
        assertTrue(recursiveEquals(term173480, term173679));
        assertTrue(recursiveEquals(term173572, term173680));
        assertTrue(recursiveEquals(retValue, term173656));
    }

};


