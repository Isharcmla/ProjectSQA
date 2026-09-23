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

public class TypeInference_traverseAdd_1886586883178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60747;
     Object term60817;

    public TypeInference_traverseAdd_1886586883178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60747 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term60817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60957, term60957.getClass(), "type", 101);
        setField(term60887, term60887.getClass(), "next", term60957);
        setIntField(term60887, term60887.getClass(), "type", 371943306);
        setField(term60887, term60887.getClass(), "propListHead", null);
        setField(term60817, term60817.getClass(), "first", term60887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term60817;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term60747, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


