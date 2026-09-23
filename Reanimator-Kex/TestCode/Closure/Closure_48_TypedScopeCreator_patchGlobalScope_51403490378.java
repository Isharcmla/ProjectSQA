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

public class TypedScopeCreator_patchGlobalScope_51403490378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45266;
     Object term45340;
     Object term45410;

    public TypedScopeCreator_patchGlobalScope_51403490378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45266 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        term45340 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term45340, term45340.getClass(), "parent", null);
        term45410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45410, term45410.getClass(), "type", 132);
        setField(term45410, term45410.getClass(), "propListHead", null);
        setField(term45410, term45410.getClass(), "parent", term45410);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term45340;
        args[1] = term45410;
        callMethod(klass, "patchGlobalScope", argTypes, term45266, args);
    }

};


