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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90996;
     Object term91146;
     Object term91360;

    public TypedScopeCreator_createScope_265732215125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90996 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term91076 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term90996, term90996.getClass(), "compiler", term91076);
        term91146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term91146, term91146.getClass(), "jsType", null);
        setIntField(term91146, term91146.getClass(), "type", 0);
        setField(term91146, term91146.getClass(), "parent", null);
        setField(term91216, term91216.getClass(), "next", term91286);
        setIntField(term91216, term91216.getClass(), "type", 41);
        setField(term91216, term91216.getClass(), "first", null);
        setField(term91146, term91146.getClass(), "first", term91216);
        term91360 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term91360, term91360.getClass(), "rootNode", null);
        setField(term91360, term91360.getClass(), "thisType", null);
        setIntField(term91360, term91360.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term91146;
        args[1] = term91360;
        try {
            callMethod(klass, "createScope", argTypes, term90996, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


