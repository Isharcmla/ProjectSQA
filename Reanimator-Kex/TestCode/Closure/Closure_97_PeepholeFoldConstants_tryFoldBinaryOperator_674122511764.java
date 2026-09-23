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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219046;
     Object term219138;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219046 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term219138 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term219230 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term219322 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term219322, term219322.getClass(), "type", 40);
        setField(term219230, term219230.getClass(), "next", term219322);
        setField(term219138, term219138.getClass(), "first", term219230);
        setIntField(term219138, term219138.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term219138;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term219046, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


