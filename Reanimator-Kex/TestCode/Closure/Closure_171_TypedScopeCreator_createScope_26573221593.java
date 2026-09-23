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

public class TypedScopeCreator_createScope_26573221593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39288;
     Object term39358;
     Object term39432;

    public TypedScopeCreator_createScope_26573221593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39288 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term39288, term39288.getClass(), "compiler", null);
        term39358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39358, term39358.getClass(), "type", -133);
        setField(term39358, term39358.getClass(), "parent", null);
        term39432 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term39432, term39432.getClass(), "rootNode", null);
        setIntField(term39432, term39432.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term39358;
        args[1] = term39432;
        callMethod(klass, "createScope", argTypes, term39288, args);
    }

};


