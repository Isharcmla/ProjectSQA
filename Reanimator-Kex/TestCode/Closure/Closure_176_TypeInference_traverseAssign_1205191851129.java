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

public class TypeInference_traverseAssign_1205191851129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71097;
     Object term71167;

    public TypeInference_traverseAssign_1205191851129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71097 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term71167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71167, term71167.getClass(), "first", term71167);
        setField(term71167, term71167.getClass(), "last", term71237);
        setIntField(term71167, term71167.getClass(), "type", 1072005683);
        setIntField(term71307, term71307.getClass(), "type", 75);
        setField(term71167, term71167.getClass(), "next", term71307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term71167;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term71097, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


