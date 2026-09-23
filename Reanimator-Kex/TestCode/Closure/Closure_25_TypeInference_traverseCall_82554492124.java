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

public class TypeInference_traverseCall_82554492124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37888;
     Object term37958;

    public TypeInference_traverseCall_82554492124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37888 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term37958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term38028, term38028.getClass(), "type", 1935707624);
        setField(term38028, term38028.getClass(), "propListHead", null);
        setIntField(term38098, term38098.getClass(), "type", 105);
        setField(term38028, term38028.getClass(), "next", term38098);
        setField(term37958, term37958.getClass(), "first", term38028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term37958;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term37888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


