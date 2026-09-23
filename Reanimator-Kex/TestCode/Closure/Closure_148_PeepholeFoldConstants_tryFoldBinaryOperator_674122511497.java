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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103578;
     Object term103664;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103578 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term103664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103750 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103836 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103922 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term103992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term103922, term103922.getClass(), "next", term103992);
        setField(term103836, term103836.getClass(), "first", term103922);
        setField(term103836, term103836.getClass(), "last", term103992);
        setField(term103750, term103750.getClass(), "next", term103836);
        setIntField(term103750, term103750.getClass(), "type", 90);
        setField(term103664, term103664.getClass(), "first", term103750);
        setIntField(term103664, term103664.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term103664;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term103578, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


