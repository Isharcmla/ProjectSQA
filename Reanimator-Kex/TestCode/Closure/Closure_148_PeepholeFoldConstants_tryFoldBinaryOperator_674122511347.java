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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68919;
     Object term69011;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68919 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term69011 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term69103 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term69195 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69195, term69195.getClass(), "type", 39);
        setField(term69103, term69103.getClass(), "next", term69195);
        setIntField(term69103, term69103.getClass(), "type", 63);
        setField(term69011, term69011.getClass(), "first", term69103);
        setIntField(term69011, term69011.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term69011;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term68919, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


