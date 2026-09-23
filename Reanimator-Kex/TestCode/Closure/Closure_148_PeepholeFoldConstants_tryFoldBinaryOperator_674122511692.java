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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153341;
     Object term153433;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153341 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term153433 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term153525 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term153617 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term153687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term153617, term153617.getClass(), "type", 39);
        setDoubleField(term153617, term153617.getClass(), "number", 4.6984628261659607E18);
        setField(term153525, term153525.getClass(), "next", term153617);
        setIntField(term153525, term153525.getClass(), "type", 63);
        setField(term153525, term153525.getClass(), "first", term153687);
        setField(term153433, term153433.getClass(), "first", term153525);
        setIntField(term153433, term153433.getClass(), "type", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term153433;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term153341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


