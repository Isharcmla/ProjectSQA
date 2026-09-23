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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443850;
     Object term443936;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443850 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term443936 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term444028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term443936, term443936.getClass(), "first", term443936);
        setIntField(term444028, term444028.getClass(), "type", 40);
        setField(term443936, term443936.getClass(), "next", term444028);
        setIntField(term443936, term443936.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term443936;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term443850, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


