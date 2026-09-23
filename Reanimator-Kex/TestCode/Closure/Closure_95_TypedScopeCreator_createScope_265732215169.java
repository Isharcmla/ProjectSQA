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

public class TypedScopeCreator_createScope_265732215169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124941;
     Object term125011;
     Object term125365;

    public TypedScopeCreator_createScope_265732215169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124941 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term124941, term124941.getClass(), "compiler", null);
        term125011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term125011, term125011.getClass(), "jsType", null);
        setIntField(term125011, term125011.getClass(), "type", 0);
        setField(term125151, term125151.getClass(), "next", term125221);
        setIntField(term125151, term125151.getClass(), "type", 47);
        setField(term125151, term125151.getClass(), "first", null);
        setField(term125081, term125081.getClass(), "next", term125151);
        setIntField(term125081, term125081.getClass(), "type", 0);
        setField(term125291, term125291.getClass(), "next", null);
        setIntField(term125291, term125291.getClass(), "type", 0);
        setField(term125291, term125291.getClass(), "first", null);
        setField(term125081, term125081.getClass(), "first", term125291);
        setField(term125011, term125011.getClass(), "first", term125081);
        term125365 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term125365, term125365.getClass(), "rootNode", null);
        setField(term125365, term125365.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term125011;
        args[1] = term125365;
        try {
            callMethod(klass, "createScope", argTypes, term124941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


