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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390557;
     Object term390643;
     Object term390735;
     Object term390827;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term390643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term390643, term390643.getClass(), "parent", null);
        setIntField(term390643, term390643.getClass(), "type", 0);
        term390735 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term390735, term390735.getClass(), "type", 0);
        term390827 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term390827, term390827.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term390643;
        args[1] = term390735;
        args[2] = term390827;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term390557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


