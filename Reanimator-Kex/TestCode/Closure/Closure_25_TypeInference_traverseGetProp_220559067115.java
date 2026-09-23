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

public class TypeInference_traverseGetProp_220559067115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35135;
     Object term35205;

    public TypeInference_traverseGetProp_220559067115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35135 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term35205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35275, term35275.getClass(), "type", 104);
        setField(term35205, term35205.getClass(), "first", term35275);
        setField(term35205, term35205.getClass(), "last", term35345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term35205;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term35135, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


