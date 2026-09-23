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
     Object term66237;
     Object term66307;

    public TypeInference_traverseHook_73608969115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66237 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term66307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66377, term66377.getClass(), "next", term66447);
        setIntField(term66377, term66377.getClass(), "type", 8);
        setField(term66307, term66307.getClass(), "first", term66377);
        setField(term66307, term66307.getClass(), "last", term66517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term66307;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term66237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


