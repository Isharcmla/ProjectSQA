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

public class TypeValidator_registerMismatch_581023849358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136149;
     Object term136247;
     Object term136437;

    public TypeValidator_registerMismatch_581023849358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136149 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term136247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term136339 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term136247, term136247.getClass(), "referencedType", term136339);
        term136437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term136247;
        args[1] = term136437;
        try {
            callMethod(klass, "registerMismatch", argTypes, term136149, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


