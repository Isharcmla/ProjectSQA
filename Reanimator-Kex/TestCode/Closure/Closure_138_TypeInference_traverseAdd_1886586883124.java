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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAdd_1886586883124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63098;
     Object term63168;

    public TypeInference_traverseAdd_1886586883124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63098 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term63168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63168, term63168.getClass(), "first", term63168);
        setField(term63168, term63168.getClass(), "next", term63238);
        setIntField(term63168, term63168.getClass(), "type", 91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term63168;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term63098, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


