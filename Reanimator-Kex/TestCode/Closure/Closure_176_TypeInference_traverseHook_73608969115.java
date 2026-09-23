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

public class TypeInference_traverseHook_73608969115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66964;
     Object term67034;

    public TypeInference_traverseHook_73608969115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term67034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67174 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67244 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67104, term67104.getClass(), "next", term67174);
        setIntField(term67104, term67104.getClass(), "type", 8);
        setField(term67034, term67034.getClass(), "first", term67104);
        setField(term67034, term67034.getClass(), "last", term67244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term67034;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term66964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


