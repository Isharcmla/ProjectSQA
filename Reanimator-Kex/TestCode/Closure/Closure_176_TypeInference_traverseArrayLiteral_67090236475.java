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

public class TypeInference_traverseArrayLiteral_67090236475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2023593;
     Object term2023663;

    public TypeInference_traverseArrayLiteral_67090236475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2023593 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2023663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2023733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2023803 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2023873 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2023943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024433 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2024503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2023733, term2023733.getClass(), "type", 83);
        setIntField(term2023803, term2023803.getClass(), "type", 83);
        setIntField(term2023873, term2023873.getClass(), "type", 83);
        setIntField(term2023943, term2023943.getClass(), "type", 83);
        setIntField(term2024013, term2024013.getClass(), "type", 83);
        setIntField(term2024083, term2024083.getClass(), "type", 83);
        setIntField(term2024153, term2024153.getClass(), "type", 83);
        setIntField(term2024223, term2024223.getClass(), "type", 83);
        setIntField(term2024293, term2024293.getClass(), "type", 83);
        setIntField(term2024363, term2024363.getClass(), "type", 83);
        setIntField(term2024433, term2024433.getClass(), "type", 83);
        setIntField(term2024503, term2024503.getClass(), "type", 89);
        setField(term2024433, term2024433.getClass(), "first", term2024503);
        setField(term2024363, term2024363.getClass(), "first", term2024433);
        setField(term2024293, term2024293.getClass(), "first", term2024363);
        setField(term2024223, term2024223.getClass(), "first", term2024293);
        setField(term2024153, term2024153.getClass(), "first", term2024223);
        setField(term2024083, term2024083.getClass(), "first", term2024153);
        setField(term2024013, term2024013.getClass(), "first", term2024083);
        setField(term2023943, term2023943.getClass(), "first", term2024013);
        setField(term2023873, term2023873.getClass(), "first", term2023943);
        setField(term2023803, term2023803.getClass(), "first", term2023873);
        setField(term2023733, term2023733.getClass(), "first", term2023803);
        setField(term2023663, term2023663.getClass(), "first", term2023733);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2023663;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term2023593, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


