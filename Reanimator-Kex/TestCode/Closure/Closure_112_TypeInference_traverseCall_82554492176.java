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

public class TypeInference_traverseCall_82554492176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90026;
     Object term90096;

    public TypeInference_traverseCall_82554492176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90026 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term90096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90166, term90166.getClass(), "type", -945116798);
        setIntField(term90236, term90236.getClass(), "type", 70);
        setField(term90166, term90166.getClass(), "next", term90236);
        setField(term90096, term90096.getClass(), "first", term90166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term90096;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term90026, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


