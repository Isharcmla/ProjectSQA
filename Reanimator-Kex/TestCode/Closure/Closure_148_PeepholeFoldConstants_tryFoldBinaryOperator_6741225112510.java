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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term705589;
     Object term705681;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term705589 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term705681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term705751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term705843 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term705935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term705843, term705843.getClass(), "type", 64);
        setField(term705751, term705751.getClass(), "next", term705843);
        setIntField(term705751, term705751.getClass(), "type", 0);
        setField(term705681, term705681.getClass(), "first", term705751);
        setIntField(term705681, term705681.getClass(), "type", 101);
        setIntField(term705935, term705935.getClass(), "type", 108);
        setField(term705681, term705681.getClass(), "parent", term705935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term705681;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term705589, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


