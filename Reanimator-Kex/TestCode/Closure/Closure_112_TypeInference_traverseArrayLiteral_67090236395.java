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

public class TypeInference_traverseArrayLiteral_67090236395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1083897;
     Object term1083967;

    public TypeInference_traverseArrayLiteral_67090236395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1083897 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1083967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1084037, term1084037.getClass(), "type", -1310015129);
        setIntField(term1084107, term1084107.getClass(), "type", 114);
        setField(term1084037, term1084037.getClass(), "next", term1084107);
        setField(term1083967, term1083967.getClass(), "first", term1084037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1083967;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term1083897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


