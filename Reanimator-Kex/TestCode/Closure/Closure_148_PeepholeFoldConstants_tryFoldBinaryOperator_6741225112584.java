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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term732760;
     Object term732852;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term732760 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term732852 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term732942 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term733034 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term733120 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term733034, term733034.getClass(), "type", 64);
        setField(term732942, term732942.getClass(), "next", term733034);
        setIntField(term732942, term732942.getClass(), "type", 0);
        setField(term732852, term732852.getClass(), "first", term732942);
        setIntField(term732852, term732852.getClass(), "type", 101);
        setIntField(term733120, term733120.getClass(), "type", 114);
        setField(term732852, term732852.getClass(), "parent", term733120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term732852;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term732760, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


