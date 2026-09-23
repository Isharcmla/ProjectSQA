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

public class TypeInference_traverseAdd_1886586883131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42885;
     Object term42955;

    public TypeInference_traverseAdd_1886586883131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42885 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term42955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43095, term43095.getClass(), "type", 95);
        setField(term43025, term43025.getClass(), "next", term43095);
        setIntField(term43025, term43025.getClass(), "type", 371943306);
        setField(term43025, term43025.getClass(), "propListHead", null);
        setField(term42955, term42955.getClass(), "first", term43025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term42955;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term42885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


