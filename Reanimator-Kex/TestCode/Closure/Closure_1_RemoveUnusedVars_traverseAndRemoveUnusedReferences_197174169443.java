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

public class RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10926;
     Object term10996;

    public RemoveUnusedVars_traverseAndRemoveUnusedReferences_197174169443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10926 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term10926, term10926.getClass(), "compiler", null);
        term10996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10996, term10996.getClass(), "type", 0);
        setIntField(term11066, term11066.getClass(), "type", 105);
        setField(term10996, term10996.getClass(), "first", term11066);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10996;
        callMethod(klass, "traverseAndRemoveUnusedReferences", argTypes, term10926, args);
    }

};
