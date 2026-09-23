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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term949596;
     Object term949688;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term949596 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term949688 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949780 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term949872 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term949872, term949872.getClass(), "first", term949780);
        setField(term949780, term949780.getClass(), "next", term949872);
        setField(term949688, term949688.getClass(), "first", term949780);
        setIntField(term949688, term949688.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term949688;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term949596, args);
    }

};


