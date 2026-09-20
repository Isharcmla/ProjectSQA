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

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8385;
     Object term8535;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8385 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term8465 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term8385, term8385.getClass(), "compiler", term8465);
        term8535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8535, term8535.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8535;
        callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term8385, args);
    }

};
