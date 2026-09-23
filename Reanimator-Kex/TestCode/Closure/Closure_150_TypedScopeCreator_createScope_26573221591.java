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
     Object term54927;
     Object term55077;
     Object term55151;

    public TypedScopeCreator_createScope_26573221591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54927 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term55007 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54927, term54927.getClass(), "compiler", term55007);
        term55077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55077, term55077.getClass(), "jsType", null);
        setIntField(term55077, term55077.getClass(), "type", 0);
        setField(term55077, term55077.getClass(), "first", null);
        term55151 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term55221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55151, term55151.getClass(), "rootNode", term55221);
        setField(term55151, term55151.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term55077;
        args[1] = term55151;
        try {
            callMethod(klass, "createScope", argTypes, term54927, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


