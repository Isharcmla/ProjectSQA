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

public class TypeCheck_visit_8595247841628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548081;
     Object term548263;

    public TypeCheck_visit_8595247841628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548081 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term548171 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term548081, term548081.getClass(), "validator", term548171);
        term548263 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term548333 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term548425 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term548535 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setIntField(term548263, term548263.getClass(), "type", 51);
        setField(term548263, term548263.getClass(), "first", term548333);
        setField(term548425, term548425.getClass(), "jsType", term548535);
        setField(term548263, term548263.getClass(), "last", term548425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term548263;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term548081, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


