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

public class TypeCheck_process_10560252651590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502848;
     Object term503098;
     Object term503168;

    public TypeCheck_process_10560252651590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term502848 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term502954 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term503028 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term502848, term502848.getClass(), "scopeCreator", term502954);
        setField(term502848, term502848.getClass(), "topScope", term503028);
        term503098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term503168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term503168, term503168.getClass(), "parent", term503238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term503098;
        args[1] = term503168;
        try {
            callMethod(klass, "process", argTypes, term502848, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


