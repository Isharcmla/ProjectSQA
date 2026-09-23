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

public class TypeInference_traverseWithinShortCircuitingBinOp_342908577104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55073;
     Object term55143;

    public TypeInference_traverseWithinShortCircuitingBinOp_342908577104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55073 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term55143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55143, term55143.getClass(), "type", 16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term55143;
        args[1] = null;
        try {
            callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term55073, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


