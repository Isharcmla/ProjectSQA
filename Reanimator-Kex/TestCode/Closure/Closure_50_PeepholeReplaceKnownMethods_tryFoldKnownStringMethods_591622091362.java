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
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2640952;
     Object term2641044;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2640952 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2641044 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2641130 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2641216 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2641302 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term2641044, term2641044.getClass(), "type", 37);
        setIntField(term2641130, term2641130.getClass(), "type", 35);
        setIntField(term2641302, term2641302.getClass(), "type", 40);
        setField(term2641216, term2641216.getClass(), "next", term2641302);
        setIntField(term2641216, term2641216.getClass(), "type", 40);
        setField(term2641130, term2641130.getClass(), "first", term2641216);
        setField(term2641044, term2641044.getClass(), "first", term2641130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2641044;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2640952, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


