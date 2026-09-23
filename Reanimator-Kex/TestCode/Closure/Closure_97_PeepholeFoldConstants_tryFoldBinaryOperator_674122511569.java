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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149680;
     Object term149750;
     Object term150337;
     Object term150338;
     Object term150308;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149680 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term149750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149820 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term149890 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term149820, term149820.getClass(), "next", term149890);
        setIntField(term149820, term149820.getClass(), "type", 39);
        setField(term149750, term149750.getClass(), "first", term149820);
        setIntField(term149750, term149750.getClass(), "type", 22);
        term150337 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term150337, term150337.getClass(), "currentTraversal", null);
        term150338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term150338, term150338.getClass(), "type", 22);
        setField(term150338, term150338.getClass(), "next", null);
        setIntField(term150339, term150339.getClass(), "type", 39);
        setIntField(term150340, term150340.getClass(), "type", 0);
        setField(term150340, term150340.getClass(), "next", null);
        setField(term150340, term150340.getClass(), "first", null);
        setField(term150340, term150340.getClass(), "last", null);
        setField(term150340, term150340.getClass(), "propListHead", null);
        setIntField(term150340, term150340.getClass(), "sourcePosition", 0);
        setField(term150340, term150340.getClass(), "jsType", null);
        setField(term150340, term150340.getClass(), "parent", null);
        setField(term150339, term150339.getClass(), "next", term150340);
        setField(term150339, term150339.getClass(), "first", null);
        setField(term150339, term150339.getClass(), "last", null);
        setField(term150339, term150339.getClass(), "propListHead", null);
        setIntField(term150339, term150339.getClass(), "sourcePosition", 0);
        setField(term150339, term150339.getClass(), "jsType", null);
        setField(term150339, term150339.getClass(), "parent", null);
        setField(term150338, term150338.getClass(), "first", term150339);
        setField(term150338, term150338.getClass(), "last", null);
        setField(term150338, term150338.getClass(), "propListHead", null);
        setIntField(term150338, term150338.getClass(), "sourcePosition", 0);
        setField(term150338, term150338.getClass(), "jsType", null);
        setField(term150338, term150338.getClass(), "parent", null);
        term150308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term150308, term150308.getClass(), "type", 22);
        setField(term150308, term150308.getClass(), "next", null);
        setIntField(term150310, term150310.getClass(), "type", 39);
        setIntField(term150312, term150312.getClass(), "type", 0);
        setField(term150312, term150312.getClass(), "next", null);
        setField(term150312, term150312.getClass(), "first", null);
        setField(term150312, term150312.getClass(), "last", null);
        setField(term150312, term150312.getClass(), "propListHead", null);
        setIntField(term150312, term150312.getClass(), "sourcePosition", 0);
        setField(term150312, term150312.getClass(), "jsType", null);
        setField(term150312, term150312.getClass(), "parent", null);
        setField(term150310, term150310.getClass(), "next", term150312);
        setField(term150310, term150310.getClass(), "first", null);
        setField(term150310, term150310.getClass(), "last", null);
        setField(term150310, term150310.getClass(), "propListHead", null);
        setIntField(term150310, term150310.getClass(), "sourcePosition", 0);
        setField(term150310, term150310.getClass(), "jsType", null);
        setField(term150310, term150310.getClass(), "parent", null);
        setField(term150308, term150308.getClass(), "first", term150310);
        setField(term150308, term150308.getClass(), "last", null);
        setField(term150308, term150308.getClass(), "propListHead", null);
        setIntField(term150308, term150308.getClass(), "sourcePosition", 0);
        setField(term150308, term150308.getClass(), "jsType", null);
        setField(term150308, term150308.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term149750;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term149680, args);
        assertTrue(recursiveEquals(term149680, term150337));
        assertTrue(recursiveEquals(term149750, term150338));
        assertTrue(recursiveEquals(retValue, term150308));
    }

};


