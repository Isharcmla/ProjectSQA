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

public class TypeInference_traverseGetElem_947565415371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1443022;
     Object term1443092;

    public TypeInference_traverseGetElem_947565415371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1443022 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1443092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443582 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1443932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1444002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1444072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1444142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1443162, term1443162.getClass(), "type", 21);
        setField(term1443232, term1443232.getClass(), "next", term1443302);
        setIntField(term1443232, term1443232.getClass(), "type", 21);
        setField(term1443372, term1443372.getClass(), "next", term1443442);
        setIntField(term1443372, term1443372.getClass(), "type", 21);
        setField(term1443512, term1443512.getClass(), "next", term1443582);
        setIntField(term1443512, term1443512.getClass(), "type", 21);
        setField(term1443652, term1443652.getClass(), "next", term1443722);
        setIntField(term1443652, term1443652.getClass(), "type", 21);
        setField(term1443792, term1443792.getClass(), "next", term1443862);
        setIntField(term1443792, term1443792.getClass(), "type", 21);
        setField(term1443932, term1443932.getClass(), "next", term1444002);
        setIntField(term1443932, term1443932.getClass(), "type", 21);
        setField(term1444072, term1444072.getClass(), "next", term1444142);
        setIntField(term1444072, term1444072.getClass(), "type", 85);
        setField(term1443932, term1443932.getClass(), "first", term1444072);
        setField(term1443792, term1443792.getClass(), "first", term1443932);
        setField(term1443652, term1443652.getClass(), "first", term1443792);
        setField(term1443512, term1443512.getClass(), "first", term1443652);
        setField(term1443372, term1443372.getClass(), "first", term1443512);
        setField(term1443232, term1443232.getClass(), "first", term1443372);
        setField(term1443162, term1443162.getClass(), "first", term1443232);
        setField(term1443092, term1443092.getClass(), "first", term1443162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1443092;
        args[1] = null;
        callMethod(klass, "traverseGetElem", argTypes, term1443022, args);
    }

};


