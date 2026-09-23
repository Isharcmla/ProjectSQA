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

public class FunctionType_isSubtype_21010021581451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2081787;
     Object term2082441;

    public FunctionType_isSubtype_21010021581451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2084247 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2084246 = ((Class) term2084247).getDeclaredField((String) "INTERFACE");
        ((Field) term2084246).setAccessible(true);
        Object enum3706 = ((Field) term2084246).get((Object) null);
        Class<? extends Object> term2084541 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2084540 = ((Class) term2084541).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2084540).setAccessible(true);
        Object enum3707 = ((Field) term2084540).get((Object) null);
        term2081787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2082331 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2081787, term2081787.getClass(), "kind", enum3706);
        setField(term2082331, term2082331.getClass(), "kind", enum3707);
        setField(term2082331, term2082331.getClass(), "call", null);
        setField(term2081787, term2081787.getClass(), "typeOfThis", term2082331);
        term2082441 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2082773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2082867 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2082441, term2082441.getClass(), "kind", enum3706);
        setField(term2082773, term2082773.getClass(), "kind", enum3707);
        setField(term2082773, term2082773.getClass(), "call", term2082867);
        setField(term2082441, term2082441.getClass(), "typeOfThis", term2082773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2082441;
        try {
            callMethod(klass, "isSubtype", argTypes, term2081787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


