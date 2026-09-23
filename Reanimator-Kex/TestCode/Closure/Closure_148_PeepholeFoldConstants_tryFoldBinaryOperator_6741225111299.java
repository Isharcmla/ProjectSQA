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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311534;
     Object term311626;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311534 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term311626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term311712 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term311782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term311868 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term311712, term311712.getClass(), "next", term311782);
        setIntField(term311712, term311712.getClass(), "type", 63);
        setField(term311626, term311626.getClass(), "first", term311712);
        setIntField(term311626, term311626.getClass(), "type", 101);
        setField(term311626, term311626.getClass(), "parent", term311868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term311626;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term311534, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


