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

public class TypedScopeCreator_createScope_265732215102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75851;
     Object term75921;
     Object term76135;

    public TypedScopeCreator_createScope_265732215102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75851 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term75851, term75851.getClass(), "compiler", null);
        term75921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76061 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75921, term75921.getClass(), "jsType", null);
        setIntField(term75921, term75921.getClass(), "type", 0);
        setField(term75921, term75921.getClass(), "parent", null);
        setField(term75991, term75991.getClass(), "next", null);
        setIntField(term75991, term75991.getClass(), "type", 0);
        setField(term76061, term76061.getClass(), "next", null);
        setIntField(term76061, term76061.getClass(), "type", 0);
        setField(term76061, term76061.getClass(), "first", null);
        setField(term76061, term76061.getClass(), "parent", null);
        setField(term75991, term75991.getClass(), "first", term76061);
        setField(term75991, term75991.getClass(), "parent", null);
        setField(term75921, term75921.getClass(), "first", term75991);
        term76135 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term76135, term76135.getClass(), "rootNode", null);
        setField(term76135, term76135.getClass(), "thisType", null);
        setIntField(term76135, term76135.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term75921;
        args[1] = term76135;
        callMethod(klass, "createScope", argTypes, term75851, args);
    }

};


