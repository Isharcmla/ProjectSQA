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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931238;
     Object term931330;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term931238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term931330 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term931420 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term931512 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term931604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term931512, term931512.getClass(), "type", 44);
        setField(term931420, term931420.getClass(), "next", term931512);
        setIntField(term931420, term931420.getClass(), "type", 0);
        setField(term931330, term931330.getClass(), "first", term931420);
        setIntField(term931330, term931330.getClass(), "type", 101);
        setIntField(term931604, term931604.getClass(), "type", 113);
        setField(term931330, term931330.getClass(), "parent", term931604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term931330;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term931238, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


