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

public class FunctionInjector_inlineReturnValue_211698033157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12140;
     Object term12210;
     Object term12372;

    public FunctionInjector_inlineReturnValue_211698033157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12140 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term12140, term12140.getClass(), "safeNameIdSupplier", null);
        term12210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12302 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term12210, term12210.getClass(), "parent", term12210);
        setField(term12210, term12210.getClass(), "first", term12302);
        term12372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12372, term12372.getClass(), "last", term12442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12210;
        args[1] = term12372;
        callMethod(klass, "inlineReturnValue", argTypes, term12140, args);
    }

};


