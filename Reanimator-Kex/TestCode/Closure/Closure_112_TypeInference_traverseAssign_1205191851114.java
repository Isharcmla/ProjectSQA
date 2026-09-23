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

public class TypeInference_traverseAssign_1205191851114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64874;
     Object term64944;

    public TypeInference_traverseAssign_1205191851114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64874 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term64944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64944, term64944.getClass(), "first", term64944);
        setField(term64944, term64944.getClass(), "last", term65014);
        setIntField(term64944, term64944.getClass(), "type", 1072005683);
        setIntField(term65084, term65084.getClass(), "type", 154);
        setField(term64944, term64944.getClass(), "next", term65084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term64944;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term64874, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


