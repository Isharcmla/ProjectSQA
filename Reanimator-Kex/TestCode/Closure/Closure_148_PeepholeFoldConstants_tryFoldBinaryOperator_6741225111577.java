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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397838;
     Object term397908;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397838 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term397908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term398048, term398048.getClass(), "type", 64);
        setField(term397978, term397978.getClass(), "next", term398048);
        setIntField(term397978, term397978.getClass(), "type", 0);
        setField(term397908, term397908.getClass(), "first", term397978);
        setIntField(term397908, term397908.getClass(), "type", 101);
        setField(term397908, term397908.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term397908;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term397838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


