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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793946;
     Object term794038;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term793946 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term794038 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term794128 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term794220 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term794312 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term794220, term794220.getClass(), "type", 44);
        setField(term794128, term794128.getClass(), "next", term794220);
        setIntField(term794128, term794128.getClass(), "type", 0);
        setField(term794038, term794038.getClass(), "first", term794128);
        setIntField(term794038, term794038.getClass(), "type", 101);
        setIntField(term794312, term794312.getClass(), "type", 114);
        setField(term794038, term794038.getClass(), "parent", term794312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term794038;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term793946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


