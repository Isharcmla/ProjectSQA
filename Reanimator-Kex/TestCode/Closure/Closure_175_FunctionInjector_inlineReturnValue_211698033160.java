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

public class FunctionInjector_inlineReturnValue_211698033160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12830;
     Object term12900;
     Object term13005;

    public FunctionInjector_inlineReturnValue_211698033160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12830 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term12830, term12830.getClass(), "safeNameIdSupplier", null);
        term12900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term13005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12900, term12900.getClass(), "parent", null);
        setField(term13005, term13005.getClass(), "last", null);
        setField(term13005, term13005.getClass(), "next", null);
        setField(term12900, term12900.getClass(), "first", term13005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12900;
        args[1] = term13005;
        callMethod(klass, "inlineReturnValue", argTypes, term12830, args);
    }

};


