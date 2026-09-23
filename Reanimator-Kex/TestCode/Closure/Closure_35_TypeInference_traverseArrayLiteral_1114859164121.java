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

public class TypeInference_traverseArrayLiteral_1114859164121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40014;
     Object term40084;

    public TypeInference_traverseArrayLiteral_1114859164121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40014 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term40084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40154, term40154.getClass(), "type", 497269071);
        setField(term40154, term40154.getClass(), "propListHead", null);
        setIntField(term40224, term40224.getClass(), "type", 10);
        setField(term40154, term40154.getClass(), "next", term40224);
        setField(term40084, term40084.getClass(), "first", term40154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term40084;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term40014, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


