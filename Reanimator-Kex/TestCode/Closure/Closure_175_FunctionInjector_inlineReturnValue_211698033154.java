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

public class FunctionInjector_inlineReturnValue_211698033154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11309;
     Object term11379;
     Object term11589;

    public FunctionInjector_inlineReturnValue_211698033154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11309 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term11309, term11309.getClass(), "safeNameIdSupplier", null);
        term11379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11379, term11379.getClass(), "parent", term11379);
        setField(term11449, term11449.getClass(), "next", term11519);
        setField(term11379, term11379.getClass(), "first", term11449);
        setIntField(term11379, term11379.getClass(), "type", 37);
        term11589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11589, term11589.getClass(), "last", term11659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term11379;
        args[1] = term11589;
        callMethod(klass, "inlineReturnValue", argTypes, term11309, args);
    }

};


