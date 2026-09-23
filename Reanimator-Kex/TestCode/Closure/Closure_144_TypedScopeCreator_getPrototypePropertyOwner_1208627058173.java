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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171125;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171125 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171211 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term171303 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term171411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term171125, term171125.getClass(), "type", 33);
        setIntField(term171211, term171211.getClass(), "type", 33);
        setField(term171303, term171303.getClass(), "str", "prototype");
        setField(term171211, term171211.getClass(), "last", term171303);
        setIntField(term171411, term171411.getClass(), "type", 33);
        setField(term171211, term171211.getClass(), "first", term171411);
        setField(term171125, term171125.getClass(), "first", term171211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term171125;
        try {
            callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


