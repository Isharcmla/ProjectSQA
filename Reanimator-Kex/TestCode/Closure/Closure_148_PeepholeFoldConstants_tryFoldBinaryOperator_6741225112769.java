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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798102;
     Object term798172;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798102 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term798172 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term798262 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term798352 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term798444 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term798352, term798352.getClass(), "type", 44);
        setField(term798262, term798262.getClass(), "next", term798352);
        setIntField(term798262, term798262.getClass(), "type", 0);
        setField(term798172, term798172.getClass(), "first", term798262);
        setIntField(term798172, term798172.getClass(), "type", 101);
        setIntField(term798444, term798444.getClass(), "type", 114);
        setField(term798172, term798172.getClass(), "parent", term798444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term798172;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term798102, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


