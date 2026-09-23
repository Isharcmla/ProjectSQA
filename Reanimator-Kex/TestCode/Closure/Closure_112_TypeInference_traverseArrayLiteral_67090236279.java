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

public class TypeInference_traverseArrayLiteral_67090236279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279921;
     Object term279991;

    public TypeInference_traverseArrayLiteral_67090236279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279921 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term279991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term280061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term280131 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term280061, term280061.getClass(), "type", -1310015129);
        setIntField(term280131, term280131.getClass(), "type", 91);
        setField(term280061, term280061.getClass(), "next", term280131);
        setField(term279991, term279991.getClass(), "first", term280061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term279991;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term279921, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


