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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563929;
     Object term564021;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563929 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term564021 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term564111 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term564203 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term564289 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term564203, term564203.getClass(), "type", 44);
        setField(term564111, term564111.getClass(), "next", term564203);
        setIntField(term564111, term564111.getClass(), "type", 0);
        setField(term564021, term564021.getClass(), "first", term564111);
        setIntField(term564021, term564021.getClass(), "type", 101);
        setIntField(term564289, term564289.getClass(), "type", 114);
        setField(term564021, term564021.getClass(), "parent", term564289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term564021;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term563929, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


