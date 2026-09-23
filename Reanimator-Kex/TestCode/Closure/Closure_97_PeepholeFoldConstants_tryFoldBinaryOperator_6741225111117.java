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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344966;
     Object term345058;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344966 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term345058 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term345150 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term345242 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term345242, term345242.getClass(), "type", 39);
        setField(term345150, term345150.getClass(), "next", term345242);
        setIntField(term345150, term345150.getClass(), "type", 39);
        setField(term345058, term345058.getClass(), "first", term345150);
        setIntField(term345058, term345058.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term345058;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term344966, args);
    }

};


