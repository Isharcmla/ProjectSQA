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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584436;
     Object term584528;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584436 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term584528 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term584614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term584684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term584770 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term584614, term584614.getClass(), "next", term584684);
        setIntField(term584614, term584614.getClass(), "type", 64);
        setField(term584528, term584528.getClass(), "first", term584614);
        setIntField(term584528, term584528.getClass(), "type", 101);
        setField(term584528, term584528.getClass(), "parent", term584770);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term584528;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term584436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


