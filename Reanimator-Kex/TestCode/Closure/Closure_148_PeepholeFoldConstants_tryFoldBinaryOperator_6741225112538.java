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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716465;
     Object term716551;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716465 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term716551 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term716637 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term716723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term716813 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term716723, term716723.getClass(), "type", 47);
        setField(term716637, term716637.getClass(), "next", term716723);
        setIntField(term716637, term716637.getClass(), "type", 0);
        setField(term716551, term716551.getClass(), "first", term716637);
        setIntField(term716551, term716551.getClass(), "type", 101);
        setIntField(term716813, term716813.getClass(), "type", 114);
        setField(term716551, term716551.getClass(), "parent", term716813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term716551;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term716465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


