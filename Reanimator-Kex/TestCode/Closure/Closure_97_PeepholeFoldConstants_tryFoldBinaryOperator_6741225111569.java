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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573234;
     Object term573326;
     Object term573979;
     Object term573980;
     Object term573943;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573234 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term573326 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573510 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term573418, term573418.getClass(), "next", term573510);
        setIntField(term573418, term573418.getClass(), "type", 39);
        setField(term573326, term573326.getClass(), "first", term573418);
        setIntField(term573326, term573326.getClass(), "type", 19);
        term573979 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term573979, term573979.getClass(), "currentTraversal", null);
        term573980 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573981 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573982 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term573980, term573980.getClass(), "number", 0.0);
        setIntField(term573980, term573980.getClass(), "type", 19);
        setField(term573980, term573980.getClass(), "next", null);
        setDoubleField(term573981, term573981.getClass(), "number", 0.0);
        setIntField(term573981, term573981.getClass(), "type", 39);
        setDoubleField(term573982, term573982.getClass(), "number", 0.0);
        setIntField(term573982, term573982.getClass(), "type", 0);
        setField(term573982, term573982.getClass(), "next", null);
        setField(term573982, term573982.getClass(), "first", null);
        setField(term573982, term573982.getClass(), "last", null);
        setField(term573982, term573982.getClass(), "propListHead", null);
        setIntField(term573982, term573982.getClass(), "sourcePosition", 0);
        setField(term573982, term573982.getClass(), "jsType", null);
        setField(term573982, term573982.getClass(), "parent", null);
        setField(term573981, term573981.getClass(), "next", term573982);
        setField(term573981, term573981.getClass(), "first", null);
        setField(term573981, term573981.getClass(), "last", null);
        setField(term573981, term573981.getClass(), "propListHead", null);
        setIntField(term573981, term573981.getClass(), "sourcePosition", 0);
        setField(term573981, term573981.getClass(), "jsType", null);
        setField(term573981, term573981.getClass(), "parent", null);
        setField(term573980, term573980.getClass(), "first", term573981);
        setField(term573980, term573980.getClass(), "last", null);
        setField(term573980, term573980.getClass(), "propListHead", null);
        setIntField(term573980, term573980.getClass(), "sourcePosition", 0);
        setField(term573980, term573980.getClass(), "jsType", null);
        setField(term573980, term573980.getClass(), "parent", null);
        term573943 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573946 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term573949 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term573943, term573943.getClass(), "number", 0.0);
        setIntField(term573943, term573943.getClass(), "type", 19);
        setField(term573943, term573943.getClass(), "next", null);
        setDoubleField(term573946, term573946.getClass(), "number", 0.0);
        setIntField(term573946, term573946.getClass(), "type", 39);
        setDoubleField(term573949, term573949.getClass(), "number", 0.0);
        setIntField(term573949, term573949.getClass(), "type", 0);
        setField(term573949, term573949.getClass(), "next", null);
        setField(term573949, term573949.getClass(), "first", null);
        setField(term573949, term573949.getClass(), "last", null);
        setField(term573949, term573949.getClass(), "propListHead", null);
        setIntField(term573949, term573949.getClass(), "sourcePosition", 0);
        setField(term573949, term573949.getClass(), "jsType", null);
        setField(term573949, term573949.getClass(), "parent", null);
        setField(term573946, term573946.getClass(), "next", term573949);
        setField(term573946, term573946.getClass(), "first", null);
        setField(term573946, term573946.getClass(), "last", null);
        setField(term573946, term573946.getClass(), "propListHead", null);
        setIntField(term573946, term573946.getClass(), "sourcePosition", 0);
        setField(term573946, term573946.getClass(), "jsType", null);
        setField(term573946, term573946.getClass(), "parent", null);
        setField(term573943, term573943.getClass(), "first", term573946);
        setField(term573943, term573943.getClass(), "last", null);
        setField(term573943, term573943.getClass(), "propListHead", null);
        setIntField(term573943, term573943.getClass(), "sourcePosition", 0);
        setField(term573943, term573943.getClass(), "jsType", null);
        setField(term573943, term573943.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term573326;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term573234, args);
        assertTrue(recursiveEquals(term573234, term573979));
        assertTrue(recursiveEquals(term573326, term573980));
        assertTrue(recursiveEquals(retValue, term573943));
    }

};


