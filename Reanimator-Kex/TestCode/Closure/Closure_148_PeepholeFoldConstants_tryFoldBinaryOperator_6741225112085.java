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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225112085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563452;
     Object term563522;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225112085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563452 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term563522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term563732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term563592, term563592.getClass(), "next", term563662);
        setIntField(term563592, term563592.getClass(), "type", 44);
        setField(term563522, term563522.getClass(), "first", term563592);
        setIntField(term563522, term563522.getClass(), "type", 101);
        setField(term563522, term563522.getClass(), "parent", term563732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term563522;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term563452, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


