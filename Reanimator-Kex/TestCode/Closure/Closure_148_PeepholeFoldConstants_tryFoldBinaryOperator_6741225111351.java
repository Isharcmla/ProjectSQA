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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327887;
     Object term327973;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327887 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term327973 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term328059 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term328149 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term328149, term328149.getClass(), "type", 63);
        setField(term328059, term328059.getClass(), "next", term328149);
        setIntField(term328059, term328059.getClass(), "type", 0);
        setField(term327973, term327973.getClass(), "first", term328059);
        setIntField(term327973, term327973.getClass(), "type", 101);
        setField(term327973, term327973.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term327973;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term327887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


