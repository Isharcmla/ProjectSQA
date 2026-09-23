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

public class TypedScopeCreator_createScope_265732215109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80282;
     Object term80352;
     Object term80776;

    public TypedScopeCreator_createScope_265732215109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80282 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term80282, term80282.getClass(), "compiler", null);
        term80352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term80352, term80352.getClass(), "jsType", null);
        setIntField(term80352, term80352.getClass(), "type", 0);
        setField(term80352, term80352.getClass(), "parent", null);
        setField(term80562, term80562.getClass(), "next", term80632);
        setIntField(term80562, term80562.getClass(), "type", 83);
        setField(term80562, term80562.getClass(), "first", null);
        setField(term80492, term80492.getClass(), "next", term80562);
        setIntField(term80492, term80492.getClass(), "type", 0);
        setField(term80492, term80492.getClass(), "first", null);
        setField(term80492, term80492.getClass(), "parent", null);
        setField(term80422, term80422.getClass(), "next", term80492);
        setIntField(term80422, term80422.getClass(), "type", 0);
        setField(term80702, term80702.getClass(), "next", null);
        setIntField(term80702, term80702.getClass(), "type", 0);
        setField(term80702, term80702.getClass(), "first", null);
        setField(term80702, term80702.getClass(), "parent", null);
        setField(term80422, term80422.getClass(), "first", term80702);
        setField(term80422, term80422.getClass(), "parent", null);
        setField(term80352, term80352.getClass(), "first", term80422);
        term80776 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term80776, term80776.getClass(), "rootNode", null);
        setField(term80776, term80776.getClass(), "thisType", null);
        setIntField(term80776, term80776.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term80352;
        args[1] = term80776;
        try {
            callMethod(klass, "createScope", argTypes, term80282, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


