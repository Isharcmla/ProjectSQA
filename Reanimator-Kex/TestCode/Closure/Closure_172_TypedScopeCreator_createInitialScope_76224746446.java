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

public class TypedScopeCreator_createInitialScope_76224746446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13186;
     Object term13440;

    public TypedScopeCreator_createInitialScope_76224746446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13186 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term13266 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term13370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term13186, term13186.getClass(), "compiler", term13266);
        setField(term13186, term13186.getClass(), "typeRegistry", term13370);
        term13440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13440, term13440.getClass(), "type", -133);
        setField(term13440, term13440.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13440;
        try {
            callMethod(klass, "createInitialScope", argTypes, term13186, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


