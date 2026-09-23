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

public class TypedScopeCreator_createScope_26573221547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14771;
     Object term14863;
     Object term14937;

    public TypedScopeCreator_createScope_26573221547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14771 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term14771, term14771.getClass(), "compiler", null);
        term14863 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term14863, term14863.getClass(), "jsType", null);
        term14937 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term15007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14937, term14937.getClass(), "rootNode", term15007);
        setField(term14937, term14937.getClass(), "thisType", null);
        setIntField(term14937, term14937.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term14863;
        args[1] = term14937;
        try {
            callMethod(klass, "createScope", argTypes, term14771, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


