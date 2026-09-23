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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldAndOr_4258702901898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501917;
     Object term502003;
     Object term502159;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501917 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term502003 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term502073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term502003, term502003.getClass(), "parent", null);
        setIntField(term502003, term502003.getClass(), "type", 100);
        setField(term502003, term502003.getClass(), "first", term502073);
        term502159 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term502159, term502159.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term502003;
        args[1] = term502159;
        args[2] = null;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term501917, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


