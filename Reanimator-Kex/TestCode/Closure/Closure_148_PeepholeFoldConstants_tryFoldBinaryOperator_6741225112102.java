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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570738;
     Object term570830;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term570830 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term570916 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term571006 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term571006, term571006.getClass(), "type", 63);
        setField(term570916, term570916.getClass(), "next", term571006);
        setIntField(term570916, term570916.getClass(), "type", 0);
        setField(term570830, term570830.getClass(), "first", term570916);
        setIntField(term570830, term570830.getClass(), "type", 101);
        setField(term570830, term570830.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term570830;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term570738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


