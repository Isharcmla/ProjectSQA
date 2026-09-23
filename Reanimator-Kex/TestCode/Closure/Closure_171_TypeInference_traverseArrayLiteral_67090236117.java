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

public class TypeInference_traverseArrayLiteral_67090236117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66955;
     Object term67025;

    public TypeInference_traverseArrayLiteral_67090236117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66955 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term67025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67165 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67095, term67095.getClass(), "type", -1310015129);
        setIntField(term67165, term67165.getClass(), "type", 139);
        setField(term67095, term67095.getClass(), "next", term67165);
        setField(term67025, term67025.getClass(), "first", term67095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term67025;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term66955, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


