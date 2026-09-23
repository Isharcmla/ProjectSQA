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

public class TypeInference_traverseReturn_94528842227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300969;
     Object term301039;

    public TypeInference_traverseReturn_94528842227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term300969 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term301039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301809 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301879 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term302229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term301109, term301109.getClass(), "type", 9);
        setIntField(term301179, term301179.getClass(), "type", 9);
        setIntField(term301249, term301249.getClass(), "type", 9);
        setIntField(term301319, term301319.getClass(), "type", 9);
        setIntField(term301389, term301389.getClass(), "type", 9);
        setIntField(term301459, term301459.getClass(), "type", 9);
        setIntField(term301529, term301529.getClass(), "type", 9);
        setIntField(term301599, term301599.getClass(), "type", 9);
        setIntField(term301669, term301669.getClass(), "type", 9);
        setIntField(term301739, term301739.getClass(), "type", 9);
        setIntField(term301809, term301809.getClass(), "type", 9);
        setIntField(term301879, term301879.getClass(), "type", 9);
        setIntField(term301949, term301949.getClass(), "type", 9);
        setIntField(term302019, term302019.getClass(), "type", 9);
        setIntField(term302089, term302089.getClass(), "type", 9);
        setIntField(term302159, term302159.getClass(), "type", 9);
        setIntField(term302229, term302229.getClass(), "type", 80);
        setField(term302159, term302159.getClass(), "first", term302229);
        setField(term302089, term302089.getClass(), "first", term302159);
        setField(term302019, term302019.getClass(), "first", term302089);
        setField(term301949, term301949.getClass(), "first", term302019);
        setField(term301879, term301879.getClass(), "first", term301949);
        setField(term301809, term301809.getClass(), "first", term301879);
        setField(term301739, term301739.getClass(), "first", term301809);
        setField(term301669, term301669.getClass(), "first", term301739);
        setField(term301599, term301599.getClass(), "first", term301669);
        setField(term301529, term301529.getClass(), "first", term301599);
        setField(term301459, term301459.getClass(), "first", term301529);
        setField(term301389, term301389.getClass(), "first", term301459);
        setField(term301319, term301319.getClass(), "first", term301389);
        setField(term301249, term301249.getClass(), "first", term301319);
        setField(term301179, term301179.getClass(), "first", term301249);
        setField(term301109, term301109.getClass(), "first", term301179);
        setField(term301039, term301039.getClass(), "first", term301109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term301039;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term300969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


