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

public class PeepholeFoldConstants_tryFoldBitAndOr_587122727572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125361;
     Object term125466;
     Object term125479;
     Object term125480;
     Object term125481;
     Object term125468;

    public PeepholeFoldConstants_tryFoldBitAndOr_587122727572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125361 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term125466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125466, term125466.getClass(), "type", 9);
        term125479 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term125479, term125479.getClass(), "currentTraversal", null);
        term125480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125480, term125480.getClass(), "type", 9);
        setField(term125480, term125480.getClass(), "next", null);
        setField(term125480, term125480.getClass(), "first", null);
        setField(term125480, term125480.getClass(), "last", null);
        setField(term125480, term125480.getClass(), "propListHead", null);
        setIntField(term125480, term125480.getClass(), "sourcePosition", 0);
        setField(term125480, term125480.getClass(), "jsType", null);
        setField(term125480, term125480.getClass(), "parent", null);
        term125481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125481, term125481.getClass(), "type", 9);
        setField(term125481, term125481.getClass(), "next", null);
        setField(term125481, term125481.getClass(), "first", null);
        setField(term125481, term125481.getClass(), "last", null);
        setField(term125481, term125481.getClass(), "propListHead", null);
        setIntField(term125481, term125481.getClass(), "sourcePosition", 0);
        setField(term125481, term125481.getClass(), "jsType", null);
        setField(term125481, term125481.getClass(), "parent", null);
        term125468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125468, term125468.getClass(), "type", 9);
        setField(term125468, term125468.getClass(), "next", null);
        setField(term125468, term125468.getClass(), "first", null);
        setField(term125468, term125468.getClass(), "last", null);
        setField(term125468, term125468.getClass(), "propListHead", null);
        setIntField(term125468, term125468.getClass(), "sourcePosition", 0);
        setField(term125468, term125468.getClass(), "jsType", null);
        setField(term125468, term125468.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term125466;
        args[1] = term125466;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldBitAndOr", argTypes, term125361, args);
        assertTrue(recursiveEquals(term125361, term125479));
        assertTrue(recursiveEquals(term125466, term125480));
        assertTrue(recursiveEquals(term125466, term125481));
        assertTrue(recursiveEquals(retValue, term125468));
    }

};


