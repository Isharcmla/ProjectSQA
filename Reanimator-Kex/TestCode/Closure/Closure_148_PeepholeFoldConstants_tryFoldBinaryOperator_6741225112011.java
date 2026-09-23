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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537880;
     Object term537966;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537880 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term537966 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538052 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538138 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term538230 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term538138, term538138.getClass(), "type", 63);
        setField(term538052, term538052.getClass(), "next", term538138);
        setIntField(term538052, term538052.getClass(), "type", 0);
        setField(term537966, term537966.getClass(), "first", term538052);
        setIntField(term537966, term537966.getClass(), "type", 101);
        setIntField(term538230, term538230.getClass(), "type", 108);
        setField(term537966, term537966.getClass(), "parent", term538230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term537966;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term537880, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


