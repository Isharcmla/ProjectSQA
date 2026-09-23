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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227416;
     Object term227486;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227416 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term227486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term227556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term227626 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term227696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term227766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term227696, term227696.getClass(), "next", term227766);
        setField(term227626, term227626.getClass(), "first", term227696);
        setField(term227626, term227626.getClass(), "last", term227766);
        setField(term227556, term227556.getClass(), "next", term227626);
        setIntField(term227556, term227556.getClass(), "type", 39);
        setField(term227486, term227486.getClass(), "first", term227556);
        setIntField(term227486, term227486.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term227486;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term227416, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


