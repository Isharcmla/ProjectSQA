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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876360;
     Object term876430;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term876360 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term876430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term876520 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term876606 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term876606, term876606.getClass(), "type", 64);
        setField(term876520, term876520.getClass(), "next", term876606);
        setIntField(term876520, term876520.getClass(), "type", 0);
        setField(term876430, term876430.getClass(), "first", term876520);
        setIntField(term876430, term876430.getClass(), "type", 101);
        setField(term876430, term876430.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term876430;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term876360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


