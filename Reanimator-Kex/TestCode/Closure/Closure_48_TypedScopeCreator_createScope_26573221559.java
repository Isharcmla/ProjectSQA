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

public class TypedScopeCreator_createScope_26573221559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30197;
     Object term30267;
     Object term30411;

    public TypedScopeCreator_createScope_26573221559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30197 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term30197, term30197.getClass(), "compiler", null);
        term30267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term30267, term30267.getClass(), "jsType", null);
        setIntField(term30267, term30267.getClass(), "type", 0);
        setField(term30267, term30267.getClass(), "parent", null);
        setField(term30337, term30337.getClass(), "next", null);
        setIntField(term30337, term30337.getClass(), "type", 132);
        setField(term30267, term30267.getClass(), "first", term30337);
        term30411 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term30481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30595 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term30411, term30411.getClass(), "rootNode", term30481);
        setField(term30411, term30411.getClass(), "thisType", term30595);
        setIntField(term30411, term30411.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term30267;
        args[1] = term30411;
        try {
            callMethod(klass, "createScope", argTypes, term30197, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


