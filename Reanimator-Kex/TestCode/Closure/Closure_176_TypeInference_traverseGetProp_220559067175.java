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

public class TypeInference_traverseGetProp_220559067175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84964;
     Object term85034;

    public TypeInference_traverseGetProp_220559067175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term85034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term85104, term85104.getClass(), "type", 59);
        setField(term85034, term85034.getClass(), "first", term85104);
        setField(term85034, term85034.getClass(), "last", term85174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term85034;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetProp", argTypes, term84964, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


