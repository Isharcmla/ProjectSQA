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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720799;
     Object term720891;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term720799 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term720891 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term720983 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term721075 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term721075, term721075.getClass(), "type", 39);
        setDoubleField(term721075, term721075.getClass(), "number", -4.5622871600146678E18);
        setField(term720983, term720983.getClass(), "next", term721075);
        setIntField(term720983, term720983.getClass(), "type", 63);
        setField(term720891, term720891.getClass(), "first", term720983);
        setIntField(term720891, term720891.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term720891;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term720799, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


