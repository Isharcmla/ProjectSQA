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

public class TypeInference_traverseAdd_1886586883168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51171;
     Object term51241;

    public TypeInference_traverseAdd_1886586883168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51171 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term51241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term51381, term51381.getClass(), "type", 91);
        setField(term51311, term51311.getClass(), "next", term51381);
        setIntField(term51311, term51311.getClass(), "type", 371943306);
        setField(term51311, term51311.getClass(), "propListHead", null);
        setField(term51241, term51241.getClass(), "first", term51311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term51241;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term51171, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


