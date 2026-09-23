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

public class TypeInference_traverseReturn_1142297770380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term960249;
     Object term960319;

    public TypeInference_traverseReturn_1142297770380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term960249 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term960319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term960949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term961019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term960389, term960389.getClass(), "type", 29);
        setIntField(term960459, term960459.getClass(), "type", 29);
        setIntField(term960529, term960529.getClass(), "type", 29);
        setIntField(term960599, term960599.getClass(), "type", 29);
        setIntField(term960669, term960669.getClass(), "type", 29);
        setIntField(term960739, term960739.getClass(), "type", 29);
        setIntField(term960809, term960809.getClass(), "type", 29);
        setIntField(term960879, term960879.getClass(), "type", 29);
        setIntField(term960949, term960949.getClass(), "type", 29);
        setIntField(term961019, term961019.getClass(), "type", 67);
        setField(term960949, term960949.getClass(), "first", term961019);
        setField(term960879, term960879.getClass(), "first", term960949);
        setField(term960809, term960809.getClass(), "first", term960879);
        setField(term960739, term960739.getClass(), "first", term960809);
        setField(term960669, term960669.getClass(), "first", term960739);
        setField(term960599, term960599.getClass(), "first", term960669);
        setField(term960529, term960529.getClass(), "first", term960599);
        setField(term960459, term960459.getClass(), "first", term960529);
        setField(term960389, term960389.getClass(), "first", term960459);
        setField(term960319, term960319.getClass(), "first", term960389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term960319;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term960249, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


