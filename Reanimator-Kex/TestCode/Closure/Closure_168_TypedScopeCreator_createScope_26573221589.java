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

public class TypedScopeCreator_createScope_26573221589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54701;
     Object term54771;
     Object term54845;

    public TypedScopeCreator_createScope_26573221589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54701 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term54701, term54701.getClass(), "compiler", null);
        term54771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54771, term54771.getClass(), "jsType", null);
        setIntField(term54771, term54771.getClass(), "type", 0);
        setField(term54771, term54771.getClass(), "parent", null);
        setField(term54771, term54771.getClass(), "first", null);
        term54845 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term54955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term54845, term54845.getClass(), "rootNode", null);
        setField(term54845, term54845.getClass(), "thisType", term54955);
        setIntField(term54845, term54845.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term54771;
        args[1] = term54845;
        callMethod(klass, "createScope", argTypes, term54701, args);
    }

};


