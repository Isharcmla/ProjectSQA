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
import java.util.ArrayList;
import java.util.HashMap;

public class TypedScopeCreator_init_85329935449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14492;

    public TypedScopeCreator_init_85329935449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14284 = new ArrayList();
        HashMap term14332 = new HashMap();
        Object term14232 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term14412 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term14232, term14232.getClass(), "delegateProxyPrototypes", term14284);
        setField(term14232, term14232.getClass(), "delegateCallingConventions", term14332);
        setField(term14232, term14232.getClass(), "functionAnalysisResults", null);
        setField(term14232, term14232.getClass(), "compiler", term14412);
        term14492 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term14596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term14492, term14492.getClass(), "typeValidator", null);
        setField(term14492, term14492.getClass(), "typeRegistry", term14596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Object[] args = new Object[2];
        args[0] = term14492;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


