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

public class TypeInference_traverseAdd_838817955559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3168179;
     Object term3168249;

    public TypeInference_traverseAdd_838817955559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3168179 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term3168249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3168949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3169019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3168319, term3168319.getClass(), "next", term3168389);
        setIntField(term3168319, term3168319.getClass(), "type", 14);
        setIntField(term3168459, term3168459.getClass(), "type", 14);
        setIntField(term3168529, term3168529.getClass(), "type", 14);
        setIntField(term3168599, term3168599.getClass(), "type", 14);
        setIntField(term3168669, term3168669.getClass(), "type", 14);
        setIntField(term3168739, term3168739.getClass(), "type", 14);
        setIntField(term3168809, term3168809.getClass(), "type", 14);
        setIntField(term3168879, term3168879.getClass(), "type", 14);
        setIntField(term3168949, term3168949.getClass(), "type", 14);
        setIntField(term3169019, term3169019.getClass(), "type", 144);
        setField(term3168949, term3168949.getClass(), "first", term3169019);
        setField(term3168879, term3168879.getClass(), "first", term3168949);
        setField(term3168809, term3168809.getClass(), "first", term3168879);
        setField(term3168739, term3168739.getClass(), "first", term3168809);
        setField(term3168669, term3168669.getClass(), "first", term3168739);
        setField(term3168599, term3168599.getClass(), "first", term3168669);
        setField(term3168529, term3168529.getClass(), "first", term3168599);
        setField(term3168459, term3168459.getClass(), "first", term3168529);
        setField(term3168319, term3168319.getClass(), "first", term3168459);
        setField(term3168249, term3168249.getClass(), "first", term3168319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term3168249;
        args[1] = null;
        callMethod(klass, "traverseAdd", argTypes, term3168179, args);
    }

};


