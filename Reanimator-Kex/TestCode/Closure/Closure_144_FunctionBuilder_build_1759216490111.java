package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionBuilder_build_1759216490111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81056;

    public FunctionBuilder_build_1759216490111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term81160 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term81268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81056, term81056.getClass(), "registry", term81160);
        setField(term81056, term81056.getClass(), "name", "");
        setField(term81056, term81056.getClass(), "sourceNode", term81268);
        setField(term81056, term81056.getClass(), "parametersNode", null);
        setField(term81056, term81056.getClass(), "returnType", null);
        setBooleanField(term81056, term81056.getClass(), "inferredReturnType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term81056, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


