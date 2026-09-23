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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534627;
     Object term534719;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534627 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term534719 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term534811 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term534903 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term534995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term534903, term534903.getClass(), "type", 44);
        setField(term534811, term534811.getClass(), "next", term534903);
        setIntField(term534811, term534811.getClass(), "type", 0);
        setField(term534719, term534719.getClass(), "first", term534811);
        setIntField(term534719, term534719.getClass(), "type", 101);
        setIntField(term534995, term534995.getClass(), "type", 114);
        setField(term534719, term534719.getClass(), "parent", term534995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term534719;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term534627, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


