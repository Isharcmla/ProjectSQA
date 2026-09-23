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
import java.lang.Object;

public class TypeInference_traverseAdd_1886586883102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54829;
     Object term54899;

    public TypeInference_traverseAdd_1886586883102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54829 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term54899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54899, term54899.getClass(), "first", term54899);
        setField(term54899, term54899.getClass(), "next", term54969);
        setIntField(term54899, term54899.getClass(), "type", 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term54899;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term54829, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


