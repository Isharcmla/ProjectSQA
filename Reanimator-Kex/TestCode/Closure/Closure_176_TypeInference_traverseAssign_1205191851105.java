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

public class TypeInference_traverseAssign_1205191851105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64432;
     Object term64502;

    public TypeInference_traverseAssign_1205191851105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64432 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term64502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term64572, term64572.getClass(), "type", 100);
        setField(term64502, term64502.getClass(), "first", term64572);
        setField(term64502, term64502.getClass(), "last", term64642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term64502;
        args[1] = null;
        try {
            callMethod(klass, "traverseAssign", argTypes, term64432, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


