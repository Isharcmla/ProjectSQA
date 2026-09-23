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

public class PeepholeFoldConstants_optimizeSubtree_16065069931313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435450;
     Object term435520;
     Object term435944;
     Object term435945;
     Object term435921;

    public PeepholeFoldConstants_optimizeSubtree_16065069931313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435450 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term435520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term435520, term435520.getClass(), "type", 32);
        setField(term435520, term435520.getClass(), "first", term435520);
        term435944 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term435944, term435944.getClass(), "currentTraversal", null);
        term435945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term435945, term435945.getClass(), "type", 32);
        setField(term435945, term435945.getClass(), "next", null);
        setField(term435945, term435945.getClass(), "first", term435945);
        setField(term435945, term435945.getClass(), "last", null);
        setField(term435945, term435945.getClass(), "propListHead", null);
        setIntField(term435945, term435945.getClass(), "sourcePosition", 0);
        setField(term435945, term435945.getClass(), "jsType", null);
        setField(term435945, term435945.getClass(), "parent", null);
        term435921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term435921, term435921.getClass(), "type", 32);
        setField(term435921, term435921.getClass(), "next", null);
        setField(term435921, term435921.getClass(), "first", term435921);
        setField(term435921, term435921.getClass(), "last", null);
        setField(term435921, term435921.getClass(), "propListHead", null);
        setIntField(term435921, term435921.getClass(), "sourcePosition", 0);
        setField(term435921, term435921.getClass(), "jsType", null);
        setField(term435921, term435921.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term435520;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term435450, args);
        assertTrue(recursiveEquals(term435450, term435944));
        assertTrue(recursiveEquals(term435520, term435945));
        assertTrue(recursiveEquals(retValue, term435921));
    }

};


