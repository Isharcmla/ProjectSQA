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

public class TypeInference_traverseAssign_1205191851119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67593;
     Object term67663;

    public TypeInference_traverseAssign_1205191851119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67593 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term67663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67733, term67733.getClass(), "type", 41);
        setField(term67663, term67663.getClass(), "first", term67733);
        setField(term67663, term67663.getClass(), "last", term67803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term67663;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term67593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


