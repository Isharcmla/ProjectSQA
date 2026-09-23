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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_942546715325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50393;
     Object term50575;

    public PeepholeFoldConstants_tryReduceVoid_942546715325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50393 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term50483 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term50483, term50483.getClass(), "compiler", null);
        setField(term50393, term50393.getClass(), "currentTraversal", term50483);
        term50575 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term50575, term50575.getClass(), "first", term50575);
        setIntField(term50575, term50575.getClass(), "type", 90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50575;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term50393, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


