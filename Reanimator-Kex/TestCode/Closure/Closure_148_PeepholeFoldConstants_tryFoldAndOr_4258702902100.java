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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569481;
     Object term569567;
     Object term569751;
     Object term569843;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term569481 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term569567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term569659 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term569659, term569659.getClass(), "type", 108);
        setField(term569567, term569567.getClass(), "parent", term569659);
        setIntField(term569567, term569567.getClass(), "type", 100);
        term569751 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term569751, term569751.getClass(), "type", 85);
        term569843 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term569843, term569843.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term569567;
        args[1] = term569751;
        args[2] = term569843;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term569481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


