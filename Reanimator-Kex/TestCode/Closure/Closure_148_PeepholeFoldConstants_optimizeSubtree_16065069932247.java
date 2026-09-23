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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_optimizeSubtree_16065069932247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616296;
     Object term616382;

    public PeepholeFoldConstants_optimizeSubtree_16065069932247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616296 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term616382 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term616474 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term616382, term616382.getClass(), "type", 33);
        setField(term616382, term616382.getClass(), "first", term616382);
        setIntField(term616474, term616474.getClass(), "type", 40);
        setField(term616382, term616382.getClass(), "next", term616474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term616382;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term616296, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


