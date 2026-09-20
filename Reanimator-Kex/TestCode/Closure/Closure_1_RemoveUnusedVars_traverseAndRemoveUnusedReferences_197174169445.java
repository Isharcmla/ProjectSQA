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

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11434;
     Object term11584;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11434 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term11514 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11434, term11434.getClass(), "compiler", term11514);
        term11584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11676 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term11584, term11584.getClass(), "type", 0);
        setField(term11584, term11584.getClass(), "first", term11676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term11584;
        callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term11434, args);
    }

};
