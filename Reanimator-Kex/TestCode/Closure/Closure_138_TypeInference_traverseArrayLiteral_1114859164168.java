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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseArrayLiteral_1114859164168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198147;
     Object term198217;

    public TypeInference_traverseArrayLiteral_1114859164168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198147 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term198217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term198287, term198287.getClass(), "type", 28);
        setIntField(term198357, term198357.getClass(), "type", 28);
        setIntField(term198427, term198427.getClass(), "type", 82);
        setField(term198357, term198357.getClass(), "first", term198427);
        setField(term198287, term198287.getClass(), "first", term198357);
        setField(term198217, term198217.getClass(), "first", term198287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term198217;
        args[1] = null;
        callMethod(klass, "traverseArrayLiteral", argTypes, term198147, args);
    }

};


