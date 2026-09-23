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

public class TypeInference_traverseAssign_1205191851156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50027;
     Object term50097;

    public TypeInference_traverseAssign_1205191851156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50027 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term50097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50167, term50167.getClass(), "type", -615654495);
        setField(term50167, term50167.getClass(), "propListHead", null);
        setIntField(term50237, term50237.getClass(), "type", 109);
        setField(term50167, term50167.getClass(), "next", term50237);
        setField(term50097, term50097.getClass(), "first", term50167);
        setField(term50097, term50097.getClass(), "last", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term50097;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term50027, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


