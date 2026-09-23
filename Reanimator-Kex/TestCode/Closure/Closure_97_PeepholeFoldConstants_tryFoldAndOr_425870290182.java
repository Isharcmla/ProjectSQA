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

public class PeepholeFoldConstants_tryFoldAndOr_425870290182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35079;
     Object term35171;
     Object term35263;
     Object term35355;
     Object term35419;
     Object term35420;
     Object term35421;
     Object term35422;
     Object term35380;

    public PeepholeFoldConstants_tryFoldAndOr_425870290182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35079 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term35171 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term35171, term35171.getClass(), "parent", null);
        setIntField(term35171, term35171.getClass(), "type", 0);
        term35263 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35263, term35263.getClass(), "type", 0);
        term35355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term35419 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term35419, term35419.getClass(), "currentTraversal", null);
        term35420 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term35420, term35420.getClass(), "str", null);
        setIntField(term35420, term35420.getClass(), "type", 0);
        setField(term35420, term35420.getClass(), "next", null);
        setField(term35420, term35420.getClass(), "first", null);
        setField(term35420, term35420.getClass(), "last", null);
        setField(term35420, term35420.getClass(), "propListHead", null);
        setIntField(term35420, term35420.getClass(), "sourcePosition", 0);
        setField(term35420, term35420.getClass(), "jsType", null);
        setField(term35420, term35420.getClass(), "parent", null);
        term35421 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term35421, term35421.getClass(), "number", 0.0);
        setIntField(term35421, term35421.getClass(), "type", 0);
        setField(term35421, term35421.getClass(), "next", null);
        setField(term35421, term35421.getClass(), "first", null);
        setField(term35421, term35421.getClass(), "last", null);
        setField(term35421, term35421.getClass(), "propListHead", null);
        setIntField(term35421, term35421.getClass(), "sourcePosition", 0);
        setField(term35421, term35421.getClass(), "jsType", null);
        setField(term35421, term35421.getClass(), "parent", null);
        term35422 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term35422, term35422.getClass(), "str", null);
        setIntField(term35422, term35422.getClass(), "type", 0);
        setField(term35422, term35422.getClass(), "next", null);
        setField(term35422, term35422.getClass(), "first", null);
        setField(term35422, term35422.getClass(), "last", null);
        setField(term35422, term35422.getClass(), "propListHead", null);
        setIntField(term35422, term35422.getClass(), "sourcePosition", 0);
        setField(term35422, term35422.getClass(), "jsType", null);
        setField(term35422, term35422.getClass(), "parent", null);
        term35380 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term35380, term35380.getClass(), "str", null);
        setIntField(term35380, term35380.getClass(), "type", 0);
        setField(term35380, term35380.getClass(), "next", null);
        setField(term35380, term35380.getClass(), "first", null);
        setField(term35380, term35380.getClass(), "last", null);
        setField(term35380, term35380.getClass(), "propListHead", null);
        setIntField(term35380, term35380.getClass(), "sourcePosition", 0);
        setField(term35380, term35380.getClass(), "jsType", null);
        setField(term35380, term35380.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term35171;
        args[1] = term35263;
        args[2] = term35355;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term35079, args);
        assertTrue(recursiveEquals(term35079, term35419));
        assertTrue(recursiveEquals(term35171, term35420));
        assertTrue(recursiveEquals(term35263, term35421));
        assertTrue(recursiveEquals(term35355, term35422));
        assertTrue(recursiveEquals(retValue, term35380));
    }

};


