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

public class TypeValidator_registerMismatch_581023849501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264299;
     Object term264397;
     Object term264593;

    public TypeValidator_registerMismatch_581023849501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264299 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        term264397 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term264495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setField(term264397, term264397.getClass(), "referencedType", term264495);
        term264593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term264703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term264703, term264703.getClass(), "unknown", false);
        setField(term264593, term264593.getClass(), "referencedType", term264703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term264397;
        args[1] = term264593;
        try {
            callMethod(klass, "registerMismatch", argTypes, term264299, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


