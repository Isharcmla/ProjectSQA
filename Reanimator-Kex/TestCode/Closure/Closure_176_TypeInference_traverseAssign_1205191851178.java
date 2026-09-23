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

public class TypeInference_traverseAssign_1205191851178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88501;
     Object term88571;

    public TypeInference_traverseAssign_1205191851178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88501 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term88571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88641, term88641.getClass(), "type", 101);
        setField(term88571, term88571.getClass(), "first", term88641);
        setField(term88571, term88571.getClass(), "last", term88711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term88571;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term88501, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


