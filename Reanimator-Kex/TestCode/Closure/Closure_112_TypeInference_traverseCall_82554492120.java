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

public class TypeInference_traverseCall_82554492120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69733;
     Object term69803;

    public TypeInference_traverseCall_82554492120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69733 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term69803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69873, term69873.getClass(), "type", -945116798);
        setIntField(term69943, term69943.getClass(), "type", 9);
        setField(term69873, term69873.getClass(), "next", term69943);
        setField(term69803, term69803.getClass(), "first", term69873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term69803;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term69733, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


