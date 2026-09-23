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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641762;
     Object term641854;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term641762 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term641854 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term641924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term642016 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term642016, term642016.getClass(), "type", 63);
        setField(term641924, term641924.getClass(), "next", term642016);
        setIntField(term641924, term641924.getClass(), "type", 0);
        setField(term641854, term641854.getClass(), "first", term641924);
        setIntField(term641854, term641854.getClass(), "type", 101);
        setField(term641854, term641854.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term641854;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term641762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


