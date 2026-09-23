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

public class TypeInference_traverseReturn_9452884299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30357;
     Object term30427;

    public TypeInference_traverseReturn_9452884299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30357 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term30427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30497, term30497.getClass(), "type", 972867650);
        setField(term30497, term30497.getClass(), "propListHead", null);
        setIntField(term30567, term30567.getClass(), "type", 77);
        setField(term30497, term30497.getClass(), "next", term30567);
        setField(term30427, term30427.getClass(), "first", term30497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term30427;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term30357, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


