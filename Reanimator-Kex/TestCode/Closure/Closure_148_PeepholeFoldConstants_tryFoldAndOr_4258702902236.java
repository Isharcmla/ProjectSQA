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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term613439;
     Object term613525;
     Object term613617;
     Object term613709;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term613439 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term613525 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term613525, term613525.getClass(), "parent", null);
        setIntField(term613525, term613525.getClass(), "type", 0);
        term613617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term613617, term613617.getClass(), "type", 0);
        term613709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term613709, term613709.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term613525;
        args[1] = term613617;
        args[2] = term613709;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term613439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


