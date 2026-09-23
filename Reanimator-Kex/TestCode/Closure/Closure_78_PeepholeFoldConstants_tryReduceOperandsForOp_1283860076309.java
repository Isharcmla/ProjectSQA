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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47303;
     Object term47373;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47303 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term47373 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47373, term47373.getClass(), "type", 97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term47373;
        try {
            callMethod(klass, "tryReduceOperandsForOp", argTypes, term47303, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


