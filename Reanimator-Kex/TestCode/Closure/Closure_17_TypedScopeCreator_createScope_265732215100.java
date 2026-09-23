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

public class TypedScopeCreator_createScope_265732215100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75093;
     Object term75163;
     Object term75347;

    public TypedScopeCreator_createScope_265732215100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75093 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term75163 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term75163, term75163.getClass(), "jsType", term75273);
        term75347 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term75347, term75347.getClass(), "rootNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term75163;
        args[1] = term75347;
        callMethod(klass, "createScope", argTypes, term75093, args);
    }

};


