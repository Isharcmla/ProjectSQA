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

public class TypedScopeCreator_createScope_265732215113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66414;
     Object term66484;
     Object term66838;

    public TypedScopeCreator_createScope_265732215113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66414 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term66414, term66414.getClass(), "compiler", null);
        term66484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term66484, term66484.getClass(), "jsType", null);
        setIntField(term66484, term66484.getClass(), "type", 0);
        setField(term66484, term66484.getClass(), "parent", null);
        setField(term66694, term66694.getClass(), "next", null);
        setIntField(term66694, term66694.getClass(), "type", 122);
        setField(term66694, term66694.getClass(), "first", null);
        setField(term66624, term66624.getClass(), "next", term66694);
        setIntField(term66624, term66624.getClass(), "type", 33);
        setField(term66624, term66624.getClass(), "first", null);
        setField(term66624, term66624.getClass(), "parent", null);
        setField(term66554, term66554.getClass(), "next", term66624);
        setIntField(term66554, term66554.getClass(), "type", 0);
        setField(term66764, term66764.getClass(), "next", null);
        setIntField(term66764, term66764.getClass(), "type", 0);
        setField(term66764, term66764.getClass(), "first", null);
        setField(term66764, term66764.getClass(), "parent", null);
        setField(term66554, term66554.getClass(), "first", term66764);
        setField(term66554, term66554.getClass(), "parent", null);
        setField(term66484, term66484.getClass(), "first", term66554);
        term66838 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term66908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term66838, term66838.getClass(), "rootNode", term66908);
        setField(term66838, term66838.getClass(), "thisType", term67020);
        setIntField(term66838, term66838.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term66484;
        args[1] = term66838;
        try {
            callMethod(klass, "createScope", argTypes, term66414, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


