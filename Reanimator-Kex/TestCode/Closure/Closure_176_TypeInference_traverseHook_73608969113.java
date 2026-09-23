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

public class TypeInference_traverseHook_73608969113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66184;
     Object term66254;

    public TypeInference_traverseHook_73608969113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66184 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term66254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66324, term66324.getClass(), "next", term66394);
        setIntField(term66324, term66324.getClass(), "type", 90);
        setField(term66254, term66254.getClass(), "first", term66324);
        setField(term66254, term66254.getClass(), "last", term66464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term66254;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term66184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


