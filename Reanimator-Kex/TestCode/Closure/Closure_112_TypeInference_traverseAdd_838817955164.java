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

public class TypeInference_traverseAdd_838817955164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85695;
     Object term85765;

    public TypeInference_traverseAdd_838817955164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85695 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term85765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85835 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term85765, term85765.getClass(), "first", term85765);
        setIntField(term85835, term85835.getClass(), "type", 94);
        setField(term85765, term85765.getClass(), "next", term85835);
        setIntField(term85765, term85765.getClass(), "type", 1045547089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term85765;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term85695, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


