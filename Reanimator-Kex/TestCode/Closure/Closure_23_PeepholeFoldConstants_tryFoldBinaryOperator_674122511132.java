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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19932;
     Object term20002;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19932 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term20002, term20002.getClass(), "first", term20002);
        setField(term20002, term20002.getClass(), "next", term20002);
        setIntField(term20002, term20002.getClass(), "type", 25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20002;
        callMethod(klass, "tryFoldBinaryOperator", argTypes, term19932, args);
    }

};


