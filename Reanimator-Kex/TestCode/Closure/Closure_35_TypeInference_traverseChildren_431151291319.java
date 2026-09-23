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

public class TypeInference_traverseChildren_431151291319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844059;
     Object term844129;

    public TypeInference_traverseChildren_431151291319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844059 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term844129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term844199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term844269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term844199, term844199.getClass(), "type", 1241164745);
        setField(term844199, term844199.getClass(), "propListHead", null);
        setIntField(term844269, term844269.getClass(), "type", 46);
        setField(term844199, term844199.getClass(), "next", term844269);
        setField(term844129, term844129.getClass(), "first", term844199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term844129;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term844059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


