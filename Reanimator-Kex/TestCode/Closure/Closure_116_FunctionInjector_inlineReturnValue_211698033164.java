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

public class FunctionInjector_inlineReturnValue_211698033164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13722;
     Object term13792;
     Object term13954;

    public FunctionInjector_inlineReturnValue_211698033164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13722 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term13722, term13722.getClass(), "safeNameIdSupplier", null);
        term13792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13884 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term13792, term13792.getClass(), "parent", term13792);
        setField(term13792, term13792.getClass(), "first", term13884);
        term13954 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13954, term13954.getClass(), "last", term14024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term13792;
        args[1] = term13954;
        callMethod(klass, "inlineReturnValue", argTypes, term13722, args);
    }

};


