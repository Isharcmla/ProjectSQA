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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122326;
     Object term122418;
     Object term123082;
     Object term123083;
     Object term123055;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122326 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term122418 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term122488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term122418, term122418.getClass(), "first", term122418);
        setField(term122418, term122418.getClass(), "next", term122488);
        setIntField(term122418, term122418.getClass(), "type", 35);
        term123082 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term123082, term123082.getClass(), "currentTraversal", null);
        term123083 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term123083, term123083.getClass(), "number", 0.0);
        setIntField(term123083, term123083.getClass(), "type", 35);
        setIntField(term123084, term123084.getClass(), "type", 0);
        setField(term123084, term123084.getClass(), "next", null);
        setField(term123084, term123084.getClass(), "first", null);
        setField(term123084, term123084.getClass(), "last", null);
        setField(term123084, term123084.getClass(), "propListHead", null);
        setIntField(term123084, term123084.getClass(), "sourcePosition", 0);
        setField(term123084, term123084.getClass(), "jsType", null);
        setField(term123084, term123084.getClass(), "parent", null);
        setField(term123083, term123083.getClass(), "next", term123084);
        setField(term123083, term123083.getClass(), "first", term123083);
        setField(term123083, term123083.getClass(), "last", null);
        setField(term123083, term123083.getClass(), "propListHead", null);
        setIntField(term123083, term123083.getClass(), "sourcePosition", 0);
        setField(term123083, term123083.getClass(), "jsType", null);
        setField(term123083, term123083.getClass(), "parent", null);
        term123055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term123058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term123055, term123055.getClass(), "number", 0.0);
        setIntField(term123055, term123055.getClass(), "type", 35);
        setIntField(term123058, term123058.getClass(), "type", 0);
        setField(term123058, term123058.getClass(), "next", null);
        setField(term123058, term123058.getClass(), "first", null);
        setField(term123058, term123058.getClass(), "last", null);
        setField(term123058, term123058.getClass(), "propListHead", null);
        setIntField(term123058, term123058.getClass(), "sourcePosition", 0);
        setField(term123058, term123058.getClass(), "jsType", null);
        setField(term123058, term123058.getClass(), "parent", null);
        setField(term123055, term123055.getClass(), "next", term123058);
        setField(term123055, term123055.getClass(), "first", term123055);
        setField(term123055, term123055.getClass(), "last", null);
        setField(term123055, term123055.getClass(), "propListHead", null);
        setIntField(term123055, term123055.getClass(), "sourcePosition", 0);
        setField(term123055, term123055.getClass(), "jsType", null);
        setField(term123055, term123055.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term122418;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term122326, args);
        assertTrue(recursiveEquals(term122326, term123082));
        assertTrue(recursiveEquals(term122418, term123083));
        assertTrue(recursiveEquals(retValue, term123055));
    }

};


