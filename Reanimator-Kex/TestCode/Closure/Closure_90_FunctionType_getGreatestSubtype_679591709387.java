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

public class FunctionType_getGreatestSubtype_679591709387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285368;
     Object term285626;

    public FunctionType_getGreatestSubtype_679591709387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term286708 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term286707 = ((Class) term286708).getDeclaredField((String) "INTERFACE");
        ((Field) term286707).setAccessible(true);
        Object enum495 = ((Field) term286707).get((Object) null);
        term285368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term285368, term285368.getClass(), "kind", enum495);
        Class<? extends Object> term287002 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term287001 = ((Class) term287002).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term287001).setAccessible(true);
        Object enum496 = ((Field) term287001).get((Object) null);
        term285626 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term285626, term285626.getClass(), "kind", enum496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term285626;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term285368, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


