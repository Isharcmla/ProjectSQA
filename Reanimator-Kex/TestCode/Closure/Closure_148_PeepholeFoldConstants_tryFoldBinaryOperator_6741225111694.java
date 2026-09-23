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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436394;
     Object term436480;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436394 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term436480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term436566 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term436656 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term436746 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term436656, term436656.getClass(), "type", 63);
        setField(term436566, term436566.getClass(), "next", term436656);
        setIntField(term436566, term436566.getClass(), "type", 0);
        setField(term436480, term436480.getClass(), "first", term436566);
        setIntField(term436480, term436480.getClass(), "type", 101);
        setIntField(term436746, term436746.getClass(), "type", 114);
        setField(term436480, term436480.getClass(), "parent", term436746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term436480;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term436394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


