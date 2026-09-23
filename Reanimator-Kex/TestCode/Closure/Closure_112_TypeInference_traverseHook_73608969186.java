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

public class TypeInference_traverseHook_73608969186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90983;
     Object term91053;

    public TypeInference_traverseHook_73608969186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90983 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term91053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91123, term91123.getClass(), "next", term91193);
        setIntField(term91123, term91123.getClass(), "type", 56);
        setField(term91053, term91053.getClass(), "first", term91123);
        setField(term91053, term91053.getClass(), "last", term91263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term91053;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term90983, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


