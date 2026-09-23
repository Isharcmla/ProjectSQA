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

public class TypedScopeCreator_createScope_265732215116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69880;
     Object term69950;
     Object term70304;

    public TypedScopeCreator_createScope_265732215116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69880 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term69880, term69880.getClass(), "compiler", null);
        term69950 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70160 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69950, term69950.getClass(), "jsType", null);
        setIntField(term69950, term69950.getClass(), "type", 0);
        setField(term69950, term69950.getClass(), "parent", null);
        setField(term70160, term70160.getClass(), "next", null);
        setIntField(term70160, term70160.getClass(), "type", 39);
        setField(term70160, term70160.getClass(), "first", null);
        setField(term70090, term70090.getClass(), "next", term70160);
        setIntField(term70090, term70090.getClass(), "type", 33);
        setField(term70090, term70090.getClass(), "first", null);
        setField(term70090, term70090.getClass(), "parent", null);
        setField(term70020, term70020.getClass(), "next", term70090);
        setIntField(term70020, term70020.getClass(), "type", 0);
        setField(term70230, term70230.getClass(), "next", null);
        setIntField(term70230, term70230.getClass(), "type", 0);
        setField(term70230, term70230.getClass(), "first", null);
        setField(term70230, term70230.getClass(), "parent", null);
        setField(term70020, term70020.getClass(), "first", term70230);
        setField(term70020, term70020.getClass(), "parent", null);
        setField(term69950, term69950.getClass(), "first", term70020);
        term70304 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term70374 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70478 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term70304, term70304.getClass(), "rootNode", term70374);
        setField(term70304, term70304.getClass(), "thisType", term70478);
        setIntField(term70304, term70304.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term69950;
        args[1] = term70304;
        callMethod(klass, "createScope", argTypes, term69880, args);
    }

};


