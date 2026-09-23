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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688522;
     Object term688614;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term688522 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term688614 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term688700 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688786 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term688856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term688786, term688786.getClass(), "type", 47);
        setField(term688700, term688700.getClass(), "next", term688786);
        setIntField(term688700, term688700.getClass(), "type", 0);
        setField(term688614, term688614.getClass(), "first", term688700);
        setIntField(term688614, term688614.getClass(), "type", 101);
        setIntField(term688856, term688856.getClass(), "type", 114);
        setField(term688614, term688614.getClass(), "parent", term688856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term688614;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term688522, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


