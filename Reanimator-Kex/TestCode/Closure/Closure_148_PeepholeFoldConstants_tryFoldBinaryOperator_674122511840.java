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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191735;
     Object term191827;
     Object term192049;
     Object term192050;
     Object term191996;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191735 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term191827 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term191897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term191989 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term191897, term191897.getClass(), "next", term191989);
        setIntField(term191897, term191897.getClass(), "type", 0);
        setField(term191827, term191827.getClass(), "first", term191897);
        setIntField(term191827, term191827.getClass(), "type", 101);
        setField(term191827, term191827.getClass(), "parent", null);
        term192049 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term192049, term192049.getClass(), "currentTraversal", null);
        term192050 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term192051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192052 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term192050, term192050.getClass(), "str", null);
        setIntField(term192050, term192050.getClass(), "type", 101);
        setField(term192050, term192050.getClass(), "next", null);
        setIntField(term192051, term192051.getClass(), "type", 0);
        setField(term192052, term192052.getClass(), "str", null);
        setIntField(term192052, term192052.getClass(), "type", 0);
        setField(term192052, term192052.getClass(), "next", null);
        setField(term192052, term192052.getClass(), "first", null);
        setField(term192052, term192052.getClass(), "last", null);
        setField(term192052, term192052.getClass(), "propListHead", null);
        setIntField(term192052, term192052.getClass(), "sourcePosition", 0);
        setField(term192052, term192052.getClass(), "jsType", null);
        setField(term192052, term192052.getClass(), "parent", null);
        setField(term192051, term192051.getClass(), "next", term192052);
        setField(term192051, term192051.getClass(), "first", null);
        setField(term192051, term192051.getClass(), "last", null);
        setField(term192051, term192051.getClass(), "propListHead", null);
        setIntField(term192051, term192051.getClass(), "sourcePosition", 0);
        setField(term192051, term192051.getClass(), "jsType", null);
        setField(term192051, term192051.getClass(), "parent", null);
        setField(term192050, term192050.getClass(), "first", term192051);
        setField(term192050, term192050.getClass(), "last", null);
        setField(term192050, term192050.getClass(), "propListHead", null);
        setIntField(term192050, term192050.getClass(), "sourcePosition", 0);
        setField(term192050, term192050.getClass(), "jsType", null);
        setField(term192050, term192050.getClass(), "parent", null);
        term191996 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term191998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192000 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term191996, term191996.getClass(), "str", null);
        setIntField(term191996, term191996.getClass(), "type", 101);
        setField(term191996, term191996.getClass(), "next", null);
        setIntField(term191998, term191998.getClass(), "type", 0);
        setField(term192000, term192000.getClass(), "str", null);
        setIntField(term192000, term192000.getClass(), "type", 0);
        setField(term192000, term192000.getClass(), "next", null);
        setField(term192000, term192000.getClass(), "first", null);
        setField(term192000, term192000.getClass(), "last", null);
        setField(term192000, term192000.getClass(), "propListHead", null);
        setIntField(term192000, term192000.getClass(), "sourcePosition", 0);
        setField(term192000, term192000.getClass(), "jsType", null);
        setField(term192000, term192000.getClass(), "parent", null);
        setField(term191998, term191998.getClass(), "next", term192000);
        setField(term191998, term191998.getClass(), "first", null);
        setField(term191998, term191998.getClass(), "last", null);
        setField(term191998, term191998.getClass(), "propListHead", null);
        setIntField(term191998, term191998.getClass(), "sourcePosition", 0);
        setField(term191998, term191998.getClass(), "jsType", null);
        setField(term191998, term191998.getClass(), "parent", null);
        setField(term191996, term191996.getClass(), "first", term191998);
        setField(term191996, term191996.getClass(), "last", null);
        setField(term191996, term191996.getClass(), "propListHead", null);
        setIntField(term191996, term191996.getClass(), "sourcePosition", 0);
        setField(term191996, term191996.getClass(), "jsType", null);
        setField(term191996, term191996.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term191827;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term191735, args);
        assertTrue(recursiveEquals(term191735, term192049));
        assertTrue(recursiveEquals(term191827, term192050));
        assertTrue(recursiveEquals(retValue, term191996));
    }

};


