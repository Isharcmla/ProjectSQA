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

public class PeepholeFoldConstants_optimizeSubtree_16065069931655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660693;
     Object term660779;

    public PeepholeFoldConstants_optimizeSubtree_16065069931655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term660779 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term660865 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term660957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term660779, term660779.getClass(), "type", 35);
        setIntField(term660957, term660957.getClass(), "type", 39);
        setField(term660865, term660865.getClass(), "next", term660957);
        setIntField(term660865, term660865.getClass(), "type", 63);
        setField(term660779, term660779.getClass(), "first", term660865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term660779;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term660693, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


