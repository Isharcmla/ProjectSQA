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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413473;
     Object term413559;
     Object term413645;
     Object term413731;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413473 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term413559 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term413559, term413559.getClass(), "parent", null);
        setIntField(term413559, term413559.getClass(), "type", 0);
        term413645 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term413645, term413645.getClass(), "type", 0);
        term413731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term413731, term413731.getClass(), "type", 47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term413559;
        args[1] = term413645;
        args[2] = term413731;
        try {
            callMethod(klass, "tryFoldAndOr", argTypes, term413473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


