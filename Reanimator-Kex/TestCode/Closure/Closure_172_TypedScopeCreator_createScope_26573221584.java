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

public class TypedScopeCreator_createScope_26573221584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33262;
     Object term33434;
     Object term33600;

    public TypedScopeCreator_createScope_26573221584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33262 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term33342 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term33262, term33262.getClass(), "compiler", term33342);
        term33434 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term33526 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term33434, term33434.getClass(), "type", -133);
        setField(term33434, term33434.getClass(), "parent", term33526);
        term33600 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term33670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33600, term33600.getClass(), "rootNode", term33670);
        setIntField(term33600, term33600.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term33434;
        args[1] = term33600;
        callMethod(klass, "createScope", argTypes, term33262, args);
    }

};


