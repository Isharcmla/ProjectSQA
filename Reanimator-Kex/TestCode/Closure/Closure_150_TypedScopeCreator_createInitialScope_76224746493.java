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

public class TypedScopeCreator_createInitialScope_76224746493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56147;
     Object term56321;

    public TypedScopeCreator_createInitialScope_76224746493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56147 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term56251 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term56147, term56147.getClass(), "compiler", null);
        setField(term56147, term56147.getClass(), "typeRegistry", term56251);
        term56321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56321, term56321.getClass(), "type", 0);
        setField(term56321, term56321.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56321;
        try {
            callMethod(klass, "createInitialScope", argTypes, term56147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


