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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902690 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term770065;
     Object term770151;
     Object term770335;
     Object term770427;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902690() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term770065 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term770151 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term770243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term770243, term770243.getClass(), "type", 108);
        setField(term770151, term770151.getClass(), "parent", term770243);
        setIntField(term770151, term770151.getClass(), "type", 0);
        term770335 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term770335, term770335.getClass(), "type", 94);
        term770427 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term770427, term770427.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term770151;
        args[1] = term770335;
        args[2] = term770427;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term770065, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


