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

public class TypeInference_traverseAdd_838817955205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98818;
     Object term98888;

    public TypeInference_traverseAdd_838817955205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98818 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term98888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term98888, term98888.getClass(), "first", term98888);
        setField(term98888, term98888.getClass(), "next", term98958);
        setIntField(term98888, term98888.getClass(), "type", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term98888;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term98818, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


