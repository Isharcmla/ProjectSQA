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

public class TypeInference_traverseHook_73608969172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83932;
     Object term84002;

    public TypeInference_traverseHook_73608969172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83932 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term84002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84142 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term84072, term84072.getClass(), "next", term84142);
        setIntField(term84072, term84072.getClass(), "type", 113);
        setField(term84002, term84002.getClass(), "first", term84072);
        setField(term84002, term84002.getClass(), "last", term84212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term84002;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term83932, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


