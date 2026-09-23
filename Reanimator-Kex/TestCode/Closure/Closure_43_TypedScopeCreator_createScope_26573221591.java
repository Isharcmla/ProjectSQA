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

public class TypedScopeCreator_createScope_26573221591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57582;
     Object term57652;
     Object term57866;

    public TypedScopeCreator_createScope_26573221591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57582 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term57582, term57582.getClass(), "compiler", null);
        term57652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57652, term57652.getClass(), "jsType", null);
        setIntField(term57652, term57652.getClass(), "type", 0);
        setField(term57652, term57652.getClass(), "parent", null);
        setField(term57722, term57722.getClass(), "next", null);
        setIntField(term57722, term57722.getClass(), "type", 41);
        setField(term57792, term57792.getClass(), "next", null);
        setIntField(term57792, term57792.getClass(), "type", 83);
        setField(term57792, term57792.getClass(), "first", null);
        setField(term57722, term57722.getClass(), "first", term57792);
        setField(term57652, term57652.getClass(), "first", term57722);
        term57866 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term57936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57866, term57866.getClass(), "rootNode", term57936);
        setField(term57866, term57866.getClass(), "thisType", null);
        setIntField(term57866, term57866.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term57652;
        args[1] = term57866;
        try {
            callMethod(klass, "createScope", argTypes, term57582, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


