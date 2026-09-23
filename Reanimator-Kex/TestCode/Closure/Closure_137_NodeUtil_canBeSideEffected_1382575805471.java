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

public class NodeUtil_canBeSideEffected_1382575805471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34720;

    public NodeUtil_canBeSideEffected_1382575805471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34720, term34720.getClass(), "type", -506958186);
        setIntField(term34790, term34790.getClass(), "type", 0);
        setField(term34790, term34790.getClass(), "first", term34790);
        setField(term34720, term34720.getClass(), "first", term34790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term34720;
        try {
            callMethod(klass, "canBeSideEffected", argTypes, null, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


