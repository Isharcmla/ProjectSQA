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

public class TypedScopeCreator_createInitialScope_76224746446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14135;
     Object term14389;

    public TypedScopeCreator_createInitialScope_76224746446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14135 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term14215 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term14319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term14135, term14135.getClass(), "compiler", term14215);
        setField(term14135, term14135.getClass(), "typeRegistry", term14319);
        term14389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14389, term14389.getClass(), "type", 0);
        setField(term14389, term14389.getClass(), "parent", null);
        setField(term14459, term14459.getClass(), "next", term14529);
        setIntField(term14459, term14459.getClass(), "type", 132);
        setField(term14389, term14389.getClass(), "first", term14459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term14389;
        try {
            callMethod(klass, "createInitialScope", argTypes, term14135, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


