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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540863;
     Object term540949;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540863 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term540949 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term541035 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term541127 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term541127, term541127.getClass(), "type", 64);
        setField(term541035, term541035.getClass(), "next", term541127);
        setIntField(term541035, term541035.getClass(), "type", 0);
        setField(term540949, term540949.getClass(), "first", term541035);
        setIntField(term540949, term540949.getClass(), "type", 101);
        setField(term540949, term540949.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term540949;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term540863, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


