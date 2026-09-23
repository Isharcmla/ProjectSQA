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

public class PeepholeFoldConstants_tryFoldTypeof_103678687779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12534;
     Object term12604;
     Object term12649;
     Object term12650;
     Object term12641;

    public PeepholeFoldConstants_tryFoldTypeof_103678687779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12534 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term12604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12604, term12604.getClass(), "type", 32);
        term12649 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term12649, term12649.getClass(), "currentTraversal", null);
        term12650 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12650, term12650.getClass(), "type", 32);
        setField(term12650, term12650.getClass(), "next", null);
        setField(term12650, term12650.getClass(), "first", null);
        setField(term12650, term12650.getClass(), "last", null);
        setField(term12650, term12650.getClass(), "propListHead", null);
        setIntField(term12650, term12650.getClass(), "sourcePosition", 0);
        setField(term12650, term12650.getClass(), "jsType", null);
        setField(term12650, term12650.getClass(), "parent", null);
        term12641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12641, term12641.getClass(), "type", 32);
        setField(term12641, term12641.getClass(), "next", null);
        setField(term12641, term12641.getClass(), "first", null);
        setField(term12641, term12641.getClass(), "last", null);
        setField(term12641, term12641.getClass(), "propListHead", null);
        setIntField(term12641, term12641.getClass(), "sourcePosition", 0);
        setField(term12641, term12641.getClass(), "jsType", null);
        setField(term12641, term12641.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12604;
        Object retValue = callMethod(klass, "tryFoldTypeof", argTypes, term12534, args);
        assertTrue(recursiveEquals(term12534, term12649));
        assertTrue(recursiveEquals(term12604, term12650));
        assertTrue(recursiveEquals(retValue, term12641));
    }

};


