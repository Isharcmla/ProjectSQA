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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43839;
     Object term44005;
     Object term44079;

    public TypedScopeCreator_createScope_26573221589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43839 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term43919 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term43839, term43839.getClass(), "compiler", term43919);
        term44005 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term44005, term44005.getClass(), "jsType", null);
        term44079 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term44149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44079, term44079.getClass(), "rootNode", term44149);
        setField(term44079, term44079.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term44005;
        args[1] = term44079;
        try {
            callMethod(klass, "createScope", argTypes, term43839, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


