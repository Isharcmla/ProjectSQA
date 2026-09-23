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

public class TypeInference_traverseReturn_1142297770148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79054;
     Object term79124;

    public TypeInference_traverseReturn_1142297770148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79054 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term79124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term79194, term79194.getClass(), "type", -344842608);
        setIntField(term79264, term79264.getClass(), "type", 154);
        setField(term79194, term79194.getClass(), "next", term79264);
        setField(term79124, term79124.getClass(), "first", term79194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term79124;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term79054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


