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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22686;
     Object term22836;
     Object term22980;

    public TypedScopeCreator_createScope_26573221547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22686 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term22766 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term22686, term22686.getClass(), "compiler", term22766);
        term22836 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22836, term22836.getClass(), "jsType", null);
        setIntField(term22836, term22836.getClass(), "type", 0);
        setField(term22906, term22906.getClass(), "next", null);
        setIntField(term22906, term22906.getClass(), "type", 43);
        setField(term22906, term22906.getClass(), "first", null);
        setField(term22836, term22836.getClass(), "first", term22906);
        term22980 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term22980, term22980.getClass(), "rootNode", null);
        setField(term22980, term22980.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term22836;
        args[1] = term22980;
        try {
            callMethod(klass, "createScope", argTypes, term22686, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


