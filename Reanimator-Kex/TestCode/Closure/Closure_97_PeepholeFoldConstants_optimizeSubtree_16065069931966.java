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

public class PeepholeFoldConstants_optimizeSubtree_16065069931966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744647;
     Object term744739;

    public PeepholeFoldConstants_optimizeSubtree_16065069931966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744647 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term744739 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term744831 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term744923 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term744739, term744739.getClass(), "type", 35);
        setIntField(term744923, term744923.getClass(), "type", 39);
        setDoubleField(term744923, term744923.getClass(), "number", -4.5622871600146678E18);
        setField(term744831, term744831.getClass(), "next", term744923);
        setIntField(term744831, term744831.getClass(), "type", 63);
        setField(term744739, term744739.getClass(), "first", term744831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term744739;
        try {
            callMethod(klass, "optimizeSubtree", argTypes, term744647, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


