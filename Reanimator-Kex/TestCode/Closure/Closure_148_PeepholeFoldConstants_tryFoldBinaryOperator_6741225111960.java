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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term522159;
     Object term522245;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term522159 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term522245 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term522331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term522421 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term522421, term522421.getClass(), "type", 64);
        setField(term522331, term522331.getClass(), "next", term522421);
        setIntField(term522331, term522331.getClass(), "type", 0);
        setField(term522245, term522245.getClass(), "first", term522331);
        setIntField(term522245, term522245.getClass(), "type", 100);
        setField(term522245, term522245.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term522245;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term522159, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


