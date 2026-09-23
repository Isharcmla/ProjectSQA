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

public class PeepholeFoldConstants_optimizeSubtree_16065069932049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551464;
     Object term551550;

    public PeepholeFoldConstants_optimizeSubtree_16065069932049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551464 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term551550 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term551642 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term551550, term551550.getClass(), "type", 33);
        setField(term551550, term551550.getClass(), "first", term551550);
        setIntField(term551642, term551642.getClass(), "type", 40);
        setField(term551550, term551550.getClass(), "next", term551642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term551550;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term551464, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


