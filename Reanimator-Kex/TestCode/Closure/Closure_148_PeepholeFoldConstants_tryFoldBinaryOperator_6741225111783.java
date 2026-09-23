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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463662;
     Object term463748;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463662 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term463748 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term463834 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term463920 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term463920, term463920.getClass(), "type", 64);
        setField(term463834, term463834.getClass(), "next", term463920);
        setIntField(term463834, term463834.getClass(), "type", 0);
        setField(term463748, term463748.getClass(), "first", term463834);
        setIntField(term463748, term463748.getClass(), "type", 100);
        setField(term463748, term463748.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term463748;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term463662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


