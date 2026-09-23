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
import java.lang.String;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_isSafeToFoldArrayConstructor_817449752117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129136;
     Object term192266;
     Object enum2;

    public PeepholeSubstituteAlternateSyntax_isSafeToFoldArrayConstructor_817449752117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term129136, term129136.getClass(), "next", null);
        term192266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term192266, term192266.getClass(), "type", 0);
        setField(term192266, term192266.getClass(), "next", null);
        setField(term192266, term192266.getClass(), "first", null);
        setField(term192266, term192266.getClass(), "last", null);
        setField(term192266, term192266.getClass(), "propListHead", null);
        setIntField(term192266, term192266.getClass(), "sourcePosition", 0);
        setField(term192266, term192266.getClass(), "jsType", null);
        setField(term192266, term192266.getClass(), "parent", null);
        Class<? extends Object> term192268 = Class.forName((String) "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Field term192267 = ((Class) term192268).getDeclaredField((String) "NOT_SAFE_TO_FOLD");
        ((Field) term192267).setAccessible(true);
        enum2 = ((Field) term192267).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term129136;
        Object retValue = callMethod(klass, "isSafeToFoldArrayConstructor", argTypes, null, args);
        assertTrue(recursiveEquals(term129136, term192266));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


