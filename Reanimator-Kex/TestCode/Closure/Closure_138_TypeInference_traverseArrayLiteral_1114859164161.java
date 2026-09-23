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

public class TypeInference_traverseArrayLiteral_1114859164161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140418;
     Object term140488;

    public TypeInference_traverseArrayLiteral_1114859164161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140418 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term140488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140558, term140558.getClass(), "type", 28);
        setIntField(term140628, term140628.getClass(), "type", 28);
        setIntField(term140698, term140698.getClass(), "type", 28);
        setIntField(term140768, term140768.getClass(), "type", 28);
        setIntField(term140838, term140838.getClass(), "type", 77);
        setField(term140768, term140768.getClass(), "first", term140838);
        setField(term140698, term140698.getClass(), "first", term140768);
        setField(term140628, term140628.getClass(), "first", term140698);
        setField(term140558, term140558.getClass(), "first", term140628);
        setField(term140488, term140488.getClass(), "first", term140558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term140488;
        args[1] = null;
        callMethod(klass, "traverseArrayLiteral", argTypes, term140418, args);
    }

};


