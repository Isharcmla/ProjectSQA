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

public class TypeInference_traverseNew_189864070693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28479;
     Object term28549;

    public TypeInference_traverseNew_189864070693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28479 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term28549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28619, term28619.getClass(), "type", -233024044);
        setField(term28619, term28619.getClass(), "propListHead", null);
        setField(term28619, term28619.getClass(), "jsType", null);
        setIntField(term28689, term28689.getClass(), "type", 87);
        setField(term28619, term28619.getClass(), "next", term28689);
        setField(term28549, term28549.getClass(), "first", term28619);
        setField(term28549, term28549.getClass(), "jsType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term28549;
        args[1] = null;
        try {
            callMethod(klass, "traverseNew", argTypes, term28479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


