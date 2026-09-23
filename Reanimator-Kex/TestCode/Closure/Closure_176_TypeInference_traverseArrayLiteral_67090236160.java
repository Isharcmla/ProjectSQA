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

public class TypeInference_traverseArrayLiteral_67090236160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82339;
     Object term82409;

    public TypeInference_traverseArrayLiteral_67090236160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82339 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term82409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term82479, term82479.getClass(), "type", -1310015129);
        setIntField(term82549, term82549.getClass(), "type", 133);
        setField(term82479, term82479.getClass(), "next", term82549);
        setField(term82409, term82409.getClass(), "first", term82479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term82409;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term82339, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


