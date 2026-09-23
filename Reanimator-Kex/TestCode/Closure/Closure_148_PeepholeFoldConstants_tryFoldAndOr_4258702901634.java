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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416943;
     Object term417029;
     Object term417115;
     Object term417201;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416943 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term417029 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term417029, term417029.getClass(), "parent", null);
        setIntField(term417029, term417029.getClass(), "type", 0);
        term417115 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term417115, term417115.getClass(), "type", 0);
        term417201 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term417201, term417201.getClass(), "type", 44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term417029;
        args[1] = term417115;
        args[2] = term417201;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term416943, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


