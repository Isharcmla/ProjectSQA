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

public class TypeInference_traverseGetProp_220559067325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533023;
     Object term533093;

    public TypeInference_traverseGetProp_220559067325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533023 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term533093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term533163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term533233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term533093, term533093.getClass(), "first", term533093);
        setField(term533093, term533093.getClass(), "last", term533163);
        setIntField(term533093, term533093.getClass(), "type", 1716165145);
        setIntField(term533233, term533233.getClass(), "type", 137);
        setField(term533093, term533093.getClass(), "next", term533233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term533093;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term533023, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


