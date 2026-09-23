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

public class PeepholeFoldConstants_optimizeSubtree_16065069931160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356701;
     Object term356771;

    public PeepholeFoldConstants_optimizeSubtree_16065069931160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356701 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term356771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term356841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term356911 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term356771, term356771.getClass(), "type", 35);
        setIntField(term356911, term356911.getClass(), "type", 39);
        setField(term356841, term356841.getClass(), "next", term356911);
        setIntField(term356841, term356841.getClass(), "type", 63);
        setField(term356771, term356771.getClass(), "first", term356841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term356771;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term356701, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


