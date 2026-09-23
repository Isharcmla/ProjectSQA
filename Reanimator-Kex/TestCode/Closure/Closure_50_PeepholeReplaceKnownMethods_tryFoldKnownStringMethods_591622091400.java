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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2656526;
     Object term2656612;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2656526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2656612 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2656704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2656796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2656888 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2656612, term2656612.getClass(), "type", 37);
        setIntField(term2656704, term2656704.getClass(), "type", 33);
        setIntField(term2656888, term2656888.getClass(), "type", 40);
        setField(term2656796, term2656796.getClass(), "next", term2656888);
        setIntField(term2656796, term2656796.getClass(), "type", 40);
        setField(term2656704, term2656704.getClass(), "first", term2656796);
        setField(term2656612, term2656612.getClass(), "first", term2656704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2656612;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2656526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


