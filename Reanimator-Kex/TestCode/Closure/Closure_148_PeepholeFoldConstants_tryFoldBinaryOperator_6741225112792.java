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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807821;
     Object term807913;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807821 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term807913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term808005 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term808097 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term808189 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term808097, term808097.getClass(), "type", 64);
        setField(term808005, term808005.getClass(), "next", term808097);
        setIntField(term808005, term808005.getClass(), "type", 45);
        setField(term807913, term807913.getClass(), "first", term808005);
        setIntField(term807913, term807913.getClass(), "type", 100);
        setIntField(term808189, term808189.getClass(), "type", 114);
        setField(term807913, term807913.getClass(), "parent", term808189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term807913;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term807821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


