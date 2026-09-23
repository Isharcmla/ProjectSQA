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
     Object term25707;
     Object term25857;
     Object term26001;

    public TypedScopeCreator_createScope_26573221551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25707 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term25787 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25707, term25707.getClass(), "compiler", term25787);
        term25857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25857, term25857.getClass(), "jsType", null);
        setIntField(term25857, term25857.getClass(), "type", 126);
        setField(term25857, term25857.getClass(), "parent", null);
        setField(term25857, term25857.getClass(), "first", term25927);
        term26001 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term26071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term26001, term26001.getClass(), "rootNode", term26071);
        setField(term26001, term26001.getClass(), "thisType", null);
        setIntField(term26001, term26001.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term25857;
        args[1] = term26001;
        try {
            callMethod(klass, "createScope", argTypes, term25707, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


