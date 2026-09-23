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

public class TypeInference_traverseChildren_1478920219361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1114241;
     Object term1114311;

    public TypeInference_traverseChildren_1478920219361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1114241 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1114311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1114381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1114451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1114381, term1114381.getClass(), "type", 18);
        setIntField(term1114451, term1114451.getClass(), "type", 68);
        setField(term1114381, term1114381.getClass(), "first", term1114451);
        setField(term1114311, term1114311.getClass(), "first", term1114381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1114311;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term1114241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


