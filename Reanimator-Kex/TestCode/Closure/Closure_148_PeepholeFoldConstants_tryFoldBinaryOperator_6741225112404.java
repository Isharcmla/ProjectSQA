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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667996;
     Object term668088;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term667996 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term668088 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668180 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668272 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term668342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term668272, term668272.getClass(), "type", 39);
        setDoubleField(term668272, term668272.getClass(), "number", 4.7019030283980636E18);
        setField(term668180, term668180.getClass(), "next", term668272);
        setIntField(term668180, term668180.getClass(), "type", 63);
        setField(term668180, term668180.getClass(), "first", term668342);
        setField(term668088, term668088.getClass(), "first", term668180);
        setIntField(term668088, term668088.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term668088;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term667996, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


