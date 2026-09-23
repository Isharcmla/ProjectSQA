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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809793;
     Object term809863;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term809793 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term809863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term809953 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term810045 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term810045, term810045.getClass(), "type", 64);
        setField(term809953, term809953.getClass(), "next", term810045);
        setIntField(term809953, term809953.getClass(), "type", 0);
        setField(term809863, term809863.getClass(), "first", term809953);
        setIntField(term809863, term809863.getClass(), "type", 101);
        setField(term809863, term809863.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term809863;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term809793, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


