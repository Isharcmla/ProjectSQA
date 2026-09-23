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

public class TypeInference_traverseArrayLiteral_1114859164127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41292;
     Object term41362;

    public TypeInference_traverseArrayLiteral_1114859164127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41292 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term41362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41432, term41432.getClass(), "type", 497269071);
        setField(term41432, term41432.getClass(), "propListHead", null);
        setIntField(term41502, term41502.getClass(), "type", 37);
        setField(term41432, term41432.getClass(), "next", term41502);
        setField(term41362, term41362.getClass(), "first", term41432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term41362;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term41292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


