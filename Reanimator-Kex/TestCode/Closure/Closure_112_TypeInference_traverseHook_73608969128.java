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

public class TypeInference_traverseHook_73608969128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71804;
     Object term71874;

    public TypeInference_traverseHook_73608969128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71804 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term71874 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term71944, term71944.getClass(), "next", term72014);
        setIntField(term71944, term71944.getClass(), "type", 130);
        setField(term71874, term71874.getClass(), "first", term71944);
        setField(term71874, term71874.getClass(), "last", term72084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term71874;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term71804, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


