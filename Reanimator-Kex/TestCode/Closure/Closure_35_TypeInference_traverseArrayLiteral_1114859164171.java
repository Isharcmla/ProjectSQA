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

public class TypeInference_traverseArrayLiteral_1114859164171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56389;
     Object term56459;

    public TypeInference_traverseArrayLiteral_1114859164171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56389 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term56459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56529, term56529.getClass(), "type", 497269071);
        setField(term56529, term56529.getClass(), "propListHead", null);
        setIntField(term56599, term56599.getClass(), "type", 67);
        setField(term56529, term56529.getClass(), "next", term56599);
        setField(term56459, term56459.getClass(), "first", term56529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term56459;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term56389, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


