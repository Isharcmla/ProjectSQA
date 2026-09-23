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

public class TypedScopeCreator_createScope_265732215113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79706;
     Object term79856;
     Object term80070;

    public TypedScopeCreator_createScope_265732215113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79706 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term79786 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term79706, term79706.getClass(), "compiler", term79786);
        term79856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term79856, term79856.getClass(), "jsType", null);
        setIntField(term79856, term79856.getClass(), "type", 0);
        setField(term79856, term79856.getClass(), "parent", null);
        setField(term79926, term79926.getClass(), "next", null);
        setIntField(term79926, term79926.getClass(), "type", 122);
        setField(term79996, term79996.getClass(), "next", null);
        setIntField(term79996, term79996.getClass(), "type", 0);
        setField(term79996, term79996.getClass(), "first", null);
        setField(term79926, term79926.getClass(), "first", term79996);
        setField(term79856, term79856.getClass(), "first", term79926);
        term80070 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term80070, term80070.getClass(), "rootNode", null);
        setField(term80070, term80070.getClass(), "thisType", null);
        setIntField(term80070, term80070.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term79856;
        args[1] = term80070;
        try {
            callMethod(klass, "createScope", argTypes, term79706, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


