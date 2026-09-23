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

public class FunctionBuilder_build_1759216490209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142785;

    public FunctionBuilder_build_1759216490209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder"));
        Object term142893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term142785, term142785.getClass(), "registry", null);
        setField(term142785, term142785.getClass(), "name", "");
        setField(term142785, term142785.getClass(), "sourceNode", null);
        setField(term142785, term142785.getClass(), "parametersNode", term142893);
        setField(term142785, term142785.getClass(), "returnType", null);
        setBooleanField(term142785, term142785.getClass(), "inferredReturnType", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "build", argTypes, term142785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


