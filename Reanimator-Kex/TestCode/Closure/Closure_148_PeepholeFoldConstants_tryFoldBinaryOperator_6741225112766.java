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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797078;
     Object term797170;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term797078 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term797170 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term797260 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term797330 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term797416 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term797330, term797330.getClass(), "type", 63);
        setField(term797260, term797260.getClass(), "next", term797330);
        setIntField(term797260, term797260.getClass(), "type", 0);
        setField(term797170, term797170.getClass(), "first", term797260);
        setIntField(term797170, term797170.getClass(), "type", 101);
        setIntField(term797416, term797416.getClass(), "type", 108);
        setField(term797170, term797170.getClass(), "parent", term797416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term797170;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term797078, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


