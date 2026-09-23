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

public class TypeInference_traverseArrayLiteral_67090236203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157247;
     Object term157317;

    public TypeInference_traverseArrayLiteral_67090236203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157247 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term157317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term157387, term157387.getClass(), "type", 497269071);
        setField(term157387, term157387.getClass(), "propListHead", null);
        setIntField(term157457, term157457.getClass(), "type", 66);
        setField(term157387, term157387.getClass(), "next", term157457);
        setField(term157317, term157317.getClass(), "first", term157387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term157317;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term157247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


