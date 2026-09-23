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

public class TypeInference_traverseWithinShortCircuitingBinOp_1208988484596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1984693;
     Object term1984763;

    public TypeInference_traverseWithinShortCircuitingBinOp_1208988484596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1984693 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1984763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1984763, term1984763.getClass(), "type", 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1984763;
        args[1] = null;
        try {
            callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term1984693, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


