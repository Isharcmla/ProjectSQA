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

public class TypedScopeCreator_createScope_26573221546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18658;
     Object term18728;
     Object term19012;

    public TypedScopeCreator_createScope_26573221546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18658 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term18658, term18658.getClass(), "compiler", null);
        term18728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18728, term18728.getClass(), "jsType", null);
        setIntField(term18728, term18728.getClass(), "type", 0);
        setField(term18728, term18728.getClass(), "parent", null);
        setField(term18798, term18798.getClass(), "next", term18868);
        setIntField(term18798, term18798.getClass(), "type", 44);
        setField(term18938, term18938.getClass(), "next", null);
        setIntField(term18938, term18938.getClass(), "type", 0);
        setField(term18938, term18938.getClass(), "first", null);
        setField(term18938, term18938.getClass(), "parent", null);
        setField(term18798, term18798.getClass(), "first", term18938);
        setField(term18728, term18728.getClass(), "first", term18798);
        term19012 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term19082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19012, term19012.getClass(), "rootNode", term19082);
        setField(term19012, term19012.getClass(), "thisType", null);
        setIntField(term19012, term19012.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term18728;
        args[1] = term19012;
        try {
            callMethod(klass, "createScope", argTypes, term18658, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


