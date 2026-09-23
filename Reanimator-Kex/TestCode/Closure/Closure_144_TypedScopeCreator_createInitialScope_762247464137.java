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

public class TypedScopeCreator_createInitialScope_762247464137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68721;
     Object term68997;

    public TypedScopeCreator_createInitialScope_762247464137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68721 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term68801 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term68905 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term68721, term68721.getClass(), "compiler", term68801);
        setField(term68721, term68721.getClass(), "typeRegistry", term68905);
        term68997 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term68997, term68997.getClass(), "type", 105);
        setField(term68997, term68997.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term68997;
        try {
            callMethod(klass, "createInitialScope", argTypes, term68721, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


