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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385173;
     Object term385265;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385173 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term385265 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term385357 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term385449 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term385449, term385449.getClass(), "type", 39);
        setField(term385357, term385357.getClass(), "next", term385449);
        setIntField(term385357, term385357.getClass(), "type", 39);
        setField(term385265, term385265.getClass(), "first", term385357);
        setIntField(term385265, term385265.getClass(), "type", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term385265;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term385173, args);
    }

};


