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

public class TypeInference_traverseArrayLiteral_67090236203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98176;
     Object term98246;

    public TypeInference_traverseArrayLiteral_67090236203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98176 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term98246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98386 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term98316, term98316.getClass(), "type", -1310015129);
        setIntField(term98386, term98386.getClass(), "type", 123);
        setField(term98316, term98316.getClass(), "next", term98386);
        setField(term98246, term98246.getClass(), "first", term98316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term98246;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term98176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


