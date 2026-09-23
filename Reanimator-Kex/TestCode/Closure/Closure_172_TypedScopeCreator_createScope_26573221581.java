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

public class TypedScopeCreator_createScope_26573221581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32098;
     Object term32168;
     Object term32312;

    public TypedScopeCreator_createScope_26573221581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32098 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term32098, term32098.getClass(), "compiler", null);
        term32168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32238 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32168, term32168.getClass(), "type", 0);
        setIntField(term32238, term32238.getClass(), "type", 132);
        setField(term32168, term32168.getClass(), "parent", term32238);
        term32312 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term32312, term32312.getClass(), "rootNode", null);
        setIntField(term32312, term32312.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term32168;
        args[1] = term32312;
        try {
            callMethod(klass, "createScope", argTypes, term32098, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


