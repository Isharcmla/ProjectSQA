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
import java.lang.Object;

public class PeepholeFoldConstants_optimizeSubtree_16065069931349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327426;
     Object term327518;

    public PeepholeFoldConstants_optimizeSubtree_16065069931349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327426 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term327518 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term327610 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term327702 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term327518, term327518.getClass(), "type", 33);
        setIntField(term327702, term327702.getClass(), "type", 40);
        setField(term327610, term327610.getClass(), "next", term327702);
        setField(term327518, term327518.getClass(), "first", term327610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term327518;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term327426, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


