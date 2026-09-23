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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236973;
     Object term237065;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236973 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term237065 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term237157 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term237249 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term237249, term237249.getClass(), "type", 39);
        setField(term237157, term237157.getClass(), "next", term237249);
        setIntField(term237157, term237157.getClass(), "type", 39);
        setField(term237065, term237065.getClass(), "first", term237157);
        setIntField(term237065, term237065.getClass(), "type", 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term237065;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term236973, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


