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

public class TypeInference_traverseArrayLiteral_1114859164215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236302;
     Object term236372;

    public TypeInference_traverseArrayLiteral_1114859164215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236302 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term236372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term236442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term236512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term236442, term236442.getClass(), "type", 497269071);
        setField(term236442, term236442.getClass(), "propListHead", null);
        setIntField(term236512, term236512.getClass(), "type", 71);
        setField(term236442, term236442.getClass(), "next", term236512);
        setField(term236372, term236372.getClass(), "first", term236442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term236372;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term236302, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


