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

public class TypedScopeCreator_createScope_26573221542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15588;
     Object term15738;
     Object term16092;

    public TypedScopeCreator_createScope_26573221542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15588 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term15668 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15588, term15588.getClass(), "compiler", term15668);
        term15738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16018 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15738, term15738.getClass(), "jsType", null);
        setIntField(term15738, term15738.getClass(), "type", 0);
        setField(term15738, term15738.getClass(), "parent", null);
        setField(term15878, term15878.getClass(), "next", term15948);
        setIntField(term15878, term15878.getClass(), "type", 0);
        setField(term15878, term15878.getClass(), "first", null);
        setField(term15808, term15808.getClass(), "next", term15878);
        setIntField(term15808, term15808.getClass(), "type", 0);
        setField(term16018, term16018.getClass(), "next", null);
        setIntField(term16018, term16018.getClass(), "type", 0);
        setField(term16018, term16018.getClass(), "first", null);
        setField(term16018, term16018.getClass(), "parent", null);
        setField(term15808, term15808.getClass(), "first", term16018);
        setField(term15808, term15808.getClass(), "parent", null);
        setField(term15738, term15738.getClass(), "first", term15808);
        term16092 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term16092, term16092.getClass(), "rootNode", null);
        setField(term16092, term16092.getClass(), "thisType", null);
        setIntField(term16092, term16092.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term15738;
        args[1] = term16092;
        try {
            callMethod(klass, "createScope", argTypes, term15588, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


