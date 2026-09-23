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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415505;
     Object term415575;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415505 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term415575 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term415785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term415645, term415645.getClass(), "next", term415715);
        setIntField(term415645, term415645.getClass(), "type", 47);
        setField(term415575, term415575.getClass(), "first", term415645);
        setIntField(term415575, term415575.getClass(), "type", 101);
        setField(term415575, term415575.getClass(), "parent", term415785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term415575;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term415505, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


