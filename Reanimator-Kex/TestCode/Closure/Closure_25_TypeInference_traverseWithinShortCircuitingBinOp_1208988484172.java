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

public class TypeInference_traverseWithinShortCircuitingBinOp_1208988484172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54091;
     Object term54161;

    public TypeInference_traverseWithinShortCircuitingBinOp_1208988484172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54091 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term54161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54271 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term54161, term54161.getClass(), "type", -27944011);
        setField(term54161, term54161.getClass(), "propListHead", null);
        setField(term54161, term54161.getClass(), "jsType", term54271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term54161;
        args[1] = null;
        try {
            callMethod(klass, "traverseWithinShortCircuitingBinOp", argTypes, term54091, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


