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

public class PeepholeFoldConstants_tryFoldStringJoin_1462460793635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165366;
     Object term165436;
     Object term165946;
     Object term165947;
     Object term165930;

    public PeepholeFoldConstants_tryFoldStringJoin_1462460793635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165366 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term165436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term165436, term165436.getClass(), "first", term165436);
        setField(term165436, term165436.getClass(), "next", term165436);
        term165946 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term165946, term165946.getClass(), "currentTraversal", null);
        term165947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term165947, term165947.getClass(), "type", 0);
        setField(term165947, term165947.getClass(), "next", term165947);
        setField(term165947, term165947.getClass(), "first", term165947);
        setField(term165947, term165947.getClass(), "last", null);
        setField(term165947, term165947.getClass(), "propListHead", null);
        setIntField(term165947, term165947.getClass(), "sourcePosition", 0);
        setField(term165947, term165947.getClass(), "jsType", null);
        setField(term165947, term165947.getClass(), "parent", null);
        term165930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term165930, term165930.getClass(), "type", 0);
        setField(term165930, term165930.getClass(), "next", term165930);
        setField(term165930, term165930.getClass(), "first", term165930);
        setField(term165930, term165930.getClass(), "last", null);
        setField(term165930, term165930.getClass(), "propListHead", null);
        setIntField(term165930, term165930.getClass(), "sourcePosition", 0);
        setField(term165930, term165930.getClass(), "jsType", null);
        setField(term165930, term165930.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term165436;
        Object retValue = callMethod(klass, "tryFoldStringJoin", argTypes, term165366, args);
        assertTrue(recursiveEquals(term165366, term165946));
        assertTrue(recursiveEquals(term165436, term165947));
        assertTrue(recursiveEquals(retValue, term165930));
    }

};


