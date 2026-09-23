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

public class TypedScopeCreator_createScope_26573221551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24923;
     Object term24993;
     Object term25277;

    public TypedScopeCreator_createScope_26573221551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24923 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term24923, term24923.getClass(), "compiler", null);
        term24993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term24993, term24993.getClass(), "jsType", null);
        setIntField(term24993, term24993.getClass(), "type", 0);
        setField(term24993, term24993.getClass(), "parent", null);
        setField(term25063, term25063.getClass(), "next", null);
        setIntField(term25063, term25063.getClass(), "type", 0);
        setField(term25133, term25133.getClass(), "next", term25203);
        setIntField(term25133, term25133.getClass(), "type", 37);
        setField(term25133, term25133.getClass(), "first", null);
        setField(term25063, term25063.getClass(), "first", term25133);
        setField(term24993, term24993.getClass(), "first", term25063);
        term25277 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term25347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term25277, term25277.getClass(), "rootNode", term25347);
        setField(term25277, term25277.getClass(), "thisType", term25447);
        setIntField(term25277, term25277.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term24993;
        args[1] = term25277;
        try {
            callMethod(klass, "createScope", argTypes, term24923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


