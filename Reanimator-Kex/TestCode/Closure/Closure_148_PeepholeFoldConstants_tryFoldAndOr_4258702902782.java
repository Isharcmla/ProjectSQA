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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term803701;
     Object term803787;
     Object term803971;
     Object term804063;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term803701 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term803787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term803879 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term803879, term803879.getClass(), "type", 114);
        setField(term803787, term803787.getClass(), "parent", term803879);
        setIntField(term803787, term803787.getClass(), "type", 0);
        term803971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term803971, term803971.getClass(), "type", 91);
        term804063 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term804063, term804063.getClass(), "type", 63);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term803787;
        args[1] = term803971;
        args[2] = term804063;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term803701, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


