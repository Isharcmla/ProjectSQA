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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TypeInference_traverseReturn_1142297770121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67907;
     Object term67977;

    public TypeInference_traverseReturn_1142297770121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67907 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term67977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67977, term67977.getClass(), "first", term67977);
        setIntField(term67977, term67977.getClass(), "type", 29);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term67977;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term67907, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


