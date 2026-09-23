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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31773;
     Object term31843;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31773 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term31843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31983, term31983.getClass(), "type", 39);
        setField(term31913, term31913.getClass(), "next", term31983);
        setIntField(term31913, term31913.getClass(), "type", 63);
        setField(term31843, term31843.getClass(), "first", term31913);
        setIntField(term31843, term31843.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31843;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term31773, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


