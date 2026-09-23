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

public class TypedScopeCreator_createInitialScope_76224746449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15047;
     Object term15117;

    public TypedScopeCreator_createInitialScope_76224746449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15047 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term15047, term15047.getClass(), "compiler", null);
        setField(term15047, term15047.getClass(), "typeRegistry", null);
        term15117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15117, term15117.getClass(), "type", -133);
        setField(term15117, term15117.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15117;
        try {
            callMethod(klass, "createInitialScope", argTypes, term15047, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


