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

public class TypedScopeCreator_createScope_26573221557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28871;
     Object term28941;
     Object term29085;

    public TypedScopeCreator_createScope_26573221557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28871 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term28871, term28871.getClass(), "compiler", null);
        term28941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28941, term28941.getClass(), "jsType", null);
        setIntField(term28941, term28941.getClass(), "type", 0);
        setField(term28941, term28941.getClass(), "parent", null);
        setField(term29011, term29011.getClass(), "next", null);
        setIntField(term29011, term29011.getClass(), "type", 126);
        setField(term28941, term28941.getClass(), "first", term29011);
        term29085 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term29155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term29085, term29085.getClass(), "rootNode", term29155);
        setField(term29085, term29085.getClass(), "thisType", null);
        setIntField(term29085, term29085.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term28941;
        args[1] = term29085;
        try {
            callMethod(klass, "createScope", argTypes, term28871, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


