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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309112;
     Object term309182;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term309182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term309322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term309322, term309322.getClass(), "type", 39);
        setField(term309252, term309252.getClass(), "next", term309322);
        setIntField(term309252, term309252.getClass(), "type", 39);
        setField(term309182, term309182.getClass(), "first", term309252);
        setIntField(term309182, term309182.getClass(), "type", 24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term309182;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term309112, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


