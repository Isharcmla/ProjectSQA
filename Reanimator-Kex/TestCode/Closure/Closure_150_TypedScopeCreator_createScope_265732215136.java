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

public class TypedScopeCreator_createScope_265732215136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85748;
     Object term85818;
     Object term86226;

    public TypedScopeCreator_createScope_265732215136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85748 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term85748, term85748.getClass(), "compiler", null);
        term85818 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term85958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term85818, term85818.getClass(), "jsType", null);
        setIntField(term85818, term85818.getClass(), "type", 0);
        setField(term85958, term85958.getClass(), "next", term86028);
        setIntField(term85958, term85958.getClass(), "type", 64);
        setField(term85958, term85958.getClass(), "first", null);
        setField(term85888, term85888.getClass(), "next", term85958);
        setIntField(term85888, term85888.getClass(), "type", 64);
        setField(term85888, term85888.getClass(), "first", null);
        setField(term85888, term85888.getClass(), "jsType", term86152);
        setField(term85818, term85818.getClass(), "first", term85888);
        term86226 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term86296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term86226, term86226.getClass(), "rootNode", term86296);
        setField(term86226, term86226.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term85818;
        args[1] = term86226;
        try {
            callMethod(klass, "createScope", argTypes, term85748, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


