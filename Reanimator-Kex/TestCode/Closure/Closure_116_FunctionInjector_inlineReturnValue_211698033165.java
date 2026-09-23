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
import java.lang.Object;

public class FunctionInjector_inlineReturnValue_211698033165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14181;
     Object term14251;
     Object term14461;

    public FunctionInjector_inlineReturnValue_211698033165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14181 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term14181, term14181.getClass(), "safeNameIdSupplier", null);
        term14251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14391 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14251, term14251.getClass(), "parent", term14251);
        setField(term14321, term14321.getClass(), "next", term14391);
        setField(term14251, term14251.getClass(), "first", term14321);
        setIntField(term14251, term14251.getClass(), "type", 37);
        term14461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14461, term14461.getClass(), "last", term14531);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term14251;
        args[1] = term14461;
        callMethod(klass, "inlineReturnValue", argTypes, term14181, args);
    }

};


