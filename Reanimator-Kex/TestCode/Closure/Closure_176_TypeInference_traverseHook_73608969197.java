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

public class TypeInference_traverseHook_73608969197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92630;
     Object term92700;

    public TypeInference_traverseHook_73608969197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92630 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term92700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term92910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term92770, term92770.getClass(), "next", term92840);
        setIntField(term92770, term92770.getClass(), "type", 98);
        setField(term92700, term92700.getClass(), "first", term92770);
        setField(term92700, term92700.getClass(), "last", term92910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term92700;
        args[1] = null;
        try {
            callMethod(klass, "traverseHook", argTypes, term92630, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


