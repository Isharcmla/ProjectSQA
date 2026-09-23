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
     Object term11159;
     Object term11229;
     Object term11553;

    public FunctionInjector_inlineReturnValue_211698033154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11159 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term11159, term11159.getClass(), "safeNameIdSupplier", null);
        term11229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11391 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term11483 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term11229, term11229.getClass(), "parent", term11299);
        setField(term11391, term11391.getClass(), "next", term11483);
        setField(term11229, term11229.getClass(), "first", term11391);
        setIntField(term11229, term11229.getClass(), "type", 0);
        setField(term11229, term11229.getClass(), "propListHead", null);
        setIntField(term11229, term11229.getClass(), "sourcePosition", 16);
        term11553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11553, term11553.getClass(), "last", term11623);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term11229;
        args[1] = term11553;
        callMethod(klass, "inlineReturnValue", argTypes, term11159, args);
    }

};


