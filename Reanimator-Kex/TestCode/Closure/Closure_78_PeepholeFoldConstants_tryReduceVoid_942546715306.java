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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_942546715306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46449;
     Object term46631;

    public PeepholeFoldConstants_tryReduceVoid_942546715306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46449 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term46539 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term46539, term46539.getClass(), "compiler", null);
        setField(term46449, term46449.getClass(), "currentTraversal", term46539);
        term46631 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term46631, term46631.getClass(), "first", term46631);
        setIntField(term46631, term46631.getClass(), "type", 89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term46631;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term46449, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


