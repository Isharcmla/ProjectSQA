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

public class TypedScopeCreator_createScope_26573221555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27820;
     Object term27970;
     Object term28324;

    public TypedScopeCreator_createScope_26573221555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27820 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term27900 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term27820, term27820.getClass(), "compiler", term27900);
        term27970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27970, term27970.getClass(), "jsType", null);
        setIntField(term27970, term27970.getClass(), "type", 0);
        setField(term27970, term27970.getClass(), "parent", null);
        setField(term28110, term28110.getClass(), "next", term28180);
        setIntField(term28110, term28110.getClass(), "type", 125);
        setField(term28040, term28040.getClass(), "next", term28110);
        setIntField(term28040, term28040.getClass(), "type", 0);
        setField(term28250, term28250.getClass(), "next", null);
        setIntField(term28250, term28250.getClass(), "type", 0);
        setField(term28250, term28250.getClass(), "first", null);
        setField(term28250, term28250.getClass(), "parent", null);
        setField(term28040, term28040.getClass(), "first", term28250);
        setField(term28040, term28040.getClass(), "parent", null);
        setField(term27970, term27970.getClass(), "first", term28040);
        term28324 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term28394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term28324, term28324.getClass(), "rootNode", term28394);
        setField(term28324, term28324.getClass(), "thisType", null);
        setIntField(term28324, term28324.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27970;
        args[1] = term28324;
        try {
            callMethod(klass, "createScope", argTypes, term27820, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


