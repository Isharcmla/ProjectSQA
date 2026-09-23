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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814527;
     Object term814619;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term814527 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term814619 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term814709 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term814795 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term814881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term814795, term814795.getClass(), "type", 64);
        setField(term814709, term814709.getClass(), "next", term814795);
        setIntField(term814709, term814709.getClass(), "type", 0);
        setField(term814619, term814619.getClass(), "first", term814709);
        setIntField(term814619, term814619.getClass(), "type", 101);
        setIntField(term814881, term814881.getClass(), "type", 113);
        setField(term814619, term814619.getClass(), "parent", term814881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term814619;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term814527, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


