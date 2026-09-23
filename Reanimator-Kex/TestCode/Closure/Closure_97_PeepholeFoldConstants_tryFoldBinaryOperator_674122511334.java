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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63526;
     Object term63596;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63526 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term63596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63596, term63596.getClass(), "first", term63596);
        setField(term63736, term63736.getClass(), "next", term63666);
        setField(term63666, term63666.getClass(), "first", term63736);
        setField(term63666, term63666.getClass(), "last", term63666);
        setField(term63596, term63596.getClass(), "next", term63666);
        setIntField(term63596, term63596.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63596;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term63526, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


