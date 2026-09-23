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

public class TypeInference_traverseGetProp_220559067181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89420;
     Object term89490;

    public TypeInference_traverseGetProp_220559067181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89420 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term89490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89490, term89490.getClass(), "first", term89490);
        setField(term89490, term89490.getClass(), "last", term89560);
        setIntField(term89490, term89490.getClass(), "type", -728760750);
        setIntField(term89630, term89630.getClass(), "type", 48);
        setField(term89490, term89490.getClass(), "next", term89630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term89490;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term89420, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


