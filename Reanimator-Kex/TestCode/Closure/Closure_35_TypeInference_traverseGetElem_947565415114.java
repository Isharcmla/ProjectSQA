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

public class TypeInference_traverseGetElem_947565415114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33247;
     Object term33317;

    public TypeInference_traverseGetElem_947565415114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33247 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term33317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33457 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33387, term33387.getClass(), "type", -1792504217);
        setField(term33387, term33387.getClass(), "propListHead", null);
        setIntField(term33457, term33457.getClass(), "type", 80);
        setField(term33387, term33387.getClass(), "next", term33457);
        setField(term33317, term33317.getClass(), "first", term33387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term33317;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term33247, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


