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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633483;
     Object term633569;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633483 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term633569 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term633655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term633741 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term633833 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term633741, term633741.getClass(), "type", 63);
        setField(term633655, term633655.getClass(), "next", term633741);
        setIntField(term633655, term633655.getClass(), "type", 0);
        setField(term633569, term633569.getClass(), "first", term633655);
        setIntField(term633569, term633569.getClass(), "type", 101);
        setIntField(term633833, term633833.getClass(), "type", 113);
        setField(term633569, term633569.getClass(), "parent", term633833);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term633569;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term633483, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


