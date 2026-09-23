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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term851863;
     Object term851955;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term851863 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term851955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term852047 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term852139 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term852231 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term852047, term852047.getClass(), "next", term852139);
        setIntField(term852047, term852047.getClass(), "type", 44);
        setField(term851955, term851955.getClass(), "first", term852047);
        setIntField(term851955, term851955.getClass(), "type", 101);
        setField(term851955, term851955.getClass(), "parent", term852231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term851955;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term851863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


