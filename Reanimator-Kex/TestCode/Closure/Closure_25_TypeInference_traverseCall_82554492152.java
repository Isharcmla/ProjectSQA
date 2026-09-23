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

public class TypeInference_traverseCall_82554492152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48956;
     Object term49026;

    public TypeInference_traverseCall_82554492152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48956 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term49026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49096, term49096.getClass(), "type", 1935707624);
        setField(term49096, term49096.getClass(), "propListHead", null);
        setIntField(term49166, term49166.getClass(), "type", 28);
        setField(term49096, term49096.getClass(), "next", term49166);
        setField(term49026, term49026.getClass(), "first", term49096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term49026;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term48956, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


