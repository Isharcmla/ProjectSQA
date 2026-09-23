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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843835;
     Object term843927;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843835 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term843927 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term844017 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term844109 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term844195 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term844109, term844109.getClass(), "type", 63);
        setField(term844017, term844017.getClass(), "next", term844109);
        setIntField(term844017, term844017.getClass(), "type", 0);
        setField(term843927, term843927.getClass(), "first", term844017);
        setIntField(term843927, term843927.getClass(), "type", 101);
        setIntField(term844195, term844195.getClass(), "type", 113);
        setField(term843927, term843927.getClass(), "parent", term844195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term843927;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term843835, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


