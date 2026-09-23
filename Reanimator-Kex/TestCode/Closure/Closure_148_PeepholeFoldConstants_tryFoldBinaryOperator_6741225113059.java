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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term901222;
     Object term901314;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term901222 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term901314 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term901406 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term901498 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term901590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term901498, term901498.getClass(), "type", 47);
        setField(term901406, term901406.getClass(), "next", term901498);
        setIntField(term901406, term901406.getClass(), "type", 0);
        setField(term901314, term901314.getClass(), "first", term901406);
        setIntField(term901314, term901314.getClass(), "type", 101);
        setIntField(term901590, term901590.getClass(), "type", 108);
        setField(term901314, term901314.getClass(), "parent", term901590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term901314;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term901222, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


