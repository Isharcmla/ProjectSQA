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

public class TypeValidator_registerMismatch_581023849488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253082;
     Object term253180;
     Object term253370;

    public TypeValidator_registerMismatch_581023849488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253082 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term253180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term253272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.VoidType"));
        setField(term253180, term253180.getClass(), "referencedType", term253272);
        term253370 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term253468 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term253370, term253370.getClass(), "referencedType", term253468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term253180;
        args[1] = term253370;
        try {
            callMethod(klass, "registerMismatch", argTypes, term253082, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


