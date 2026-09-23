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

public class TypeInference_traverseHook_73608969423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1645653;
     Object term1645723;

    public TypeInference_traverseHook_73608969423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1645653 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1645723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1645793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1645863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1645933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1645793, term1645793.getClass(), "next", term1645863);
        setIntField(term1645793, term1645793.getClass(), "type", 77);
        setField(term1645723, term1645723.getClass(), "first", term1645793);
        setField(term1645723, term1645723.getClass(), "last", term1645933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1645723;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term1645653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


