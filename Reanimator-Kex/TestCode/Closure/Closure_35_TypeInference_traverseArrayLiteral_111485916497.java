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

public class TypeInference_traverseArrayLiteral_111485916497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29683;
     Object term29753;

    public TypeInference_traverseArrayLiteral_111485916497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29683 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term29753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term29823, term29823.getClass(), "type", 497269071);
        setField(term29823, term29823.getClass(), "propListHead", null);
        setIntField(term29893, term29893.getClass(), "type", 22);
        setField(term29823, term29823.getClass(), "next", term29893);
        setField(term29753, term29753.getClass(), "first", term29823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term29753;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term29683, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


