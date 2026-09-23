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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342240;
     Object term342332;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342240 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term342332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term342424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term342516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term342608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term342424, term342424.getClass(), "next", term342516);
        setIntField(term342424, term342424.getClass(), "type", 47);
        setField(term342332, term342332.getClass(), "first", term342424);
        setIntField(term342332, term342332.getClass(), "type", 101);
        setField(term342332, term342332.getClass(), "parent", term342608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term342332;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term342240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


