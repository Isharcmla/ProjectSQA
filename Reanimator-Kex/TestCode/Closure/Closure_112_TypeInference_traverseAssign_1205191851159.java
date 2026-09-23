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

public class TypeInference_traverseAssign_1205191851159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81214;
     Object term81284;

    public TypeInference_traverseAssign_1205191851159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81214 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term81284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term81354, term81354.getClass(), "type", 146);
        setField(term81284, term81284.getClass(), "first", term81354);
        setField(term81284, term81284.getClass(), "last", term81424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term81284;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term81214, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


