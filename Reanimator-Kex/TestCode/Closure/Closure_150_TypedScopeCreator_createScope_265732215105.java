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

public class TypedScopeCreator_createScope_265732215105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64466;
     Object term64536;
     Object term64610;

    public TypedScopeCreator_createScope_265732215105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64466 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term64466, term64466.getClass(), "compiler", null);
        term64536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64536, term64536.getClass(), "jsType", null);
        setIntField(term64536, term64536.getClass(), "type", 0);
        setField(term64536, term64536.getClass(), "first", null);
        term64610 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term64610, term64610.getClass(), "rootNode", null);
        setField(term64610, term64610.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term64536;
        args[1] = term64610;
        try {
            callMethod(klass, "createScope", argTypes, term64466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


