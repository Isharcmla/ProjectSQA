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

public class TypedScopeCreator_createScope_26573221557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16015;
     Object term16085;
     Object term16229;

    public TypedScopeCreator_createScope_26573221557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16015 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term16015, term16015.getClass(), "compiler", null);
        term16085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16085, term16085.getClass(), "jsType", null);
        setIntField(term16085, term16085.getClass(), "type", 0);
        setField(term16155, term16155.getClass(), "next", null);
        setIntField(term16155, term16155.getClass(), "type", 39);
        setField(term16155, term16155.getClass(), "first", null);
        setField(term16085, term16085.getClass(), "first", term16155);
        term16229 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term16299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term16229, term16229.getClass(), "rootNode", term16299);
        setField(term16229, term16229.getClass(), "thisType", term16397);
        setIntField(term16229, term16229.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term16085;
        args[1] = term16229;
        callMethod(klass, "createScope", argTypes, term16015, args);
    }

};


