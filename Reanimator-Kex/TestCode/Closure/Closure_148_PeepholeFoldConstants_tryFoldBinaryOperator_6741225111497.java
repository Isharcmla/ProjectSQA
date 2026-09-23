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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372743;
     Object term372835;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372743 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term372835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term372927 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term373019 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term373019, term373019.getClass(), "type", 64);
        setField(term372927, term372927.getClass(), "next", term373019);
        setIntField(term372927, term372927.getClass(), "type", 0);
        setField(term372835, term372835.getClass(), "first", term372927);
        setIntField(term372835, term372835.getClass(), "type", 100);
        setField(term372835, term372835.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term372835;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term372743, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


