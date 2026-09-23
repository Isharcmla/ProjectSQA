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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702901677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430811;
     Object term430897;
     Object term431053;
     Object term431139;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term430811 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term430897 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term430967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term430967, term430967.getClass(), "type", 115);
        setField(term430897, term430897.getClass(), "parent", term430967);
        setIntField(term430897, term430897.getClass(), "type", 63);
        term431053 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term431053, term431053.getClass(), "type", 0);
        term431139 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term431139, term431139.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term430897;
        args[1] = term431053;
        args[2] = term431139;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term430811, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


