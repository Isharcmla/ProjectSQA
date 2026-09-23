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

public class TypeInference_traverseAdd_838817955121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37024;
     Object term37094;

    public TypeInference_traverseAdd_838817955121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37024 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term37094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term37164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term37094, term37094.getClass(), "first", term37094);
        setField(term37094, term37094.getClass(), "next", term37164);
        setIntField(term37094, term37094.getClass(), "type", 41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term37094;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term37024, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


