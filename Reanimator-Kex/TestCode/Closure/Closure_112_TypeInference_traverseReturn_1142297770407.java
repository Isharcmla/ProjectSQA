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

public class TypeInference_traverseReturn_1142297770407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169821;
     Object term1169891;

    public TypeInference_traverseReturn_1142297770407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1169821 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1169891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1169961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1170031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1169961, term1169961.getClass(), "type", 110);
        setIntField(term1170031, term1170031.getClass(), "type", 82);
        setField(term1169961, term1169961.getClass(), "first", term1170031);
        setField(term1169891, term1169891.getClass(), "first", term1169961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1169891;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1169821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


