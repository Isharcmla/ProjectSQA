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

public class TypedScopeCreator_createScope_265732215171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114862;
     Object term114932;
     Object term115352;

    public TypedScopeCreator_createScope_265732215171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114862 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term114862, term114862.getClass(), "compiler", null);
        term114932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115178 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term115278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term114932, term114932.getClass(), "jsType", null);
        setIntField(term114932, term114932.getClass(), "type", 0);
        setField(term115072, term115072.getClass(), "next", null);
        setIntField(term115072, term115072.getClass(), "type", 64);
        setField(term115072, term115072.getClass(), "first", null);
        setField(term115072, term115072.getClass(), "jsType", term115178);
        setField(term115002, term115002.getClass(), "next", term115072);
        setIntField(term115002, term115002.getClass(), "type", 64);
        setField(term115002, term115002.getClass(), "first", null);
        setField(term115002, term115002.getClass(), "jsType", term115278);
        setField(term114932, term114932.getClass(), "first", term115002);
        term115352 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term115352, term115352.getClass(), "rootNode", null);
        setField(term115352, term115352.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term114932;
        args[1] = term115352;
        try {
            callMethod(klass, "createScope", argTypes, term114862, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


