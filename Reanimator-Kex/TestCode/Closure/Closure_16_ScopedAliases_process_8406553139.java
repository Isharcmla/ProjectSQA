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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_process_8406553139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3666;
     Object term3736;
     Object term5217;
     Object term5218;

    public ScopedAliases_process_8406553139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3666 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term3666, term3666.getClass(), "compiler", null);
        term3736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3876 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3736, term3736.getClass(), "type", 0);
        setField(term3736, term3736.getClass(), "parent", null);
        setField(term3876, term3876.getClass(), "next", null);
        setIntField(term3876, term3876.getClass(), "type", 0);
        setField(term3876, term3876.getClass(), "first", null);
        setField(term3806, term3806.getClass(), "next", term3876);
        setIntField(term3806, term3806.getClass(), "type", 0);
        setField(term3946, term3946.getClass(), "next", null);
        setIntField(term3946, term3946.getClass(), "type", 0);
        setField(term3946, term3946.getClass(), "first", null);
        setField(term3806, term3806.getClass(), "first", term3946);
        setField(term3736, term3736.getClass(), "first", term3806);
        term5217 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term5217, term5217.getClass(), "compiler", null);
        setField(term5217, term5217.getClass(), "preprocessorSymbolTable", null);
        setField(term5217, term5217.getClass(), "transformationHandler", null);
        term5218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5218, term5218.getClass(), "type", 0);
        setField(term5218, term5218.getClass(), "next", null);
        setIntField(term5219, term5219.getClass(), "type", 0);
        setIntField(term5220, term5220.getClass(), "type", 0);
        setField(term5220, term5220.getClass(), "next", null);
        setField(term5220, term5220.getClass(), "first", null);
        setField(term5220, term5220.getClass(), "last", null);
        setField(term5220, term5220.getClass(), "propListHead", null);
        setIntField(term5220, term5220.getClass(), "sourcePosition", 0);
        setField(term5220, term5220.getClass(), "jsType", null);
        setField(term5220, term5220.getClass(), "parent", null);
        setField(term5219, term5219.getClass(), "next", term5220);
        setIntField(term5221, term5221.getClass(), "type", 0);
        setField(term5221, term5221.getClass(), "next", null);
        setField(term5221, term5221.getClass(), "first", null);
        setField(term5221, term5221.getClass(), "last", null);
        setField(term5221, term5221.getClass(), "propListHead", null);
        setIntField(term5221, term5221.getClass(), "sourcePosition", 0);
        setField(term5221, term5221.getClass(), "jsType", null);
        setField(term5221, term5221.getClass(), "parent", null);
        setField(term5219, term5219.getClass(), "first", term5221);
        setField(term5219, term5219.getClass(), "last", null);
        setField(term5219, term5219.getClass(), "propListHead", null);
        setIntField(term5219, term5219.getClass(), "sourcePosition", 0);
        setField(term5219, term5219.getClass(), "jsType", null);
        setField(term5219, term5219.getClass(), "parent", null);
        setField(term5218, term5218.getClass(), "first", term5219);
        setField(term5218, term5218.getClass(), "last", null);
        setField(term5218, term5218.getClass(), "propListHead", null);
        setIntField(term5218, term5218.getClass(), "sourcePosition", 0);
        setField(term5218, term5218.getClass(), "jsType", null);
        setField(term5218, term5218.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3736;
        callMethod(klass, "process", argTypes, term3666, args);
        assertTrue(recursiveEquals(term3666, term5217));
        assertTrue(recursiveEquals(term3736, null));
    }

};


