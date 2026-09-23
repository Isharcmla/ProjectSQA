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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648610;
     Object term648696;
     Object term648874;
     Object term648966;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term648610 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term648696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term648782 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term648782, term648782.getClass(), "type", 114);
        setField(term648696, term648696.getClass(), "parent", term648782);
        setIntField(term648696, term648696.getClass(), "type", 0);
        term648874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term648874, term648874.getClass(), "type", 96);
        term648966 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term648966, term648966.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term648696;
        args[1] = term648874;
        args[2] = term648966;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term648610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


