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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class InlineFunctions_trimCanidatesUsingOnCost_149856593261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9730;

    public InlineFunctions_trimCanidatesUsingOnCost_149856593261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9868 = newInstance(Class.forName("java.lang.Object"));
        Object term9906 = newInstance(Class.forName("java.lang.Object"));
        HashMap term9778 = new HashMap();
        ((HashMap) term9778).put(term9868, term9868);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        ((HashMap) term9778).put(term9906, term9906);
        term9730 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term9730, term9730.getClass(), "fns", term9778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "trimCanidatesUsingOnCost", argTypes, term9730, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


