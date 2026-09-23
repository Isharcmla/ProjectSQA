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

public class TypeInference_traverseAdd_838817955297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403759;
     Object term403829;

    public TypeInference_traverseAdd_838817955297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403759 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term403829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term403969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term404109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term403899, term403899.getClass(), "next", term403969);
        setIntField(term403899, term403899.getClass(), "type", 14);
        setIntField(term404039, term404039.getClass(), "type", 14);
        setIntField(term404109, term404109.getClass(), "type", 36);
        setField(term404039, term404039.getClass(), "first", term404109);
        setField(term403899, term403899.getClass(), "first", term404039);
        setField(term403829, term403829.getClass(), "first", term403899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term403829;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term403759, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


