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

public class TypeInference_traverseCall_82554492175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87877;
     Object term87947;

    public TypeInference_traverseCall_82554492175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87877 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term87947 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88017, term88017.getClass(), "type", -945116798);
        setIntField(term88087, term88087.getClass(), "type", 88);
        setField(term88017, term88017.getClass(), "next", term88087);
        setField(term87947, term87947.getClass(), "first", term88017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term87947;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term87877, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


