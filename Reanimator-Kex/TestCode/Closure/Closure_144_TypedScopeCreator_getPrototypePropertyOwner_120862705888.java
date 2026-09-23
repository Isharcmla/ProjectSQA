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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_120862705888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43405;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43405 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43497 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term43589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term43405, term43405.getClass(), "type", 33);
        setIntField(term43497, term43497.getClass(), "type", 33);
        setIntField(term43589, term43589.getClass(), "type", 40);
        setField(term43497, term43497.getClass(), "last", term43589);
        setField(term43405, term43405.getClass(), "first", term43497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43405;
        try {
            callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


