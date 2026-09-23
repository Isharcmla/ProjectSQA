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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FunctionInjector_inlineReturnValue_211698033171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15600;
     Object term15670;
     Object term15775;

    public FunctionInjector_inlineReturnValue_211698033171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15600 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term15600, term15600.getClass(), "safeNameIdSupplier", null);
        term15670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term15775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15670, term15670.getClass(), "parent", null);
        setField(term15775, term15775.getClass(), "last", null);
        setField(term15775, term15775.getClass(), "next", null);
        setField(term15670, term15670.getClass(), "first", term15775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term15670;
        args[1] = term15775;
        callMethod(klass, "inlineReturnValue", argTypes, term15600, args);
    }

};


