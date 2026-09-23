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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term837707;
     Object term837793;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term837707 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term837793 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term837879 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term837971 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term837971, term837971.getClass(), "type", 47);
        setField(term837879, term837879.getClass(), "next", term837971);
        setIntField(term837879, term837879.getClass(), "type", 0);
        setField(term837793, term837793.getClass(), "first", term837879);
        setIntField(term837793, term837793.getClass(), "type", 100);
        setField(term837793, term837793.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term837793;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term837707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


