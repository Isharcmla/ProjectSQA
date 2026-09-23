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

public class TypeInference_traverseHook_73608969286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535501;
     Object term535571;

    public TypeInference_traverseHook_73608969286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term535501 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term535571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term535641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term535711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term535781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term535641, term535641.getClass(), "next", term535711);
        setIntField(term535641, term535641.getClass(), "type", 46);
        setField(term535571, term535571.getClass(), "first", term535641);
        setField(term535571, term535571.getClass(), "last", term535781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term535571;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term535501, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


