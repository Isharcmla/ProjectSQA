package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_2101002158370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264366;
     Object term264722;

    public FunctionType_isSubtype_2101002158370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term266753 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term266752 = ((Class) term266753).getDeclaredField((String) "ORDINARY");
        ((Field) term266752).setAccessible(true);
        Object enum492 = ((Field) term266752).get((Object) null);
        term264366 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term264614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term264366, term264366.getClass(), "kind", enum492);
        setField(term264366, term264366.getClass(), "typeOfThis", term264614);
        Class<? extends Object> term267044 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term267043 = ((Class) term267044).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term267043).setAccessible(true);
        Object enum493 = ((Field) term267043).get((Object) null);
        term264722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term264980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term264722, term264722.getClass(), "kind", enum493);
        setField(term264722, term264722.getClass(), "typeOfThis", term264980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term264722;
        try {
            callMethod(klass, "isSubtype", argTypes, term264366, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


