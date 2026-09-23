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
     Object term10914;
     Object term10984;
     Object term11194;

    public FunctionInjector_inlineReturnValue_211698033154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10914 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term10914, term10914.getClass(), "safeNameIdSupplier", null);
        term10984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11054 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term10984, term10984.getClass(), "parent", term10984);
        setField(term11054, term11054.getClass(), "next", term11124);
        setField(term10984, term10984.getClass(), "first", term11054);
        setIntField(term10984, term10984.getClass(), "type", 37);
        term11194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11194, term11194.getClass(), "last", term11264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10984;
        args[1] = term11194;
        callMethod(klass, "inlineReturnValue", argTypes, term10914, args);
    }

};


