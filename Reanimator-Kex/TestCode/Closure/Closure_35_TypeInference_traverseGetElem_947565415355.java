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

public class TypeInference_traverseGetElem_947565415355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078069;
     Object term1078139;

    public TypeInference_traverseGetElem_947565415355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1078069 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1078139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078419 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078489 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1078979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1079189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1078209, term1078209.getClass(), "type", 21);
        setField(term1078279, term1078279.getClass(), "next", term1078349);
        setIntField(term1078279, term1078279.getClass(), "type", 21);
        setField(term1078419, term1078419.getClass(), "next", term1078489);
        setIntField(term1078419, term1078419.getClass(), "type", 21);
        setField(term1078559, term1078559.getClass(), "next", term1078629);
        setIntField(term1078559, term1078559.getClass(), "type", 21);
        setField(term1078699, term1078699.getClass(), "next", term1078769);
        setIntField(term1078699, term1078699.getClass(), "type", 21);
        setField(term1078839, term1078839.getClass(), "next", term1078909);
        setIntField(term1078839, term1078839.getClass(), "type", 21);
        setField(term1078979, term1078979.getClass(), "next", term1079049);
        setIntField(term1078979, term1078979.getClass(), "type", 21);
        setField(term1079119, term1079119.getClass(), "next", term1079189);
        setIntField(term1079119, term1079119.getClass(), "type", 126);
        setField(term1078979, term1078979.getClass(), "first", term1079119);
        setField(term1078839, term1078839.getClass(), "first", term1078979);
        setField(term1078699, term1078699.getClass(), "first", term1078839);
        setField(term1078559, term1078559.getClass(), "first", term1078699);
        setField(term1078419, term1078419.getClass(), "first", term1078559);
        setField(term1078279, term1078279.getClass(), "first", term1078419);
        setField(term1078209, term1078209.getClass(), "first", term1078279);
        setField(term1078139, term1078139.getClass(), "first", term1078209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1078139;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term1078069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


