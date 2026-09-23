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

public class TypedScopeCreator_createInitialScope_76224746483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49908;
     Object term50162;

    public TypedScopeCreator_createInitialScope_76224746483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49908 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term49988 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term50092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term49908, term49908.getClass(), "compiler", term49988);
        setField(term49908, term49908.getClass(), "typeRegistry", term50092);
        term50162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term50162, term50162.getClass(), "type", 77);
        setField(term50162, term50162.getClass(), "parent", null);
        setField(term50232, term50232.getClass(), "next", term50302);
        setIntField(term50232, term50232.getClass(), "type", 0);
        setField(term50162, term50162.getClass(), "first", term50232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term50162;
        try {
            callMethod(klass, "createInitialScope", argTypes, term49908, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


