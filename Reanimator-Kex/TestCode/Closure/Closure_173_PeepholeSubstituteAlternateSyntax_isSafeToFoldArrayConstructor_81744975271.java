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

public class PeepholeSubstituteAlternateSyntax_isSafeToFoldArrayConstructor_81744975271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum1;

    public PeepholeSubstituteAlternateSyntax_isSafeToFoldArrayConstructor_81744975271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36880 = Class.forName((String) "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax$FoldArrayAction");
        Field term36879 = ((Class) term36880).getDeclaredField((String) "SAFE_TO_FOLD_WITHOUT_ARGS");
        ((Field) term36879).setAccessible(true);
        enum1 = ((Field) term36879).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isSafeToFoldArrayConstructor", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


