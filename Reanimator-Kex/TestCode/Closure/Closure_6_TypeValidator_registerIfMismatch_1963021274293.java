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
import java.lang.String;
import java.lang.Object;

public class TypeValidator_registerIfMismatch_1963021274293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87678;
     Object term87788;
     Object term88156;

    public TypeValidator_registerIfMismatch_1963021274293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87678 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Class<? extends Object> term88232 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term88231 = ((Class) term88232).getDeclaredField((String) "ORDINARY");
        ((Field) term88231).setAccessible(true);
        Object enum24 = ((Field) term88231).get((Object) null);
        term87788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term88046 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term87788, term87788.getClass(), "unknown", false);
        setField(term87788, term87788.getClass(), "kind", enum24);
        setField(term87788, term87788.getClass(), "typeOfThis", term88046);
        term88156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setBooleanField(term88156, term88156.getClass(), "unknown", false);
        setField(term88156, term88156.getClass(), "kind", enum24);
        setField(term88156, term88156.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeValidator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.JSError");
        Object[] args = new Object[3];
        args[0] = term87788;
        args[1] = term88156;
        args[2] = null;
        callMethod(klass, "registerIfMismatch", argTypes, term87678, args);
    }

};


