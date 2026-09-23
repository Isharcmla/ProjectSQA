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

public class TypeInference_traverseAssign_1205191851128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73861;
     Object term73931;

    public TypeInference_traverseAssign_1205191851128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73861 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term73931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term74071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term74001, term74001.getClass(), "type", 80);
        setField(term73931, term73931.getClass(), "first", term74001);
        setField(term73931, term73931.getClass(), "last", term74071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term73931;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term73861, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


